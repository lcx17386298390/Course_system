package com.evan.demo.service;

import com.evan.demo.mapper.CourseMapper;
import com.evan.demo.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    public List<Course> getCourseByTeacherNumber(String teacherAccountNumber){
        return courseMapper.getCourseByTeacherNumber(teacherAccountNumber);
    }

    public Course getCourseByCourseNumber(String courseNumber){
        return courseMapper.getCourseByCourseNumber(courseNumber);
    }
}
