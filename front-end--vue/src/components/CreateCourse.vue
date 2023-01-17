<template>
  <div class="mainDiv">
    课程名称：<input type="text" placeholder="课程名称" style="width: 226px;" id="courseName"><br><br>
    课程封面：<input type="file" id="coursePic"><br><br>
    <textarea placeholder="课程简介" id="courseIntroduction"></textarea><br><br>
    课程时长：<input type="number" placeholder="课时" style="width: 226px" id="classHours"><br><br>
    截止日期：<input type="date" style="width: 226px" id="endDate"><br><br>
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
        }
    }
}
</script>

<style>
@import '../assets/style/css/createCourse.css'
</style>