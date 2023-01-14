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
    @Select("select * from comments_info where id=#{id} and owner_id=#{owner_id}")
    List<Comment> getCommentsByIdAndOwner_id(@Param("id") String id,@Param("owner_id") String owner_id);

    @Select("select * from comments_info where id=#{id}")
    List<Comment> getCommentById(@Param("id") String id);

    @Select("insert into comments_info(id,sub_id,type,owner_id,from_id,like_num,content,create_time)" +
            "values (#{id},#{sub_id},#{type},#{owner_id},#{from_id},#{like_num},#{content},#{create_time})")
    void addCommend(@Param("id") String id,
                    @Param("sub_id") String sub_id,
                    @Param("type") Integer type,
                    @Param("owner_id") String owner_id,
                    @Param("from_id") String from_id,
                    @Param("like_num") Integer like_num,
                    @Param("content") String content,
                    @Param("create_time") String create_time);

}
