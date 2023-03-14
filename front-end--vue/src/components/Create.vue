<template>
  <div style="height:333px;width:752px;overflow:auto">
    <ul class="qkcListPic1 clearAfter" id="clist">
      <li>
        <div class="courseAddDiv" style="text-align:center">
          <a href="/#/createCourse" target="_blank" >
            <img src="../assets/style/image/courseAddBtn.png" style="height:130px;width:130px"><br>
            {{ $t('user.createCoursePage.createPngMes') }}
          </a>
        </div>
      </li>
      <li v-for="(value, index) in createCourseList" :key="index">
        <div class="qExpress_padd qNima">
          <div class="qExpress_pic">
            <a :href="'/#/editCourse/'+value.courseNumber+'/chapter'" target="_blank">
              <img :src="'/api/images/' + value.imagePath">
            </a>
            <span></span>
          </div>
          <dl class="qExpress_dl">
            <dt><a :href="'/#/editCourse/'+value.courseNumber+'/chapter'" target="_blank">{{ value.courseName }}</a></dt>
            <!-- <dd>{{ value.teacherSchool }} | {{ value.teacherName }}</dd> -->
          </dl>
          <div class="qExpress_state">
            <span class="colorBlue fl">{{ value.state == 1 ? $t('user.coursePage.inProgress') : $t('user.coursePage.haveEnd') }}</span>
            <span class="colorGray fr">{{ value.learnNumber }}{{ $t('user.coursePage.learnMes') }}</span>
          </div>
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
import myCreateJs from "../assets/style/js/createVue.js"
export default {
  name: "createTest",
  props:['myMes'],
  data(){
    return{
      createCourseList:''
    }
  },
  methods:{
    getCreateCourseList: function(callback){
      myCreateJs.getCourseByTeacherNumber(this.myMes.data.userAccountNumber).then(res=>{
        this.createCourseList = res.data
        callback(res)
      })
    }
  },
  mounted(){
    let _this = this
    setTimeout(()=>{
      this.getCreateCourseList(function(arr){
        _this.$nextTick(()=>{
          console.log(arr)
        })
      })
    },300)
    
  }
}
</script>

<style>
@import "../assets/style/css/createList.css"
</style>