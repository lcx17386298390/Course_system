<template>
    <div class="fanyaPreview" id="fanyaPreview">
        <div class=" fanyaPreview_right" style="padding: 0px;">
            <div class="prev_box" id="mainid" style="margin-bottom:86px">
                <div class="prev_title_pos">
                    <div class="prev_title" title="标题一">{{ '章节'+this.$route.params.chapterNum }}</div>
                </div>
                <div class="btnBlue btn_92 fs14 prev_next marginRight30 prev" style="display: none;">上一章</div>
                <div class="jb_btn jb_btn_92 fs14 prev_next next" style="display: none;">下一章</div>
                <input type="hidden" name="chapterId" id="chapterIdid" value="706700298">
                <!-- <div class="ans-job-icon " id="ext-gen1048"></div> -->
                <div class="prev_main" id="qqqq">
                    <iframe height="492px" width="850px" style="padding-top:30px" id="iframe" frameborder="0"
                        scrolling="no" :src="chapterMes.data.fileName" allowfullscreen="true"
                        webkitallowfullscreen="true" mozallowfullscreen="true">
                    </iframe>
                    <!-- <iframe height="492px" width="850px" style="padding-top:30px" id="iframe" frameborder="0"
                        scrolling="no" src="/video.mp4" allowfullscreen="true"
                        webkitallowfullscreen="true" mozallowfullscreen="true" onload="clickImg()">
                    </iframe>
                    <video height="492px" width="850px" src="video.mp4" controls>
                        <source src="video.mp4" type="video/mp4">
                    </video> -->
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import chapterJs from '@/assets/style/js/chapterPageVue.js'
export default {
    name: 'ChapterPage',
    data(){
        return{
            that: this,
            chapterMes:{
                data:{

                }
            }
        }
    },
    methods:{
        chapterBegin: function(callback) {
            chapterJs.start(this.that).then(res=>{
                this.chapterMes = res
                callback(res)
            })
        },
        beginStart: function() {
            let _this = this
            this.chapterBegin(arr=> {
                _this.$nextTick(()=>{
                    console.log(arr)
                })
            })
        }
    },
    mounted(){
        this.beginStart()
    }
}
</script>

<style>
@import '../assets/style/css/chapterPage.css'
</style>