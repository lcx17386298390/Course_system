package com.evan.demo.mapper;

import com.evan.demo.pojo.CourseSelection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseSelectionMapper {

    @Select("select * from course_selection where userAccountNumber=#{userAccountNumber}")
    public List<CourseSelection> getSelectionByUser(@Param("userAccountNumber")String userAccountNumber);

    @Select("insert into course_selection(courseNumber,userAccountNumber) values(#{courseNumber},#{userAccountNumber})")
    public void addSelectionByCourseNumberAndUser(@Param("courseNumber")String courseNumber,@Param("userAccountNumber")String userAccountNumber);

    @Select("delete from course_selection where courseNumber=#{courseNumber} and userAccountNumber=#{userAccountNumber}")
    public void removeSelectionByCourseNumberAndUser(@Param("courseNumber")String courseNumber,@Param("userAccountNumber")String userAccountNumber);

    @Select("select * from course_selection where userAccountNumber=#{userAccountNumber} and courseNumber=#{courseNumber}")
    public CourseSelection getSelectionByUserAndCourseNumber(@Param("userAccountNumber")String userAccountNumber,@Param("courseNumber")String courseNumber);


}
