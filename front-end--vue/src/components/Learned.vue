<template>
  <div style="height:333px;width:752px;overflow:auto">
    <ul class="qkcListPic1 clearAfter" id="clist">
      <li v-for="(value, index) in LearnCourseList" :key="index">
        <div class="qExpress_padd qNima">
          <div class="qExpress_pic">
            <a :href="'/#/coursePage/' + value.courseNumber " target="_blank">
              <img :src="'/images/' + value.imagePath">
            </a>
            <span></span>
          </div>
          <dl class="qExpress_dl">
            <dt><a :href="'/#/coursePage/' + value.courseNumber " target="_blank">{{ value.courseName }}</a>
            </dt>
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
import myCreateJs from "../assets/style/js/learnedVue.js"
export default {
  name: "LearnedTest",
  props:['myMes'],
  data(){
    return{
      LearnCourseList:''
    }
  },
  methods:{
    getLearnCourseList: function(callback){
      myCreateJs.getLearnCourseByTeacherNumber(this.myMes.data.email).then(res=>{
        this.LearnCourseList = res.data
        callback(res)
      })
    }
  },
  mounted(){
    let _this = this
    setTimeout(()=>{
      this.getLearnCourseList(function(arr){
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