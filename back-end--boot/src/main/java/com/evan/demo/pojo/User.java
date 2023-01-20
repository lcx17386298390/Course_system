package com.evan.demo.pojo;

import org.apache.ibatis.annotations.Param;

public class User {
    private String userPaw;
    private String name;
    private String school;
    private String position;
    private String introduction;
    private String imagePath;
    private int type;
    private String email;

    public String getUserPaw() {
        return userPaw;
    }

    public void setUserPaw(String userPaw) {
        this.userPaw = userPaw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userPaw='" + userPaw + '\'' +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", position='" + position + '\'' +
                ", introduction='" + introduction + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", type=" + type +
                ", email='" + email + '\'' +
                '}';
    }
}
