package com.evan.demo.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginStateService {

    /*登录状态检测方法
     * 此service方法没有与数据库交互，所以没有mappaer层
     * 返回一个map，装有登录状态和登录信息
     * */
    public Map loginStateDetection(HttpServletResponse response, HttpServletRequest request) {
        Map<String, Object> maps = new HashMap<>();
        Cookie cookies[] = request.getCookies();
        /* cookie数据为空, */
        if(cookies!=null){
            for(Cookie cookie:cookies){
                /*
                * 相当做了第二次验证，非空不一定登陆
                * */
                if(cookie.getName().equals("userName")&&cookie.getValue()!=null){
                    maps.put("state",true);
                    maps.put("loginUser",cookie.getValue());
                    return maps;
                }
            }
        }
        /*为空设置登录状态为false返回*/
        maps.put("state",false);
        maps.put("loginUser",false);
        return maps;
    }
}
