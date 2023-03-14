package com.evan.demo.service;

import com.evan.demo.mapper.UserMesMapper;
import com.evan.demo.pojo.Course;
import com.evan.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserMesService {
    @Autowired
    UserMesMapper userMesMapper;

    public Object[] imageStart(MultipartFile userImageFile){

        Object[] list = new Object[3];
        list[0] = 1;
        if (userImageFile == null) {
            list[0] = 0;
        }

        String fileName;
        /*定义上传路径*/

        String filePath = "/home/admin/Course_System/upFile/userImageFile/";
        File folder = new File(filePath);
        if (!folder.exists() && !folder.isDirectory()) {
            folder.mkdir();
        }
        fileName = userImageFile.getOriginalFilename();
        File dest = new File(filePath + fileName);
        list[1] = fileName;
        list[2] = dest;
        return list;
    }


    public String addUserMes(String userPaw,
                             String name,
                             String school,
                             String position,
                             String introduction,
                             MultipartFile userImageFile,
                             int type,
                             String email,
                             int memberTab,
                             String hobby1,
                             String hobby2,
                             String hobby3) {
        Object[] list = imageStart(userImageFile);
        if((int)list[0] == 0){
            return "上传失败，请重新上传";
        }
        try {
            userImageFile.transferTo((File) list[2]);
            int userNum = getUserCount();
            String num = Integer.toString(1000000000 + userNum);
            userMesMapper.addUserMes(userPaw, name, school, position, introduction, "userImageFile/" + (String) list[1], type, email, memberTab,num,hobby1,hobby2,hobby3);
            log.info("上传成功");
            return "上传成功，请在首页登录";
        } catch (IOException e) {
            log.error(e.toString(), e);
        }
//
        return "上传失败！";
    }

    public User getUserByEmail(String email) {
        User user = userMesMapper.getUserByEmail(email);
        if (user != null && user.getEmail().equals(email)) {
            return user;
        }
        return null;
    }

    public User getUserByAccountNumber(String userAccountNumber) {
        User user = userMesMapper.getUserByAccountNumber(userAccountNumber);
        if (user != null && user.getUserAccountNumber().equals(userAccountNumber)) {
            return user;
        }
        return null;
    }

    public Object modifyMes(String userPaw,
                            String name,
                            String school,
                            String position,
                            String introduction,
                            MultipartFile userImageFile,
                            int type,
                            String email,
                            int memberTab,
                            User oldMes) throws IOException {
        Object[] list;
        System.out.println(userImageFile);
        if(userImageFile==null){
            list = new Object[3];
            list[0] = 1;
            String imageMes = oldMes.getImagePath();
            String imageMes2 = imageMes.substring(imageMes.indexOf('/',1)+1);
            System.out.println(imageMes2+"--");
            list[1] = imageMes2;
        }else{
            list = imageStart(userImageFile);
            userImageFile.transferTo((File) list[2]);
        }

        if((int)list[0] == 0){
            return "修改失败，请重新上传";
        }
        userMesMapper.modifyMes(userPaw, name, school, position, introduction, "/userImageFile/" + (String) list[1], type, email, memberTab, oldMes.getUserAccountNumber());
        log.info("上传成功");
        return "上传成功，请在首页登录";

//        return "上传失败！";
    }

    public Integer getUserCount(){
        return userMesMapper.getUserCount();
    }
}
