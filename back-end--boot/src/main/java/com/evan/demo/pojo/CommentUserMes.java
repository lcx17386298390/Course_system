package com.evan.demo.pojo;

import lombok.Builder;
import lombok.Data;

@Data
public class CommentUserMes {
    private String email;
    private String imagePath;

    public CommentUserMes(String email, String imagePath) {
        this.email = email;
        this.imagePath = imagePath;
    }
}
