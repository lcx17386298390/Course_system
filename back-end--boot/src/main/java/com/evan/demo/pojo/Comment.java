package com.evan.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

//评论类
@Data
public class Comment {
    private String id;
    private String sub_id;
    private Integer type;
    private String owner_id;
    private String from_id;
    private Integer like_num;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")		//转化时间戳
    private Timestamp create_time;
}
