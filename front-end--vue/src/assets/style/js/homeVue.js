import axios from "axios"
const homeJs = {
    getMyMes: async function(){
        let data
        await axios.get("/getMyMes")
        .then((res)=>{
            data = res
        }).catch(error=>{
            if(error&&error.response){
                if(error.response.status==500){
                    console.log("请登录")
                }
                else{
                    console.log("信息错误")
                }
            }else{
                console.log("信息错误")
            }
        })
        return data
    }
}
export default homeJs