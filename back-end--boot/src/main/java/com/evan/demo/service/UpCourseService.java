package com.evan.demo.service;

import com.evan.demo.mapper.UpCourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpCourseService {
    @Autowired
    UpCourseMapper upCourse;

    public void addCourse(String courseNumber, String courseName, String teacherName, String teacherSchool, String imagePath, int state, int learnNumber, int commentsNumber) {
        upCourse.addCourse(courseNumber, courseName, teacherName, teacherSchool, imagePath, state, learnNumber, commentsNumber);
    }

}
