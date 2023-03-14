package com.evan.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

//评论类
@Data
public class Comment {
    private String id;
    private String subId;
    private Integer type;
    private String ownerId;
    private String fromId;
    private Integer likeNum;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")		//转化时间戳
    private Timestamp createTime;
}
