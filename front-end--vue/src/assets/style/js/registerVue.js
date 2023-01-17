import axios from "axios"

const registerModule = {

    // 点击“下一步”后进行表单替换
    register: async function(e){
        // 验证验证码请求
        let codeValidationMes
        let messageCode = document.getElementById("messageCode")
        let phoneInput = document.getElementById("email")
        let phoneLength = " "
        phoneLength = phoneInput.value
        phoneLength = phoneLength.length

        function phoneValidation(email) {
            // let myreg = /^[1][3,4,5,6,7,8,9][0-9]{9}$/;     //手机匹配
            let myreg = /[\w]+(\.[\w]+)*@[\w]+(\.[\w])+/;    //邮箱
            if (myreg.test(email)) {
                return true;
            } else {
                return false;
            }
        }
        
        if(!phoneValidation(phoneInput.value)){
            phoneInput.style.borderColor = "red"
            document.getElementById("phoneMsg").innerText = "请输入正确的电子邮箱"
            return ''
        }else {
            phoneInput.style.borderColor = "#e3e8f0"
            document.getElementById("phoneMsg").innerText = ""
        }

        
        await axios.get("/codeValidation",{
            params:{
                code: messageCode.value
            }
        })
        .then((res)=>{
            codeValidationMes = res.data
            console.log(res.data)
        }).catch(error=>{
            alert(error)
        })
        if(codeValidationMes=="200"){
            let mesDiv1 = document.getElementsByClassName("mesDiv1")
            let mesDiv2 = document.getElementsByClassName("mesDiv2")
            mesDiv1[0].style.display = "none"
            mesDiv2[0].style.display = "block"
            e.style.display="none"
            document.getElementById("mesSub").style.display = "block"
        }else{
            alert("验证码错误，请重新填写")
        }
    },

    // 展出世界电话列表逻辑
    showTelList: function(){
        let countryShowBtn = document.getElementById("countryShow")
        let filterList = document.getElementsByClassName("filter-list")
        filterList[1].style.display =="block"?filterList[1].style.display="none":filterList[1].style.display="block"
    },

    // 选中地区电话号显示设置
    setCountryCode: function(num){
        let countryShow = document.getElementById("countryShow")
        let filterList = document.getElementsByClassName("filter-list")
        let countryCode = document.getElementById("countryCode")
        countryShow.innerText="+"+num
        filterList[1].style.display = "none"
        countryCode.value = num
    },

    // 点击发送验证码
    sendCode: function(that){
        let sendCodeBtn = document.getElementById("sendCodeBtn")
        let showcountdown = document.getElementById("showcountdown")
        let emailInput = document.getElementById("email")

        if(!phoneValidation(emailInput.value)){
            emailInput.style.borderColor = "red"
            document.getElementById("phoneMsg").innerText = "请输入正确的电子邮箱"
            return 
        }

        function phoneValidation(email) {
            // let myreg = /^[1][3,4,5,6,7,8,9][0-9]{9}$/;     //手机匹配
            let myreg = /[\w]+(\.[\w]+)*@[\w]+(\.[\w])+/;    //邮箱
            if (myreg.test(email)) {
                return true;
            } else {
                return false;
            }
        }

        sendCodeBtn.style.display = "none" 
        showcountdown.style.display = "block" 

        axios.get("/sendCode/"+emailInput.value)
        .then((res=>{
                console.log(res)
        })).catch(error=>{
                alert(error)
        })
        
        let time = 60
        let mySetTime = setInterval(()=>{
            time--
            showcountdown.innerText = time + that.$t('user.secondPromat')
            if(time<0){
                showcountdown.style.display = "none" 
                sendCodeBtn.style.display = "block" 
                showcountdown.innerText ="60"+that.$t('user.secondPromat')
                clearInterval(mySetTime)
            }
        }, 1000);
    },
    typeDifference: function(type){
        if(type=="0"){
            // 隐藏职务和简介
            let positionDiv = document.getElementById("positionDiv")
            let introductionDiv = document.getElementById("introductionDiv")
            positionDiv.style.display = "none"
            introductionDiv.style.display = "none"
        }
        if(type=="1"){
            // 隐藏职务和简介
            let positionDiv = document.getElementById("positionDiv")
            let introductionDiv = document.getElementById("introductionDiv")
            positionDiv.style.display = "block"
            introductionDiv.style.display = "block"
        }
    },
    submitBtn: function () {
        // let form = document.getElementById("mesForm")
        // form.onsubmit()
        // this.$router.push("/")
        let email = document.getElementsByName("email")[0].value;
        let userPaw = document.getElementsByName("userPaw")[0].value;
        let userImage = document.getElementsByName("userImage")[0].files[0];
        let name = document.getElementsByName("name")[0].value;
        let school = document.getElementsByName("school")[0].value;
        let type = document.getElementsByName("type")[0].value;
        let position = document.getElementsByName("position")[0].value;
        let introduction = document.getElementsByName("introduction")[0].value;

        let params = new FormData()
        params.append("email",email)
        params.append("userPaw",userPaw)
        params.append("userImage",userImage)
        params.append("name",name)
        params.append("school",school)
        params.append("type",type)
        params.append("position",position)
        params.append("introduction",introduction)

        axios.post("/upUserMes",params,{
            headers: {
                // 表示上传的是文件,而不是普通的表单数据
                'Content-Type': 'multipart/form-data'
              }
        })
            .then(successMes=>{
                console.log(successMes.data)
                if(successMes.status==200){
                    alert("注册成功，请登录")
                    window.location.href="/"
                }
            })
            .catch(error=>{
                alert(error)
            })
    }
}

export default registerModule