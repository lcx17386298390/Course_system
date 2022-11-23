package com.evan.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UpUserMesMapper {

    /**
     *
     * @param userPaw 用户的密码
     * @param name    用户的姓名
     * @param school    用户的学校
     * @param position  用户职位（老师）
     * @param introduction  用户简介（老师）
     * @param imagePath 头像图片的路径
     * @param type  用户类型（0--学生，1--老师）
     * @param phone 用户电话
     */
    @Select("insert into user_list (userPaw,name,school,position,introduction,imagePath,type,phone) values (#{userPaw},#{name},#{school},#{position},#{introduction},#{imagePath},#{type},#{phone})")
    void addTeacherMes(@Param("userPaw") String userPaw,
                       @Param("name") String name,
                       @Param("school") String school,
                       @Param("position") String position,
                       @Param("introduction") String introduction,
                       @Param("imagePath") String imagePath,
                       @Param("type") int type,
                       @Param("phone") String phone);
}