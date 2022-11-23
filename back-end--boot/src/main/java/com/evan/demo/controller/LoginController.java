package com.evan.demo.controller;

import com.alibaba.fastjson.JSON;
import com.evan.demo.pojo.Course;
import com.evan.demo.pojo.SlideImage;
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
    UpUserMesService teacherMesService;

    @ResponseBody
    @GetMapping("/")
    public String studentFun(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> loginStateMap = loginStateService.loginStateDetection(response, request);

        List<Object> slideImageList = new ArrayList<>();
        map.put("slideImageList", slideImageList);


        Integer id = 0;
        slideImageList.add(new SlideImage("https://s1.imagehub.cc/images/2022/11/01/4496d3ff64ab8251fdc3ecc65228f298.jpg", id++));
        slideImageList.add(new SlideImage("https://s1.imagehub.cc/images/2022/11/01/790b6e214da38a35532dddbc5b9a9ba9.png", id++));
        slideImageList.add(new SlideImage("https://s1.imagehub.cc/images/2022/11/01/6f0203d00029bb436ec2e19dc6319c15.png", id++));
        slideImageList.add(new SlideImage("https://s1.imagehub.cc/images/2022/11/01/518cc9b94f05ec96302c6f4efe704bf1.jpg", id++));
        slideImageList.add(new SlideImage("https://s1.imagehub.cc/images/2022/11/01/95dbb6a6c55b215026c1a8c2b3482820.jpg", id++));
        slideImageList.add(new SlideImage("https://s1.imagehub.cc/images/2022/11/01/79782df46a0354c3e4e48f2d2707d7d1.jpg", id++));
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

    /* 登录api（测试中） */
    @ResponseBody
    @PostMapping("/login")
    public String login(@RequestParam("userName") String userName, @RequestParam("userPaw") String userPaw, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("userName", userName);
        Cookie cookie2 = new Cookie("userPaw", userPaw);

        /*不设置cookie时间限制*/   
//        cookie1.setMaxAge(30);
//        cookie2.setMaxAge(30);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        return cookie1.getValue() + "+" + cookie2.getValue();
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


    @ResponseBody
    @PostMapping("/upTeacherMes")
    public String upTeacherMes(@RequestParam("userPaw") String userPaw,
                               @RequestParam("name") String name,
                               @RequestParam("school") String school,
                               @RequestParam("position") String position  ,
                               @RequestParam("introduction") String introduction,
                               @RequestParam("userImage") MultipartFile userImage,
                               @RequestParam("type") int type,
                               @RequestParam("phone") String phone){
        return teacherMesService.addTeacherMes(userPaw,name,school,position,introduction,userImage,type,phone);
    }

    @ResponseBody
    @GetMapping("/courselist")
    public Map getAllSource(){
        Map<String,Object>allCourceMap = new HashMap<>();
        List<Course>allCourseList = learnSortCourseService.getLearnSortCourse();
        allCourceMap.put("allCourseList",allCourseList);
        return allCourceMap;
    }

}
