import axios from "axios"
const homeJs = {
    getMyMes: async function(){
        let data
        await axios.get("/getMyMes")
        .then((res)=>{
            data = res
        }).catch(error=>{
            alert(error)
        })
        return data
    }
}
export default homeJs