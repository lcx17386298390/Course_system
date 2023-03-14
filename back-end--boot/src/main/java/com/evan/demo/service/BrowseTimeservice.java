package com.evan.demo.service;


import com.evan.demo.mapper.BrowseTimeMapper;
import com.evan.demo.pojo.BrowseTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrowseTimeservice {

    @Autowired
    BrowseTimeMapper browseTimeMapper;

    public void addBrowseTime(Integer browseTime,String userAccountNumber,String courseNumber){
        BrowseTime browseTimeClass = getBrowseTime(userAccountNumber,courseNumber);
        /*空的代表没有这个数据，需要重新创建*/
        if(browseTimeClass==null) {
            String browseTimeVal = String.valueOf(browseTime);
            createBrowseTime(browseTimeVal, userAccountNumber, courseNumber);
        }else{  /*已经存在，此时需要加时间*/
            Integer beforeTime = Integer.valueOf(browseTimeClass.getBrowseTime());
            Integer endTime = beforeTime+browseTime;
            String browseTimeVal = String.valueOf(endTime);
            browseTimeMapper.addBrowseTime(browseTimeVal,userAccountNumber,courseNumber);
        }
    }

    public void createBrowseTime(String browseTime,String userAccountNumber,String courseNumber){
        browseTimeMapper.createBrowseTime(browseTime,userAccountNumber,courseNumber);
    }

    public BrowseTime getBrowseTime(String userAccountNumber, String courseNumber){
        return browseTimeMapper.getBrowseTime(userAccountNumber,courseNumber);
    }

}