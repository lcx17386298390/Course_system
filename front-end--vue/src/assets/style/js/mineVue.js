import axios from "axios"

const mineJs = {
    // 学生老师模块判断
    // typeMoudelDisplay:function(type){

    // },
    // 用来获取个人信息的
    mineGetMesMounted: async function(){
        let data
        await axios.get("/getMyMes")
        .then((res)=>{
            // console.log(res.data)
            data = res
        }).catch(error=>{
            alert(error)
        })
        return data
    },
    // mineBtnClick2: function(btnIndex,that){
    //     let myClassList = new Array()
    //     let btnList=new Array()
    //     let titleTextList = new Array("我创建的课程","已学习课程","我的收藏","播放记录","我的信息")
    //     btnList[0] = document.getElementById("createBtn")
    //     btnList[1] = document.getElementById("learnedBtn")
    //     btnList[2] = document.getElementById("collectionBtn")
    //     btnList[3] = document.getElementById("playRecordBtn")
    //     btnList[4] = document.getElementById("myMes")

    //     myClassList[0] = "coupon "
    //     myClassList[1] = "course "
    //     myClassList[2] = "pay "
    //     myClassList[3] = "plr "
    //     myClassList[4] = "coupon "

    //     // 点击方式进行绑定按钮显示
    //     for(let i = 0;i<5;i++){
    //         if(i==btnIndex){
    //             btnList[i].classList = myClassList[i]+"crt-s"
    //             that.titleText = titleTextList[i]
    //         }else{
    //             btnList[i].classList = myClassList[i]
    //         }
    //     }

    //     // 路由方式进行绑定,细节刷新（在mine页面中点击头像）
    //     let path = that.$route.path
    //     if(path == "/mine/myCollection"){
    //         for(let i = 0;i<5;i++){
    //             if(i==2){
    //                 btnList[i].classList = myClassList[i]+"crt-s"
    //                 that.titleText = titleTextList[i]
    //             }else{
    //                 btnList[i].classList = myClassList[i]
    //             }
    //         }
    //     }
        
    // },
    mineBtnClick: function(that){
        let currentIndex = 0
        let btnList = document.getElementsByName("btnList")
        let myClassList = new Array()
        let titleTextList = new Array(that.$t('user.myMes'),that.$t('user.createCourse'),that.$t('user.coursesLearned'),that.$t('user.playbackRecord'))

        myClassList[0] = "coupon "
        myClassList[1] = "course "
        myClassList[2] = "pay "
        // myClassList[3] = "plr "
        myClassList[3] = "coupon "

        for(let i=0;i<btnList.length;i++){
            btnList[i].setAttribute("id",i)
            btnList[i].addEventListener("click",clickEvent)
        }

        function clickEvent(){
            let perIndex = currentIndex
            currentIndex = parseInt(this.id)
            classSwitch(perIndex,currentIndex)
        }

        function classSwitch(perIndex,currentIndex){
            btnList[perIndex].classList = myClassList[perIndex]
            btnList[currentIndex].classList = myClassList[currentIndex]+"crt-s"
            that.titleText = titleTextList[currentIndex]
        }

        for(let i=0;i<myClassList.length;i++){
            if(i==0){
                btnList[i].classList = myClassList[i]+"crt-s"
                that.titleText = titleTextList[currentIndex]
            }else{
                btnList[i].classList = myClassList[i]
            }            
        }
    },
}
const s = "sdfsd"
export default mineJs