<template>
<div class="mainDiv">
    <!-- <form method="post" action="/createCourse" enctype="multipart/form-data"> -->
        课程名称：<input type="text" placeholder="课程名称" style="width: 226px;" id="courseName" name="courseName"><br><br>
        课程封面：<input type="file" id="coursePic" name="file" @change="getFile($event)"><br><br>
        <textarea placeholder="课程简介" id="courseIntroduction" name="courseIntroduction"></textarea><br><br>
        课程时长：<input type="number" placeholder="课时" style="width: 226px" id="classHours" name="classHours"><br><br>
        截止日期：<input type="date" style="width: 226px" id="endDate" name="endDate"><br><br>
        <div><input type="button" value="创建课程" @click="btnClick"></div>
  </div>
</template>

<script>
import createCourseJs from '@/assets/style/js/createCourseVue.js'
export default {
    name: 'CreateCourse',
    props: ['myMes'],
    data(){
        return{
            that: this
        }
    },
    methods: {
        btnClick: function(){
            createCourseJs.btnClick(this.that,this.myMes.data.email)
        },
        getFile: function(event){
            createCourseJs.getFile(event)
        }
    }
}
</script>

<style>
@import '../assets/style/css/createCourse.css'
</style>