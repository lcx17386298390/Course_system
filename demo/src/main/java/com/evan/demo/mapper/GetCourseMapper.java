package com.evan.demo.mapper;

import com.evan.demo.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GetCourseMapper {

    @Select("select * from courses order by learnNumber desc ")
    List<Course> getLearnSortCourse();

    @Select("select * from courses order by commentsNumber desc ")
    List<Course> getCommentSortCourse();
}
