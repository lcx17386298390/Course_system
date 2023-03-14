import axios from "axios"

const chapterPageJs = {
    start: async function(that){
        let data1,data2
        await axios.get('/chapterPage/'+that.$route.params.courseNumber+'/'+that.$route.params.chapterNum)
        .then(successMes=>{
            data1 = successMes
        }).catch(error=>{
            alert(error)
        })

        await axios.get("/getMyMes")
        .then(success=>{
            data2 = success.data
            // console.log(success.data)
        }).catch(error=>{
            alert(error)
        })

        return [data1,data2]
    },
    timerEnd: function (browseTime,courseNumber,userAccountNumber) {
        // console.log(browseTime,"页面浏览时长")
        let params = new FormData()
        params.append("browseTime", browseTime)
        params.append("userAccountNumber", userAccountNumber)
        params.append("courseNumber", courseNumber)
        axios.post('/addBrowseRecord', params)
            .then(success => {
                // console.log(success.data)
            }).catch(error => {
                alert(error)
            })
    },
}
export default chapterPageJs