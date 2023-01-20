package com.evan.demo.pojo;

import lombok.Data;

/*章节类*/
@Data
public class Chapter {
    private String courseNumber;
    private Integer chapterType;
    private String title;
    private Integer num;
    private String fileName;
    private Integer owner_id;
}
