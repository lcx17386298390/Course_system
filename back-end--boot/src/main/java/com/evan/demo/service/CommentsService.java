package com.evan.demo.service;

import com.evan.demo.mapper.CommentsMapper;
import com.evan.demo.pojo.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {

    @Autowired
    CommentsMapper commentsMapper;

    public List<Comment> getCommentsByIdAndType(String id, int type){
        return commentsMapper.getCommentsByIdAndType(id,type);
    }

    public List<Comment> getCommentsByIdAndOwner_id(String id, String ownerId){
        return commentsMapper.getCommentsByIdAndOwner_id(id,ownerId);
    }

    public List<Comment> getCommentsById(String id){
        return commentsMapper.getCommentById(id);
    }

    public void addComment(String id,
                           String sub_id,
                           Integer type,
                           String owner_id,
                           String from_id,
                           Integer like_num,
                           String content,
                           String create_time){
        commentsMapper.addCommend(id,sub_id,type,owner_id,from_id,like_num,content,create_time);
    }

}
