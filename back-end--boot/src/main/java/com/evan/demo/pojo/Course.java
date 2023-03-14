package com.evan.demo.pojo;

import lombok.Data;

import java.sql.Date;

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
    private Integer memberTab;
    private Integer classesTab;
}
