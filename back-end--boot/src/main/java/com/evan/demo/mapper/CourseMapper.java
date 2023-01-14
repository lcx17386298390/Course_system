package com.evan.demo.mapper;

import com.evan.demo.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Select("select * from courses order by learnNumber desc ")
    List<Course> getLearnSortCourse();

    @Select("select * from courses order by commentsNumber desc ")
    List<Course> getCommentSortCourse();

    @Select("select * from courses where teacherAccountNumber=#{teacherAccountNumber}")
    List<Course> getCourseByTeacherNumber(String teacherAccountNumber);

    @Select("select * from courses where courseNumber=#{courseNumber}")
    Course getCourseByCourseNumber(String courseNumber);
}
