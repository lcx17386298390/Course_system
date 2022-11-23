import axios from "axios"

const login = {
    loginByPhoneAndPwd: async function(params){
        let data
        await axios.post("/login",params)
            .then(res=>{
                if(res.status == 200){
                    data = res
                }else{
                    console.log("登录数据访问错误")
                }
            })
            .catch(error=>{
                alert(error)
            })
        return data
    }
}

export default login