package com.evan.demo.pojo;

import lombok.Data;

/*章节类*/
@Data
public class Chapter {
    private String courseNumber;
    private String chapterType;
    private String title;
    private Integer num;
    private String website;
    private Integer owner_id;
}
