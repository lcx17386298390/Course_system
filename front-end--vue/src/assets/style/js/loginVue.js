import axios from "axios"

const login = {
    loginByPhoneAndPwd: async function(params){
        let data
        await axios.post("/login",params)
            .then(res=>{
                if(res.data == 200){
                    data = res
                    setTimeout(()=>{
                        window.location.href="/"
                    },500)
                }else{
                    alert("登录错误")
                }
            })
            .catch(error=>{
                alert(error)
            })
        return data
    }
}

export default login