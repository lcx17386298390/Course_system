package com.evan.demo.pojo;

import lombok.Data;
import org.apache.ibatis.annotations.Param;

@Data
public class User {
    private String userPaw;
    private String name;
    private String school;
    private String position;
    private String introduction;
    private String imagePath;
    private int type;
    private String email;
    private Integer memberTab;
    private String userAccountNumber;
    private String bobby1;
    private String bobby2;
    private String bobby3;
}
