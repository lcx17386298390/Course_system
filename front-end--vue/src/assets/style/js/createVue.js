import axios from "axios"

const createJs = {
    //  通过教师电话号查询教师创建的课程
    getCourseByTeacherNumber : async function(teacherNumber){
        let createCourseList
        await axios.get("/getCourseByTeacherNumber/"+teacherNumber)
        .then(res=>{
            console.log(res.data)
            createCourseList = res
        })
        .catch(error=>{
            alert(error)
        })
        return createCourseList
    }
}

export default createJs