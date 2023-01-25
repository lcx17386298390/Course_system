package com.evan.demo.service;

import com.evan.demo.mapper.CourseSelectionMapper;
import com.evan.demo.pojo.CourseSelection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseSelectionService {
    @Autowired
    CourseSelectionMapper courseSelectionMapper;

    public List<CourseSelection> getSelectionByUser(String userAccountNumber) {
        return courseSelectionMapper.getSelectionByUser(userAccountNumber);
    }

    public void addSelectionByCourseNumberAndUser(String courseNumber,String userAccountNumber) {
        courseSelectionMapper.addSelectionByCourseNumberAndUser(courseNumber,userAccountNumber);
    }

    public void removeSelectionByCourseNumberAndUser(String courseNumber,String userAccountNumber) {
        courseSelectionMapper.removeSelectionByCourseNumberAndUser(courseNumber,userAccountNumber);
    }

    public CourseSelection getSelectionByUserAndCourseNumber(String userAccountNumber,String courseNumber){
        return courseSelectionMapper.getSelectionByUserAndCourseNumber(userAccountNumber,courseNumber);
    }
}
