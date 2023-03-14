package com.evan.demo.mapper;

import com.evan.demo.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentsMapper {

    /*通过视频id（主键）和评论类型 获取评论---得到主评论*/
    @Select("select * from comments_info where id=#{id} and type=#{type}")
    List<Comment> getCommentsByIdAndType(@Param("id") String id,@Param("type") int type);

    /*通过视频id（主键）和视频回复目标主题id 获取评论---得到次评论（回复的评论）*/
    @Select("select * from comments_info where id=#{id} and ownerId=#{ownerId}")
    List<Comment> getCommentsByIdAndOwner_id(@Param("id") String id,@Param("ownerId") String ownerId);

    @Select("select * from comments_info where id=#{id}")
    List<Comment> getCommentById(@Param("id") String id);

    @Select("insert into comments_info(id,subId,type,ownerId,fromId,likeNum,content,createTime)" +
            "values (#{id},#{subId},#{type},#{ownerId},#{fromId},#{likeNum},#{content},#{createTime})")
    void addCommend(@Param("id") String id,
                    @Param("subId") String subId,
                    @Param("type") Integer type,
                    @Param("ownerId") String ownerId,
                    @Param("fromId") String fromId,
                    @Param("likeNum") Integer likeNum,
                    @Param("content") String content,
                    @Param("createTime") String createTime);

}
