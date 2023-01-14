package com.evan.demo.controller;

import com.alibaba.fastjson.JSON;
import com.evan.demo.pojo.*;
import com.evan.demo.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin
@Controller
@Slf4j
public class LoginController {

    @Autowired
    LoginStateService loginStateService;

    @Autowired
    UpCourseService upCourseService;

    @Autowired
    LearnSortCourseService learnSortCourseService;

    @Autowired
    CoummentSortCourseService coummentSortCourseService;

    @Autowired
    UserMesService userMesService;

    @Autowired
    SendCodeService sendCodeService;

    @Autowired
    CourseService courseService;

    @Autowired
    CommentsService commentsService;

    @Autowired
    ChapterService chapterService;

    Map<String,Object>codeMap = new HashMap<String,Object>(){{
        put("code","404");
    }};

    @ResponseBody
    @GetMapping("/")
    public String studentFun(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> loginStateMap = loginStateService.loginStateDetection(response, request);

        List<Object> slideImageList = new ArrayList<>();
        map.put("slideImageList", slideImageList);


        Integer id = 0;
        slideImageList.add(new SlideImage("https://i.postimg.cc/4yVCpb7k/4496d3ff64ab8251fdc3ecc65228f298.jpg", id++));
        slideImageList.add(new SlideImage("https://i.postimg.cc/85FgzVTC/790b6e214da38a35532dddbc5b9a9ba9.png", id++));
        slideImageList.add(new SlideImage("https://i.postimg.cc/7DrTFgkP/6f0203d00029bb436ec2e19dc6319c15.png", id++));
        slideImageList.add(new SlideImage("https://i.postimg.cc/Ssw-FXtKf/518cc9b94f05ec96302c6f4efe704bf1.jpg", id++));
        slideImageList.add(new SlideImage("https://i.postimg.cc/yNpzKN45/95dbb6a6c55b215026c1a8c2b3482820.jpg", id++));
        slideImageList.add(new SlideImage("https://i.postimg.cc/9X7j3Vx8/79782df46a0354c3e4e48f2d2707d7d1.jpg", id++));
        map.put("loginState", loginStateMap);
        map.put("LearnSortCourse", learnSortCourseService.getLearnSortCourse().subList(0,4));
        map.put("CommentSortCourse", coummentSortCourseService.getCommentSortCourse().subList(0,4));

        /*添加图片路径*/


        return JSON.toJSONString(map);
    }

    /*获取登录状态api*/
    @ResponseBody
    @GetMapping("/state")
    public Map state(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        Map<String, Object> stateMap = loginStateService.loginStateDetection(response, request);
        return stateMap;
    }

    /* 登录api */
    @ResponseBody
    @PostMapping("/login")
    public String login(@RequestParam("userName") String userName, @RequestParam("userPaw") String userPaw, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("userName", userName);
        Cookie cookie2 = new Cookie("userPaw", userPaw);
        if(userMesService.getUserByEmail(userName)!=null){
            response.addCookie(cookie1);
            response.addCookie(cookie2);
            return "200";
        };
        return "查无此人";
    }

    @ResponseBody
    @GetMapping("loginOut")
    public String loginOut(HttpServletResponse response) {
        response.addCookie(new Cookie("userName", null));
        response.addCookie(new Cookie("userPaw", null));
        return "退出账号";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile[] files,
                         @RequestParam("courseName") String courseName,
                         @RequestParam("teacherName") String teacherName,
                         @RequestParam("teacherSchool") String teacherSchool) {
        if (files.length == 0) {
            return "上传失败，请选择文件";
        }

        /*定义单次最多只能上传100个文件*/
        String[] fileNames = new String[100];
        /*定义上传路径*/
        String filePath = "C:/Users/lcx17/Desktop/upFile/";

        for (int i = 0; i < files.length; i++) {
            fileNames[i] = files[i].getOriginalFilename();
            File dest = new File(filePath + fileNames[i]);
            try {
                files[i].transferTo(dest);
                String num = "2654654560";
                upCourseService.addCourse(num+ i,courseName,teacherName,teacherSchool,fileNames[i],1,i,(int)(Math.random()*1000));
                if (i == files.length - 1) {
                    log.info("上传成功");
                    return "上传成功";
                }
            } catch (IOException e) {
                log.error(e.toString(), e);
            }
        }

        return "上传失败！";
    }


    /*用户的注册*/
    @ResponseBody
    @PostMapping("/upUserMes")
    public String upUserMes(@RequestParam("userPaw") String userPaw,
                               @RequestParam("name") String name,
                               @RequestParam("school") String school,
                               @RequestParam("position") String position  ,
                               @RequestParam("introduction") String introduction,
                               @RequestParam("userImage") MultipartFile userImage,
                               @RequestParam("type") int type,
                               @RequestParam("email") String email){
        return userMesService.addUserMes(userPaw,name,school,position,introduction,userImage,type,email);
    }

    /*获取所有课程*/
    @ResponseBody
    @GetMapping("/courselist")
    public Map getAllSource(){
        Map<String,Object>allCourceMap = new HashMap<>();
        List<Course>allCourseList = learnSortCourseService.getLearnSortCourse();
        allCourceMap.put("allCourseList",allCourseList);
        return allCourceMap;
    }

    /*发送验证码*/
    @ResponseBody
    @GetMapping("/sendCode/{emailNumber}")
    public String sendCode(@PathVariable String emailNumber){
        Map<String,Object> reCodeMap = sendCodeService.sendCode(emailNumber);
//        codeMap.put("status",reCodeMap.get("status"));
//        codeMap.put("successMes",reCodeMap.get("successMes"));
//        codeMap.put("code",reCodeMap.get("code"));
        codeMap = reCodeMap;
        return codeMap.get("successMes").toString();
    }

    /*邮箱验证码*/
    @ResponseBody
    @GetMapping("/codeValidation")
    public String codeValidation(@RequestParam("code") String code){
        System.out.println(codeMap.get("code"));
        System.out.println(code);
        if(code.equals(codeMap.get("code").toString())){
            return "200";
        }else {
            return "404";
        }
    }

    /*获取我的信息（我的模块查看使用）*/
    @ResponseBody
    @GetMapping("/getMyMes")
    public User getMyMes(HttpServletRequest request){
        Map<String,String>map = new HashMap<>();
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("userName")&&cookie.getValue()!=null&&!cookie.getValue().equals("")){
                User user = userMesService.getUserByEmail(cookie.getValue());
                return user;
            }
        }
        return null;
    }

    /*教师获取“我创建的课程”信息api*/
    @ResponseBody
    @GetMapping("/getCourseByTeacherNumber/{teacherAccountNumber}")
    public Object getCourseByTeacherNumber(@PathVariable String teacherAccountNumber){
        return courseService.getCourseByTeacherNumber(teacherAccountNumber);
    }

    /*课程页面初始化配置api*/
    @ResponseBody
    @GetMapping("/coursePage/{courseNumber}")
    public Object getCoursePage(@PathVariable String courseNumber){
        return courseService.getCourseByCourseNumber(courseNumber);
    }

    /*得到评论*/
    @ResponseBody
    @GetMapping("/getComments/{courseNumber}")
    public Object getComments(@PathVariable String courseNumber){
        List<Map>comments = new ArrayList<>();
        List<Comment>mainComments = commentsService.getCommentsByIdAndType(courseNumber,0);//type为0是得到主评论
        for(int i = 0;i< mainComments.size();i++){
            List<Comment>subComments = commentsService.getCommentsByIdAndOwner_id(courseNumber,mainComments.get(i).getSub_id());
            Map<String,Object>map = new HashMap<>();
            map.put("mainComment",mainComments.get(i));
            map.put("subComment",subComments);
            comments.add(map);
        }
        return comments;
    }

    /*上传评论内容*/
    @ResponseBody
    @PostMapping("/upReplyContent/{courseNumber}")
    public Object upComment(@PathVariable String courseNumber,
                            @RequestParam("sub_id") String sub_id,
                            @RequestParam("type") Integer type,
                            @RequestParam("replyContent") String replyContent,
                            @RequestParam("dateTime") String dateTime,
                            @RequestParam("userAccountNumber") String userAccountNumber){
        //主评论（对视频提问）
        if(type==0){
            List<Comment>mainComments = commentsService.getCommentsByIdAndType(courseNumber,0);//type为0是得到主评论
            int num = mainComments.size();  //主评论数量，便以计算子评论id
            commentsService.addComment(courseNumber,num+"1",0,null,userAccountNumber,0,replyContent,dateTime);
        }else if(type==1){  //对评论进行回复
            commentsService.addComment(courseNumber,null,1,sub_id,userAccountNumber,0,replyContent,dateTime);
        }
        return "success";
    }

    @ResponseBody
    @GetMapping("/getChapters/{courseNumber}")
    public Object getChapter(@PathVariable String courseNumber){
        List<Map> chapters = new ArrayList<>();
        List<Chapter>mainChapter = chapterService.getChapterByCourseNumberAndType(courseNumber,0);//type为0是得到主章节
        for(int i = 0;i< mainChapter.size();i++){
            List<Chapter>subChapters = chapterService.getChapterByCourseNumberAndOwnerId(courseNumber,mainChapter.get(i).getNum());
            Map<String,Object>map = new HashMap<>();
            map.put("mainChapter",mainChapter.get(i));
            map.put("subChapter",subChapters);
            chapters.add(map);
        }
        return chapters;
    }
}
