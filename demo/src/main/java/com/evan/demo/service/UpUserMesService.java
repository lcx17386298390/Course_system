package com.evan.demo.service;

import com.evan.demo.mapper.UpUserMesMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Slf4j
@Service
public class UpUserMesService {
    @Autowired
    UpUserMesMapper teacherMesMapper;


    public String addTeacherMes(String userPaw,
                                String name,
                                String school,
                                String position,
                                String introduction,
                                MultipartFile userImageFile,
                                int type,
                                String phone) {
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
            teacherMesMapper.addTeacherMes(userPaw, name, school, position, introduction, "/teacherImageFile/" + fileName,type,phone);
            log.info("上传成功");
            return "上传成功";
        } catch (IOException e) {
            log.error(e.toString(), e);
        }

        return "上传失败！";
    }
}
