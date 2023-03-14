package com.evan.demo.service;

import com.evan.demo.mapper.CourseMapper;
import com.evan.demo.pojo.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
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

    public void addCourse(String courseNumber, String courseName, String teacherName, String teacherSchool, String imagePath, int state, int learnNumber, int commentsNumber, String teacherAccountNumber, String startDate, String endDate, Integer classHours, Integer memberTab, Integer classesTab, String courseIntroduction) {
        courseMapper.addCourse(courseNumber, courseName, teacherName, teacherSchool, imagePath, state, learnNumber, commentsNumber,teacherAccountNumber,startDate, endDate,classHours,memberTab,classesTab, courseIntroduction);
    }

    public void addLearnNumber(String courseNumber){
        courseMapper.addLearnNumber(courseNumber);
    }

    public void removeLearnNumber(String courseNumber){
        courseMapper.removeLearnNumber(courseNumber);
    }

    public void addCommentNumber(String courseNumber){
        courseMapper.addCommentNumber(courseNumber);
    }

    public Integer getCourseCount(){
        return courseMapper.getCourseCount();
    }
}
