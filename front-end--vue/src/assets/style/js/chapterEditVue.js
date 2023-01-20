import axios from "axios"
const ChapterEditJs = {
    getChapters: async function(that){
        let courseChapters
        // 得到课程章节
        await axios.get("/getChapters/"+that.$route.params.courseNumber)
        .then(successResponse=>{
            courseChapters = successResponse
        })
        .catch(error=>{
            alert(error)
        })
        return courseChapters
    }
}
export default ChapterEditJs