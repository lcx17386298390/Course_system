import axios from "axios"

const coursePageJs = {
    moduleBtnClick: function(that){
        let moduleBtnList = document.getElementsByName('moduleBtn')
        let displayModuel = document.getElementsByName('displayModuel')
        let currentIndex = 0
        for(let i = 0;i<moduleBtnList.length;i++){
            moduleBtnList[i].setAttribute("id",i)
            moduleBtnList[i].addEventListener('click',clickEvent)
        }

        function clickEvent(){
            let perIndex = currentIndex
            currentIndex = parseInt(this.id)
            classSwitch(perIndex,currentIndex)
        }

        function classSwitch(perIndex,currentIndex){
            moduleBtnList[perIndex].classList = ''
            moduleBtnList[currentIndex].classList = "current"
            displayModuel[perIndex].style = 'display: none;'
            displayModuel[currentIndex].style = 'display: block;'
        }
    },
    // 访问后端api初始化
    pageInitialization: async function(that){
        let courseMes,courseComments,courseChapters
        // 得到课程信息
        await axios.get("/coursePage/"+that.$route.params.courseNumber)
        .then(successResponse=>{
            courseMes = successResponse
        })
        .catch(error=>{
            alert(error)
        })

        // 得到课程评论
        await axios.get("/getComments/"+that.$route.params.courseNumber)
        .then(successResponse=>{
            courseComments = successResponse
        })
        .catch(error=>{
            alert(error)
        })

        // 得到课程章节
        await axios.get("/getChapters/"+that.$route.params.courseNumber)
        .then(successResponse=>{
            courseChapters = successResponse
        })
        .catch(error=>{
            alert(error)
        })

        return [courseMes,courseComments,courseChapters]
    },
    // 上传评论
    replyTopic: async function(sub_id,that,type,userAccountNumber){
        if(userAccountNumber==null){
            alert("请登录账号")
            return 
        }
        let replyContent=''
        if(type==1){
            replyContent = document.getElementById("replyContents_"+sub_id).value
            document.getElementById("replyContents_"+sub_id).value=''
            // 评论完后就关闭输入框
            that.viewReply("topic_replydiv"+sub_id)
        }
        if(type==0){
            replyContent = document.getElementById("askTopic").value
            document.getElementById("askTopic").value=''
        }
        if(replyContent==null||replyContent==''){
            alert("请输入回复内容")
            return
        }
        let params = new FormData()
        let myDate = new Date()
        let myDateTime = myDate.toLocaleString()
        console.log(myDateTime)
        params.append("replyContent",replyContent)
        params.append("sub_id",sub_id)
        params.append("type",type)  // 评论类型（对资源评论还是回复）
        params.append("dateTime",myDateTime)
        params.append("userAccountNumber",userAccountNumber)
        // 上传评论内容
        await axios.post("/upReplyContent/" + that.$route.params.courseNumber, params)
            .then(res => {
                console.log(res)
            }).catch(error => {
                alert(error)
            })
        that.pageInitializationStart()
    }
}
export default coursePageJs