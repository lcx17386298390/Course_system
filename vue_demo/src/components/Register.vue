<template>
        <div class="lg-container" id="registerVm">
            <div class="main main-def-w lg-register">
                <div class="lg-top fs14">
                    <a id="back" href="javascript:void(0)" onclick="window.history.go(-1);" class="back icon-back col-lightblue">返回</a>
                </div>
                <form method="post" action="/upTeacherMes" enctype="multipart/form-data">
                    <!--第一步-->
                    <div class="mesDiv1">
                        <h3 class="lg-title">新用户注册</h3>
                        <div class="lg-item icon-school margin-btm24 item-select" id="pidDiv" style="display:none">
                            <input type="text" class="w-ipt-100 to-select-list" id="filter2" placeholder="选择单位" autocomplete="off" onfocus="getFormsByPid(2)" oninput="javascript:getFormsByPid(2)">
                            <div class="filter-list">
                                <ul class="beat-scroll list-jg" id="r1b2">
                                </ul>
                            </div>

                        </div>
                        <!--电话号码-->
                        <div class="item-tel clearaft item-select">
                            <span class="tel-area fl icon-down to-select-list" @click="showTelList" id="countryShow">+86</span>
                            <input type="hidden" value="86" id="countryCode" class="voiceUsedCountryCode">
                            <input type="tel" class="ipt-focus voiceUsedPhone" name="phone" placeholder="手机号" id="phone" maxlength="20">
                            <p class="err-txt" id="phoneMsg"></p>
                            <div class="filter-list" style="display:none">
                                <div class="li-search">
                                    <div class="dataSearch">
                                        <input v-mode name="" v-model="findCountryCode" class="dataSearch_input fl" placeholder="搜索" id="searchInput">
                                        <input type="button" name="" value="" class="dataSearch_bnt fl" id="searchButton">
                                    </div>
                                </div>
                                <ul class="list beat-scroll" id="countryList">
                                    <li data-id="86" @click="setCountryCode(86)">
                                        <span class="fl">中国</span>
                                        <span class="fr">+86</span>
                                    </li>
                                    <li data-id="852" @click="setCountryCode(852)"><span class="fl">中国香港</span><span class="fr">+852</span>
                                    </li>
                                    <li data-id="886" @click="setCountryCode(886)"><span class="fl">中国台湾</span><span class="fr">+886</span>
                                    </li>
                                    <li data-id="853" @click="setCountryCode(853)"><span class="fl">中国澳门</span><span class="fr">+853</span>
                                    </li>
                                    <li data-id="1" @click="setCountryCode(1)"><span class="fl">美国</span><span class="fr">+1</span></li>
                                    <li data-id="1" @click="setCountryCode(1)"><span class="fl">加拿大</span><span class="fr">+1</span></li>
                                    <li data-id="65" @click="setCountryCode(65)"><span class="fl">新加坡</span><span class="fr">+65</span>
                                    </li>
                                    <li data-id="60" @click="setCountryCode(60)"><span class="fl">马来西亚</span><span class="fr">+60</span>
                                    </li>
                                    <li data-id="44" @click="setCountryCode(44)"><span class="fl">英国</span><span class="fr">+44</span></li>
                                    <li data-id="49" @click="setCountryCode(49)"><span class="fl">德国</span><span class="fr">+49</span></li>
                                    <li data-id="81" @click="setCountryCode(81)"><span class="fl">日本</span><span class="fr">+81</span></li>
                                    <li data-id="244" @click="setCountryCode(244)"><span class="fl">安哥拉</span><span class="fr">+244</span>
                                    </li>
                                    <li data-id="93" @click="setCountryCode(93)"><span class="fl">阿富汗</span><span class="fr">+93</span>
                                    </li>
                                    <li data-id="355" @click="setCountryCode(355)"><span class="fl">阿尔巴尼亚</span><span
                                            class="fr">+355</span></li>
                                    <li data-id="213" @click="setCountryCode(213)"><span class="fl">阿尔及利亚</span><span
                                            class="fr">+213</span></li>
                                    <li data-id="376" @click="setCountryCode(376)"><span class="fl">安道尔共和国</span><span
                                            class="fr">+376</span></li>
                                    <li data-id="1264" @click="setCountryCode(1264)"><span class="fl">安圭拉岛</span><span
                                            class="fr">+1264</span></li>
                                    <li data-id="1268" @click="setCountryCode(1268)"><span class="fl">安提瓜和巴布达</span><span
                                            class="fr">+1268</span></li>
                                    <li data-id="54" @click="setCountryCode(54)"><span class="fl">阿根廷</span><span class="fr">+54</span>
                                    </li>
                                    <li data-id="374" @click="setCountryCode(374)"><span class="fl">亚美尼亚</span><span class="fr">+374</span>
                                    </li>
                                    <li data-id="247" @click="setCountryCode(247)"><span class="fl">阿森松</span><span class="fr">+247</span>
                                    </li>
                                    <li data-id="61" @click="setCountryCode(61)"><span class="fl">澳大利亚</span><span class="fr">+61</span>
                                    </li>
                                    <li data-id="43" @click="setCountryCode(43)"><span class="fl">奥地利</span><span class="fr">+43</span>
                                    </li>
                                    <li data-id="994" @click="setCountryCode(994)"><span class="fl">阿塞拜疆</span><span class="fr">+994</span>
                                    </li>
                                    <li data-id="1242" @click="setCountryCode(1242)"><span class="fl">巴哈马</span><span
                                            class="fr">+1242</span></li>
                                    <li data-id="973" @click="setCountryCode(973)"><span class="fl">巴林</span><span class="fr">+973</span>
                                    </li>
                                    <li data-id="880" @click="setCountryCode(880)"><span class="fl">孟加拉国</span><span class="fr">+880</span>
                                    </li>
                                    <li data-id="1246" @click="setCountryCode(1246)"><span class="fl">巴巴多斯</span><span
                                            class="fr">+1246</span></li>
                                    <li data-id="375" @click="setCountryCode(375)"><span class="fl">白俄罗斯</span><span class="fr">+375</span>
                                    </li>
                                    <li data-id="32" @click="setCountryCode(32)"><span class="fl">比利时</span><span class="fr">+32</span>
                                    </li>
                                    <li data-id="501" @click="setCountryCode(501)"><span class="fl">伯利兹城</span><span class="fr">+501</span>
                                    </li>
                                    <li data-id="229" @click="setCountryCode(229)"><span class="fl">贝宁</span><span class="fr">+229</span>
                                    </li>
                                    <li data-id="1441" @click="setCountryCode(1441)"><span class="fl">百慕大</span><span
                                            class="fr">+1441</span></li>
                                    <li data-id="591" @click="setCountryCode(591)"><span class="fl">玻利维亚</span><span class="fr">+591</span>
                                    </li>
                                    <li data-id="267" @click="setCountryCode(267)"><span class="fl">博茨瓦纳</span><span class="fr">+267</span>
                                    </li>
                                    <li data-id="55" @click="setCountryCode(55)"><span class="fl">巴西</span><span class="fr">+55</span></li>
                                    <li data-id="673" @click="setCountryCode(673)"><span class="fl">文莱达鲁萨兰国</span><span
                                            class="fr">+673</span></li>
                                    <li data-id="359" @click="setCountryCode(359)"><span class="fl">保加利亚</span><span class="fr">+359</span>
                                    </li>
                                    <li data-id="226" @click="setCountryCode(226)"><span class="fl">布基纳法索</span><span
                                            class="fr">+226</span></li>
                                    <li data-id="95" @click="setCountryCode(95)"><span class="fl">缅甸</span><span class="fr">+95</span></li>
                                    <li data-id="257" @click="setCountryCode(257)"><span class="fl">布隆迪</span><span class="fr">+257</span>
                                    </li>
                                    <li data-id="237" @click="setCountryCode(237)"><span class="fl">喀麦隆</span><span class="fr">+237</span>
                                    </li>
                                    <li data-id="1" @click="setCountryCode(1)"><span class="fl">加拿大</span><span class="fr">+1</span></li>
                                    <li data-id="1345" @click="setCountryCode(1345)"><span class="fl">开曼群岛</span><span
                                            class="fr">+1345</span></li>
                                    <li data-id="236" @click="setCountryCode(236)"><span class="fl">中非共和国</span><span
                                            class="fr">+236</span></li>
                                    <li data-id="235" @click="setCountryCode(235)"><span class="fl">乍得</span><span class="fr">+235</span>
                                    </li>
                                    <li data-id="56" @click="setCountryCode(56)"><span class="fl">智利</span><span class="fr">+56</span></li>
                                    <li data-id="86" @click="setCountryCode(86)"><span class="fl">中国</span><span class="fr">+86</span></li>
                                    <li data-id="57" @click="setCountryCode(57)"><span class="fl">哥伦比亚</span><span class="fr">+57</span>
                                    </li>
                                    <li data-id="242" @click="setCountryCode(242)"><span class="fl">刚果</span><span class="fr">+242</span>
                                    </li>
                                    <li data-id="682" @click="setCountryCode(682)"><span class="fl">库克群岛</span><span class="fr">+682</span>
                                    </li>
                                    <li data-id="506" @click="setCountryCode(506)"><span class="fl">哥斯达黎加</span><span
                                            class="fr">+506</span></li>
                                    <li data-id="53" @click="setCountryCode(53)"><span class="fl">古巴</span><span class="fr">+53</span></li>
                                    <li data-id="357" @click="setCountryCode(357)"><span class="fl">塞浦路斯</span><span class="fr">+357</span>
                                    </li>
                                    <li data-id="420" @click="setCountryCode(420)"><span class="fl">捷克</span><span class="fr">+420</span>
                                    </li>
                                    <li data-id="45" @click="setCountryCode(45)"><span class="fl">丹麦</span><span class="fr">+45</span></li>
                                    <li data-id="253" @click="setCountryCode(253)"><span class="fl">吉布提</span><span class="fr">+253</span>
                                    </li>
                                    <li data-id="593" @click="setCountryCode(593)"><span class="fl">厄瓜多尔</span><span class="fr">+593</span>
                                    </li>
                                    <li data-id="20" @click="setCountryCode(20)"><span class="fl">埃及</span><span class="fr">+20</span></li>
                                    <li data-id="503" @click="setCountryCode(503)"><span class="fl">萨尔瓦多</span><span class="fr">+503</span>
                                    </li>
                                    <li data-id="372" @click="setCountryCode(372)"><span class="fl">爱沙尼亚</span><span class="fr">+372</span>
                                    </li>
                                    <li data-id="251" @click="setCountryCode(251)"><span class="fl">埃塞俄比亚</span><span
                                            class="fr">+251</span></li>
                                    <li data-id="679" @click="setCountryCode(679)"><span class="fl">斐济</span><span class="fr">+679</span>
                                    </li>
                                    <li data-id="358" @click="setCountryCode(358)"><span class="fl">芬兰</span><span class="fr">+358</span>
                                    </li>
                                    <li data-id="33" @click="setCountryCode(33)"><span class="fl">法国</span><span class="fr">+33</span></li>
                                    <li data-id="594" @click="setCountryCode(594)"><span class="fl">法属圭亚那</span><span
                                            class="fr">+594</span></li>
                                    <li data-id="241" @click="setCountryCode(241)"><span class="fl">加蓬</span><span class="fr">+241</span>
                                    </li>
                                    <li data-id="220" @click="setCountryCode(220)"><span class="fl">冈比亚</span><span class="fr">+220</span>
                                    </li>
                                    <li data-id="995" @click="setCountryCode(995)"><span class="fl">格鲁吉亚</span><span class="fr">+995</span>
                                    </li>
                                    <li data-id="49" @click="setCountryCode(49)"><span class="fl">德国</span><span class="fr">+49</span></li>
                                    <li data-id="233" @click="setCountryCode(233)"><span class="fl">加纳</span><span class="fr">+233</span>
                                    </li>
                                    <li data-id="350" @click="setCountryCode(350)"><span class="fl">直布罗陀</span><span class="fr">+350</span>
                                    </li>
                                    <li data-id="30" @click="setCountryCode(30)"><span class="fl">希腊</span><span class="fr">+30</span></li>
                                    <li data-id="1473" @click="setCountryCode(1473)"><span class="fl">格林纳达</span><span
                                            class="fr">+1473</span></li>
                                    <li data-id="1671" @click="setCountryCode(1671)"><span class="fl">关岛</span><span
                                            class="fr">+1671</span></li>
                                    <li data-id="502" @click="setCountryCode(502)"><span class="fl">危地马拉</span><span class="fr">+502</span>
                                    </li>
                                    <li data-id="224" @click="setCountryCode(224)"><span class="fl">几内亚</span><span class="fr">+224</span>
                                    </li>
                                    <li data-id="592" @click="setCountryCode(592)"><span class="fl">圭亚那</span><span class="fr">+592</span>
                                    </li>
                                    <li data-id="509" @click="setCountryCode(509)"><span class="fl">海地</span><span class="fr">+509</span>
                                    </li>
                                    <li data-id="504" @click="setCountryCode(504)"><span class="fl">洪都拉斯</span><span class="fr">+504</span>
                                    </li>
                                    <li data-id="852" @click="setCountryCode(852)"><span class="fl">香港（中国）</span><span
                                            class="fr">+852</span></li>
                                    <li data-id="36" @click="setCountryCode(36)"><span class="fl">匈牙利</span><span class="fr">+36</span>
                                    </li>
                                    <li data-id="354" @click="setCountryCode(354)"><span class="fl">冰岛</span><span class="fr">+354</span>
                                    </li>
                                    <li data-id="91" @click="setCountryCode(91)"><span class="fl">印度</span><span class="fr">+91</span></li>
                                    <li data-id="62" @click="setCountryCode(62)"><span class="fl">印度尼西亚</span><span class="fr">+62</span>
                                    </li>
                                    <li data-id="98" @click="setCountryCode(98)"><span class="fl">伊朗（伊斯兰共和国）</span><span
                                            class="fr">+98</span></li>
                                    <li data-id="964" @click="setCountryCode(964)"><span class="fl">伊拉克</span><span class="fr">+964</span>
                                    </li>
                                    <li data-id="353" @click="setCountryCode(353)"><span class="fl">爱尔兰</span><span class="fr">+353</span>
                                    </li>
                                    <li data-id="972" @click="setCountryCode(972)"><span class="fl">以色列</span><span class="fr">+972</span>
                                    </li>
                                    <li data-id="39" @click="setCountryCode(39)"><span class="fl">意大利</span><span class="fr">+39</span>
                                    </li>
                                    <li data-id="1876" @click="setCountryCode(1876)"><span class="fl">牙买加</span><span
                                            class="fr">+1876</span></li>
                                    <li data-id="81" @click="setCountryCode(81)"><span class="fl">日本</span><span class="fr">+81</span></li>
                                    <li data-id="962" @click="setCountryCode(962)"><span class="fl">约旦</span><span class="fr">+962</span>
                                    </li>
                                    <li data-id="855" @click="setCountryCode(855)"><span class="fl">柬埔寨</span><span class="fr">+855</span>
                                    </li>
                                    <li data-id="7" @click="setCountryCode(7)"><span class="fl">哈萨克</span><span class="fr">+7</span></li>
                                    <li data-id="254" @click="setCountryCode(254)"><span class="fl">肯尼亚</span><span class="fr">+254</span>
                                    </li>
                                    <li data-id="82" @click="setCountryCode(82)"><span class="fl">韩国</span><span class="fr">+82</span></li>
                                    <li data-id="965" @click="setCountryCode(965)"><span class="fl">科威特</span><span class="fr">+965</span>
                                    </li>
                                    <li data-id="996" @click="setCountryCode(996)"><span class="fl">吉尔吉斯</span><span class="fr">+996</span>
                                    </li>
                                    <li data-id="856" @click="setCountryCode(856)"><span class="fl">老挝</span><span class="fr">+856</span>
                                    </li>
                                    <li data-id="371" @click="setCountryCode(371)"><span class="fl">拉脱维亚</span><span class="fr">+371</span>
                                    </li>
                                    <li data-id="961" @click="setCountryCode(961)"><span class="fl">黎巴嫩</span><span class="fr">+961</span>
                                    </li>
                                    <li data-id="266" @click="setCountryCode(266)"><span class="fl">莱索托</span><span class="fr">+266</span>
                                    </li>
                                    <li data-id="231" @click="setCountryCode(231)"><span class="fl">利比里亚</span><span class="fr">+231</span>
                                    </li>
                                    <li data-id="218" @click="setCountryCode(218)"><span class="fl">利比亚</span><span class="fr">+218</span>
                                    </li>
                                    <li data-id="423" @click="setCountryCode(423)"><span class="fl">列支敦士登</span><span
                                            class="fr">+423</span></li>
                                    <li data-id="370" @click="setCountryCode(370)"><span class="fl">立陶宛</span><span class="fr">+370</span>
                                    </li>
                                    <li data-id="352" @click="setCountryCode(352)"><span class="fl">卢森堡</span><span class="fr">+352</span>
                                    </li>
                                    <li data-id="853" @click="setCountryCode(853)"><span class="fl">澳门（中国）</span><span
                                            class="fr">+853</span></li>
                                    <li data-id="261" @click="setCountryCode(261)"><span class="fl">马达加斯加</span><span
                                            class="fr">+261</span></li>
                                    <li data-id="265" @click="setCountryCode(265)"><span class="fl">马拉维</span><span class="fr">+265</span>
                                    </li>
                                    <li data-id="60" @click="setCountryCode(60)"><span class="fl">马来西亚</span><span class="fr">+60</span>
                                    </li>
                                    <li data-id="960" @click="setCountryCode(960)"><span class="fl">马尔代夫</span><span class="fr">+960</span>
                                    </li>
                                    <li data-id="223" @click="setCountryCode(223)"><span class="fl">马里</span><span class="fr">+223</span>
                                    </li>
                                    <li data-id="356" @click="setCountryCode(356)"><span class="fl">马尔他</span><span class="fr">+356</span>
                                    </li>
                                    <li data-id="1670" @click="setCountryCode(1670)"><span class="fl">北马里亚纳群岛</span><span
                                            class="fr">+1670</span></li>
                                    <li data-id="596" @click="setCountryCode(596)"><span class="fl">马提尼克岛</span><span
                                            class="fr">+596</span></li>
                                    <li data-id="230" @click="setCountryCode(230)"><span class="fl">毛里求斯</span><span class="fr">+230</span>
                                    </li>
                                    <li data-id="52" @click="setCountryCode(52)"><span class="fl">墨西哥</span><span class="fr">+52</span>
                                    </li>
                                    <li data-id="373" @click="setCountryCode(373)"><span class="fl">摩尔多瓦</span><span class="fr">+373</span>
                                    </li>
                                    <li data-id="377" @click="setCountryCode(377)"><span class="fl">摩纳哥</span><span class="fr">+377</span>
                                    </li>
                                    <li data-id="976" @click="setCountryCode(976)"><span class="fl">外蒙古</span><span class="fr">+976</span>
                                    </li>
                                    <li data-id="1664" @click="setCountryCode(1664)"><span class="fl">蒙特塞拉特</span><span
                                            class="fr">+1664</span></li>
                                    <li data-id="212" @click="setCountryCode(212)"><span class="fl">摩洛哥</span><span class="fr">+212</span>
                                    </li>
                                    <li data-id="258" @click="setCountryCode(258)"><span class="fl">莫桑比克</span><span class="fr">+258</span>
                                    </li>
                                    <li data-id="264" @click="setCountryCode(264)"><span class="fl">那米比亚</span><span class="fr">+264</span>
                                    </li>
                                    <li data-id="674" @click="setCountryCode(674)"><span class="fl">瑙鲁</span><span class="fr">+674</span>
                                    </li>
                                    <li data-id="977" @click="setCountryCode(977)"><span class="fl">尼泊尔</span><span class="fr">+977</span>
                                    </li>
                                    <li data-id="599" @click="setCountryCode(599)"><span class="fl">荷兰安的列斯群岛</span><span
                                            class="fr">+599</span></li>
                                    <li data-id="31" @click="setCountryCode(31)"><span class="fl">荷兰</span><span class="fr">+31</span></li>
                                    <li data-id="64" @click="setCountryCode(64)"><span class="fl">新西兰</span><span class="fr">+64</span>
                                    </li>
                                    <li data-id="505" @click="setCountryCode(505)"><span class="fl">尼加拉瓜</span><span class="fr">+505</span>
                                    </li>
                                    <li data-id="227" @click="setCountryCode(227)"><span class="fl">尼日尔</span><span class="fr">+227</span>
                                    </li>
                                    <li data-id="234" @click="setCountryCode(234)"><span class="fl">尼日利亚</span><span class="fr">+234</span>
                                    </li>
                                    <li data-id="850" @click="setCountryCode(850)"><span class="fl">朝鲜</span><span class="fr">+850</span>
                                    </li>
                                    <li data-id="47" @click="setCountryCode(47)"><span class="fl">挪威</span><span class="fr">+47</span></li>
                                    <li data-id="968" @click="setCountryCode(968)"><span class="fl">阿曼</span><span class="fr">+968</span>
                                    </li>
                                    <li data-id="92" @click="setCountryCode(92)"><span class="fl">巴基斯坦</span><span class="fr">+92</span>
                                    </li>
                                    <li data-id="507" @click="setCountryCode(507)"><span class="fl">巴拿马</span><span class="fr">+507</span>
                                    </li>
                                    <li data-id="675" @click="setCountryCode(675)"><span class="fl">巴布亚新几内亚</span><span
                                            class="fr">+675</span></li>
                                    <li data-id="595" @click="setCountryCode(595)"><span class="fl">巴拉圭</span><span class="fr">+595</span>
                                    </li>
                                    <li data-id="51" @click="setCountryCode(51)"><span class="fl">秘鲁</span><span class="fr">+51</span></li>
                                    <li data-id="63" @click="setCountryCode(63)"><span class="fl">菲律宾共和国</span><span class="fr">+63</span>
                                    </li>
                                    <li data-id="48" @click="setCountryCode(48)"><span class="fl">波兰</span><span class="fr">+48</span></li>
                                    <li data-id="689" @click="setCountryCode(689)"><span class="fl">法属玻里尼西亚</span><span
                                            class="fr">+689</span></li>
                                    <li data-id="351" @click="setCountryCode(351)"><span class="fl">葡萄牙</span><span class="fr">+351</span>
                                    </li>
                                    <li data-id="1787" @click="setCountryCode(1787)"><span class="fl">波多黎各</span><span
                                            class="fr">+1787</span></li>
                                    <li data-id="974" @click="setCountryCode(974)"><span class="fl">卡塔尔</span><span class="fr">+974</span>
                                    </li>
                                    <li data-id="262" @click="setCountryCode(262)"><span class="fl">留尼汪岛</span><span class="fr">+262</span>
                                    </li>
                                    <li data-id="40" @click="setCountryCode(40)"><span class="fl">罗马尼亚</span><span class="fr">+40</span>
                                    </li>
                                    <li data-id="7" @click="setCountryCode(7)"><span class="fl">俄罗斯联邦</span><span class="fr">+7</span></li>
                                    <li data-id="1758" @click="setCountryCode(1758)"><span class="fl">圣卢西亚岛</span><span
                                            class="fr">+1758</span></li>
                                    <li data-id="1784" @click="setCountryCode(1784)"><span class="fl">圣文森特和格林纳丁斯</span><span
                                            class="fr">+1784</span></li>
                                    <li data-id="684" @click="setCountryCode(684)"><span class="fl">东萨摩亚(美)</span><span
                                            class="fr">+684</span></li>
                                    <li data-id="685" @click="setCountryCode(685)"><span class="fl">美属萨摩亚</span><span
                                            class="fr">+685</span></li>
                                    <li data-id="378" @click="setCountryCode(378)"><span class="fl">圣马力诺共和国</span><span
                                            class="fr">+378</span></li>
                                    <li data-id="239" @click="setCountryCode(239)"><span class="fl">圣多美和普林西比</span><span
                                            class="fr">+239</span></li>
                                    <li data-id="966" @click="setCountryCode(966)"><span class="fl">沙特阿拉伯</span><span
                                            class="fr">+966</span></li>
                                    <li data-id="221" @click="setCountryCode(221)"><span class="fl">塞内加尔</span><span class="fr">+221</span>
                                    </li>
                                    <li data-id="248" @click="setCountryCode(248)"><span class="fl">塞舌尔</span><span class="fr">+248</span>
                                    </li>
                                    <li data-id="232" @click="setCountryCode(232)"><span class="fl">塞拉利昂</span><span class="fr">+232</span>
                                    </li>
                                    <li data-id="65" @click="setCountryCode(65)"><span class="fl">新加坡</span><span class="fr">+65</span>
                                    </li>
                                    <li data-id="421" @click="setCountryCode(421)"><span class="fl">斯洛伐克（斯洛伐克人的共和国）</span><span
                                            class="fr">+421</span></li>
                                    <li data-id="386" @click="setCountryCode(386)"><span class="fl">斯洛文尼亚</span><span
                                            class="fr">+386</span></li>
                                    <li data-id="677" @click="setCountryCode(677)"><span class="fl">索罗门群岛</span><span
                                            class="fr">+677</span></li>
                                    <li data-id="252" @click="setCountryCode(252)"><span class="fl">索马里</span><span class="fr">+252</span>
                                    </li>
                                    <li data-id="27" @click="setCountryCode(27)"><span class="fl">南非</span><span class="fr">+27</span></li>
                                    <li data-id="34" @click="setCountryCode(34)"><span class="fl">西班牙</span><span class="fr">+34</span>
                                    </li>
                                    <li data-id="94" @click="setCountryCode(94)"><span class="fl">斯里兰卡</span><span class="fr">+94</span>
                                    </li>
                                    <li data-id="249" @click="setCountryCode(249)"><span class="fl">苏丹</span><span class="fr">+249</span>
                                    </li>
                                    <li data-id="597" @click="setCountryCode(597)"><span class="fl">苏里南</span><span class="fr">+597</span>
                                    </li>
                                    <li data-id="268" @click="setCountryCode(268)"><span class="fl">斯威士兰</span><span class="fr">+268</span>
                                    </li>
                                    <li data-id="46" @click="setCountryCode(46)"><span class="fl">瑞典</span><span class="fr">+46</span></li>
                                    <li data-id="41" @click="setCountryCode(41)"><span class="fl">瑞士</span><span class="fr">+41</span></li>
                                    <li data-id="963" @click="setCountryCode(963)"><span class="fl">叙利亚</span><span class="fr">+963</span>
                                    </li>
                                    <li data-id="886" @click="setCountryCode(886)"><span class="fl">台湾（中国）</span><span
                                            class="fr">+886</span></li>
                                    <li data-id="992" @click="setCountryCode(992)"><span class="fl">塔吉克</span><span class="fr">+992</span>
                                    </li>
                                    <li data-id="255" @click="setCountryCode(255)"><span class="fl">坦桑尼亚</span><span class="fr">+255</span>
                                    </li>
                                    <li data-id="66" @click="setCountryCode(66)"><span class="fl">泰国</span><span class="fr">+66</span></li>
                                    <li data-id="228" @click="setCountryCode(228)"><span class="fl">多哥</span><span class="fr">+228</span>
                                    </li>
                                    <li data-id="676" @click="setCountryCode(676)"><span class="fl">汤加</span><span class="fr">+676</span>
                                    </li>
                                    <li data-id="1868" @click="setCountryCode(1868)"><span class="fl">特立尼达和多巴哥</span><span
                                            class="fr">+1868</span></li>
                                    <li data-id="216" @click="setCountryCode(216)"><span class="fl">突尼斯</span><span class="fr">+216</span>
                                    </li>
                                    <li data-id="90" @click="setCountryCode(90)"><span class="fl">土耳其</span><span class="fr">+90</span>
                                    </li>
                                    <li data-id="993" @click="setCountryCode(993)"><span class="fl">土库曼</span><span class="fr">+993</span>
                                    </li>
                                    <li data-id="256" @click="setCountryCode(256)"><span class="fl">乌干达</span><span class="fr">+256</span>
                                    </li>
                                    <li data-id="380" @click="setCountryCode(380)"><span class="fl">乌克兰</span><span class="fr">+380</span>
                                    </li>
                                    <li data-id="971" @click="setCountryCode(971)"><span class="fl">阿拉伯联合酋长国</span><span
                                            class="fr">+971</span></li>
                                    <li data-id="44" @click="setCountryCode(44)"><span class="fl">英国</span><span class="fr">+44</span></li>
                                    <li data-id="1" @click="setCountryCode(1)"><span class="fl">美国</span><span class="fr">+1</span></li>
                                    <li data-id="598" @click="setCountryCode(598)"><span class="fl">乌拉圭</span><span class="fr">+598</span>
                                    </li>
                                    <li data-id="998" @click="setCountryCode(998)"><span class="fl">乌兹别克斯坦</span><span
                                            class="fr">+998</span></li>
                                    <li data-id="58" @click="setCountryCode(58)"><span class="fl">委内瑞拉</span><span class="fr">+58</span>
                                    </li>
                                    <li data-id="84" @click="setCountryCode(84)"><span class="fl">越南</span><span class="fr">+84</span></li>
                                    <li data-id="967" @click="setCountryCode(967)"><span class="fl">也门</span><span class="fr">+967</span>
                                    </li>
                                    <li data-id="381" @click="setCountryCode(381)"><span class="fl">南斯拉夫</span><span class="fr">+381</span>
                                    </li>
                                    <li data-id="263" @click="setCountryCode(263)"><span class="fl">津巴布韦</span><span class="fr">+263</span>
                                    </li>
                                    <li data-id="260" @click="setCountryCode(260)"><span class="fl">赞比亚</span><span class="fr">+260</span>
                                    </li>
                                    <li data-id="246" @click="setCountryCode(246)"><span class="fl">迪戈加西亚岛</span><span
                                            class="fr">+246</span></li>
                                    <li data-id="297" @click="setCountryCode(297)"><span class="fl">阿鲁巴</span><span class="fr">+297</span>
                                    </li>
                                    <li data-id="975" @click="setCountryCode(975)"><span class="fl">不丹</span><span class="fr">+975</span>
                                    </li>
                                    <li data-id="387" @click="setCountryCode(387)"><span class="fl">波斯尼亚和黑塞哥维那</span><span
                                            class="fr">+387</span></li>
                                    <li data-id="238" @click="setCountryCode(238)"><span class="fl">佛得角</span><span class="fr">+238</span>
                                    </li>
                                    <li data-id="269" @click="setCountryCode(269)"><span class="fl">科摩罗</span><span class="fr">+269</span>
                                    </li>
                                    <li data-id="243" @click="setCountryCode(243)"><span class="fl">刚果民主共和国</span><span
                                            class="fr">+243</span></li>
                                    <li data-id="385" @click="setCountryCode(385)"><span class="fl">克罗地亚</span><span class="fr">+385</span>
                                    </li>
                                    <li data-id="1849" @click="setCountryCode(1849)"><span class="fl">多米尼加共和国</span><span
                                            class="fr">+1849</span></li>
                                    <li data-id="240" @click="setCountryCode(240)"><span class="fl">赤道几内亚</span><span
                                            class="fr">+240</span></li>
                                    <li data-id="500" @click="setCountryCode(500)"><span class="fl">福克兰群岛</span><span
                                            class="fr">+500</span></li>
                                    <li data-id="298" @click="setCountryCode(298)"><span class="fl">法罗群岛</span><span class="fr">+298</span>
                                    </li>
                                    <li data-id="45" @click="setCountryCode(45)"><span class="fl">格陵兰</span><span class="fr">+45</span>
                                    </li>
                                    <li data-id="590" @click="setCountryCode(590)"><span class="fl">瓜德罗普岛</span><span
                                            class="fr">+590</span></li>
                                    <li data-id="245" @click="setCountryCode(245)"><span class="fl">几内亚比绍</span><span
                                            class="fr">+245</span></li>
                                    <li data-id="389" @click="setCountryCode(389)"><span class="fl">马其顿</span><span class="fr">+389</span>
                                    </li>
                                    <li data-id="222" @click="setCountryCode(222)"><span class="fl">毛里塔尼亚</span><span
                                            class="fr">+222</span></li>
                                    <li data-id="691" @click="setCountryCode(691)"><span class="fl">密克罗尼西亚</span><span
                                            class="fr">+691</span></li>
                                    <li data-id="382" @click="setCountryCode(382)"><span class="fl">黑山共和国</span><span
                                            class="fr">+382</span></li>
                                    <li data-id="687" @click="setCountryCode(687)"><span class="fl">新喀里多尼亚</span><span
                                            class="fr">+687</span></li>
                                    <li data-id="6723" @click="setCountryCode(6723)"><span class="fl">诺福克岛</span><span
                                            class="fr">+6723</span></li>
                                    <li data-id="680" @click="setCountryCode(680)"><span class="fl">帛琉</span><span class="fr">+680</span>
                                    </li>
                                    <li data-id="970" @click="setCountryCode(970)"><span class="fl">巴勒斯坦</span><span class="fr">+970</span>
                                    </li>
                                    <li data-id="250" @click="setCountryCode(250)"><span class="fl">卢旺达</span><span class="fr">+250</span>
                                    </li>
                                    <li data-id="1869" @click="setCountryCode(1869)"><span class="fl">圣基茨和尼维斯</span><span
                                            class="fr">+1869</span></li>
                                    <li data-id="381" @click="setCountryCode(381)"><span class="fl">塞尔维亚共和国</span><span
                                            class="fr">+381</span></li>
                                    <li data-id="211" @click="setCountryCode(211)"><span class="fl">南苏丹共和国</span><span
                                            class="fr">+211</span></li>
                                    <li data-id="678" @click="setCountryCode(678)"><span class="fl">瓦努阿图</span><span class="fr">+678</span>
                                    </li>
                                    <li data-id="1284" @click="setCountryCode(1284)"><span class="fl">维尔京群岛(英国)</span><span
                                            class="fr">+1284</span></li>
                                    <li data-id="225" @click="setCountryCode(225)"><span class="fl">Cote D'Ivoire</span><span
                                            class="fr">+225</span></li>
                                    <li data-id="1767" @click="setCountryCode(1767)"><span class="fl">多米尼克国</span><span
                                            class="fr">+1767</span></li>
                                    <li data-id="670" @click="setCountryCode(670)"><span class="fl">东帝汶</span><span class="fr">+670</span>
                                    </li>
                                    <li data-id="291" @click="setCountryCode(291)"><span class="fl">厄立特里亚国</span><span
                                            class="fr">+291</span></li>
                                    <li data-id="681" @click="setCountryCode(681)"><span class="fl">沃利斯和富图纳群岛</span><span
                                            class="fr">+681</span></li>
                                    <li data-id="1340" @click="setCountryCode(1340)"><span class="fl">维尔京群岛(美国)</span><span
                                            class="fr">+1340</span></li>
                                    <li data-id="688" @click="setCountryCode(688)"><span class="fl">图瓦卢</span><span class="fr">+688</span>
                                    </li>
                                    <li data-id="1809" @click="setCountryCode(1809)"><span class="fl">土克斯及开科斯群岛</span><span
                                            class="fr">+1809</span></li>
                                    <li data-id="690" @click="setCountryCode(690)"><span class="fl">托克劳</span><span class="fr">+690</span>
                                    </li>
                                    <li data-id="692" @click="setCountryCode(692)"><span class="fl">马绍尔群岛</span><span
                                            class="fr">+692</span></li>
                                    <li data-id="686" @click="setCountryCode(686)"><span class="fl">基里巴斯</span><span class="fr">+686</span>
                                    </li>
                                    <li data-id="1808" @click="setCountryCode(1808)"><span class="fl">夏威夷</span><span
                                            class="fr">+1808</span></li>
                                    <li data-id="508" @click="setCountryCode(508)"><span class="fl">圣皮埃尔岛及密克隆岛</span><span
                                            class="fr">+508</span></li>
                                    <li data-id="683" @click="setCountryCode(683)"><span class="fl">纽埃</span><span class="fr">+683</span>
                                    </li>
                                    <li data-id="290" @click="setCountryCode(290)"><span class="fl">圣赫勒拿</span><span class="fr">+290</span>
                                    </li>
                                    <li data-id="39" @click="setCountryCode(39)"><span class="fl">梵蒂冈(罗马教廷)</span><span
                                            class="fr">+39</span></li>
                                    <li data-id="1808" @click="setCountryCode(1808)"><span class="fl">威克岛(美)</span><span
                                            class="fr">+1808</span></li>
                                    <li data-id="7" @click="setCountryCode(7)"><span class="fl">阿布哈兹</span><span class="fr">+7</span></li>
                                    <li data-id="672" @click="setCountryCode(672)"><span class="fl">南极洲</span><span class="fr">+672</span>
                                    </li>
                                    <li data-id="684" @click="setCountryCode(684)"><span class="fl">萨摩亚</span><span class="fr">+684</span>
                                    </li>
                                    <li data-id="44" @click="setCountryCode(44)"><span class="fl">泽西岛</span><span class="fr">+44</span>
                                    </li>
                                    <li data-id="61" @click="setCountryCode(61)"><span class="fl">科科斯群岛</span><span class="fr">+61</span>
                                    </li>
                                    <li data-id="61" @click="setCountryCode(61)"><span class="fl">圣延岛</span><span class="fr">+61</span>
                                    </li>
                                    <li data-id="685" @click="setCountryCode(685)"><span class="fl">西撒哈拉</span><span class="fr">+685</span>
                                    </li>
                                    <li data-id="33" @click="setCountryCode(33)"><span class="fl">法国大都会</span><span class="fr">+33</span>
                                    </li>
                                    <li data-id="246" @click="setCountryCode(246)"><span class="fl">英属印度洋领地</span><span
                                            class="fr">+246</span></li>
                                    <li data-id="64" @click="setCountryCode(64)"><span class="fl">皮特凯恩岛</span><span class="fr">+64</span>
                                    </li>
                                    <li data-id="7" @click="setCountryCode(7)"><span class="fl">南奥赛梯</span><span class="fr">+7</span></li>
                                    <li data-id="590" @click="setCountryCode(590)"><span class="fl">圣马丁岛</span><span class="fr">+590</span>
                                    </li>
                                    <li data-id="262" @click="setCountryCode(262)"><span class="fl">马约特</span><span class="fr">+262</span>
                                    </li>
                                </ul>
                            </div>
                        </div>

                        <!--验证码-->
                        <div class="lg-item icon-verify margin-btm24 item-getcode" style="margin-bottom: 30px">
                            <input type="text" class="ipt-code" placeholder="验证码" id="messageCode" maxlength="4">
                            <input type="hidden" name="validate" id="validate">
                            <a href="javascript:;" class="get-code col-blue pos-r24" id="sendCodeBtn">获取验证码</a>
                            <a href="javascript:;" class="col-gray pos-r24 before-reget" id="showcountdown"> 60s后重新获取</a>
                            <p class="err-tip2 voice-use" id="codeMsg"></p>
                        </div>
                        <!--密码-->
                        <div class="lg-item icon-pwd">
                            <input type="password" class="pd-right60" name="userPaw" placeholder="设置密码" id="pwd" maxlength="20">
                            <i class="pos-r24 icon-eye-close fr" onclick="initPassword(this)"></i>
                            <p class="pwd-rule">密码要求8-16位，至少包含数字，字母，字符两种元素</p>
                            <p class="err-txt" id="pwdMsg"></p>
                        </div>
                    </div>
                    <div class="mesDiv2" style="display:none">
                        <h2>用户基本信息</h2>
                        图片：<input type="file" name="userImage"><br>
                        姓名：<input type="text" name="name"><br>
                        学校：<input type="text" name="school"><br>
                        类型：  <select name="type">
                                    <option value="student">学生</option>
                                    <option value="teacher">老师</option>
                                </select><br>
                        职务：<input type="text" name="position" ><br>
                        <!-- 简介：<input type="" name="introduction"><br> -->
                        简介：<textarea name="introduction" cols="50" rows="10" placeholder="个人简介"></textarea><br>
                        <input type="submit" value="提交">
                    </div>
                    <input type="hidden" id="pid" name="pid" value="0">
                    <input type="hidden" id="startFid" name="startFid" value="0"><!--初始fid-->
                    <input type="hidden" id="fid" name="fid" value="0">
                    <input type="hidden" id="refer" name="refer" value="https://www.xueyinonline.com/">
                    <input type="hidden" id="quick" name="quick" value="0">
                    <input type="hidden" id="ebook" name="ebook" value="0">
                    <input type="hidden" id="allowSkip" name="allowSkip" value="0">
                    <input type="hidden" id="independentId" name="independentId" value="0">
                                <div class="btns-box">
                        <p class="err-tip" id="err-txt"></p>
                        <button type="button" class="btn-big-blue" style="margin-top:0" @click="register">下一步</button>
                    </div>
                </form>
                <p class="Agreement">登录即表示同意平台<a href="https://homewh.chaoxing.com/agree/privacyPolicy?appId=900001" target="_blank">《隐私政策》</a>
                    和<a href="https://homewh.chaoxing.com/agree/userAgreement?appId=900001" target="_blank">《用户协议》</a></p>
            </div>
</div>
</template>

<script>
import $ from 'jquery'
export default {
    name: "registerTest",
    data(){
        return{
                findCountryCode:''
        }
    },
    methods:{
        register: function(){
            let mesDiv1 = document.getElementsByClassName("mesDiv1")
            let mesDiv2 = document.getElementsByClassName("mesDiv2")
            mesDiv1[0].style.display = "none"
            mesDiv2[0].style.display = "block"
        },
        showTelList: function(){
            let countryShowBtn = document.getElementById("countryShow")
            let filterList = document.getElementsByClassName("filter-list")
            filterList[1].style.display =="block"?filterList[1].style.display="none":filterList[1].style.display="block"
        },
        setCountryCode: function(num){
            let countryShow = document.getElementById("countryShow")
            let filterList = document.getElementsByClassName("filter-list")
            let countryCode = document.getElementById("countryCode")
            countryShow.innerText="+"+num
            filterList[1].style.display = "none"
            countryCode.value = num
        }
    },
    
}
</script>

<style>
@import "../assets/style/css/register.css"
</style>