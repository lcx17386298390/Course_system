<template>
    <div class="fanyaChapterWhite">
        <div class="chapHeight" style="height:77px; position:relative;">
            <div class="chapFixed"
                style="position: relative; top: 0px; left: 0px; right: 0px; background: rgb(255, 255, 255); z-index: 18;">
                <div class="chapter_head clear">
                    <a href="javascript:;" class="jb_btn jb_btn_104 fl fs14 chapter_editorial"
                        @click="addMainChapter()">
                        <i class="chapter_PlusIcon icon-edit"></i>添加主章节</a>
                </div>
            </div>
        </div>
        <div class="chapter_body">
            <div class="banji_select_bg"></div>
            <div class="banji_select_height">
                <!-- <div class="banji_select_box fr">
                    <a class="banji_select_name icon-down" href="javascript:void(0)">
                        <span class="banji_select_name_text" data="71862440" id="curClazz">默认班级</span>
                    </a>
                    <div class="banji_select_con" style="display:none;">
                        <div class="banji_search_display" style="display: none;">
                            <div class="banji_search">
                                <input type="text" name="" value="" class="banji_search_input fl" placeholder="搜索班级"
                                    id="classSearch">
                                <a class="banji_search_bnt icon-search fr" href="javascript:void(0)"></a>
                            </div>
                        </div>
                        <div class="banji_list" id="banji_scroll" style="max-height: 300px;">
                            <ul>
                                <li class="inShow active" data="cls_71862440">
                                    <div>默认班级</div>
                                </li>
                            </ul>
                        </div>
                        <div id="searchList" style="display: none; max-height: 300px;" class="banji_list">
                            <ul></ul>
                        </div>
                        <div class="NoSearchResults" style="display:none;">无搜索结果</div>
                    </div>
                </div> -->
            </div>
            <div class="chapter_th">
                <input type="hidden" value="目录" id="setCatalog">
                <span class="chapter_th_mulu" id="catalogSelect">
                    <!-- <div class="inputCheck fl"><input type="checkbox" name="checkbox" value=""></div> -->
                    <div id="catalogSelectMsg" style="display: inline;">目录</div>
                </span>
            </div>
            <div class="chapter_td" id="chapterContent">
                <div class="loadings loadMore loading" style="display: none;">
                    <p class="loadingText">正在加载中，请稍候…</p>
                </div>
                <!-- 章节加载 -->
                <div class="chapterList" id="chapterList">
                    <div class="chapter_verticalLine"></div>
                    <input type="hidden" value="-1" id="countListSearchChapter">
                    <div class="chapter_unit" v-for="(value,index) in chaptersMes.data" :key="index" >
                        <div class="chapter_item" @click="openSubChapter(index+1)">
                            <div class="catalog_title chapter_Thats_bnt">
                                <div class="catalog_num fl"><span><i><em style="font-style:normal;">{{ index+1 }}</em></i></span>
                                </div>
                                <div class="catalog_name">
                                    <span :title="'单元'+(index+1)"> 单元{{ index+1 }} </span>
                                </div>
                                <!-- <span class="catalog_upDown icon-down"></span> -->
                                
                                <!-- <span class="catalog_upDown icon-down catalog_upDown_active"></span> -->
                            </div>
                            <div class="catalog_jindu catalog_tishi56">
                                <div class="catalog_ressbar" data="706700293" style="cursor: pointer;">
                                    <div class="catalog_ressbar_width" style="width:0%;"></div>
                                </div>
                            </div>
                        </div>
                        <!-- 第二级开始 -->
                        <div class="catalog_level" style="display:none;position:relative" :id="'subChapterDiv'+(index+1)">
                            <ul v-for="(subValue,subIndex) in value.subChapter" :key="subIndex">
                                <li>
                                    <div class="chapter_item">
                                        <div class="catalog_title">
                                            <div class="catalog_name" onclick="toNew('232550283', '706700298', '71862440')">
                                                <a title="标题一" target="_blank" class="clicktitle">
                                                    <span class="catalog_sbar">{{ index+1 }}.{{ subIndex+1 }}</span> {{ subValue.title }} </a>
                                            </div>
                        
                                            <a onclick="toEditOld('232550283', '706700298', '71862440')" target="_blank"
                                                class="jb_btn jb_btn_60 fs14 catalog_edit">选择文件</a>
                                            <!-- <a href="javascript:void(0);"
                                                                        class="fs14 colorBlue catalog_setup popSetupBnt"
                                                                        onclick="setOpenStatus('open', '706700298', '', '', '0', '0')">设置</a> -->
                                            <!-- <div class="catalog_task">
                                                                        <span class="catalog_points_yi">2</span>
                                                                    </div> -->
                                        </div>
                                        <div class="catalog_jindu catalog_tishi56">
                                            <div class="catalog_ressbar" data="706700298" style="cursor: pointer;">
                                                <div class="catalog_ressbar_width" style="width:0%;"></div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- 第三级开始 -->
                                    <!-- 第三级结束 -->
                                </li>
                            </ul>
                            <div style="height:36px;margin-left:65%"><a href="javascript:;" class="jb_btn jb_btn_104 fs14 chapter_editorial"
                                @click="addSubChapter(index)" style="position:absolute;margin-top:5px;">
                                <i class="chapter_PlusIcon icon-edit"></i>添加子章节</a></div>
                        </div>
                        <!-- 第二级结束 -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import ChapterEditJs from '@/assets/style/js/chapterEditVue.js'
import axios from 'axios'

export default {
    data(){
        return{
            that: this,
            chaptersMes:{
                data: []
            }
        }
    },
    methods:{
        getChaptersMesStart: function(){
            this.getChaptersMes(function(arr){
                console.log(arr)
            })
        },
        getChaptersMes: function(callback){
            ChapterEditJs.getChapters(this.that).then(res=>{
                this.$nextTick(()=>{
                    this.chaptersMes = res
                    callback(res)
                })
            })
        },
        openSubChapter: function(index){
            let subChapterDiv = document.getElementById('subChapterDiv'+index)
            subChapterDiv.style.display=='block'?subChapterDiv.style.display='none':subChapterDiv.style.display='block'
        },
        addMainChapter: function(){
            let num = this.chaptersMes.data.length+1
            axios.post("/addMainChapter?courseNumber="+this.$route.params.courseNumber+"&num="+num)
                .then(res=>{
                    if(res.data=='success'){
                        this.getChaptersMesStart()
                    }
                })
                .catch(error=>{alert(error)})
        },
        addSubChapter: function(index){
            let num = this.chaptersMes.data[index].subChapter.length+1
            axios.post("/addSubChapter?courseNumber="+this.$route.params.courseNumber+"&num="+num+"&owner_id="+(index+1))
                .then(res=>{
                    if(res.data=='success'){
                        this.getChaptersMesStart()
                    }
                })
                .catch(error=>{alert(error)})
        },
    },
    mounted(){
        this.getChaptersMesStart()
    }
}
</script>

<style>
@import '../assets/style/css/chapterEdit.css'
</style>