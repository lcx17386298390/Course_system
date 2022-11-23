package com.evan.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
/*增加、删除、修改课程接口*/
public interface UpCourseMapper {
    /* 添加课程 */
    @Select("insert into courses(courseNumber,courseName,teacherName,teacherSchool,imagePath,state,learnNumber,commentsNumber) " +
            "values (#{courseNumber},#{courseName},#{teacherName},#{teacherSchool},#{imagePath},#{state},#{learnNumber},#{commentsNumber})")
    void addCourse(@Param("courseNumber") String courseNumber,
                   @Param("courseName") String courseName,
                   @Param("teacherName") String teacherName,
                   @Param("teacherSchool") String teacherSchool,
                   @Param("imagePath") String imagePath,
                   @Param("state") int state,
                   @Param("learnNumber") int learnNumber,
                   @Param("commentsNumber")int commentsNumber);
}
