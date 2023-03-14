package com.evan.demo.mapper;

import com.evan.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMesMapper {

    /**
     * @param userPaw      用户的密码
     * @param name         用户的姓名
     * @param school       用户的学校
     * @param position     用户职位（老师）
     * @param introduction 用户简介（老师）
     * @param imagePath    头像图片的路径
     * @param type         用户类型（0--学生，1--老师）
     * @param email        用户电话
     */
    @Select("insert into user_list (userPaw,name,school,position,introduction,imagePath,type,email,memberTab,userAccountNumber,hobby1,hobby2,hobby3) values (#{userPaw},#{name},#{school},#{position},#{introduction},#{imagePath},#{type},#{email},#{memberTab},#{userAccountNumber},#{hobby1},#{hobby2},#{hobby3})")
    void addUserMes(@Param("userPaw") String userPaw,
                    @Param("name") String name,
                    @Param("school") String school,
                    @Param("position") String position,
                    @Param("introduction") String introduction,
                    @Param("imagePath") String imagePath,
                    @Param("type") int type,
                    @Param("email") String email,
                    @Param("memberTab") Integer memberTab,
                    @Param("userAccountNumber") String userAccountNumber,
                    @Param("hobby1") String hobby1,
                    @Param("hobby2") String hobby2,
                    @Param("hobby3") String hobby3);

    @Select("select * from user_list where email=#{email}")
    User getUserByEmail(String email);

    @Select("select * from user_list where userAccountNumber=#{userAccountNumber}")
    User getUserByAccountNumber(String userAccountNumber);

    @Select("update user_list set userPaw=#{userPaw},name=#{name},school=#{school},position=#{position},introduction=#{introduction},imagePath=#{imagePath},type=#{type},email=#{email},memberTab=#{memberTab} where userAccountNumber=#{userAccountNumber}")
    void modifyMes(@Param("userPaw") String userPaw,
                   @Param("name") String name,
                   @Param("school") String school,
                   @Param("position") String position,
                   @Param("introduction") String introduction,
                   @Param("imagePath") String imagePath,
                   @Param("type") Integer type,
                   @Param("email") String email,
                   @Param("memberTab") Integer memberTab,
                   @Param("userAccountNumber") String userAccountNumber);

    @Select("select count(*) from user_list")
    Integer getUserCount();
}