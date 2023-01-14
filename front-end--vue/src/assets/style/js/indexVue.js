import axios from "axios"

const index = {
	// 首页的请求方法
	// 此时这个函数也就相当于一个promise函数
	indexAccess: async function () {
		let data;
		await axios
			.get('/')
			.then(successResponse => {
				if (successResponse.status === 200) {
					data = successResponse
				} else {
					console.log("访问错误")
				}
			})
			.catch(failResponse => {
				alert(failResponse)
			})
		return data
	},
	// 首页的样式逻辑
	// indexImage: function () {
	// 	let slides = document.getElementById("slides").getElementsByTagName("li")
	// 	for (let i = 0; i < 6; i++) {
	// 		// slides[i].style.backgroundImage = 'url('+this.successMes[i].ImageName+')'
	// 		console.log(this.successMes)
	// 	}
	// },
	indexStyle: function () {
		let currentIndex = 0
		let slides = document.getElementById("slides").getElementsByTagName("li")
		let pagination = document.getElementById("pagination").getElementsByTagName("li")

		for (let i = 0; i < pagination.length; i++) {
			pagination[i].setAttribute("id", i);
			pagination[i].addEventListener("click", overCircle)
		}


		for (let i = 0; i <= 6; i++) {
			setTimeout(() => {
				if (i == 6) {
					pagination[0].click();
				}
				else {
					pagination[i].click();
				}
			}, 200)

		}

		//点击圆点
		function overCircle() {
			let preIndex = currentIndex
			currentIndex = parseInt(this.id);
			changeImage(preIndex, currentIndex)
		}

		//实现自动轮播
		function nextMove() {
			let preIndex = currentIndex
			if (currentIndex != 5) {
				currentIndex++;
			}
			else {
				currentIndex = 0;
			}

			changeImage(preIndex, currentIndex)
		}
		let timer = setInterval(nextMove, 8000);

		//改变图片样式和小圆点样式
		function changeImage(pI, cI) {

			slides[pI].style.opacity = 0;
			slides[cI].style.opacity = 1;

			slides[pI].style.visibility = "hidden"
			slides[cI].style.visibility = "visible"

			pagination[pI].className = ""
			pagination[cI].className = "current"
		}
	}
}


export default index;