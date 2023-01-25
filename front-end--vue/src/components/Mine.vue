<template>
    <div class="body">
        <div style="height:66px"></div>
        <div class="g-doc f-cb m-center">
            <div class="MyOpenNav_navBody" data-v-87842d9c="">
                <dl class="mine" data-v-87842d9c="">
                    <dd data-v-87842d9c=""><img :src="myMes.data.imagePath" alt="" srcset="" class="avator" data-v-87842d9c=""></dd>
                    <!---->
                    <dt data-v-87842d9c="">
                        <h4 class="mine-login" data-v-87842d9c="">{{ myMes.data.name }}</h4>
                    </dt>
                </dl>
                <ul class="u-sd f-cb f-tal f-fs1" data-v-87842d9c="">
                    <li class="coupon crt-s" data-v-87842d9c="" id="myMes" name="btnList">
                        <router-link to="myMes" data-v-87842d9c="" >{{$t('user.myMes')}}</router-link>
                    </li>
                    <li class="coupon" data-v-87842d9c="" id="createBtn" name="btnList" :style="{display:(myMes.data.type==1?'block':'none')}">
                        <router-link to="myCreated" data-v-87842d9c="" >{{$t('user.createCourse')}}</router-link>
                    </li>
                    <li class="course" data-v-87842d9c="" id="learnedBtn" name="btnList">
                        <router-link to="myLearned" data-v-87842d9c="" >{{$t('user.coursesLearned')}}</router-link>
                    </li>
                    <!-- <li class="pay crt-s" data-v-87842d9c="" id="collectionBtn" name="btnList">
                        <router-link to="myCollection" data-v-87842d9c="" >我的收藏</router-link>
                    </li> -->
                    <!-- <li class="plr" data-v-87842d9c="" id="playRecordBtn" name="btnList">
                        <router-link to="myPlayRecord" data-v-87842d9c="" >{{$t('user.playbackRecord')}}</router-link>
                    </li> -->
                </ul>
            </div>
            <div class="g-mn-b">
                <div class="mnc m-storeCenter" data-v-3d27f6cb="">
                    <ul class="m-tab-s f-cb" data-v-3d27f6cb="">
                        <li data-v-3d27f6cb=""><b class="crt-st" data-v-3d27f6cb="">{{titleText}}</b></li>
                    </ul>
                    <!-- <div class="m-centercnt f-db m-b-20" data-v-3d27f6cb="">
                        <div class="nowrap" data-v-3d27f6cb="">
                            <div class="nostorerecord" data-v-3d27f6cb="">
                                登录查看您购买的课程!
                                <a href="javascript:;" class="color-green" data-v-3d27f6cb="">请登录</a>                               
                            </div>
                        </div>
                    </div> -->
                    <div class="mineView">
                        <router-view v-bind:myMes="myMes"></router-view>
                    </div>
                </div>
            </div>
        </div>
    </div>

</template>

<script>
import mineJs from "../assets/style/js/mineVue" 
export default {
    name: "mineTest",
    data(){
        return{
            that: this,
            titleText: '我的信息',
            mineJs: mineJs,
            myMes:{
              data:{
                imagePath: "",
                introduction: "",
                name:"",
                phone:"",
                position:"",
                school:"",
                type:1,
                userPaw:""
              }
            }
        }
    },
    methods:{
        getMes: function(callback){
        mineJs.mineGetMesMounted().then(res=>{
          this.myMes = res
          callback(res)
        })
      }
    },
    mounted(){
        let _this = this

        mineJs.mineBtnClick(this.that)
        // 加载信息
        this.getMes(function(arr){
            _this.$nextTick(() => {
            console.log(arr)
            })
        })
    },
    watch:{
        $route(to,from){
            if(to.path == "/mine/myMes"){
                mineJs.mineBtnClick(this.that)
            }
        }
    }
}
</script>

<style>
@import "../assets/style/css/mine.css"
</style>