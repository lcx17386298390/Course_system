package com.evan.demo.pojo;

public class Course {
    private String courseNumber;
    private String courseName;
    private String teacherName;
    private String teacherSchool;
    private String imagePath;
    private int state;
    private int learnNumber;
    private int commentsNumber;

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public void setCommentsNumber(int commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSchool() {
        return teacherSchool;
    }

    public void setTeacherSchool(String teacherSchool) {
        this.teacherSchool = teacherSchool;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getLearnNumber() {
        return learnNumber;
    }

    public void setLearnNumber(int learnNumber) {
        this.learnNumber = learnNumber;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNumber='" + courseNumber + '\'' +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSchool='" + teacherSchool + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", state=" + state +
                ", learnNumber=" + learnNumber +
                ", commentsNumber=" + commentsNumber +
                '}';
    }

    public Course(String courseNumber, String courseName, String teacherName, String teacherSchool, String imagePath, int state, int learnNumber, int commentsNumber) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.teacherSchool = teacherSchool;
        this.imagePath = imagePath;
        this.state = state;
        this.learnNumber = learnNumber;
        this.commentsNumber = commentsNumber;
    }
}
