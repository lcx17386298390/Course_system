package com.evan.demo.mapper;

import com.evan.demo.pojo.BrowseTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BrowseTimeMapper {
    /*用来增加用户对于课程学习时长*/
    @Select("update browse_time set browseTime = #{browseTime} where userAccountNumber = #{userAccountNumber} and courseNumber = #{courseNumber}")
    void addBrowseTime(@Param("browseTime") String browseTime,
                       @Param("userAccountNumber") String userAccountNumber,
                       @Param("courseNumber") String courseNumber);

    /*用来创建用户课程学习时长*/
    @Select("insert into browse_time(browseTime,userAccountNumber,courseNumber) " +
            "values(#{browseTime},#{userAccountNumber},#{courseNumber})")
    void createBrowseTime(@Param("browseTime") String browseTime,
                       @Param("userAccountNumber") String userAccountNumber,
                       @Param("courseNumber") String courseNumber);

    /*用来创建用户课程学习时长*/
    @Select("select * from browse_time where userAccountNumber = #{userAccountNumber} and courseNumber = #{courseNumber}")
    BrowseTime getBrowseTime(@Param("userAccountNumber") String userAccountNumber,
                             @Param("courseNumber") String courseNumber);
}
