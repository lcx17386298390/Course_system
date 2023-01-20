package com.evan.demo.mapper;

import com.evan.demo.pojo.Chapter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ChapterMapper {

    @Select("select * from chapter where courseNumber=#{courseNumber} and chapterType=#{chapterType}")
    List<Chapter> getChapterByCourseNumberAndType(@Param("courseNumber") String courseNumber,@Param("chapterType") int chapterType);

    @Select("select * from chapter where courseNumber=#{courseNumber} and owner_id=#{owner_id}")
    List<Chapter> getChapterByCourseNumberAndOwnerId(@Param("courseNumber") String courseNumber,@Param("owner_id") int owner_id);

    @Select("select * from chapter where courseNumber=#{courseNumber} and owner_id=#{owner_id} and num=#{num}")
    Chapter getChapterByCourseNumberAndOwnerIdAndNum(@Param("courseNumber") String courseNumber,@Param("owner_id") int owner_id,@Param("num") int num);

    @Select("insert into chapter(courseNumber,chapterType,title,num,fileName,owner_id)"+
            "values(#{courseNumber},#{chapterType},#{title},#{num},#{fileName},#{owner_id})")
    void addChapter(@Param("courseNumber") String courseNumber,
                        @Param("chapterType") int chapterType,
                        @Param("title") String title,
                        @Param("num") Integer num,
                        @Param("fileName") String fileName,
                        @Param("owner_id") Integer owner_id);

}
