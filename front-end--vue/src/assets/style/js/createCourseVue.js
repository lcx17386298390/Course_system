import axios from "axios"

const createCourseJs = {
    btnClick: function(that,teacherAccountNumber){
        let courseName = document.getElementById('courseName').value
        let courseIntroduction = document.getElementById('courseIntroduction').value
        let classHours = document.getElementById('classHours').value
        let classesTab = document.getElementById('classesTab').value
        let memberTab = this.getRadioVal()
        let endDate = document.getElementById('endDate').value
        // let config = {
        //     headers: {'Content-Type': 'multipart/form-data'}
        //  }

        let params = new FormData()
        params.append('courseName',courseName)
        params.append('file',this.file)
        params.append('courseIntroduction',courseIntroduction)
        params.append('classHours',classHours)
        params.append('memberTab',memberTab)
        params.append('classesTab',classesTab)
        params.append('endDate',endDate)
        params.append('teacherAccountNumber',teacherAccountNumber)

        // 输入检验
        if(courseName==null||courseName==''||courseIntroduction==null||courseIntroduction==''||classHours==null||classHours==''||endDate==null||endDate==''||this.file==null||this.file==''){
            alert('请输入完整信息')
            return
        }
        if(teacherAccountNumber==null||teacherAccountNumber==''){
            alert("请先登录账号！")
            return 
        }
        axios.post("/createCourse",params)
            .then(successMes=>{
                if(successMes.data=='success'){
                    alert("创建课程成功，正在跳转主页")
                    that.$router.push('/')
                }else{
                    alert(successMes.data)
                }
            }).catch(error=>{alert(error)})
    },
    getFile: function(event){
        this.file = event.target.files[0];
        console.log(event)
    },
    getRadioVal: function(){
        let radios = document.getElementsByName("memberTab")
        if(radios[0].checked){
            return 0
        }else{
            return 1
        }
    }
}
export default createCourseJs