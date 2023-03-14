import axios from "axios"

const createJs = {
    //  通过教师电话号查询教师创建的课程
    getCourseByTeacherNumber : async function(teacherAccountNumber){
        let createCourseList
        await axios.get("/getCourseByTeacherNumber/"+teacherAccountNumber)
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