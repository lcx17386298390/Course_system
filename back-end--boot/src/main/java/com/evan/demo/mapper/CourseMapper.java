package com.evan.demo.mapper;

import com.evan.demo.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
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

    /* 添加课程 */
    @Select("insert into courses(courseNumber,courseName,teacherName,teacherSchool,imagePath,state,learnNumber,commentsNumber,teacherAccountNumber,startDate,endDate,classHours,courseIntroduction) " +
            "values (#{courseNumber},#{courseName},#{teacherName},#{teacherSchool},#{imagePath},#{state},#{learnNumber},#{commentsNumber},#{teacherAccountNumber},#{startDate},#{endDate},#{classHours},#{courseIntroduction})")
    void addCourse(@Param("courseNumber") String courseNumber,
                   @Param("courseName") String courseName,
                   @Param("teacherName") String teacherName,
                   @Param("teacherSchool") String teacherSchool,
                   @Param("imagePath") String imagePath,
                   @Param("state") int state,
                   @Param("learnNumber") int learnNumber,
                   @Param("commentsNumber") int commentsNumber,
                   @Param("teacherAccountNumber") String teacherAccountNumber,
                   @Param("startDate") Date startDate,
                   @Param("endDate") Date endDate,
                   @Param("classHours") Integer classHours,
                   @Param("courseIntroduction") String courseIntroduction);
}
