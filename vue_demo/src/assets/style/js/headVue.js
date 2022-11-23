import axios from "axios";
const head = {
    // 请求函数
    headAccess: async function () {
        let data
        await axios
            .get("/state")
            .then(res => {
                if (res.status === 200) {
					data = res
				} else {
					console.log("访问错误")
				}
            })
            .catch(err=>{
                alert(err)
            })
        return data
    },
    
    loginOut: async function(){
        let logOutData
        await axios.get("/loginOut")
            .then(res=>{
                if(res.status == 200){
                    logOutData = res
                }else{
                    console.log("登出操作异常，请稍后重试")
                }
            })
            .catch(error=>{
                console.log(error)
            })
        return logOutData
    },

    // 登录状态的判断，影响头部的信息显示
    loginJudge: function (loginMes) {
        if (loginMes.loginUser) {
            document.getElementsByClassName("qLogin_before")[0].style.display = "none"
            document.getElementsByClassName("qLogin_after")[0].style.display = "block"
        } else {
            document.getElementsByClassName("qLogin_before")[0].style.display = "block"
            document.getElementsByClassName("qLogin_after")[0].style.display = "none"
        }
    }
}
export default head;