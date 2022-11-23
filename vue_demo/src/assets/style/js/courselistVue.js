import axios from "axios";

const courseListJs = {
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