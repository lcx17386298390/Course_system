package com.evan.demo.service;

import com.evan.demo.mapper.ChapterMapper;
import com.evan.demo.pojo.Chapter;
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

}
