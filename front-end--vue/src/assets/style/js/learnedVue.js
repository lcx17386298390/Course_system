import axios from "axios"

const learnedJs = {
    //  通过教师电话号查询教师创建的课程
    getLearnCourseByTeacherNumber : async function(userAccountNumber){
        let learnCourseList
        await axios.get("/getLearnByUser?userAccountNumber="+userAccountNumber)
        .then(res=>{
            console.log(res.data)
            learnCourseList = res
        })
        .catch(error=>{
            alert(error)
        })
        return learnCourseList
    }
}

export default learnedJs