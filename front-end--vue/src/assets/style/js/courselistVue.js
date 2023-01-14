import axios from "axios";

const courseListJs = {
    // 页数跳转
    coursePageJump: function(){
        let xljumpButton = document.getElementsByClassName('xl-jumpButton')[0]
        xljumpButton.addEventListener("click",jumpButtonClick)
        function jumpButtonClick(){
        }
    },
    courselistAccess: async function () {
        let data
        await axios.get("/courselist")
            .then(successResponse=>{
                if (successResponse.status === 200) {
					data = successResponse
				} else {
					console.log("访问错误")
				}
            })
            .catch(error=>{
                alert(error)
            })
        
        return data
    }
}
export default courseListJs