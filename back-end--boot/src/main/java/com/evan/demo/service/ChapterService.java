package com.evan.demo.service;

import com.evan.demo.mapper.ChapterMapper;
import com.evan.demo.pojo.Chapter;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {
    @Autowired
    ChapterMapper chapterMapper;

    public List<Chapter> getChapterByCourseNumberAndType(String courseNumber,int type){
        return chapterMapper.getChapterByCourseNumberAndType(courseNumber,type);
    }

    public List<Chapter> getChapterByCourseNumberAndOwnerId(String courseNumber,int ownerId){
        return chapterMapper.getChapterByCourseNumberAndOwnerId(courseNumber,ownerId);
    }

    public Chapter getChapterByCourseNumberAndOwnerIdAndNum(String courseNumber, int owner_id, int num){
        return chapterMapper.getChapterByCourseNumberAndOwnerIdAndNum(courseNumber,owner_id,num);
    }

    public void addChapter(String courseNumber,int chapterType,String title,Integer num,String fileName,Integer owner_id){
        chapterMapper.addChapter(courseNumber,chapterType,title,num,fileName,owner_id);
    }

}
