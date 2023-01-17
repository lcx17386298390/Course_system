<template>
  <div style="height:333px;width:752px;overflow:auto">
    <ul class="qkcListPic1 clearAfter" id="clist">
      <li>
        <div class="courseAddDiv" style="text-align:center">
          <a href="/#/createCourse" target="_blank" >
            <img src="../assets/style/image/courseAddBtn.png" style="height:130px;width:130px"><br>
            点击创建课程
          </a>
        </div>
      </li>
      <li v-for="(value, index) in createCourseList" :key="index">
        <div class="qExpress_padd qNima">
          <div class="qExpress_pic">
            <a href="/#" target="_blank">
              <img :src="'/images/' + value.imagePath">
            </a>
            <span></span>
          </div>
          <dl class="qExpress_dl">
            <dt><a href="/#" target="_blank">{{ value.courseName }}</a></dt>
            <!-- <dd>{{ value.teacherSchool }} | {{ value.teacherName }}</dd> -->
          </dl>
          <div class="qExpress_state">
            <span class="colorBlue fl">{{ value.state == 1 ? "进行中" : "已结束" }}</span>
            <span class="colorGray fr">{{ value.learnNumber }}人已学</span>
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
      myCreateJs.getCourseByTeacherNumber(this.myMes.data.email).then(res=>{
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