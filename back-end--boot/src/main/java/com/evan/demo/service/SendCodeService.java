package com.evan.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class SendCodeService {

    @Autowired
    JavaMailSenderImpl mailSender;

    public Map sendCode(String emailNumber){
        Map<String,Object>codeMap = new HashMap<>();
        String code = null;
        try {
            /*一封简单的邮件*/
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            /*邮件标题*/
            mailMessage.setSubject("邮件验证码");
            /*邮件内容(随机生成验证码)*/
            code = UUID.randomUUID().toString().substring(0,6);
            mailMessage.setText(code);
            /*发送人(必须和配置文件中的username相同)*/
            mailMessage.setFrom("2948065094@qq.com");
            /*收件人*/
            mailMessage.setTo(emailNumber);
            /*发送*/
            mailSender.send(mailMessage);
        }catch (Exception e){
            codeMap.put("status","404");
            codeMap.put("successMes","验证码请求失败");
            codeMap.put("code",null);
        }
        codeMap.put("status","200");
        codeMap.put("successMes","发送成功");
        codeMap.put("code",code);
        return codeMap;
    }
}
