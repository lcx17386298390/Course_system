<template>
	<div>
		<!-- 推荐轮播图 -->
		<div class="qBanner">
			<div id="full-screen-slider">
				<ul id="slides">
					<!-- A计划 -->
					<li v-for="(value) in successMes.data.slideImageList" :key="value.id" :style="{background: 'url('+value.ImageName+')'}" style="background: center top no-repeat; z-index: 9; transition:all 2s; visibility: visible; background-size: auto 100%; opacity:1;">
						<a href="#" target="_blank"></a>>
					</li>

					<!-- B计划 -->
					<!-- <li style="background: url() center top no-repeat; z-index: 9; visibility: visible; background-size: auto 100%; opacity:1;"><a href="#" target="_blank"></a></li>
					<li style="background: url() center top no-repeat; z-index: 8; visibility: hidden; background-size: auto 100%; opacity:0;"><a href="#" target="_blank"></a></li>
					<li style="background: url() center top no-repeat; z-index: 9; visibility: hidden; background-size: auto 100%; opacity:0;"><a href="#" target="_blank"></a></li>
					<li style="background: url() center top no-repeat; z-index: 9; visibility: hidden; background-size: auto 100%; opacity:0;"><a href="#" target="_blank"></a></li>
					<li style="background: url() center top no-repeat; z-index: 9; visibility: hidden; background-size: auto 100%; opacity:0;"><a href="#" target="_blank"></a></li>
					<li style="background: url() center top no-repeat; z-index: 9; visibility: hidden; background-size: auto 100%; opacity:0;"><a href="#" target="_blank"></a></li> -->
				</ul>
				<ul id="pagination" style="margin-left: -72px;">
					<!-- <li v-for="(value) in successMes" :key="value.id" class="current"><a href="#"></a></li> -->
					<li class="current"><a href="#">1</a></li>
					<li class=""><a href="#">2</a></li>
					<li class=""><a href="#">3</a></li>
					<li class=""><a href="#">4</a></li>
					<li class=""><a href="#">5</a></li>
					<li class=""><a href="#">6</a></li>
				</ul>
			</div>
		</div>

		<!-- 课程分类表 -->
		<div class="qFicat">
			<div class="qWrap clearfix">
				<ul class="qFicat_ul01 clearfix fl">
					<li value="1"><a class="title" href="javascript:void(0);">本科</a></li>
					<li value="6863" data-value="C1"><a href="javascript:void(0);">理学</a></li>
					<li value="6913" data-value="C1"><a href="javascript:void(0);">工学</a></li>
					<li value="6775" data-value="C1"><a href="javascript:void(0);">文学</a></li>
					<li value="6695" data-value="C1"><a href="javascript:void(0);">经济学</a></li>
					<li value="7205" data-value="C1"><a href="javascript:void(0);">管理学</a></li>
					<li value="6717" data-value="C1"><a href="javascript:void(0);">法学</a></li>
					<li value="7149" data-value="C1"><a href="javascript:void(0);">医学</a></li>
					<li value="7114" data-value="C1"><a href="javascript:void(0);">农学</a></li>
					<li value="7261" data-value="C1"><a href="javascript:void(0);">艺术学</a></li>
					<li value="6855" data-value="C1"><a href="javascript:void(0);">历史学</a></li>
					<li value="6756" data-value="C1"><a href="javascript:void(0);">教育学</a></li>
				</ul>
				<ul class="qFicat_ul02 clearfix fl">
					<li value="491"><a class="title" href="javascript:void(0);">高职</a></li>
					<li value="3165" data-value="C2"><a href="javascript:void(0);">电子信息</a></li>
					<li value="3529" data-value="C2"><a href="javascript:void(0);">公管与服务</a></li>
					<li value="3264" data-value="C2"><a href="javascript:void(0);">财经商贸</a></li>
					<li value="3209" data-value="C2"><a href="javascript:void(0);">医药卫生</a></li>
					<li value="2937" data-value="C2"><a href="javascript:void(0);">装备制造</a></li>
				</ul>
				<ul class="qFicat_ul03 clearfix fl">
					<li value="7330"><a class="title" href="javascript:void(0);">中职</a></li>
					<li value="7339" data-value="C3"><a href="javascript:void(0);">信息技术</a></li>
					<li value="7335" data-value="C3"><a href="javascript:void(0);">加工制造</a></li>
					<li value="7343" data-value="C3"><a href="javascript:void(0);">旅游服务</a></li>
					<li value="7344" data-value="C3"><a href="javascript:void(0);">文化艺术</a></li>
					<li value="7338" data-value="C3"><a href="javascript:void(0);">交通运输</a></li>
			
				</ul>
				<ul class="qFicat_ul04 clearfix fl">
					<li class="active"><a href="https://www.xueyinonline.com/mooc/courselist?coursetype=2">国家级金课</a></li>
					<li><a href="https://www.xueyinonline.com/portal/project">微专业</a></li>
					<li><a href="https://www.xueyinonline.com/portal/project">微学位</a></li>
					<li><a href="https://www.xueyinonline.com/mooc/courselist">更多</a></li>
				</ul>
			</div>
		</div>

		<!--个性推荐 （甲方自做算法接口）start-->
		<div class="qnewCourse snf-page">
			<div class="qTitle">
				<h2 class="ico_newCourse fl"></h2>
			</div>
			<div class="qExpress clearAfter">
				<!-- 首位推荐 -->
				<div class="qExpress_cack fl">
					<div class="qExpress_padd qNima">
						<div class="qExpress_pic"><a href="#"><img
									src=""></a>
							<span></span>
						</div>
						<dl class="qExpress_dl">
							<dt><a href="#">xxx</a></dt>
							<dd>xxx</dd>
						</dl>
						<div class="qExpress_state">
							<span class="colorBlue fl">进行中</span>
							<span class="colorGray fr">xxx人已学</span>
						</div>
					</div>
				</div>
				<!-- 次推 -->
				<div class="qExpress_list fr">
					<ul class="clearAfter">
						<li>
							<div class="qExpress_padd qNima">
								<div class="qExpress_pic"><a href="#"><img
											src=""></a>
									<span></span>
								</div>
								<dl class="qExpress_dl">
									<dt><a href="#">xxx</a></dt>
									<dd>xxx</dd>
								</dl>
							</div>
						</li>
						<li>
							<div class="qExpress_padd qNima">
								<div class="qExpress_pic"><a href="#"><img
											src=""></a>
									<span></span>
								</div>
								<dl class="qExpress_dl">
									<dt><a href="#">xxx</a></dt>
									<dd>xxx</dd>
								</dl>
							</div>
						</li>
						<li>
							<div class="qExpress_padd qNima">
								<div class="qExpress_pic"><a href="#"><img
											src=""></a>
									<span></span>
								</div>
								<dl class="qExpress_dl">
									<dt><a href="#">xxx</a></dt>
									<dd>xxx</dd>
								</dl>
							</div>
						</li>
						<li>
							<div class="qExpress_padd qNima">
								<div class="qExpress_pic"><a href="#"><img
											src=""></a>
									<span></span>
								</div>
								<dl class="qExpress_dl">
									<dt><a href="#">xxx</a></dt>
									<dd>xxx</dd>
								</dl>
							</div>
						</li>
						<li>
							<div class="qExpress_padd qNima">
								<div class="qExpress_pic"><a href="#"><img
											src=""></a>
									<span></span>
								</div>
								<dl class="qExpress_dl">
									<dt><a href="#">xxx</a></dt>
									<dd>xxx</dd>
								</dl>
							</div>
						</li>
						<li>
							<div class="qExpress_padd qNima">
								<div class="qExpress_pic"><a href="#"><img
											src=""></a>
									<span></span>
								</div>
								<dl class="qExpress_dl">
									<dt><a href="#">xxx</a></dt>
									<dd>xxx</dd>
								</dl>
							</div>
						</li>
					</ul>
					<!-- <ul class="clearAfter">
						<li v-for="">
							<div class="qExpress_padd qNima">
								<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/228586727"><img
											src=""></a>
									<span></span>
								</div>
								<dl class="qExpress_dl">
									<dt><a href="https://www.xueyinonline.com/detail/228586727">电子商务数据分析基础</a></dt>
									<dd>乌鲁木齐职业大学 | 慕颜如</dd>
								</dl>
							</div>
						</li>
					</ul> -->
				</div>
		
			</div>
		</div>

		<!-- 热门推送 -->
		<div class="qHotSel snf-page">
			<div class="qTitle">
				<a class="ico_qHotSel fl"></a>
				<ul class="qTitle_tab fl" id="picTab">
					<!-- <li class="active">推荐</li>
					<li>计算机类</li>
					<li>经管类</li>
					<li>文史类</li>
					<li>理工类</li> -->
				</ul>
				<a class="qMore fr" href="https://www.xueyinonline.com/mooc/courselist">更多 &gt;</a>
			</div>
			<div class="qHotSel_ul" id="picCon">
				<ul class="clearAfter">
					<!-- 学习人数最多推荐 -->
					<li v-for="(value,index) in successMes.data.LearnSortCourse" :key="index">
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a :href="'/#/coursePage/'+value.courseNumber" target="_brank"><img
									:src="'/images/'+value.imagePath"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a :href="'/#/coursePage/'+value.courseNumber" target="_brank">{{value.courseName}}</a></dt>
								<dd>{{value.teacherSchool}} | {{value.teacherName}}</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">{{value.state==1 ? '进行中':"已结束"}}</span>
								<span class="colorGray fr">{{value.learnNumber}}人已学</span>
							</div>
						</div>
					</li>
					<!-- 评论人数最多推荐 -->
					<li v-for="(value,index) in successMes.data.CommentSortCourse" :key="index">
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a :href="'/#/coursePage/'+value.courseNumber" target="_brank"><img
									:src="'/images/'+value.imagePath"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a :href="'/#/coursePage/'+value.courseNumber" target="_brank">{{value.courseName}}</a></dt>
								<dd>{{value.teacherSchool}} | {{value.teacherName}}</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">{{value.state==1 ? '进行中':"已结束"}}</span>
								<span class="colorGray fr">{{value.learnNumber}}人已学</span>
							</div>
						</div>
					</li>
					<!-- <li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227089381"><img
									:src="successMes"	></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227089381">传播学：生活的镜像</a></dt>
								<dd>山西财经大学 | 王群英</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2790人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226931029">
								<img src="https://s1.imagehub.cc/images/2022/11/01/95dbb6a6c55b215026c1a8c2b3482820.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226931029">书籍装帧设计&nbsp;第七期&nbsp;（2022秋季）</a>
								</dt>
								<dd>内蒙古艺术学院 | 赵媛</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2093人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227919937"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/dbcf61c8b724511bd1d667669447713e.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227919937">摄影技术与艺术</a></dt>
								<dd>江西科技学院 | 秦琛</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">4137人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/228093602"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/8f20f6ac3e57b0eb6392e67ce2830666.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/228093602">中医基础理论</a></dt>
								<dd>辽宁中医药大学 | 尚德阳 </dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2410人已学</span>
							</div>
						</div>
					</li> -->
					<!-- <li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226678488"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/af6649d0203a5ebfba227a7b2639a92c.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226678488">卫生微生物检验实验方法与技能</a></dt>
								<dd>南华大学 | 柏琴琴</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1761人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/229475734"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/fdb31d99532aa8d887fd7b8e95b0ee9b.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/229475734">互联网空间的法律-第五期</a></dt>
								<dd>武汉东湖学院 | 李振华</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">3617人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/228106561"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/283964a488eb3dcc74e05bea7c217c81.png"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/228106561">药用植物</a></dt>
								<dd>安徽中医药高等专科学校 | 汪荣斌</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2376人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227835598"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/33e2931ddad3f3283dfa72499df16357.png"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227835598">管理信息系统</a></dt>
								<dd>杭州电子科技大学 | 柳毅</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1225人已学</span>
							</div>
						</div>
					</li> -->
				</ul>
				<!-- <ul class="clearAfter" style="display: none;">
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227346181"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/31e0013aec71d41dc0ca3d9a1418130d.jpeg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227346181">网络技术与应用</a></dt>
								<dd>陕西职业技术学院 | 薄璐</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">3394人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227205172"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/cf5fcfd46629eb42750ed4f1815a074f.png"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227205172">大学计算机基础</a></dt>
								<dd>华北科技学院 | 郭红</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">6200人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/228865874"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/95582d25cdcc2256b0339149bab43f85.png"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/228865874">Python程序设计基础</a></dt>
								<dd>陕西理工大学 | 赵晖</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">8126人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227627832"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/470d3d5455b96ea9ee91f003a1093d40.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227627832">Blockly 创意趣味编程</a></dt>
								<dd>兰州大学 | 周庆国</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2905人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226959986"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/da60d1a9b5e2875f64c796743063f24c.png"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226959986">网页设计 九期</a></dt>
								<dd>萍乡学院 | 梁莉菁</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2847人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226954428"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/59798d440f0e8c4ace900a776ca79cb2.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226954428">Java面向对象程序设计</a></dt>
								<dd>湖南涉外经济学院 | 卢嫣</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2811人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227096710"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/c61089739c4dc597d469e4a7a2bef157.png"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227096710">（第六期）高级语言程序设计</a></dt>
								<dd>南昌师范学院 | 徐新爱</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2252人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/224874696"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/72cf23aa8fc8ab5df73af6ece80dad5e.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/224874696">3D设计与打印</a></dt>
								<dd>山东工业职业学院 | 李晓芳</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1582人已学</span>
							</div>
						</div>
					</li>
				</ul>
				<ul class="clearAfter" style="display: none;">
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226620643"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/eaf14ff5f487ced941cd607c7edef635.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226620643">统计之美</a></dt>
								<dd>湖南理工学院 | 曾玉林</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2014人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227626319"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/5a5b2e549c2f920cfc86d9e540f003a2.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227626319">国际贸易理论与政策</a></dt>
								<dd>湖南财政经济学院 | 姚志毅</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1802人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227544760"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/2e9520ca7ab66757b9695c3b2a069ca1.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227544760">资本市场运作</a></dt>
								<dd>广州华商学院 | 杨俏文</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">11594人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227642746"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/d82b6bb57cf9fed741e24fcf21d64085.png"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227642746">货币金融学</a></dt>
								<dd>中南财经政法大学 | 朱新蓉</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2636人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226964428"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/53c66593a310a822ad8b315c.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226964428">宏观经济学（2022秋季）</a></dt>
								<dd>内蒙古财经大学 | 纪红丽</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">3310人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227617518"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/b9b018961f9dbeedc6d4c9bc51186a12.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227617518">会计学原理（7期）</a></dt>
								<dd>贵州财经大学 | 钱润红</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">8581人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226978862"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/2f6722b55a3ae01950a00a82e0662452.png"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226978862">旅行社计调业务（8）</a></dt>
								<dd>河源职业技术学院 | 张颖</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">3783人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/229002442"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/1bc80aaae00b8340a27389b1e6c9bce2.png"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/229002442">创业者的管理心理学修炼（2022上）</a></dt>
								<dd>福建江夏学院 | 邵雅利</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">4606人已学</span>
							</div>
						</div>
					</li>
				</ul>
				<ul class="clearAfter" style="display: none;">
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226027119"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/0e3c2b55bbbd6f1daf20a946ec664d05.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226027119">大学体育 1（体育导论）</a></dt>
								<dd>青岛科技大学 | 楚晓东</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">24213人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227554201"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/0da359a672cd57866424abae86320929.png"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227554201">日本近现代文学选读</a></dt>
								<dd>上海外国语大学 | 高洁</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1924人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227077076"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/33ab5791adf669e62c7de431a6b9f983.png"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227077076">神话传说故事与中国文化</a></dt>
								<dd>郑州工程技术学院 | 丁雪艳</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2051人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226946376"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/c4ac158654076ede6c3c340b6535e3c6.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226946376">第7期 英语课堂微技能教学</a></dt>
								<dd>南昌师范学院 | 雷雪莲 </dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1946人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227914279"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/3ea3d4a20535c67c59d1c5dfd650ebbd.png"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227914279">对联文化</a></dt>
								<dd>湖南第一师范学院 | 鲁晓川</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2935人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227484304"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/5360f922c6774f0a1ada85c3c3622274.png"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227484304">大学生礼仪与形象设计</a></dt>
								<dd>兰州交通大学 | 陈鸿雁（主讲）</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">5303人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/226819970"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/b4e66884a4c351af09c69083a1ce17e7.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/226819970">现当代国际关系史</a></dt>
								<dd>江西师范大学 | 李昌新</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1282人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/228969701"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/d48705eb746a75e2e1d91a612b20d355.png"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/228969701">欧美影视语言文化赏析</a></dt>
								<dd>湖北工业职业技术学院 | 唐本赛</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">4132人已学</span>
							</div>
						</div>
					</li>
				</ul>
				<ul class="clearAfter" style="display: none;">
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227589293"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/890474e45d90fa6248e18319d64accaa.jpg"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227589293">诺贝尔物理学奖漫谈</a></dt>
								<dd>兰州大学 | 王建波</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1005人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227719629"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/8636267e25dba7d0558f325aa0ee413b.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227719629">建筑力学（上）</a></dt>
								<dd>广西建设职业技术学院 | 江怀雁</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">3929人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227879232"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/8b0a41138419bdb7b4a68dc2f546ce52.png"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227879232">概率论基础</a></dt>
								<dd>湖南涉外经济学院 | 周琴</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">10605人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227642355"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/aab52962b92e29400a18393c5d0ff1e4.png"></a>
								<span class="qTips_two"></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227642355">环境监测</a></dt>
								<dd>湖南农业大学 | 吴根义</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">2668人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/228359785"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/a87096e82b5399d88a1dcab63eb704c0.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/228359785">电子技术基础与实践</a></dt>
								<dd>山东工业职业学院 | 董建民</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1478人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227089417"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/3f5fb74b80ae22e5a523a9ab8de723b4.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227089417">高等数学（微积分）</a></dt>
								<dd>山西财经大学 | 刘振洁</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">23910人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227022935"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/0318530e82dc62f95848cd6d6af401a4.png"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227022935">汽车底盘检修</a></dt>
								<dd>山东工业职业学院 | 苏尚彬</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">1507人已学</span>
							</div>
						</div>
					</li>
					<li>
						<div class="qExpress_padd qNima">
							<div class="qExpress_pic"><a href="https://www.xueyinonline.com/detail/227809113"><img
										src="https://p.ananas.chaoxing.com/star3/320_150c/47d7b1830299eb708748615902255758.jpg"></a>
								<span></span>
							</div>
							<dl class="qExpress_dl">
								<dt><a href="https://www.xueyinonline.com/detail/227809113">建筑识图与构造(1+X建筑工程识图职业技能等级培训)</a></dt>
								<dd>南宁职业技术学院 | 王宇平</dd>
							</dl>
							<div class="qExpress_state">
								<span class="colorBlue fl">进行中</span>
								<span class="colorGray fr">7402人已学</span>
							</div>
						</div>
					</li>
				</ul> -->
			</div>
		</div>
	</div>
</template>

<script>

import indexJs from '@/assets/style/js/indexVue';
import $ from 'jquery';
export default {
	name: "IndexTest",
	data(){
		return{
			// 后端返回的信息
			successMes:{
				data:{
					LearnSortCourse:[],
					CommentSortCourse:[],
					loginState:{},	//登录状态和信息
					slideImageList:[],	//轮播图图片
				}
			}
		}
	},
	methods:{
		mesUpdata: function (callback) {
			indexJs.indexAccess().then(res => {
				this.successMes = res
				callback(res)
			})
		}
	},
	mounted() {
		window.Vue = this
		let _this = this
		indexJs.indexStyle()
		// 渲染页面
		this.mesUpdata(function(arr){
			_this.$nextTick(()=>{
				console.log(arr)
			})
		})
	},
};
</script>
<style>
@import "../assets/style/css/index.css";
@import "../assets/style/css/global.css"
</style>