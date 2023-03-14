package com.evan.demo.controller;

import com.alibaba.fastjson.JSON;
import com.evan.demo.pojo.*;
import com.evan.demo.service.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.Null;
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
import java.text.SimpleDateFormat;
import java.util.*;


@CrossOrigin
@Controller
@Slf4j
public class LoginController {

    @Autowired
    LoginStateService loginStateService;

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

    @Autowired
    CourseSelectionService courseSelectionService;

    @Autowired
    BrowseTimeservice browseTimeservice;

    Map<String, Object> codeMap = new HashMap<String, Object>() {{
//        put("code", "404");
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
        map.put("LearnSortCourse", learnSortCourseService.getLearnSortCourse().subList(0, 4));
        map.put("CommentSortCourse", coummentSortCourseService.getCommentSortCourse().subList(0, 4));

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
        User user = userMesService.getUserByEmail(userName);
        if (user != null && user.getUserPaw().equals(userPaw)) {
            Cookie cookie3 = new Cookie("userAccountNumber", user.getUserAccountNumber());
            response.addCookie(cookie1);
            response.addCookie(cookie2);
            response.addCookie(cookie3);
            return "200";
        }
        return "查无此人";
    }

    @ResponseBody
    @GetMapping("loginOut")
    public String loginOut(HttpServletResponse response) {
        response.addCookie(new Cookie("userName", null));
        response.addCookie(new Cookie("userPaw", null));
        response.addCookie(new Cookie("userAccountNumber", null));
        return "退出账号";
    }

    /*创建课程api*/
    @ResponseBody
    @PostMapping("/createCourse")
    public Object upload(@RequestParam("file") MultipartFile file,
                         @RequestParam("courseName") String courseName,
                         @RequestParam("courseIntroduction") String courseIntroduction,
                         @RequestParam("classHours") int classHours,
                         @RequestParam("memberTab") int memberTab,
                         @RequestParam("classesTab") int classesTab,
                         @RequestParam("endDate") String endDate,
                         @RequestParam("teacherAccountNumber") String teacherAccountNumber) {
//        if (files.length == 0) {
//            return "上传失败，请选择文件";
//        }
//
//        /*定义单次最多只能上传100个文件*/
//        String[] fileNames = new String[100];
//        /*定义上传路径*/
//        String filePath = "C:/Users/lcx17/Desktop/upFile/";
//
//        for (int i = 0; i < files.length; i++) {
//            fileNames[i] = files[i].getOriginalFilename();
//            File dest = new File(filePath + fileNames[i]);
//            try {
//                files[i].transferTo(dest);
//                String num = "2654654560";
//                upCourseService.addCourse(num+ i,courseName,teacherName,teacherSchool,fileNames[i],1,i,(int)(Math.random()*1000));
//                if (i == files.length - 1) {
//                    log.info("上传成功");
//                    return "上传成功";
//                }
//            } catch (IOException e) {
//                log.error(e.toString(), e);
//            }
//        }
        try {
            if (file == null || file.isEmpty()) {
                return "上传失败，请选择文件";
            }
            String fileName;
            /*定义上传路径*/
            String filePath = "/home/admin/Course_System/upFile/";
            fileName = file.getOriginalFilename();
            File dest = new File(filePath + fileName);
            try {
                file.transferTo(dest);
                int courseNum = courseService.getCourseCount() + 1;
                String num = Integer.toString(1000000000 + courseNum);
                User teacher = userMesService.getUserByAccountNumber(teacherAccountNumber);
                Date startDate = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                courseService.addCourse(num, courseName, teacher.getName(), teacher.getSchool(), fileName, 1, 0, 0, teacherAccountNumber, sdf.format(startDate), endDate, classHours, memberTab, classesTab, courseIntroduction);
            } catch (IOException e) {
                log.error(e.toString(), e);
                return "上传失败";
            }
            return "success";
        }catch (Exception e){
            return "数据异常";
        }

    }


    /*用户的注册*/
    @ResponseBody
    @PostMapping("/upUserMes")
    public String upUserMes(@RequestParam("userPaw") String userPaw,
                            @RequestParam("name") String name,
                            @RequestParam("school") String school,
                            @RequestParam("position") String position,
                            @RequestParam("introduction") String introduction,
                            @RequestParam("userImage") MultipartFile userImage,
                            @RequestParam("type") int type,
                            @RequestParam("email") String email,
                            @RequestParam(value = "hobby", required = false) String[] hobbys) {
        return userMesService.addUserMes(userPaw, name, school, position, introduction, userImage, type, email, 0, hobbys[0], hobbys[1], hobbys[2]);
    }

    /*获取所有课程*/
    @ResponseBody
    @GetMapping("/courselist")
    public Map getAllSource() {
        Map<String, Object> allCourceMap = new HashMap<>();
        List<Course> allCourseList = learnSortCourseService.getLearnSortCourse();
        allCourceMap.put("allCourseList", allCourseList);
        return allCourceMap;
    }

    /*发送验证码*/
    @ResponseBody
    @GetMapping("/sendCode/{emailNumber}")
    public Object sendCode(@PathVariable String emailNumber) {
        User user = userMesService.getUserByEmail(emailNumber);
        Map<String, Object> reCodeMap = new HashMap<>();
        if (user != null) {
            codeMap.put("status", "500");
            codeMap.put("successMes", "账户已存在");
            codeMap.put("code", null);
            reCodeMap.put("status", "500");
            reCodeMap.put("successMes", "账户已存在");
        } else {
            codeMap = sendCodeService.sendCode(emailNumber);
            reCodeMap.put("status", codeMap.get("status"));
            reCodeMap.put("successMes", codeMap.get("successMes"));
        }

//        codeMap.put("status",reCodeMap.get("status"));
//        codeMap.put("successMes",reCodeMap.get("successMes"));
//        codeMap.put("code",reCodeMap.get("code"));

        return reCodeMap;
    }

    /*邮箱验证码*/
    @ResponseBody
    @GetMapping("/codeValidation")
    public String codeValidation(@RequestParam("code") String code) {
//        System.out.println(codeMap.get("code"));
//        System.out.println(code);
        if (code == null) {
            return "404";
        }
        if (code.equals(codeMap.get("code").toString())) {
            return "200";
        } else {
            return "404";
        }
    }

    /*获取我的信息（我的模块查看使用）*/
    @ResponseBody
    @GetMapping("/getMyMes")
    public User getMyMes(HttpServletRequest request) {
        try {
            Map<String, String> map = new HashMap<>();
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userName") && cookie.getValue() != null && !cookie.getValue().equals("")) {
                    User user = userMesService.getUserByEmail(cookie.getValue());
                    return user;
                }
            }
        }catch (NullPointerException e){
            return null;
        }
        return null;
    }

    /*教师获取“我创建的课程”信息api*/
    @ResponseBody
    @GetMapping("/getCourseByTeacherNumber/{teacherAccountNumber}")
    public Object getCourseByTeacherNumber(@PathVariable String teacherAccountNumber) {
        return courseService.getCourseByTeacherNumber(teacherAccountNumber);
    }

    /*课程页面初始化配置api*/
    @ResponseBody
    @GetMapping("/coursePage/{courseNumber}")
    public Object getCoursePage(@PathVariable String courseNumber) {
        return courseService.getCourseByCourseNumber(courseNumber);
    }

    /*得到评论*/
    @ResponseBody
    @GetMapping("/getComments/{courseNumber}")
    public Object getComments(@PathVariable String courseNumber) {
        List<Map> comments = new ArrayList<>();
        List<Comment> mainComments = commentsService.getCommentsByIdAndType(courseNumber, 0);//type为0是得到主评论
        for (int i = 0; i < mainComments.size(); i++) {
            List<CommentUserMes> subCommentUserMes = new ArrayList<>();
            List<Comment> subComments = commentsService.getCommentsByIdAndOwner_id(courseNumber, mainComments.get(i).getSubId());
            for (int j = 0; j < subComments.size(); j++) {
                User subUser = userMesService.getUserByAccountNumber(subComments.get(j).getFromId());
                CommentUserMes subUserMes = new CommentUserMes(subUser.getEmail(), subUser.getImagePath());
                subCommentUserMes.add(subUserMes);
            }
            Map<String, Object> map = new HashMap<>();
            User mainUser = userMesService.getUserByAccountNumber(mainComments.get(i).getFromId());
            CommentUserMes mainCommentUserMes = new CommentUserMes(mainUser.getEmail(), mainUser.getImagePath());
            map.put("mainComment", mainComments.get(i));
            map.put("subComment", subComments);
            map.put("mainCommentUserMes", mainCommentUserMes);
            map.put("subCommentUserMes", subCommentUserMes);
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
                            @RequestParam("userAccountNumber") String userAccountNumber) {
        //主评论（对视频提问）
        if (type == 0) {
            List<Comment> mainComments = commentsService.getCommentsByIdAndType(courseNumber, 0);//type为0是得到主评论
            int num = mainComments.size();  //主评论数量，便以计算子评论id
            commentsService.addComment(courseNumber, num + "1", 0, null, userAccountNumber, 0, replyContent, dateTime);
        } else if (type == 1) {  //对评论进行回复
            commentsService.addComment(courseNumber, null, 1, sub_id, userAccountNumber, 0, replyContent, dateTime);
        }
        courseService.addCommentNumber(courseNumber);
        return "success";
    }

    @ResponseBody
    @GetMapping("/getChapters/{courseNumber}")
    public Object getChapter(@PathVariable String courseNumber) {
        List<Map> chapters = new ArrayList<>();
        List<Chapter> mainChapter = chapterService.getChapterByCourseNumberAndType(courseNumber, 0);//type为0是得到主章节
        for (int i = 0; i < mainChapter.size(); i++) {
            List<Chapter> subChapters = chapterService.getChapterByCourseNumberAndOwnerId(courseNumber, mainChapter.get(i).getNum());
            Map<String, Object> map = new HashMap<>();
            map.put("mainChapter", mainChapter.get(i));
            map.put("subChapter", subChapters);
            chapters.add(map);
        }
        return chapters;
    }

    /*获取课程的章节文件api*/
    @ResponseBody
    @GetMapping("/chapterPage/{courseNumber}/{chapterNum}")
    public Object getChapterPage(@PathVariable String courseNumber, @PathVariable String chapterNum) {
        /*0下标位owner_id（即父章节）,1为num（本身章节，子章节）*/
        String[] nums = chapterNum.split("\\.");
        return chapterService.getChapterByCourseNumberAndOwnerIdAndNum(courseNumber, Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
    }

    /*添加主章节api*/
    @ResponseBody
    @PostMapping("/addMainChapter")
    public Object addMainChapter(@RequestParam("courseNumber") String courseNumber, @RequestParam("num") Integer num) {
        chapterService.addChapter(courseNumber, 0, "单元" + num, num, null, null);
        return "success";
    }

    /*添加子章节api*/
    @ResponseBody
    @PostMapping("/addSubChapter")
    public Object addSubChapter(@RequestParam("courseNumber") String courseNumber, @RequestParam("num") Integer num, @RequestParam("owner_id") int owner_id) {
        chapterService.addChapter(courseNumber, 1, "新建目录", num, null, owner_id);
        return "success";
    }

    /*设置章节标题api*/
    @ResponseBody
    @PostMapping("/setChapterTitle")
    public Object setChapterTitle(@RequestParam("titleVal") String titleVal, @RequestParam("courseNumber") String courseNumber, @RequestParam("num") Integer num, @RequestParam("owner_id") int owner_id) {
        chapterService.setChapterTitle(titleVal, courseNumber, 1, num, owner_id);
        return "success";
    }

    /*删除子章节api*/
    @ResponseBody
    @PostMapping("/deleteChapter")
    public Object deleteChapter(@RequestParam("courseNumber") String courseNumber, @RequestParam("num") Integer num, @RequestParam("owner_id") int owner_id) {
        chapterService.deleteChapter(courseNumber, 1, num, owner_id);
        return "success";
    }

    /*删除子章节api*/
    @ResponseBody
    @PostMapping("/fileSend")
    public Object fileSend(@RequestParam("file") MultipartFile file, @RequestParam("courseNumber") String courseNumber, @RequestParam("num") Integer num, @RequestParam("owner_id") int owner_id) throws IOException {
        if (file == null || file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String fileName;
        /*定义上传路径*/
        String filePath = "/home/admin/Course_System/upFile/";
        fileName = file.getOriginalFilename();
        File dest = new File(filePath + fileName);
        file.transferTo(dest);
        chapterService.fileSend(fileName, courseNumber, 1, num, owner_id);
        return "success";
    }

    /*加入课程api*/
    @ResponseBody
    @GetMapping("/joinCourse")
    public Object joinCourse(@RequestParam("courseNumber") String courseNubmer, @RequestParam("userEmail") String userEmail) {
        courseService.addLearnNumber(courseNubmer);
        courseSelectionService.addSelectionByCourseNumberAndUser(courseNubmer, userEmail);
        return "success";
    }

    /*得到学习的课程列表api*/
    @ResponseBody
    @GetMapping("/getLearnByUser")
    public Object getLearnByUser(@RequestParam("userAccountNumber") String userAccountNumber) {
        List<CourseSelection> learns = courseSelectionService.getSelectionByUser(userAccountNumber);
        List<Course> learnCourses = new ArrayList<>();
        for (CourseSelection courseSelection : learns) {
            learnCourses.add(courseService.getCourseByCourseNumber(courseSelection.getCourseNumber()));
        }
        return learnCourses;
    }

    /*退出课程api*/
    @ResponseBody
    @GetMapping("/withdrawalCourse")
    public Object withdrawalCourse(@RequestParam("courseNumber") String courseNubmer, @RequestParam("userEmail") String userEmail) {
        courseService.removeLearnNumber(courseNubmer);
        courseSelectionService.removeSelectionByCourseNumberAndUser(courseNubmer, userEmail);
        return "success";
    }

    /*判断此人是否已选次课*/
    @ResponseBody
    @GetMapping("/isSelect")
    public Object isSelect(@RequestParam("courseNumber") String courseNumber, @RequestParam("userEmail") String userEmail) {
        CourseSelection courseSelection = courseSelectionService.getSelectionByUserAndCourseNumber(userEmail, courseNumber);
//        System.out.println(courseSelection);
        if (courseSelection != null && !courseSelection.getUserAccountNumber().equals("")) {
            return true;
        }
        return false;
    }

    /*使用者浏览页面时长存入api*/
    @ResponseBody
    @PostMapping("/addBrowseRecord")
    public Object addBrowseRecord(@RequestParam("browseTime") Integer browseTime, @RequestParam("userAccountNumber") String userAccountNumber, @RequestParam("courseNumber") String courseNumber) {
        browseTimeservice.addBrowseTime(browseTime, userAccountNumber, courseNumber);
        return "success";
    }

    /*用户信息修改*/
    @ResponseBody
    @PostMapping("/modifyMes")
    public String modifyMes(@RequestParam("userPaw") String userPaw,
                            @RequestParam("name") String name,
                            @RequestParam("school") String school,
                            @RequestParam("position") String position,
                            @RequestParam("introduction") String introduction,
                            @RequestParam(value = "userImage", required = false) MultipartFile userImage,
//                            @RequestParam("type") int type,
                            @RequestParam("email") String email,
//                            @RequestParam("memberTab") String memberTab,
                            HttpServletRequest request,
                            HttpServletResponse response
    ) throws IOException {
//        return userMesService.addUserMes(userPaw,name,school,position,introduction,userImage,type,email);
        User oldUserMes = getMyMes(request);
        /*不修改图片*/
        userMesService.modifyMes(userPaw, name, school, position, introduction, userImage, oldUserMes.getType(), email, oldUserMes.getMemberTab(), oldUserMes);
        loginOut(response);
        return "修改成功，请重新登录";
    }

}
