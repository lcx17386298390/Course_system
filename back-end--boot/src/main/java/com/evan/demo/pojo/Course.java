package com.evan.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class Course {
    private String courseNumber;
    private String courseName;
    private String teacherName;
    private String teacherSchool;
    private String imagePath;
    private int state;
    private int learnNumber;
    private int commentsNumber;
    private String teacherAccountNumber;
    private Date startDate;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")		//转化时间戳
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    private Integer classHours;
    private String courseIntroduction;

    public Course(String courseNumber, String courseName, String teacherName, String teacherSchool, String imagePath, int state, int learnNumber, int commentsNumber, String teacherAccountNumber, Date startDate, Date endDate, Integer classHours, String courseIntroduction) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.teacherSchool = teacherSchool;
        this.imagePath = imagePath;
        this.state = state;
        this.learnNumber = learnNumber;
        this.commentsNumber = commentsNumber;
        this.teacherAccountNumber = teacherAccountNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.classHours = classHours;
        this.courseIntroduction = courseIntroduction;
    }
}
