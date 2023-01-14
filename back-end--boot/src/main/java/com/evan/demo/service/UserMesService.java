package com.evan.demo.service;

import com.evan.demo.mapper.UserMesMapper;
import com.evan.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class UserMesService {
    @Autowired
    UserMesMapper userMesMapper;


    public String addUserMes(String userPaw,
                                String name,
                                String school,
                                String position,
                                String introduction,
                                MultipartFile userImageFile,
                                int type,
                                String email) {
        if (userImageFile == null) {
            return "上传失败";
        }

        String fileName = new String();
        /*定义上传路径*/

        String filePath = "C:/Users/lcx17/Desktop/upFile/teacherImageFile/";
        File folder = new File(filePath);
        if (!folder.exists() && !folder.isDirectory()) {
            folder.mkdir();
        }

        fileName = userImageFile.getOriginalFilename();
        File dest = new File(filePath + fileName);
        try {
            userImageFile.transferTo(dest);
            userMesMapper.addUserMes(userPaw, name, school, position, introduction, "/teacherImageFile/" + fileName,type,email);
            log.info("上传成功");
            return "上传成功，请在首页登录";
        } catch (IOException e) {
            log.error(e.toString(), e);
        }

        return "上传失败！";
    }

    public User getUserByEmail(String email){
        User user = userMesMapper.getUserByEmail(email);
        if(user!=null&&user.getEmail().equals(email)){
            return user;
        }
        return null;
    }
}
