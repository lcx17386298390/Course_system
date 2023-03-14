import axios from "axios"

const myMes = {
    // 用来获取个人信息的
    myMesMounted: async function(){
        // let data
        // await axios.get("/getMyMes")
        // .then((res)=>{
        //     data = res
        // }).catch(error=>{
        //     alert(error)
        // })
        // return data
    },

    //修改个人信息
    modifyClickFun: function(userMes,modifyPaw,that){
        // axios.post()
        // console.log(userMes)
        function phoneValidation(email) {
            // let myreg = /^[1][3,4,5,6,7,8,9][0-9]{9}$/;     //手机匹配
            let myreg = /[\w]+(\.[\w]+)*@[\w]+(\.[\w])+/;    //邮箱
            if (myreg.test(email)) {
                return true;
            } else {
                return false;
            }
        }
        if(userMes.email==null||userMes.email=='null'||userMes.name==null||userMes.name==''||userMes.school==null||userMes.school==''){
            alert('请填写完整信息')
            return
        }
        if(!phoneValidation(userMes.email)){
            alert('请输入正确的电子邮箱')
            return
        }
        if(modifyPaw.oldPaw!=null&&modifyPaw.oldPaw!=''&&modifyPaw.newPaw!=null&&modifyPaw.newPaw!=''){
            userMes.userPaw = modifyPaw.newPaw
        }

        let userImage = document.getElementById('file').files[0]
        let params = new FormData()
        params.append("email",userMes.email)
        params.append("userPaw",userMes.userPaw)
        params.append("userImage",userImage)
        params.append("name",userMes.name)
        params.append("school",userMes.school)
        params.append("type",userMes.type)
        params.append("position",userMes.position)
        params.append("introduction",userMes.introduction)
        params.append("memberTab",userMes.memberTab)

        axios.post('/modifyMes',params)
            .then(res=>{
                alert(res.data)
            })
            .catch(error=>{
                alert(error)
            })
        that.$router.push('/login')
    }
}
export default myMes