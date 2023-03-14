<template>
    <div class="fanyaChapterWhite">
        <div class="chapHeight" style="height:77px; position:relative;">
            <div class="chapFixed"
                style="position: relative; top: 0px; left: 0px; right: 0px; background: rgb(255, 255, 255); z-index: 18;">
                <div class="chapter_head clear">
                    <a href="javascript:;" class="jb_btn jb_btn_104 fl fs14 chapter_editorial"
                        @click="addMainChapter()">
                        <i class="chapter_PlusIcon icon-edit"></i>{{ $t('user.editCourse.addSection') }}</a>
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
                                    <span :title="$t('user.editCourse.unit')+(index+1)"> {{ $t('user.editCourse.unit') }}{{ index+1 }} </span>
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
                            <ul>
                                <li v-for="(subValue,subIndex) in value.subChapter" :key="subIndex">
                                    <div class="chapter_item">
                                        <div class="catalog_title">
                                            <div class="catalog_name">
                                                <a :title="subValue.title" target="_blank" class="clicktitle" :href="'/#/chapterPage/'+that.$route.params.courseNumber+'/'+(index+1)+'.'+(subIndex+1)">
                                                    <span class="catalog_sbar">{{ index+1 }}.{{ subIndex+1 }}</span> 
                                                    <span>{{ subValue.title }}</span> </a>
                                            </div>
                                            <input type="file" :id="'upLoadFile'+(index+1)+'.'+(subIndex+1)" style="display:none" @change="fileSend((index+1)+'.'+(subIndex+1))">
                                            <a @click="upLoadFile((index+1)+'.'+(subIndex+1))" target="_blank"
                                                class="jb_btn jb_btn_60 fs14 catalog_edit">{{ $t('user.editCourse.file') }}</a>
                                            <a @click="setTitle((index+1)+'.'+(subIndex+1))" target="_blank"
                                                class="jb_btn jb_btn_60 fs14 catalog_edit" style="left:700px">{{ $t('user.editCourse.title') }}</a>
                                            <a @click="deleteChapter((index+1)+'.'+(subIndex+1))" target="_blank"
                                                class="jb_btn jb_btn_60 fs14 catalog_edit" style="left:550px">{{ $t('user.editCourse.delete') }}</a>
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
                                <i class="chapter_PlusIcon icon-edit"></i>{{ $t('user.editCourse.addSubSection') }}</a></div>
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
            },
            oldHTML: '',    //旧的代码段
            oldTitle: '',    //旧的标题
            titleStatu: 0,  //1为激活
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
        setSubChapterTitle: function(index){
            let num = this.chaptersMes.data[index].subChapter.length+1
            axios.post("/setSubChapterTitle?courseNumber="+this.$route.params.courseNumber+"&num="+num+"&owner_id="+(index+1))
                .then(res=>{
                    if(res.data=='success'){
                        this.getChaptersMesStart()
                    }
                })
                .catch(error=>{alert(error)})
        },
        setTitle: function(num){ 
            if(this.titleStatu==1){
                alert("请关闭当前标题操作")
                return
            }
            this.titleStatu = 1
            let number = num.split('.')
            let div = document.getElementById('subChapterDiv'+number[0]).children[0].children[number[1]-1].children[0].children[0].children[0]
            this.oldHTML = div.innerHTML
            this.oldTitle = div.children[0].children[1].innerHTML
            div.innerHTML = "<a class='clicktitle'><span class='catalog_sbar'>"+num+"</span><input type='text' onblur=blurFun(this,"+num+") /></a>"
            // div.addEventListener("mouseout", function (event) {
            //     div.innerHTML = this.oldHTML
            // });
        },
        blurFun: function(div,num){
            let titleValue = div.value
            num = String(num)
            let number = num.split('.')
            if(titleValue==null||titleValue==''||titleValue==this.oldTitle){
                // 无操作,未修改成功
                div.parentNode.parentNode.innerHTML = this.oldHTML
                this.titleStatu = 0
                return
            } else {  //修改标题成功，发送请求
                axios.post('/setChapterTitle?titleVal='+titleValue+"&courseNumber="+this.that.$route.params.courseNumber+"&num="+number[1]+"&owner_id="+number[0])
                    .then((res)=>{
                        console.log(res)
                    }).catch(error=>{
                        alert(error)
                    })
                setTimeout(() => {
                    console.log(this.oldTitle+"+"+titleValue)
                    this.oldHTML = this.oldHTML.replaceAll(this.oldTitle,titleValue)
                    console.log(this.oldHTML)
                    div.parentNode.parentNode.innerHTML = this.oldHTML
                    this.titleStatu = 0
                }, 500)
            }
            // div.parentNode.innerHTML = titleValue
        },
        deleteChapter: function (num) {
            let number = num.split('.')
            let div = document.getElementById('subChapterDiv'+number[0]).children[0].children[number[1]-1]
            axios.post('/deleteChapter?courseNumber=' + this.that.$route.params.courseNumber + "&num=" + number[1] + "&owner_id=" + number[0])
                .then((res) => {
                    console.log(res)
                }).catch(error => {
                    alert(error)
                })
            div.remove()
        },
        upLoadFile: function(num){
            let number = num.split('.')
            let fileDiv = document.getElementById('upLoadFile'+num)
            fileDiv.click()
        },
        fileSend: function(num){
            let number = num.split('.')

            let file = document.getElementById('upLoadFile'+num).files[0]
            const formData = new FormData();
            formData.append("file",file);
            formData.append("courseNumber",this.$route.params.courseNumber);
            formData.append("num",number[1]);
            formData.append("owner_id",number[0]);
            axios.post('fileSend',formData,{
                'Content-type' : 'multipart/form-data'
            }).then(res=>{
                var result = res.data
                if(res.data=='success'){
                    alert("文件上传完成")
                }
            },err=>{
                alert(err)
            })
            alert("文件正在上传，请稍等（点击确认上传成功有提示）...")
        },
        // function: myAlert(){

        // }
    },
    created(){
        window.blurFun = this.blurFun
    },
    mounted(){
        this.getChaptersMesStart()
    }
}
</script>

<style>
@import '../assets/style/css/chapterEdit.css'
</style>