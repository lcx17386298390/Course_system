<template>
<div class="mainDiv">
    <!-- <form method="post" action="/createCourse" enctype="multipart/form-data"> -->
        {{ $t('user.createCoursePage.courseName') }}：<input type="text" :placeholder="this.$t('user.createCoursePage.courseName')" style="width: 226px;" id="courseName" name="courseName"><br><br>
        {{ $t('user.createCoursePage.courseCover') }}：<input type="file" id="coursePic" name="file" @change="getFile($event)"><br><br>
        <textarea :placeholder="$t('user.createCoursePage.courseIntroduction')" id="courseIntroduction" name="courseIntroduction"></textarea><br><br>
        {{ $t('user.createCoursePage.courseHour') }}：<input type="number" :placeholder="$t('user.createCoursePage.courseHour')" style="width: 226px" id="classHours" name="classHours"><br><br>
        {{ $t('user.createCoursePage.courseType') }}：
            <select id="classesTab" class="shortselect">
                <option disabled selected hidden :label="$t('user.createCoursePage.courseTypePrompt')"></option>
                <option
                    v-for="item in this.options"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value"
                    :selected="item.selected"
                />
            </select><br><br>
            {{ $t('user.createCoursePage.memberType') }}：<input type="radio" value=0 name="memberTab" :title="$t('user.createCoursePage.noMember')" id="memberRadio1"><label for="memberRadio1">{{ $t('user.createCoursePage.noMember') }}</label> <input type="radio" value=1 name="memberTab" id="memberRadio2" :title="$t('user.createCoursePage.isMember')"><label for="memberRadio2">{{ $t('user.createCoursePage.isMember') }}</label><br><br>
            {{ $t('user.createCoursePage.deadlineDate') }}：<input type="date" style="width: 226px" id="endDate" name="endDate"><br><br>
        <div><input type="button" :value="$t('user.createCoursePage.createCourse')" @click="btnClick"></div>
  </div>
</template>
<script>
import createCourseJs from '@/assets/style/js/createCourseVue.js'
export default {
    name: 'CreateCourse',
    props: ['myMes'],
    data(){
        return{
            value:'',
            that: this,
            options :[
                {
                    value: 1,
                    label: this.$t('user.discipline.medicalScience'),
                    disabled:false,
                    selected:false
                },
                {
                    value: 2,
                    label: this.$t('user.discipline.philosophy'),
                    disabled:false,
                    selected:false
                },
                {
                    value: 3,
                    label: this.$t('user.discipline.engineering'),
                    disabled:false,
                    selected:false
                },
                {
                    value: 4,
                    label: this.$t('user.discipline.pedagogy'),
                    disabled:false,
                    selected:false
                },
                {
                    value: 5,
                    label: this.$t('user.discipline.literature'),
                    disabled:false,
                    selected:false
                },
                {
                    value: 6,
                    label: this.$t('user.discipline.jurisprudence'),
                    disabled:false,
                    selected:false
                },
                {
                    value: 7,
                    label: this.$t('user.discipline.neoConfucianism'),
                    disabled:false,
                    selected:false
                },
                {
                    value: 8,
                    label: this.$t('user.discipline.management'),
                    disabled:false,
                    selected:false
                },
                {
                    value: 9,
                    label: this.$t('user.discipline.art'),
                    disabled:false,
                    selected:false
                },
            ]
        }
    },
    methods: {
        btnClick: function(){
            createCourseJs.btnClick(this.that,this.myMes.data.userAccountNumber)
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