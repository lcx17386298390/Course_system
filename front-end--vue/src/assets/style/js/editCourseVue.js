import axios from "axios"
const EditCourseJs = {
    getCourseMes: async function(that){
        let courseMes
        // 得到课程信息
        await axios.get("/coursePage/"+that.$route.params.courseNumber)
        .then(successResponse=>{
            courseMes = successResponse
        })
        .catch(error=>{
            alert(error)
        })
        return courseMes
    }
}
export default EditCourseJs