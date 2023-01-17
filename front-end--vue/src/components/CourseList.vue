<template>
    <div>
        <!--分类 start-->
        <div class="qFicReen">
            <div class="qWrap">
                <div class="qFicReen_title"></div>
                <div class="qFicReen_box">
                    <div class="qFicReen_item">
                        <span class="qFicReen_name">{{ $t('user.discipline.discipline') }}</span>
                        <div class="qFicReen_con">
                            <ul class="clearAfter" id="coursecategory">
                                <li class="active" value="0"><a>{{ $t('user.discipline.all') }}</a></li>
                                <li value="7754" data-value="C4"><a>{{ $t('user.discipline.medicalScience') }}</a></li>
                                <li value="7745" data-value="C4"><a>{{ $t('user.discipline.philosophy') }}</a></li>
                                <li value="7752" data-value="C4"><a>{{ $t('user.discipline.engineering') }}</a></li>
                                <li value="7748" data-value="C4"><a>{{ $t('user.discipline.pedagogy') }}</a></li>
                                <li value="7749" data-value="C4"><a>{{ $t('user.discipline.literature') }}</a></li>
                                <li value="7747" data-value="C4"><a>{{ $t('user.discipline.jurisprudence') }}</a></li>
                                <li value="7751" data-value="C4"><a>{{ $t('user.discipline.neoConfucianism') }}</a></li>
                                <li value="7756" data-value="C4"><a>{{ $t('user.discipline.management') }}</a></li>
                                <li value="7757" data-value="C4"><a>{{ $t('user.discipline.art') }}</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--分类 end-->

        <!--list start-->
        <div class="qkcList">
            <!-- <ul class="qkcListPic clearAfter" id="clist">
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227386361" target="_blank">
                                <img src="/images/0d08411b641dd1ae863d6c8b5583c849.jpg">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227386361" target="_blank">医学心理学</a></dt>
                            <dd>兰州大学 | 乔昆</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">4684人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/226352707" target="_blank">
                                <img src="/images/fb3ca8539546a593706b4595595d7375.jpg">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/226352707" target="_blank">游泳健身（第六期）</a>
                            </dt>
                            <dd>浙江财经大学 | 严蓓</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">4001人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227731770" target="_blank">
                                <img src="/images/38e43216520c11b8737518dbaadbae9c.jpg">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227731770" target="_blank">计算机网络A</a></dt>
                            <dd>河南科技大学 | 郑瑞娟</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">2552人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227952637" target="_blank">
                                <img src="/images/91241eea4829c29f0d11e01be3223547.jpeg">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227952637" target="_blank">中国山水画写生与创作研究</a>
                            </dt>
                            <dd>中国美术学院 | 张捷</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">1673人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227811136" target="_blank">
                                <img src="/images/4a37d72fbb9dd37e604b0ceab7106008.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227811136" target="_blank">数值天气预报</a></dt>
                            <dd>兰州大学 | 王澄海</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">1463人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227654911" target="_blank">
                                <img src="/images/69aded88e5d4e1699053583eebd07d28.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227654911" target="_blank">中国法律史</a></dt>
                            <dd>华北水利水电大学 | 刘术永</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">722人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/214743425" target="_blank">
                                <img src="/images/2c17e0c02b90e27dfe6d65e7ff348b8a.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/214743425" target="_blank">学术写作</a></dt>
                            <dd>浙江大学 | 方凡</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">690人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227997164" target="_blank">
                                <img src="/images/0187b759b3b8b8d8301107aca197e265.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227997164" target="_blank">《西方哲学研究现状》</a>
                            </dt>
                            <dd>浙江大学 | 王俊</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">621人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227855043" target="_blank">
                                <img src="/images/cb90039866a3314095e6e9951d96d779.JPG">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227855043" target="_blank">中药学专业导论</a></dt>
                            <dd>浙江工业大学 | 童胜强</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">415人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227347139" target="_blank">
                                <img src="/images/84d435d5adc1953e32ab5dac40fd18a2.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227347139" target="_blank">政治人类学</a></dt>
                            <dd>云南大学 | 廖林燕</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">341人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227347013" target="_blank">
                                <img src="/images/761499643f6a36073e20bc483cf88b0c.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227347013" target="_blank">科研论文写作</a></dt>
                            <dd>云南大学 | 陈善元</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">319人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227861287" target="_blank">
                                <img src="/images/cb3583ab9d2036ebf954863101fee150.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227861287" target="_blank">统计物理</a></dt>
                            <dd>浙江工业大学 | 吕斌</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">257人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/228568921" target="_blank">
                                <img src="/images/cb9f7c54988bd68356099291c318210b.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/228568921" target="_blank">高等传热学</a></dt>
                            <dd>华北电力大学（保定） | 高正阳</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">224人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227998841" target="_blank">
                                <img src="/images/8c9ec6b14aa72c81c375091ce79cf7cb.jpg">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227998841"
                                    target="_blank">中国写意花鸟画理论和创作方法</a></dt>
                            <dd>中国美术学院 | 刘海勇</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">195人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227385438" target="_blank">
                                <img src="/images/130e88f8a0426b58c494628b4a788127.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227385438" target="_blank">环境伦理</a></dt>
                            <dd>兰州大学 | 姜云超</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">142人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227942038" target="_blank">
                                <img src="/images/f7e6bc534503e570d03cacdc647fbbfc.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227942038" target="_blank">民族传统体育-太极拳</a>
                            </dt>
                            <dd>浙江大学 | 吴剑</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">124人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/228047501" target="_blank">
                                <img src="/images/c0deceb7b223a854ccbf6113a9767243.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/228047501" target="_blank">交互设计方法论</a></dt>
                            <dd>中国美术学院 | 胡晓琛</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">115人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227941315" target="_blank">
                                <img src="/images/30489a9a98d91e7280621487a99e7267.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227941315" target="_blank">研究生论文写作指导</a>
                            </dt>
                            <dd>浙江大学 | 李莉</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">91人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/227347069" target="_blank">
                                <img src="/images/86d951bf93462758144ca51ef4f6fa95.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/227347069" target="_blank">分析哲学</a></dt>
                            <dd>云南大学 | 刘玉鹏</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">83人已学</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a href="https://www.xueyinonline.com/detail/228016387" target="_blank">
                                <img src="/images/01e84068819d67cfbdb816f56eafbc56.png">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a href="https://www.xueyinonline.com/detail/228016387" target="_blank">中国传统壁画临摹与修复</a>
                            </dt>
                            <dd>中国美术学院 | 王一飞</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">进行中</span>
                            <span class="colorGray fr">77人已学</span>
                        </div>
                    </div>
                </li>
                <input type="hidden" value="1" id="pageNum">
                <input type="hidden" value="20" id="pageSize">
                <input type="hidden" value="2" id="totalPage">
            </ul> -->
            <ul class="qkcListPic clearAfter" id="clist">
                <li v-for="(value,index) in pageCourseList" :key="index">
                    <div class="qExpress_padd qNima">
                        <div class="qExpress_pic">
                            <a :href="'/#/coursePage/'+value.courseNumber" target="_blank">
                                <img :src="'/images/'+value.imagePath">
                            </a>
                            <span></span>
                        </div>
                        <dl class="qExpress_dl">
                            <dt><a :href="'/#/coursePage/'+value.courseNumber" target="_blank">{{value.courseName}}</a></dt>
                            <dd>{{value.teacherSchool}} | {{value.teacherName}}</dd>
                        </dl>
                        <div class="qExpress_state">
                            <span class="colorBlue fl">{{value.state==1?"进行中":"已结束"}}</span>
                            <span class="colorGray fr">{{value.learnNumber}}人已学</span>
                        </div>
                    </div>
                </li>
            </ul>
            <div id="page">
                <ul name="jumpBtnDiv">
                    <!-- <li class="xl-prevPage xl-disabled">上一页</li>
                    <li class="xl-active">1</li>
                    <li onclick="">2</li>
                    <li class="xl-nextPage">下一页</li>
                    <li class="xl-jumpText xl-disabled">跳转到<input type="number" id="xlJumpNum">页</li>
                    <li class="xl-jumpButton">确定</li> -->
                </ul>
            </div>

        </div>
        <!--list end-->
    </div>
</template>

<script>
import courselistJs from '@/assets/style/js/courselistVue'

export default {
    name: "courseListTest",
    data(){
        return{
            successMes:{
                data:{
                    allCourseList:[],
                }
            },
            pageCourseList:[],
            pageCouseBeginNum:0,
            pageNum:1,
            that: this
        }
    },
    methods:{
        upMes: function(callback){
            courselistJs.courselistAccess().then(res=>{
                // 总课程数据
                this.successMes = res
                this.pageCourseList = this.successMes.data.allCourseList.slice(this.pageCouseBeginNum,this.pageCouseBeginNum+20)
                callback(res)
                let num = this.successMes.data.allCourseList.length
                this.initialPageBtn(num,this.that)
            })
        },
        upMesStart: function(){
            let _this = this
            this.upMes(arr=>{
                _this.$nextTick(()=>{
                    console.log(arr)
                })
            })
        },
        // 重新设置起始课程
        resetBeginNum: function(beginNum){  //传进来页面值
            // 设置上一页和下一页的样式
            if(beginNum==1){
                let prePageBtn = document.getElementsByClassName("xl-prevPage")[0]
                prePageBtn.className = 'xl-prevPage xl-disabled'
            }else{
                let prePageBtn = document.getElementsByClassName("xl-prevPage")[0]
                prePageBtn.className = 'xl-prevPage'
            }
            if(beginNum==Math.ceil(this.successMes.data.allCourseList.length/20)){
                let nextPageBtn = document.getElementsByClassName("xl-nextPage")[0]
                nextPageBtn.className = 'xl-nextPage xl-disabled'
            }else{
                let nextPageBtn = document.getElementsByClassName("xl-nextPage")[0]
                nextPageBtn.className = 'xl-nextPage'
            }
            let pageBtn = document.getElementsByName('pageBtn')
            pageBtn[this.pageNum-1].className = ''
            this.pageNum = beginNum
            pageBtn[beginNum-1].className = 'xl-active'
            beginNum=(beginNum-1)*20
            this.pageCouseBeginNum = beginNum
            this.pageCourseList = this.successMes.data.allCourseList.slice(this.pageCouseBeginNum,this.pageCouseBeginNum+20)
        },
        // 跳转按钮的初始化
        initialPageBtn: function(num,that){
            let btnDivHTML = ""
            btnDivHTML+="<li class='xl-prevPage  xl-disabled' onclick='prePage()'>"+that.$t('user.prePage')+"</li>"
            let jumpBtnDiv = document.getElementsByName("jumpBtnDiv")[0]
            for(let i = 1;i<=Math.ceil(num/20);i++){
                btnDivHTML+="<li onclick='resetBeginNum("+i+")' name='pageBtn'>"+i+"</li>"
            }
            btnDivHTML+="<li class='xl-nextPage' onclick='nextPage()'>"+that.$t('user.nextPage')+"</li><li class='xl-jumpText xl-disabled'>"+that.$t('user.jumpTo')+"<input type='number' id='xlJumpNum'>"+that.$t('user.page')+"</li><li class='xl-jumpButton' onclick='jumpPage()'>"+that.$t('user.determine')+"</li>"
            jumpBtnDiv.innerHTML = btnDivHTML
            document.getElementsByName("pageBtn")[0].className = "xl-active"
        },
        prePage: function(){
            if(this.pageNum==1){
                return
            }
            // this.pageNum-=1
            this.resetBeginNum(this.pageNum-1)
        },
        nextPage: function(){
            if(this.pageNum>=Math.ceil(this.successMes.data.allCourseList.length/20)){
                return
            }
            // this.pageNum+=1
            this.resetBeginNum(this.pageNum+1)
        },
        jumpPage: function(){
            let num = document.getElementById('xlJumpNum').value
            if(num<1||num>Math.ceil(this.successMes.data.allCourseList.length/20)){
                alert("页数错误")
            }else{
                this.resetBeginNum(num)
            }
        }
    },
    created(){
        window.pageNum = this.pageNum
        window.upMesStart = this.upMesStart
        window.resetBeginNum = this.resetBeginNum
        window.prePage = this.prePage
        window.nextPage = this.nextPage
        window.jumpPage = this.jumpPage
    },
    mounted(){
        this.upMesStart()
        courselistJs.coursePageJump()
    }
}
</script>

<style>
@import "../assets/style/css/courseList.css"
</style>