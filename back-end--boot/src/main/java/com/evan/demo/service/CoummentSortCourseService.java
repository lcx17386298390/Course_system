package com.evan.demo.service;

import com.evan.demo.mapper.GetCourseMapper;
import com.evan.demo.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*查找最多评论课程算法接口*/
@Service
public class CoummentSortCourseService {
    @Autowired
    GetCourseMapper getCourse;

    public List<Course> getCommentSortCourse(){
        return getCourse.getCommentSortCourse();
    }
}
