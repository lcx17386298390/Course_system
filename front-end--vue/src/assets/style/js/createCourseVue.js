import axios from "axios"

const createCourseJs = {
    btnClick: function(that,teacherAccountNumber){
        let courseName = document.getElementById('courseName').value
        let courcoursePicseName = document.getElementById('coursePic').file.toRaw
        let courseIntroduction = document.getElementById('courseIntroduction').value
        let classHours = document.getElementById('classHours').value
        let endDate = document.getElementById('endDate').value

        // alert(courseName+"+"+courcoursePicseName+"+"+courseIntroduction+"+"+classHours+"+"+endDate)
        // let config = {
        //     headers: {'Content-Type': 'multipart/form-data'}
        //  }

        let params = new FormData()
        params.append('courseName',courseName)
        params.append('file',courcoursePicseName)
        params.append('courseIntroduction',courseIntroduction)
        params.append('classHours',classHours)
        params.append('endDate',endDate)
        params.append('teacherAccountNumber',teacherAccountNumber)
        axios.post("/createCourse",params)
            .then(success=>{
                console.log(success.data)
            }).catch(error=>{alert(error)})

    }
}
export default createCourseJs