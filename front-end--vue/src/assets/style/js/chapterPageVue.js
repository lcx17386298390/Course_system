import axios from "axios"

const chapterPageJs = {
    start: async function(that){
        let data
        await axios.get('/chapterPage/'+that.$route.params.courseNumber+'/'+that.$route.params.chapterNum)
        .then(successMes=>{
            data = successMes
        }).catch(error=>{
            alert(error)
        })
        return data
    }
}
export default chapterPageJs