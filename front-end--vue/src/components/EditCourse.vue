<template>
  <div>
    <div class="nav_side">
        <div class="sideCon" id="boxscrollleft" style="height: 596px; overflow: hidden; outline: none;" tabindex="1">
            <dl class="classDl">
                <dt>
                    <a href="javascript:void(0);" onclick="$(&#39;#tpsubmit&#39;).submit();">
                        <img width="100%" height="100%" :src="'/api/images/'+courseMes.data.imagePath">
                        <!-- <span>课程门户<i class="left_join"></i></span> -->
                    </a>
                </dt>
                <dd class="textHidden colorDeep" style="word-break: break-all;" title="test">
                    {{ courseMes.data.courseName }}
                </dd>
            </dl>
            <div class="nav-content   tchNavigationList">
                <input type="hidden" id="courseid" name="courseid" value="232550283">
                <input type="hidden" id="clazzid" name="clazzid" value="71862440">
                <input type="hidden" id="cfid" name="cfid" value="0">
                <input type="hidden" id="bbsid" name="bbsid" value="1122d3ccfec5e303286f653e6b1a419e">
                <input type="hidden" id="cpi" name="cpi" value="199759862">
                <input type="hidden" id="enc" name="enc" value="1d085a98440a63db140844bb6304be91">
                <input type="hidden" id="t" name="t" value="1673357147017">
                <input type="hidden" id="coumanagetype" name="coumanagetype" value="0">
                <input type="hidden" id="heardUt" name="heardUt" value="t">
                <input type="hidden" id="fid" name="fid" value="1052">
                <input type="hidden" id="openc" name="openc" value="95d0b68f703767fbeae1ea37bf273642">
                <input type="hidden" id="oldenc" name="oldenc" value="b92268902e6d3ea0ce10df8e2c844f69">
                <input type="hidden" id="userId" name="userId" value="193730434">
                <input type="hidden" id="moocDomainName" name="moocDomainName" value="https://mooc1.chaoxing.com">
                <input type="hidden" id="courseApp" name="courseApp" value="0">
                <input type="hidden" id="headXueyinCourse" name="headXueyinCourse" value="0">

                <!-- 功能分栏 -->
                <!-- <ul>
                  <li opentype="0" dataname="hd" pageheader="0" class="">
                    <a href="javascript:void(0);" title="" data-url="https://mobilelearn.chaoxing.com/page/class/classList">
                      <i class="hd"></i>
                    </a>
                  </li>
                </ul>

                <ul>
                    <li opentype="0" dataname="kj" pageheader="12" class="">
                        <a href="javascript:void(0);" title="课件"
                            data-url="https://mobilelearn.chaoxing.com/page/ppt/coursewareList">
                            <i class="kj"></i>课件
                        </a>
                    </li>
                    <li opentype="0" dataname="ppt" pageheader="1">
                        <a href="javascript:void(0);" title="教案"
                            data-url="https://mobilelearn.chaoxing.com/page/ppt/teachingPlanList">
                            <i class="ppt"></i>教案
                        </a>
                    </li>
                    <li opentype="0" dataname="zj" pageheader="2" class="curNav">
                        <a href="javascript:void(0);" title="章节" data-url="/mooc2-ans/mycourse/tchcourse">
                            <i class="zj"></i>章节
                        </a>
                    </li>
                    <li opentype="0" dataname="zl" pageheader="3">
                        <a href="javascript:void(0);" title="资料" data-url="/mooc2-ans/coursedata">
                            <i class="zl"></i>资料
                        </a>
                    </li>
                    <li opentype="0" dataname="tz" pageheader="4">
                        <a href="javascript:void(0);" title="通知"
                            data-url="https://notice.chaoxing.com/pc/course/notice/myNoticeList">
                            <i class="tz"></i>通知
                        </a>
                    </li>
                    <li opentype="0" dataname="tl" pageheader="5">
                        <a href="javascript:void(0);" title="讨论"
                            data-url="https://groupweb.chaoxing.com/course/topic/topicList">
                            <i class="tl"></i>讨论
                        </a>
                    </li>
                    <li opentype="0" dataname="zy" pageheader="6">
                        <a href="javascript:void(0);" title="作业" data-url="/mooc2-ans/work/list">
                            <i class="zy"></i>作业
                        </a>
                    </li>
                    <li opentype="0" dataname="ks" pageheader="7">
                        <a href="javascript:void(0);" title="考试" data-url="/mooc2-ans/exam/test">
                            <i class="ks"></i>考试
                        </a>
                    </li>
                    <li opentype="1" dataname="tk" pageheader="-1">
                        <a href="javascript:void(0);" title="题库" data-url="/mooc2-ans/qbank/questionlist">
                            <i class="tk"></i>题库
                        </a>
                    </li>
                    <li opentype="0" dataname="zsd" pageheader="12">
                        <a href="javascript:void(0);" title="知识图谱"
                            data-url="/mooc2-ans/questionBankTopic/knowledgepointshead">
                            <i class="zsd"></i>知识图谱
                        </a>
                    </li>
                </ul>

                <ul>
                    <li opentype="0" dataname="tj" pageheader="8" class="">
                        <a href="javascript:void(0);" title="统计" data-url="https://stat2-ans.chaoxing.com/stat/index">
                            <i class="tj"></i>统计
                        </a>
                    </li>
                    <li opentype="0" dataname="gl" pageheader="9">
                        <a href="javascript:void(0);" title="管理" data-url="/mooc2-ans/tcm/course-manage">
                            <i class="gl"></i>管理
                        </a>
                    </li>
                    <li opentype="0" dataname="gjx" pageheader="11">
                        <a href="javascript:void(0);" title="工具箱" data-url="/mooc2-ans/toolbox/page">
                            <i class="gjx"></i>工具箱
                        </a>
                    </li>
                </ul> -->
                <ul>
                  <li opentype="0" dataname="zj" pageheader="2" class="curNav">
                    <a href="javascript:void(0);" title="章节" data-url="/mooc2-ans/mycourse/tchcourse">
                      <i class="zj"></i>{{ $t('user.editCourse.chapter') }}
                    </a>
                  </li>
                </ul>
            </div>
        </div>
        <!-- <form id="tpsubmit" action="https://mooc1.chaoxing.com/course/232550283.html" target="_blank" method="post">
            <input type="hidden" name="edit" value="true">
        </form> -->
        <div id="ascrail2000" class="nicescroll-rails nicescroll-rails-vr"
            style="width: 8px; z-index: 2; cursor: default; position: absolute; top: 52px; left: 172px; height: 596px; display: block; opacity: 0;">
            <div class="nicescroll-cursors"
                style="position: relative; top: 0px; float: right; width: 8px; height: 332px; background-color: rgb(230, 236, 245); background-clip: padding-box; border-radius: 5px;">
            </div>
        </div>
        <div id="ascrail2000-hr" class="nicescroll-rails nicescroll-rails-hr"
            style="height: 8px; z-index: 2; top: 640px; left: 0px; position: absolute; cursor: default; display: none; width: 172px; opacity: 0;">
            <div class="nicescroll-cursors"
                style="position: absolute; top: 0px; height: 8px; width: 180px; background-color: rgb(230, 236, 245); background-clip: padding-box; border-radius: 5px; left: 0px;">
            </div>
        </div>
    </div>
    <router-view style="position: absolute; inset: 52px 0px 0px 180px; border: 0px; width: 1100px; height: 596px; top: 80px;"></router-view>
  </div>
</template>

<script>
import EditCourseJs from '@/assets/style/js/editCourseVue';
export default {
    data(){
        return{
            that: this,
            courseMes:{
                data:{

                }
            }
        }
    },
    methods:{
        getCourseMesStart: function(){
            this.getCourseMes(function(arr){
                console.log(arr)
            })
        },
        getCourseMes: function(callback){
            EditCourseJs.getCourseMes(this.that).then(res=>{
                this.$nextTick(()=>{
                    this.courseMes = res
                    callback(res)
                })
            })
        },
    },
    mounted(){
        this.getCourseMesStart()
    }
}
</script>

<style>
@import '../assets/style/css/editCourse.css'
</style>