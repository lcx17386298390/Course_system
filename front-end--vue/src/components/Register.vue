<template>
        <div class="lg-container" id="registerVm">
                <div class="main main-def-w lg-register">
                        <div class="lg-top fs14">
                                <a id="back" href="javascript:void(0)" onclick="window.history.go(-1);"
                                        class="back icon-back col-lightblue">{{ $t('user.back') }}</a>
                        </div>
                        <form method="post" action="/upTeacherMes" enctype="multipart/form-data" id="mesForm">
                                <!--第一步-->
                                <div class="mesDiv1">
                                        <h3 class="lg-title">{{ $t('user.registerPromat') }}</h3>
                                        <div class="lg-item icon-school margin-btm24 item-select" id="pidDiv"
                                                style="display:none">
                                                <input type="text" class="w-ipt-100 to-select-list" id="filter2"
                                                        placeholder="选择单位" autocomplete="off" onfocus="getFormsByPid(2)"
                                                        oninput="javascript:getFormsByPid(2)">
                                                <div class="filter-list">
                                                        <ul class="beat-scroll list-jg" id="r1b2">
                                                        </ul>
                                                </div>

                                        </div>
                                        <!--电话号码-->
                                        <div class="item-tel clearaft item-select">
                                                <span class="tel-area fl icon-down to-select-list"
                                                        @click="registerJS.showTelList()" style="display:none"
                                                        id="countryShow">+86</span>
                                                <input type="hidden" value="86" id="countryCode" class="voiceUsedCountryCode">
                                                <input type="tel" class="ipt-focus voiceUsedPhone" name="email"
                                                        :placeholder="this.$t('user.email')" id="email" maxlength="20">
                                                <p class="err-txt" id="phoneMsg"></p>
                                                <div class="filter-list" style="display:none">
                                                        <div class="li-search">
                                                                <!-- <div class="dataSearch">
                                        <input v-mode name="" v-model="findCountryCode" class="dataSearch_input fl" placeholder="搜索" id="searchInput">
                                        <input type="button" name="" value="" class="dataSearch_bnt fl" id="searchButton">
                                    </div> -->
                                                        </div>
                                                        <ul class="list beat-scroll" id="countryList">
                                                                <li data-id="86" @click="registerJS.setCountryCode(86)">
                                                                        <span class="fl">中国</span>
                                                                        <span class="fr">+86</span>
                                                                </li>
                                                                <li data-id="852" @click="registerJS.setCountryCode(852)"><span
                                                                                class="fl">中国香港</span><span
                                                                                class="fr">+852</span>
                                                                </li>
                                                                <li data-id="886" @click="registerJS.setCountryCode(886)"><span
                                                                                class="fl">中国台湾</span><span
                                                                                class="fr">+886</span>
                                                                </li>
                                                                <li data-id="853" @click="registerJS.setCountryCode(853)"><span
                                                                                class="fl">中国澳门</span><span
                                                                                class="fr">+853</span>
                                                                </li>
                                                                <li data-id="1" @click="registerJS.setCountryCode(1)"><span
                                                                                class="fl">美国</span><span class="fr">+1</span>
                                                                </li>
                                                                <li data-id="1" @click="registerJS.setCountryCode(1)"><span
                                                                                class="fl">加拿大</span><span class="fr">+1</span>
                                                                </li>
                                                                <li data-id="65" @click="registerJS.setCountryCode(65)"><span
                                                                                class="fl">新加坡</span><span class="fr">+65</span>
                                                                </li>
                                                                <li data-id="60" @click="registerJS.setCountryCode(60)"><span
                                                                                class="fl">马来西亚</span><span
                                                                                class="fr">+60</span>
                                                                </li>
                                                                <li data-id="44" @click="registerJS.setCountryCode(44)"><span
                                                                                class="fl">英国</span><span class="fr">+44</span>
                                                                </li>
                                                                <li data-id="49" @click="registerJS.setCountryCode(49)"><span
                                                                                class="fl">德国</span><span class="fr">+49</span>
                                                                </li>
                                                                <li data-id="81" @click="registerJS.setCountryCode(81)"><span
                                                                                class="fl">日本</span><span class="fr">+81</span>
                                                                </li>
                                                                <li data-id="244" @click="registerJS.setCountryCode(244)"><span
                                                                                class="fl">安哥拉</span><span
                                                                                class="fr">+244</span>
                                                                </li>
                                                                <li data-id="93" @click="registerJS.setCountryCode(93)"><span
                                                                                class="fl">阿富汗</span><span class="fr">+93</span>
                                                                </li>
                                                                <li data-id="355" @click="registerJS.setCountryCode(355)"><span
                                                                                class="fl">阿尔巴尼亚</span><span
                                                                                class="fr">+355</span></li>
                                                                <li data-id="213" @click="registerJS.setCountryCode(213)"><span
                                                                                class="fl">阿尔及利亚</span><span
                                                                                class="fr">+213</span></li>
                                                                <li data-id="376" @click="registerJS.setCountryCode(376)"><span
                                                                                class="fl">安道尔共和国</span><span
                                                                                class="fr">+376</span></li>
                                                                <li data-id="1264" @click="registerJS.setCountryCode(1264)">
                                                                        <span class="fl">安圭拉岛</span><span
                                                                                class="fr">+1264</span>
                                                                </li>
                                                                <li data-id="1268" @click="registerJS.setCountryCode(1268)">
                                                                        <span class="fl">安提瓜和巴布达</span><span
                                                                                class="fr">+1268</span>
                                                                </li>
                                                                <li data-id="54" @click="registerJS.setCountryCode(54)"><span
                                                                                class="fl">阿根廷</span><span class="fr">+54</span>
                                                                </li>
                                                                <li data-id="374" @click="registerJS.setCountryCode(374)"><span
                                                                                class="fl">亚美尼亚</span><span
                                                                                class="fr">+374</span>
                                                                </li>
                                                                <li data-id="247" @click="registerJS.setCountryCode(247)"><span
                                                                                class="fl">阿森松</span><span
                                                                                class="fr">+247</span>
                                                                </li>
                                                                <li data-id="61" @click="registerJS.setCountryCode(61)"><span
                                                                                class="fl">澳大利亚</span><span
                                                                                class="fr">+61</span>
                                                                </li>
                                                                <li data-id="43" @click="registerJS.setCountryCode(43)"><span
                                                                                class="fl">奥地利</span><span class="fr">+43</span>
                                                                </li>
                                                                <li data-id="994" @click="registerJS.setCountryCode(994)"><span
                                                                                class="fl">阿塞拜疆</span><span
                                                                                class="fr">+994</span>
                                                                </li>
                                                                <li data-id="1242" @click="registerJS.setCountryCode(1242)">
                                                                        <span class="fl">巴哈马</span><span class="fr">+1242</span>
                                                                </li>
                                                                <li data-id="973" @click="registerJS.setCountryCode(973)"><span
                                                                                class="fl">巴林</span><span class="fr">+973</span>
                                                                </li>
                                                                <li data-id="880" @click="registerJS.setCountryCode(880)"><span
                                                                                class="fl">孟加拉国</span><span
                                                                                class="fr">+880</span>
                                                                </li>
                                                                <li data-id="1246" @click="registerJS.setCountryCode(1246)">
                                                                        <span class="fl">巴巴多斯</span><span
                                                                                class="fr">+1246</span>
                                                                </li>
                                                                <li data-id="375" @click="registerJS.setCountryCode(375)"><span
                                                                                class="fl">白俄罗斯</span><span
                                                                                class="fr">+375</span>
                                                                </li>
                                                                <li data-id="32" @click="registerJS.setCountryCode(32)"><span
                                                                                class="fl">比利时</span><span class="fr">+32</span>
                                                                </li>
                                                                <li data-id="501" @click="registerJS.setCountryCode(501)"><span
                                                                                class="fl">伯利兹城</span><span
                                                                                class="fr">+501</span>
                                                                </li>
                                                                <li data-id="229" @click="registerJS.setCountryCode(229)"><span
                                                                                class="fl">贝宁</span><span class="fr">+229</span>
                                                                </li>
                                                                <li data-id="1441" @click="registerJS.setCountryCode(1441)">
                                                                        <span class="fl">百慕大</span><span class="fr">+1441</span>
                                                                </li>
                                                                <li data-id="591" @click="registerJS.setCountryCode(591)"><span
                                                                                class="fl">玻利维亚</span><span
                                                                                class="fr">+591</span>
                                                                </li>
                                                                <li data-id="267" @click="registerJS.setCountryCode(267)"><span
                                                                                class="fl">博茨瓦纳</span><span
                                                                                class="fr">+267</span>
                                                                </li>
                                                                <li data-id="55" @click="registerJS.setCountryCode(55)"><span
                                                                                class="fl">巴西</span><span class="fr">+55</span>
                                                                </li>
                                                                <li data-id="673" @click="registerJS.setCountryCode(673)"><span
                                                                                class="fl">文莱达鲁萨兰国</span><span
                                                                                class="fr">+673</span></li>
                                                                <li data-id="359" @click="registerJS.setCountryCode(359)"><span
                                                                                class="fl">保加利亚</span><span
                                                                                class="fr">+359</span>
                                                                </li>
                                                                <li data-id="226" @click="registerJS.setCountryCode(226)"><span
                                                                                class="fl">布基纳法索</span><span
                                                                                class="fr">+226</span></li>
                                                                <li data-id="95" @click="registerJS.setCountryCode(95)"><span
                                                                                class="fl">缅甸</span><span class="fr">+95</span>
                                                                </li>
                                                                <li data-id="257" @click="registerJS.setCountryCode(257)"><span
                                                                                class="fl">布隆迪</span><span
                                                                                class="fr">+257</span>
                                                                </li>
                                                                <li data-id="237" @click="registerJS.setCountryCode(237)"><span
                                                                                class="fl">喀麦隆</span><span
                                                                                class="fr">+237</span>
                                                                </li>
                                                                <li data-id="1" @click="registerJS.setCountryCode(1)"><span
                                                                                class="fl">加拿大</span><span class="fr">+1</span>
                                                                </li>
                                                                <li data-id="1345" @click="registerJS.setCountryCode(1345)">
                                                                        <span class="fl">开曼群岛</span><span
                                                                                class="fr">+1345</span>
                                                                </li>
                                                                <li data-id="236" @click="registerJS.setCountryCode(236)"><span
                                                                                class="fl">中非共和国</span><span
                                                                                class="fr">+236</span></li>
                                                                <li data-id="235" @click="registerJS.setCountryCode(235)"><span
                                                                                class="fl">乍得</span><span class="fr">+235</span>
                                                                </li>
                                                                <li data-id="56" @click="registerJS.setCountryCode(56)"><span
                                                                                class="fl">智利</span><span class="fr">+56</span>
                                                                </li>
                                                                <li data-id="86" @click="registerJS.setCountryCode(86)"><span
                                                                                class="fl">中国</span><span class="fr">+86</span>
                                                                </li>
                                                                <li data-id="57" @click="registerJS.setCountryCode(57)"><span
                                                                                class="fl">哥伦比亚</span><span
                                                                                class="fr">+57</span>
                                                                </li>
                                                                <li data-id="242" @click="registerJS.setCountryCode(242)"><span
                                                                                class="fl">刚果</span><span class="fr">+242</span>
                                                                </li>
                                                                <li data-id="682" @click="registerJS.setCountryCode(682)"><span
                                                                                class="fl">库克群岛</span><span
                                                                                class="fr">+682</span>
                                                                </li>
                                                                <li data-id="506" @click="registerJS.setCountryCode(506)"><span
                                                                                class="fl">哥斯达黎加</span><span
                                                                                class="fr">+506</span></li>
                                                                <li data-id="53" @click="registerJS.setCountryCode(53)"><span
                                                                                class="fl">古巴</span><span class="fr">+53</span>
                                                                </li>
                                                                <li data-id="357" @click="registerJS.setCountryCode(357)"><span
                                                                                class="fl">塞浦路斯</span><span
                                                                                class="fr">+357</span>
                                                                </li>
                                                                <li data-id="420" @click="registerJS.setCountryCode(420)"><span
                                                                                class="fl">捷克</span><span class="fr">+420</span>
                                                                </li>
                                                                <li data-id="45" @click="registerJS.setCountryCode(45)"><span
                                                                                class="fl">丹麦</span><span class="fr">+45</span>
                                                                </li>
                                                                <li data-id="253" @click="registerJS.setCountryCode(253)"><span
                                                                                class="fl">吉布提</span><span
                                                                                class="fr">+253</span>
                                                                </li>
                                                                <li data-id="593" @click="registerJS.setCountryCode(593)"><span
                                                                                class="fl">厄瓜多尔</span><span
                                                                                class="fr">+593</span>
                                                                </li>
                                                                <li data-id="20" @click="registerJS.setCountryCode(20)"><span
                                                                                class="fl">埃及</span><span class="fr">+20</span>
                                                                </li>
                                                                <li data-id="503" @click="registerJS.setCountryCode(503)"><span
                                                                                class="fl">萨尔瓦多</span><span
                                                                                class="fr">+503</span>
                                                                </li>
                                                                <li data-id="372" @click="registerJS.setCountryCode(372)"><span
                                                                                class="fl">爱沙尼亚</span><span
                                                                                class="fr">+372</span>
                                                                </li>
                                                                <li data-id="251" @click="registerJS.setCountryCode(251)"><span
                                                                                class="fl">埃塞俄比亚</span><span
                                                                                class="fr">+251</span></li>
                                                                <li data-id="679" @click="registerJS.setCountryCode(679)"><span
                                                                                class="fl">斐济</span><span class="fr">+679</span>
                                                                </li>
                                                                <li data-id="358" @click="registerJS.setCountryCode(358)"><span
                                                                                class="fl">芬兰</span><span class="fr">+358</span>
                                                                </li>
                                                                <li data-id="33" @click="registerJS.setCountryCode(33)"><span
                                                                                class="fl">法国</span><span class="fr">+33</span>
                                                                </li>
                                                                <li data-id="594" @click="registerJS.setCountryCode(594)"><span
                                                                                class="fl">法属圭亚那</span><span
                                                                                class="fr">+594</span></li>
                                                                <li data-id="241" @click="registerJS.setCountryCode(241)"><span
                                                                                class="fl">加蓬</span><span class="fr">+241</span>
                                                                </li>
                                                                <li data-id="220" @click="registerJS.setCountryCode(220)"><span
                                                                                class="fl">冈比亚</span><span
                                                                                class="fr">+220</span>
                                                                </li>
                                                                <li data-id="995" @click="registerJS.setCountryCode(995)"><span
                                                                                class="fl">格鲁吉亚</span><span
                                                                                class="fr">+995</span>
                                                                </li>
                                                                <li data-id="49" @click="registerJS.setCountryCode(49)"><span
                                                                                class="fl">德国</span><span class="fr">+49</span>
                                                                </li>
                                                                <li data-id="233" @click="registerJS.setCountryCode(233)"><span
                                                                                class="fl">加纳</span><span class="fr">+233</span>
                                                                </li>
                                                                <li data-id="350" @click="registerJS.setCountryCode(350)"><span
                                                                                class="fl">直布罗陀</span><span
                                                                                class="fr">+350</span>
                                                                </li>
                                                                <li data-id="30" @click="registerJS.setCountryCode(30)"><span
                                                                                class="fl">希腊</span><span class="fr">+30</span>
                                                                </li>
                                                                <li data-id="1473" @click="registerJS.setCountryCode(1473)">
                                                                        <span class="fl">格林纳达</span><span
                                                                                class="fr">+1473</span>
                                                                </li>
                                                                <li data-id="1671" @click="registerJS.setCountryCode(1671)">
                                                                        <span class="fl">关岛</span><span class="fr">+1671</span>
                                                                </li>
                                                                <li data-id="502" @click="registerJS.setCountryCode(502)"><span
                                                                                class="fl">危地马拉</span><span
                                                                                class="fr">+502</span>
                                                                </li>
                                                                <li data-id="224" @click="registerJS.setCountryCode(224)"><span
                                                                                class="fl">几内亚</span><span
                                                                                class="fr">+224</span>
                                                                </li>
                                                                <li data-id="592" @click="registerJS.setCountryCode(592)"><span
                                                                                class="fl">圭亚那</span><span
                                                                                class="fr">+592</span>
                                                                </li>
                                                                <li data-id="509" @click="registerJS.setCountryCode(509)"><span
                                                                                class="fl">海地</span><span class="fr">+509</span>
                                                                </li>
                                                                <li data-id="504" @click="registerJS.setCountryCode(504)"><span
                                                                                class="fl">洪都拉斯</span><span
                                                                                class="fr">+504</span>
                                                                </li>
                                                                <li data-id="852" @click="registerJS.setCountryCode(852)"><span
                                                                                class="fl">香港（中国）</span><span
                                                                                class="fr">+852</span></li>
                                                                <li data-id="36" @click="registerJS.setCountryCode(36)"><span
                                                                                class="fl">匈牙利</span><span class="fr">+36</span>
                                                                </li>
                                                                <li data-id="354" @click="registerJS.setCountryCode(354)"><span
                                                                                class="fl">冰岛</span><span class="fr">+354</span>
                                                                </li>
                                                                <li data-id="91" @click="registerJS.setCountryCode(91)"><span
                                                                                class="fl">印度</span><span class="fr">+91</span>
                                                                </li>
                                                                <li data-id="62" @click="registerJS.setCountryCode(62)"><span
                                                                                class="fl">印度尼西亚</span><span
                                                                                class="fr">+62</span>
                                                                </li>
                                                                <li data-id="98" @click="registerJS.setCountryCode(98)"><span
                                                                                class="fl">伊朗（伊斯兰共和国）</span><span
                                                                                class="fr">+98</span></li>
                                                                <li data-id="964" @click="registerJS.setCountryCode(964)"><span
                                                                                class="fl">伊拉克</span><span
                                                                                class="fr">+964</span>
                                                                </li>
                                                                <li data-id="353" @click="registerJS.setCountryCode(353)"><span
                                                                                class="fl">爱尔兰</span><span
                                                                                class="fr">+353</span>
                                                                </li>
                                                                <li data-id="972" @click="registerJS.setCountryCode(972)"><span
                                                                                class="fl">以色列</span><span
                                                                                class="fr">+972</span>
                                                                </li>
                                                                <li data-id="39" @click="registerJS.setCountryCode(39)"><span
                                                                                class="fl">意大利</span><span class="fr">+39</span>
                                                                </li>
                                                                <li data-id="1876" @click="registerJS.setCountryCode(1876)">
                                                                        <span class="fl">牙买加</span><span class="fr">+1876</span>
                                                                </li>
                                                                <li data-id="81" @click="registerJS.setCountryCode(81)"><span
                                                                                class="fl">日本</span><span class="fr">+81</span>
                                                                </li>
                                                                <li data-id="962" @click="registerJS.setCountryCode(962)"><span
                                                                                class="fl">约旦</span><span class="fr">+962</span>
                                                                </li>
                                                                <li data-id="855" @click="registerJS.setCountryCode(855)"><span
                                                                                class="fl">柬埔寨</span><span
                                                                                class="fr">+855</span>
                                                                </li>
                                                                <li data-id="7" @click="registerJS.setCountryCode(7)"><span
                                                                                class="fl">哈萨克</span><span class="fr">+7</span>
                                                                </li>
                                                                <li data-id="254" @click="registerJS.setCountryCode(254)"><span
                                                                                class="fl">肯尼亚</span><span
                                                                                class="fr">+254</span>
                                                                </li>
                                                                <li data-id="82" @click="registerJS.setCountryCode(82)"><span
                                                                                class="fl">韩国</span><span class="fr">+82</span>
                                                                </li>
                                                                <li data-id="965" @click="registerJS.setCountryCode(965)"><span
                                                                                class="fl">科威特</span><span
                                                                                class="fr">+965</span>
                                                                </li>
                                                                <li data-id="996" @click="registerJS.setCountryCode(996)"><span
                                                                                class="fl">吉尔吉斯</span><span
                                                                                class="fr">+996</span>
                                                                </li>
                                                                <li data-id="856" @click="registerJS.setCountryCode(856)"><span
                                                                                class="fl">老挝</span><span class="fr">+856</span>
                                                                </li>
                                                                <li data-id="371" @click="registerJS.setCountryCode(371)"><span
                                                                                class="fl">拉脱维亚</span><span
                                                                                class="fr">+371</span>
                                                                </li>
                                                                <li data-id="961" @click="registerJS.setCountryCode(961)"><span
                                                                                class="fl">黎巴嫩</span><span
                                                                                class="fr">+961</span>
                                                                </li>
                                                                <li data-id="266" @click="registerJS.setCountryCode(266)"><span
                                                                                class="fl">莱索托</span><span
                                                                                class="fr">+266</span>
                                                                </li>
                                                                <li data-id="231" @click="registerJS.setCountryCode(231)"><span
                                                                                class="fl">利比里亚</span><span
                                                                                class="fr">+231</span>
                                                                </li>
                                                                <li data-id="218" @click="registerJS.setCountryCode(218)"><span
                                                                                class="fl">利比亚</span><span
                                                                                class="fr">+218</span>
                                                                </li>
                                                                <li data-id="423" @click="registerJS.setCountryCode(423)"><span
                                                                                class="fl">列支敦士登</span><span
                                                                                class="fr">+423</span></li>
                                                                <li data-id="370" @click="registerJS.setCountryCode(370)"><span
                                                                                class="fl">立陶宛</span><span
                                                                                class="fr">+370</span>
                                                                </li>
                                                                <li data-id="352" @click="registerJS.setCountryCode(352)"><span
                                                                                class="fl">卢森堡</span><span
                                                                                class="fr">+352</span>
                                                                </li>
                                                                <li data-id="853" @click="registerJS.setCountryCode(853)"><span
                                                                                class="fl">澳门（中国）</span><span
                                                                                class="fr">+853</span></li>
                                                                <li data-id="261" @click="registerJS.setCountryCode(261)"><span
                                                                                class="fl">马达加斯加</span><span
                                                                                class="fr">+261</span></li>
                                                                <li data-id="265" @click="registerJS.setCountryCode(265)"><span
                                                                                class="fl">马拉维</span><span
                                                                                class="fr">+265</span>
                                                                </li>
                                                                <li data-id="60" @click="registerJS.setCountryCode(60)"><span
                                                                                class="fl">马来西亚</span><span
                                                                                class="fr">+60</span>
                                                                </li>
                                                                <li data-id="960" @click="registerJS.setCountryCode(960)"><span
                                                                                class="fl">马尔代夫</span><span
                                                                                class="fr">+960</span>
                                                                </li>
                                                                <li data-id="223" @click="registerJS.setCountryCode(223)"><span
                                                                                class="fl">马里</span><span class="fr">+223</span>
                                                                </li>
                                                                <li data-id="356" @click="registerJS.setCountryCode(356)"><span
                                                                                class="fl">马尔他</span><span
                                                                                class="fr">+356</span>
                                                                </li>
                                                                <li data-id="1670" @click="registerJS.setCountryCode(1670)">
                                                                        <span class="fl">北马里亚纳群岛</span><span
                                                                                class="fr">+1670</span>
                                                                </li>
                                                                <li data-id="596" @click="registerJS.setCountryCode(596)"><span
                                                                                class="fl">马提尼克岛</span><span
                                                                                class="fr">+596</span></li>
                                                                <li data-id="230" @click="registerJS.setCountryCode(230)"><span
                                                                                class="fl">毛里求斯</span><span
                                                                                class="fr">+230</span>
                                                                </li>
                                                                <li data-id="52" @click="registerJS.setCountryCode(52)"><span
                                                                                class="fl">墨西哥</span><span class="fr">+52</span>
                                                                </li>
                                                                <li data-id="373" @click="registerJS.setCountryCode(373)"><span
                                                                                class="fl">摩尔多瓦</span><span
                                                                                class="fr">+373</span>
                                                                </li>
                                                                <li data-id="377" @click="registerJS.setCountryCode(377)"><span
                                                                                class="fl">摩纳哥</span><span
                                                                                class="fr">+377</span>
                                                                </li>
                                                                <li data-id="976" @click="registerJS.setCountryCode(976)"><span
                                                                                class="fl">外蒙古</span><span
                                                                                class="fr">+976</span>
                                                                </li>
                                                                <li data-id="1664" @click="registerJS.setCountryCode(1664)">
                                                                        <span class="fl">蒙特塞拉特</span><span
                                                                                class="fr">+1664</span>
                                                                </li>
                                                                <li data-id="212" @click="registerJS.setCountryCode(212)"><span
                                                                                class="fl">摩洛哥</span><span
                                                                                class="fr">+212</span>
                                                                </li>
                                                                <li data-id="258" @click="registerJS.setCountryCode(258)"><span
                                                                                class="fl">莫桑比克</span><span
                                                                                class="fr">+258</span>
                                                                </li>
                                                                <li data-id="264" @click="registerJS.setCountryCode(264)"><span
                                                                                class="fl">那米比亚</span><span
                                                                                class="fr">+264</span>
                                                                </li>
                                                                <li data-id="674" @click="registerJS.setCountryCode(674)"><span
                                                                                class="fl">瑙鲁</span><span class="fr">+674</span>
                                                                </li>
                                                                <li data-id="977" @click="registerJS.setCountryCode(977)"><span
                                                                                class="fl">尼泊尔</span><span
                                                                                class="fr">+977</span>
                                                                </li>
                                                                <li data-id="599" @click="registerJS.setCountryCode(599)"><span
                                                                                class="fl">荷兰安的列斯群岛</span><span
                                                                                class="fr">+599</span></li>
                                                                <li data-id="31" @click="registerJS.setCountryCode(31)"><span
                                                                                class="fl">荷兰</span><span class="fr">+31</span>
                                                                </li>
                                                                <li data-id="64" @click="registerJS.setCountryCode(64)"><span
                                                                                class="fl">新西兰</span><span class="fr">+64</span>
                                                                </li>
                                                                <li data-id="505" @click="registerJS.setCountryCode(505)"><span
                                                                                class="fl">尼加拉瓜</span><span
                                                                                class="fr">+505</span>
                                                                </li>
                                                                <li data-id="227" @click="registerJS.setCountryCode(227)"><span
                                                                                class="fl">尼日尔</span><span
                                                                                class="fr">+227</span>
                                                                </li>
                                                                <li data-id="234" @click="registerJS.setCountryCode(234)"><span
                                                                                class="fl">尼日利亚</span><span
                                                                                class="fr">+234</span>
                                                                </li>
                                                                <li data-id="850" @click="registerJS.setCountryCode(850)"><span
                                                                                class="fl">朝鲜</span><span class="fr">+850</span>
                                                                </li>
                                                                <li data-id="47" @click="registerJS.setCountryCode(47)"><span
                                                                                class="fl">挪威</span><span class="fr">+47</span>
                                                                </li>
                                                                <li data-id="968" @click="registerJS.setCountryCode(968)"><span
                                                                                class="fl">阿曼</span><span class="fr">+968</span>
                                                                </li>
                                                                <li data-id="92" @click="registerJS.setCountryCode(92)"><span
                                                                                class="fl">巴基斯坦</span><span
                                                                                class="fr">+92</span>
                                                                </li>
                                                                <li data-id="507" @click="registerJS.setCountryCode(507)"><span
                                                                                class="fl">巴拿马</span><span
                                                                                class="fr">+507</span>
                                                                </li>
                                                                <li data-id="675" @click="registerJS.setCountryCode(675)"><span
                                                                                class="fl">巴布亚新几内亚</span><span
                                                                                class="fr">+675</span></li>
                                                                <li data-id="595" @click="registerJS.setCountryCode(595)"><span
                                                                                class="fl">巴拉圭</span><span
                                                                                class="fr">+595</span>
                                                                </li>
                                                                <li data-id="51" @click="registerJS.setCountryCode(51)"><span
                                                                                class="fl">秘鲁</span><span class="fr">+51</span>
                                                                </li>
                                                                <li data-id="63" @click="registerJS.setCountryCode(63)"><span
                                                                                class="fl">菲律宾共和国</span><span
                                                                                class="fr">+63</span>
                                                                </li>
                                                                <li data-id="48" @click="registerJS.setCountryCode(48)"><span
                                                                                class="fl">波兰</span><span class="fr">+48</span>
                                                                </li>
                                                                <li data-id="689" @click="registerJS.setCountryCode(689)"><span
                                                                                class="fl">法属玻里尼西亚</span><span
                                                                                class="fr">+689</span></li>
                                                                <li data-id="351" @click="registerJS.setCountryCode(351)"><span
                                                                                class="fl">葡萄牙</span><span
                                                                                class="fr">+351</span>
                                                                </li>
                                                                <li data-id="1787" @click="registerJS.setCountryCode(1787)">
                                                                        <span class="fl">波多黎各</span><span
                                                                                class="fr">+1787</span>
                                                                </li>
                                                                <li data-id="974" @click="registerJS.setCountryCode(974)"><span
                                                                                class="fl">卡塔尔</span><span
                                                                                class="fr">+974</span>
                                                                </li>
                                                                <li data-id="262" @click="registerJS.setCountryCode(262)"><span
                                                                                class="fl">留尼汪岛</span><span
                                                                                class="fr">+262</span>
                                                                </li>
                                                                <li data-id="40" @click="registerJS.setCountryCode(40)"><span
                                                                                class="fl">罗马尼亚</span><span
                                                                                class="fr">+40</span>
                                                                </li>
                                                                <li data-id="7" @click="registerJS.setCountryCode(7)"><span
                                                                                class="fl">俄罗斯联邦</span><span
                                                                                class="fr">+7</span></li>
                                                                <li data-id="1758" @click="registerJS.setCountryCode(1758)">
                                                                        <span class="fl">圣卢西亚岛</span><span
                                                                                class="fr">+1758</span>
                                                                </li>
                                                                <li data-id="1784" @click="registerJS.setCountryCode(1784)">
                                                                        <span class="fl">圣文森特和格林纳丁斯</span><span
                                                                                class="fr">+1784</span>
                                                                </li>
                                                                <li data-id="684" @click="registerJS.setCountryCode(684)"><span
                                                                                class="fl">东萨摩亚(美)</span><span
                                                                                class="fr">+684</span></li>
                                                                <li data-id="685" @click="registerJS.setCountryCode(685)"><span
                                                                                class="fl">美属萨摩亚</span><span
                                                                                class="fr">+685</span></li>
                                                                <li data-id="378" @click="registerJS.setCountryCode(378)"><span
                                                                                class="fl">圣马力诺共和国</span><span
                                                                                class="fr">+378</span></li>
                                                                <li data-id="239" @click="registerJS.setCountryCode(239)"><span
                                                                                class="fl">圣多美和普林西比</span><span
                                                                                class="fr">+239</span></li>
                                                                <li data-id="966" @click="registerJS.setCountryCode(966)"><span
                                                                                class="fl">沙特阿拉伯</span><span
                                                                                class="fr">+966</span></li>
                                                                <li data-id="221" @click="registerJS.setCountryCode(221)"><span
                                                                                class="fl">塞内加尔</span><span
                                                                                class="fr">+221</span>
                                                                </li>
                                                                <li data-id="248" @click="registerJS.setCountryCode(248)"><span
                                                                                class="fl">塞舌尔</span><span
                                                                                class="fr">+248</span>
                                                                </li>
                                                                <li data-id="232" @click="registerJS.setCountryCode(232)"><span
                                                                                class="fl">塞拉利昂</span><span
                                                                                class="fr">+232</span>
                                                                </li>
                                                                <li data-id="65" @click="registerJS.setCountryCode(65)"><span
                                                                                class="fl">新加坡</span><span class="fr">+65</span>
                                                                </li>
                                                                <li data-id="421" @click="registerJS.setCountryCode(421)"><span
                                                                                class="fl">斯洛伐克（斯洛伐克人的共和国）</span><span
                                                                                class="fr">+421</span></li>
                                                                <li data-id="386" @click="registerJS.setCountryCode(386)"><span
                                                                                class="fl">斯洛文尼亚</span><span
                                                                                class="fr">+386</span></li>
                                                                <li data-id="677" @click="registerJS.setCountryCode(677)"><span
                                                                                class="fl">索罗门群岛</span><span
                                                                                class="fr">+677</span></li>
                                                                <li data-id="252" @click="registerJS.setCountryCode(252)"><span
                                                                                class="fl">索马里</span><span
                                                                                class="fr">+252</span>
                                                                </li>
                                                                <li data-id="27" @click="registerJS.setCountryCode(27)"><span
                                                                                class="fl">南非</span><span class="fr">+27</span>
                                                                </li>
                                                                <li data-id="34" @click="registerJS.setCountryCode(34)"><span
                                                                                class="fl">西班牙</span><span class="fr">+34</span>
                                                                </li>
                                                                <li data-id="94" @click="registerJS.setCountryCode(94)"><span
                                                                                class="fl">斯里兰卡</span><span
                                                                                class="fr">+94</span>
                                                                </li>
                                                                <li data-id="249" @click="registerJS.setCountryCode(249)"><span
                                                                                class="fl">苏丹</span><span class="fr">+249</span>
                                                                </li>
                                                                <li data-id="597" @click="registerJS.setCountryCode(597)"><span
                                                                                class="fl">苏里南</span><span
                                                                                class="fr">+597</span>
                                                                </li>
                                                                <li data-id="268" @click="registerJS.setCountryCode(268)"><span
                                                                                class="fl">斯威士兰</span><span
                                                                                class="fr">+268</span>
                                                                </li>
                                                                <li data-id="46" @click="registerJS.setCountryCode(46)"><span
                                                                                class="fl">瑞典</span><span class="fr">+46</span>
                                                                </li>
                                                                <li data-id="41" @click="registerJS.setCountryCode(41)"><span
                                                                                class="fl">瑞士</span><span class="fr">+41</span>
                                                                </li>
                                                                <li data-id="963" @click="registerJS.setCountryCode(963)"><span
                                                                                class="fl">叙利亚</span><span
                                                                                class="fr">+963</span>
                                                                </li>
                                                                <li data-id="886" @click="registerJS.setCountryCode(886)"><span
                                                                                class="fl">台湾（中国）</span><span
                                                                                class="fr">+886</span></li>
                                                                <li data-id="992" @click="registerJS.setCountryCode(992)"><span
                                                                                class="fl">塔吉克</span><span
                                                                                class="fr">+992</span>
                                                                </li>
                                                                <li data-id="255" @click="registerJS.setCountryCode(255)"><span
                                                                                class="fl">坦桑尼亚</span><span
                                                                                class="fr">+255</span>
                                                                </li>
                                                                <li data-id="66" @click="registerJS.setCountryCode(66)"><span
                                                                                class="fl">泰国</span><span class="fr">+66</span>
                                                                </li>
                                                                <li data-id="228" @click="registerJS.setCountryCode(228)"><span
                                                                                class="fl">多哥</span><span class="fr">+228</span>
                                                                </li>
                                                                <li data-id="676" @click="registerJS.setCountryCode(676)"><span
                                                                                class="fl">汤加</span><span class="fr">+676</span>
                                                                </li>
                                                                <li data-id="1868" @click="registerJS.setCountryCode(1868)">
                                                                        <span class="fl">特立尼达和多巴哥</span><span
                                                                                class="fr">+1868</span>
                                                                </li>
                                                                <li data-id="216" @click="registerJS.setCountryCode(216)"><span
                                                                                class="fl">突尼斯</span><span
                                                                                class="fr">+216</span>
                                                                </li>
                                                                <li data-id="90" @click="registerJS.setCountryCode(90)"><span
                                                                                class="fl">土耳其</span><span class="fr">+90</span>
                                                                </li>
                                                                <li data-id="993" @click="registerJS.setCountryCode(993)"><span
                                                                                class="fl">土库曼</span><span
                                                                                class="fr">+993</span>
                                                                </li>
                                                                <li data-id="256" @click="registerJS.setCountryCode(256)"><span
                                                                                class="fl">乌干达</span><span
                                                                                class="fr">+256</span>
                                                                </li>
                                                                <li data-id="380" @click="registerJS.setCountryCode(380)"><span
                                                                                class="fl">乌克兰</span><span
                                                                                class="fr">+380</span>
                                                                </li>
                                                                <li data-id="971" @click="registerJS.setCountryCode(971)"><span
                                                                                class="fl">阿拉伯联合酋长国</span><span
                                                                                class="fr">+971</span></li>
                                                                <li data-id="44" @click="registerJS.setCountryCode(44)"><span
                                                                                class="fl">英国</span><span class="fr">+44</span>
                                                                </li>
                                                                <li data-id="1" @click="registerJS.setCountryCode(1)"><span
                                                                                class="fl">美国</span><span class="fr">+1</span>
                                                                </li>
                                                                <li data-id="598" @click="registerJS.setCountryCode(598)"><span
                                                                                class="fl">乌拉圭</span><span
                                                                                class="fr">+598</span>
                                                                </li>
                                                                <li data-id="998" @click="registerJS.setCountryCode(998)"><span
                                                                                class="fl">乌兹别克斯坦</span><span
                                                                                class="fr">+998</span></li>
                                                                <li data-id="58" @click="registerJS.setCountryCode(58)"><span
                                                                                class="fl">委内瑞拉</span><span
                                                                                class="fr">+58</span>
                                                                </li>
                                                                <li data-id="84" @click="registerJS.setCountryCode(84)"><span
                                                                                class="fl">越南</span><span class="fr">+84</span>
                                                                </li>
                                                                <li data-id="967" @click="registerJS.setCountryCode(967)"><span
                                                                                class="fl">也门</span><span class="fr">+967</span>
                                                                </li>
                                                                <li data-id="381" @click="registerJS.setCountryCode(381)"><span
                                                                                class="fl">南斯拉夫</span><span
                                                                                class="fr">+381</span>
                                                                </li>
                                                                <li data-id="263" @click="registerJS.setCountryCode(263)"><span
                                                                                class="fl">津巴布韦</span><span
                                                                                class="fr">+263</span>
                                                                </li>
                                                                <li data-id="260" @click="registerJS.setCountryCode(260)"><span
                                                                                class="fl">赞比亚</span><span
                                                                                class="fr">+260</span>
                                                                </li>
                                                                <li data-id="246" @click="registerJS.setCountryCode(246)"><span
                                                                                class="fl">迪戈加西亚岛</span><span
                                                                                class="fr">+246</span></li>
                                                                <li data-id="297" @click="registerJS.setCountryCode(297)"><span
                                                                                class="fl">阿鲁巴</span><span
                                                                                class="fr">+297</span>
                                                                </li>
                                                                <li data-id="975" @click="registerJS.setCountryCode(975)"><span
                                                                                class="fl">不丹</span><span class="fr">+975</span>
                                                                </li>
                                                                <li data-id="387" @click="registerJS.setCountryCode(387)"><span
                                                                                class="fl">波斯尼亚和黑塞哥维那</span><span
                                                                                class="fr">+387</span></li>
                                                                <li data-id="238" @click="registerJS.setCountryCode(238)"><span
                                                                                class="fl">佛得角</span><span
                                                                                class="fr">+238</span>
                                                                </li>
                                                                <li data-id="269" @click="registerJS.setCountryCode(269)"><span
                                                                                class="fl">科摩罗</span><span
                                                                                class="fr">+269</span>
                                                                </li>
                                                                <li data-id="243" @click="registerJS.setCountryCode(243)"><span
                                                                                class="fl">刚果民主共和国</span><span
                                                                                class="fr">+243</span></li>
                                                                <li data-id="385" @click="registerJS.setCountryCode(385)"><span
                                                                                class="fl">克罗地亚</span><span
                                                                                class="fr">+385</span>
                                                                </li>
                                                                <li data-id="1849" @click="registerJS.setCountryCode(1849)">
                                                                        <span class="fl">多米尼加共和国</span><span
                                                                                class="fr">+1849</span>
                                                                </li>
                                                                <li data-id="240" @click="registerJS.setCountryCode(240)"><span
                                                                                class="fl">赤道几内亚</span><span
                                                                                class="fr">+240</span></li>
                                                                <li data-id="500" @click="registerJS.setCountryCode(500)"><span
                                                                                class="fl">福克兰群岛</span><span
                                                                                class="fr">+500</span></li>
                                                                <li data-id="298" @click="registerJS.setCountryCode(298)"><span
                                                                                class="fl">法罗群岛</span><span
                                                                                class="fr">+298</span>
                                                                </li>
                                                                <li data-id="45" @click="registerJS.setCountryCode(45)"><span
                                                                                class="fl">格陵兰</span><span class="fr">+45</span>
                                                                </li>
                                                                <li data-id="590" @click="registerJS.setCountryCode(590)"><span
                                                                                class="fl">瓜德罗普岛</span><span
                                                                                class="fr">+590</span></li>
                                                                <li data-id="245" @click="registerJS.setCountryCode(245)"><span
                                                                                class="fl">几内亚比绍</span><span
                                                                                class="fr">+245</span></li>
                                                                <li data-id="389" @click="registerJS.setCountryCode(389)"><span
                                                                                class="fl">马其顿</span><span
                                                                                class="fr">+389</span>
                                                                </li>
                                                                <li data-id="222" @click="registerJS.setCountryCode(222)"><span
                                                                                class="fl">毛里塔尼亚</span><span
                                                                                class="fr">+222</span></li>
                                                                <li data-id="691" @click="registerJS.setCountryCode(691)"><span
                                                                                class="fl">密克罗尼西亚</span><span
                                                                                class="fr">+691</span></li>
                                                                <li data-id="382" @click="registerJS.setCountryCode(382)"><span
                                                                                class="fl">黑山共和国</span><span
                                                                                class="fr">+382</span></li>
                                                                <li data-id="687" @click="registerJS.setCountryCode(687)"><span
                                                                                class="fl">新喀里多尼亚</span><span
                                                                                class="fr">+687</span></li>
                                                                <li data-id="6723" @click="registerJS.setCountryCode(6723)">
                                                                        <span class="fl">诺福克岛</span><span
                                                                                class="fr">+6723</span>
                                                                </li>
                                                                <li data-id="680" @click="registerJS.setCountryCode(680)"><span
                                                                                class="fl">帛琉</span><span class="fr">+680</span>
                                                                </li>
                                                                <li data-id="970" @click="registerJS.setCountryCode(970)"><span
                                                                                class="fl">巴勒斯坦</span><span
                                                                                class="fr">+970</span>
                                                                </li>
                                                                <li data-id="250" @click="registerJS.setCountryCode(250)"><span
                                                                                class="fl">卢旺达</span><span
                                                                                class="fr">+250</span>
                                                                </li>
                                                                <li data-id="1869" @click="registerJS.setCountryCode(1869)">
                                                                        <span class="fl">圣基茨和尼维斯</span><span
                                                                                class="fr">+1869</span>
                                                                </li>
                                                                <li data-id="381" @click="registerJS.setCountryCode(381)"><span
                                                                                class="fl">塞尔维亚共和国</span><span
                                                                                class="fr">+381</span></li>
                                                                <li data-id="211" @click="registerJS.setCountryCode(211)"><span
                                                                                class="fl">南苏丹共和国</span><span
                                                                                class="fr">+211</span></li>
                                                                <li data-id="678" @click="registerJS.setCountryCode(678)"><span
                                                                                class="fl">瓦努阿图</span><span
                                                                                class="fr">+678</span>
                                                                </li>
                                                                <li data-id="1284" @click="registerJS.setCountryCode(1284)">
                                                                        <span class="fl">维尔京群岛(英国)</span><span
                                                                                class="fr">+1284</span>
                                                                </li>
                                                                <li data-id="225" @click="registerJS.setCountryCode(225)"><span
                                                                                class="fl">Cote D'Ivoire</span><span
                                                                                class="fr">+225</span></li>
                                                                <li data-id="1767" @click="registerJS.setCountryCode(1767)">
                                                                        <span class="fl">多米尼克国</span><span
                                                                                class="fr">+1767</span>
                                                                </li>
                                                                <li data-id="670" @click="registerJS.setCountryCode(670)"><span
                                                                                class="fl">东帝汶</span><span
                                                                                class="fr">+670</span>
                                                                </li>
                                                                <li data-id="291" @click="registerJS.setCountryCode(291)"><span
                                                                                class="fl">厄立特里亚国</span><span
                                                                                class="fr">+291</span></li>
                                                                <li data-id="681" @click="registerJS.setCountryCode(681)"><span
                                                                                class="fl">沃利斯和富图纳群岛</span><span
                                                                                class="fr">+681</span></li>
                                                                <li data-id="1340" @click="registerJS.setCountryCode(1340)">
                                                                        <span class="fl">维尔京群岛(美国)</span><span
                                                                                class="fr">+1340</span>
                                                                </li>
                                                                <li data-id="688" @click="registerJS.setCountryCode(688)"><span
                                                                                class="fl">图瓦卢</span><span
                                                                                class="fr">+688</span>
                                                                </li>
                                                                <li data-id="1809" @click="registerJS.setCountryCode(1809)">
                                                                        <span class="fl">土克斯及开科斯群岛</span><span
                                                                                class="fr">+1809</span>
                                                                </li>
                                                                <li data-id="690" @click="registerJS.setCountryCode(690)"><span
                                                                                class="fl">托克劳</span><span
                                                                                class="fr">+690</span>
                                                                </li>
                                                                <li data-id="692" @click="registerJS.setCountryCode(692)"><span
                                                                                class="fl">马绍尔群岛</span><span
                                                                                class="fr">+692</span></li>
                                                                <li data-id="686" @click="registerJS.setCountryCode(686)"><span
                                                                                class="fl">基里巴斯</span><span
                                                                                class="fr">+686</span>
                                                                </li>
                                                                <li data-id="1808" @click="registerJS.setCountryCode(1808)">
                                                                        <span class="fl">夏威夷</span><span class="fr">+1808</span>
                                                                </li>
                                                                <li data-id="508" @click="registerJS.setCountryCode(508)"><span
                                                                                class="fl">圣皮埃尔岛及密克隆岛</span><span
                                                                                class="fr">+508</span></li>
                                                                <li data-id="683" @click="registerJS.setCountryCode(683)"><span
                                                                                class="fl">纽埃</span><span class="fr">+683</span>
                                                                </li>
                                                                <li data-id="290" @click="registerJS.setCountryCode(290)"><span
                                                                                class="fl">圣赫勒拿</span><span
                                                                                class="fr">+290</span>
                                                                </li>
                                                                <li data-id="39" @click="registerJS.setCountryCode(39)"><span
                                                                                class="fl">梵蒂冈(罗马教廷)</span><span
                                                                                class="fr">+39</span></li>
                                                                <li data-id="1808" @click="registerJS.setCountryCode(1808)">
                                                                        <span class="fl">威克岛(美)</span><span
                                                                                class="fr">+1808</span>
                                                                </li>
                                                                <li data-id="7" @click="registerJS.setCountryCode(7)"><span
                                                                                class="fl">阿布哈兹</span><span class="fr">+7</span>
                                                                </li>
                                                                <li data-id="672" @click="registerJS.setCountryCode(672)"><span
                                                                                class="fl">南极洲</span><span
                                                                                class="fr">+672</span>
                                                                </li>
                                                                <li data-id="684" @click="registerJS.setCountryCode(684)"><span
                                                                                class="fl">萨摩亚</span><span
                                                                                class="fr">+684</span>
                                                                </li>
                                                                <li data-id="44" @click="registerJS.setCountryCode(44)"><span
                                                                                class="fl">泽西岛</span><span class="fr">+44</span>
                                                                </li>
                                                                <li data-id="61" @click="registerJS.setCountryCode(61)"><span
                                                                                class="fl">科科斯群岛</span><span
                                                                                class="fr">+61</span>
                                                                </li>
                                                                <li data-id="61" @click="registerJS.setCountryCode(61)"><span
                                                                                class="fl">圣延岛</span><span class="fr">+61</span>
                                                                </li>
                                                                <li data-id="685" @click="registerJS.setCountryCode(685)"><span
                                                                                class="fl">西撒哈拉</span><span
                                                                                class="fr">+685</span>
                                                                </li>
                                                                <li data-id="33" @click="registerJS.setCountryCode(33)"><span
                                                                                class="fl">法国大都会</span><span
                                                                                class="fr">+33</span>
                                                                </li>
                                                                <li data-id="246" @click="registerJS.setCountryCode(246)"><span
                                                                                class="fl">英属印度洋领地</span><span
                                                                                class="fr">+246</span></li>
                                                                <li data-id="64" @click="registerJS.setCountryCode(64)"><span
                                                                                class="fl">皮特凯恩岛</span><span
                                                                                class="fr">+64</span>
                                                                </li>
                                                                <li data-id="7" @click="registerJS.setCountryCode(7)"><span
                                                                                class="fl">南奥赛梯</span><span class="fr">+7</span>
                                                                </li>
                                                                <li data-id="590" @click="registerJS.setCountryCode(590)"><span
                                                                                class="fl">圣马丁岛</span><span
                                                                                class="fr">+590</span>
                                                                </li>
                                                                <li data-id="262" @click="registerJS.setCountryCode(262)"><span
                                                                                class="fl">马约特</span><span
                                                                                class="fr">+262</span>
                                                                </li>
                                                        </ul>
                                                </div>
                                        </div>

                                        <!--验证码-->
                                        <div class="lg-item icon-verify margin-btm24 item-getcode" style="margin-bottom: 30px">
                                                <input type="text" class="ipt-code"
                                                        :placeholder="this.$t('user.verificationCode')" id="messageCode"
                                                        maxlength="6">
                                                <input type="hidden" name="validate" id="validate">
                                                <a href="javascript:;" @click="registerJS.sendCode(that)"
                                                        class="get-code col-blue pos-r24" id="sendCodeBtn">{{
                                                                $t('user.getVerificationCode') }}</a>
                                                <a href="javascript:;" class="col-gray pos-r24 before-reget"
                                                        id="showcountdown">60{{ $t('user.secondPromat') }}</a>
                                                <p class="err-tip2 voice-use" id="codeMsg"></p>
                                        </div>
                                        <!--密码-->
                                        <div class="lg-item icon-pwd">
                                                <input type="password" class="pd-right60" name="userPaw"
                                                        :placeholder="this.$t('user.setPas')" id="pwd" maxlength="20">
                                                <!-- <i class="pos-r24 icon-eye-close fr" onclick="initPassword(this)"></i> -->
                                                <p class="pwd-rule">{{ $t('user.pasPromat') }}</p>
                                                <p class="err-txt" id="pwdMsg"></p>
                                        </div>
                                </div>
                                <div class="mesDiv2" style="display:none">
                                        <h2>{{ $t('user.basicUserInformation') }}</h2>
                                        <div class="mesDiv">
                                                {{ $t('user.picture') }}：<input type="file" name="userImage" id="imgFile"><br>
                                        </div>
                                        <div class="mesDiv">{{ $t('user.name') }}：<input type="text" name="name"
                                                        class="ipt-text" :placeholder="this.$t('user.name')"><br></div>
                                        <div class="mesDiv">{{ $t('user.school') }}：<input type="text" name="school"
                                                        class="ipt-text" :placeholder="this.$t('user.name')"><br></div>

                                        <div class="mesDiv typeDiv" style="display:inline-block">
                                                {{ $t('user.type') }}： <select name="type" id="type" class="typeChoose">
                                                        <option value=0>{{ $t('user.student') }}</option>
                                                        <option value=1>{{ $t('user.teacher') }}</option>
                                                </select><br>
                                        </div>
                                        <div class="tab-container" style="width: 200px;height:40px;display:inline-block">
                                                <el-form ref="dataForm"
                                                        style="width: 200px;">
                                                        <el-form-item>
                                                                <el-select v-model="hobbys"
                                                                        class="filter-item" placeholder="爱好选择(3种)" multiple
                                                                        style="width: 200px;height:40px" collapse-tags="true" multiple-limit="3">
                                                                        <el-option v-for="item in tabMapOptions"
                                                                                :key="item.key" :label="item.label"
                                                                                :value="item.key" />
                                                                </el-select>
                                                        </el-form-item>
                                                </el-form>
                                        </div>
                                        <div id="positionDiv" style="display:none" class="mesDiv">
                                                {{ $t('user.position') }}：<input type="text" name="position"
                                                        class="ipt-text"><br>
                                        </div>
                                        <div id="introductionDiv" style="display:none" class="mesDiv">
                                                <!-- 简介：<input type="" name="introduction"><br> -->
                                                {{ $t('user.introduction') }}：<textarea name="introduction" cols="50" rows="10"
                                                        :placeholder="this.$t('user.personalProfile')"
                                                        class="introductionView"></textarea><br>
                                        </div>
                                </div>
                                <div class="btns-box">
                                        <p class="err-tip" id="err-txt"></p>
                                        <button type="button" class="btn-big-blue" style="margin-top:0"
                                                @click="registerJS.register($event.target)">{{ $t('user.next') }}</button>
                                        <input type="button" id="mesSub" class="btn-big-blue" style="margin-top:0;display:none"
                                                @click="registerJS.submitBtn(that)" :value="this.$t('user.submit')">
                                </div>
                        </form>
                        <p class="Agreement">{{ $t('user.loginPagePrompt') }}<a
                                        href="https://homewh.chaoxing.com/agree/privacyPolicy?appId=900001"
                                        target="_blank">《隐私政策》</a>
                                和<a href="https://homewh.chaoxing.com/agree/userAgreement?appId=900001"
                                        target="_blank">《用户协议》</a></p>
                </div>
        </div>
</template>

<script>
import $ from 'jquery'
import axios from 'axios'
import registerJS from "@/assets/style/js/registerVue"

export default {
        name: "registerTest",
        data() {
                return {
                        findCountryCode: '',
                        registerJS: registerJS,
                        that: this,
                        gradeSelect: "",
                        tabMapOptions: [
                                { label: "#1", key: "hobby1" },
                                { label: "#2", key: "hobby2" },
                                { label: "#3", key: "hobby3" },
                                { label: "#4", key: "hobby4" },
                                { label: "#5", key: "hobby5" },
                                { label: "#6", key: "hobby6" },
                                { label: "#7", key: "hobby7" },
                                { label: "#8", key: "hobby8" },
                                { label: "#9", key: "hobby9" },
                        ],
                        hobbys:[]

                }
        },
        methods: {
        },
        mounted() {
                $('#type').change(() => {
                        registerJS.typeDifference(document.getElementById("type").value)
                })
        }
}
</script>

<style>@import "../assets/style/css/register.css"</style>