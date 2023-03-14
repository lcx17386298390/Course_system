<template>
    <!-- 课程页面 -->
  <div>
    <div class="mainCourse">
        <input type="hidden" id="courseId" value="228416117">
        <input type="hidden" id="t" value="0">
        <input type="hidden" id="jinkeType" value="0">
        <div class="crumbs">
            <span class="colorGray33">{{ $t('user.coursePage.currentCourse') }}：</span> <a href="/">{{ $t('user.coursePage.homePage') }}</a> &gt; <a
                href="/#/courseList">{{ $t('user.course') }}</a> &gt; <a
                :href="'/#/coursePage/'+course.data.courseNumber">{{ course.data.courseName }}</a>
        </div>
        <div class="mgCard">
            <div class="mgCard_head clearAfter">
                <div class="mgCard_play fl">
                    <div class="mainBanner">
                        <div class="mainCon" style="height:376px;">


                            <div class="mainCon_left mainBanCon" id="reader">

                                <div class="video-js vjs-default-skin vjs-big-play-centered vjs-paused html5player-dimensions vjs-controls-enabled vjs-workinghover vjs-v7 vjs-user-active"
                                    id="html5player" lang="zh-cn" role="region" aria-label="视频播放器"><video
                                        id="html5player_html5_api" class="vjs-tech" tabindex="-1" preload="none"
                                        src="https://s1.ananas.chaoxing.com/video/d8/a4/a5/a330586cb792a4dc454f6e958f4bc7ca/sd.mp4?at_=1672796629589&amp;ak_=db459bf594cf77e2f2ba9423ce765877&amp;ad_=19b0c68eb73a6f84e9d89ab026f326be"></video>
                                    <div class="vjs-poster" tabindex="-1" aria-disabled="false"
                                        :style="'background-image:url(http://localhost:8443/'+course.data.imagePath+')'">
                                        <img :src="'/api/images/'+course.data.imagePath">
                                    </div>
                                    <!-- 视频播放 -->
                                    <!-- <div class="vjs-text-track-display" aria-live="off" aria-atomic="true"></div>
                                    <div class="vjs-loading-spinner" dir="ltr"><span class="vjs-control-text">视频播放器 is
                                            loading.</span></div><button class="vjs-big-play-button" type="button"
                                        title="播放视频" aria-disabled="false"><span aria-hidden="true"
                                            class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                            aria-live="polite">播放视频</span></button> -->
                                    <!-- <div class="vjs-control-bar" dir="ltr"><button
                                            class="vjs-play-control vjs-control vjs-button" type="button" title="播放"
                                            aria-disabled="false"><span aria-hidden="true"
                                                class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                                aria-live="polite">播放</span></button>
                                        <div class="vjs-volume-panel vjs-control vjs-volume-panel-horizontal"><button
                                                class="vjs-mute-control vjs-control vjs-button vjs-vol-3" type="button"
                                                title="静音" aria-disabled="false"><span aria-hidden="true"
                                                    class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                                    aria-live="polite">静音</span></button>
                                            <div class="vjs-volume-control vjs-control vjs-volume-horizontal">
                                                <div tabindex="0"
                                                    class="vjs-volume-bar vjs-slider-bar vjs-slider vjs-slider-horizontal"
                                                    role="slider" aria-valuenow="100" aria-valuemin="0"
                                                    aria-valuemax="100" aria-label="音量" aria-live="polite"
                                                    aria-valuetext="100%">
                                                    <div class="vjs-volume-level"><span class="vjs-control-text"></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="vjs-current-time vjs-time-control vjs-control"><span
                                                class="vjs-control-text">当前时间&nbsp;</span><span
                                                class="vjs-current-time-display" aria-live="off">0:00</span></div>
                                        <div class="vjs-time-control vjs-time-divider">
                                            <div><span>/</span></div>
                                        </div>
                                        <div class="vjs-duration vjs-time-control vjs-control"><span
                                                class="vjs-control-text">时长&nbsp;</span><span
                                                class="vjs-duration-display" aria-live="off">0:00</span></div>
                                        <div class="vjs-progress-control vjs-control">
                                            <div tabindex="0"
                                                class="vjs-progress-holder vjs-slider vjs-slider-horizontal"
                                                role="slider" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"
                                                aria-label="进度小节">
                                                <div class="vjs-load-progress"><span
                                                        class="vjs-control-text"><span>加载完毕</span>: 0%</span></div>
                                                <div class="vjs-mouse-display">
                                                    <div class="vjs-time-tooltip"></div>
                                                </div>
                                                <div class="vjs-play-progress vjs-slider-bar">
                                                    <div class="vjs-time-tooltip"></div><span
                                                        class="vjs-control-text"><span>进度</span>: 0%</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="vjs-live-control vjs-control vjs-hidden">
                                            <div class="vjs-live-display" aria-live="off"><span
                                                    class="vjs-control-text">媒体流类型&nbsp;</span>直播</div>
                                        </div>
                                        <div class="vjs-remaining-time vjs-time-control vjs-control"><span
                                                class="vjs-control-text">剩余时间&nbsp;</span><span
                                                class="vjs-remaining-time-display" aria-live="off">-0:00</span></div>
                                        <div class="vjs-custom-control-spacer vjs-spacer ">&nbsp;</div>
                                        <div
                                            class="vjs-playback-rate vjs-menu-button vjs-menu-button-popup vjs-control vjs-button vjs-hidden">
                                            <button
                                                class="vjs-playback-rate vjs-menu-button vjs-menu-button-popup vjs-button"
                                                type="button" aria-disabled="false" title="播放速度" aria-haspopup="true"
                                                aria-expanded="false"><span aria-hidden="true"
                                                    class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                                    aria-live="polite">播放速度</span></button>
                                            <div class="vjs-menu">
                                                <ul class="vjs-menu-content" role="menu"></ul>
                                            </div>
                                            <div class="vjs-playback-rate-value">1x</div>
                                        </div>
                                        <div
                                            class="vjs-chapters-button vjs-menu-button vjs-menu-button-popup vjs-control vjs-button vjs-hidden">
                                            <button
                                                class="vjs-chapters-button vjs-menu-button vjs-menu-button-popup vjs-button"
                                                type="button" aria-disabled="false" title="节目段落" aria-haspopup="true"
                                                aria-expanded="false"><span aria-hidden="true"
                                                    class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                                    aria-live="polite">节目段落</span></button>
                                            <div class="vjs-menu">
                                                <ul class="vjs-menu-content" role="menu">
                                                    <li class="vjs-menu-title" tabindex="-1">节目段落</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div
                                            class="vjs-descriptions-button vjs-menu-button vjs-menu-button-popup vjs-control vjs-button vjs-hidden">
                                            <button
                                                class="vjs-descriptions-button vjs-menu-button vjs-menu-button-popup vjs-button"
                                                type="button" aria-disabled="false" title="描述" aria-haspopup="true"
                                                aria-expanded="false"><span aria-hidden="true"
                                                    class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                                    aria-live="polite">描述</span></button>
                                            <div class="vjs-menu">
                                                <ul class="vjs-menu-content" role="menu">
                                                    <li class="vjs-menu-item vjs-selected" tabindex="-1"
                                                        role="menuitemradio" aria-disabled="false" aria-checked="true">
                                                        <span class="vjs-menu-item-text">关闭描述</span><span
                                                            class="vjs-control-text" aria-live="polite">, 选择</span></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div
                                            class="vjs-subs-caps-button vjs-menu-button vjs-menu-button-popup vjs-control vjs-button vjs-hidden">
                                            <button
                                                class="vjs-subs-caps-button vjs-menu-button vjs-menu-button-popup vjs-button"
                                                type="button" aria-disabled="false" title="字幕" aria-haspopup="true"
                                                aria-expanded="false"><span aria-hidden="true"
                                                    class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                                    aria-live="polite">字幕</span></button>
                                            <div class="vjs-menu">
                                                <ul class="vjs-menu-content" role="menu">
                                                    <li class="vjs-menu-item vjs-texttrack-settings" tabindex="-1"
                                                        role="menuitem" aria-disabled="false"><span
                                                            class="vjs-menu-item-text">字幕设定</span><span
                                                            class="vjs-control-text" aria-live="polite">,
                                                            开启字幕设置弹窗</span></li>
                                                    <li class="vjs-menu-item vjs-selected" tabindex="-1"
                                                        role="menuitemradio" aria-disabled="false" aria-checked="true">
                                                        <span class="vjs-menu-item-text">关闭字幕</span><span
                                                            class="vjs-control-text" aria-live="polite">, 选择</span></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div
                                            class="vjs-audio-button vjs-menu-button vjs-menu-button-popup vjs-control vjs-button vjs-hidden">
                                            <button
                                                class="vjs-audio-button vjs-menu-button vjs-menu-button-popup vjs-button"
                                                type="button" aria-disabled="false" title="音轨" aria-haspopup="true"
                                                aria-expanded="false"><span aria-hidden="true"
                                                    class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                                    aria-live="polite">音轨</span></button>
                                            <div class="vjs-menu">
                                                <ul class="vjs-menu-content" role="menu"></ul>
                                            </div>
                                        </div><button class="vjs-fullscreen-control vjs-control vjs-button"
                                            type="button" title="全屏" aria-disabled="false"><span aria-hidden="true"
                                                class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                                aria-live="polite">全屏</span></button>
                                    </div> -->
                                    <!-- <div class="vjs-error-display vjs-modal-dialog vjs-hidden " tabindex="-1"
                                        aria-describedby="html5player_component_358_description" aria-hidden="true"
                                        aria-label="弹窗" role="dialog">
                                        <p class="vjs-modal-dialog-description vjs-control-text"
                                            id="html5player_component_358_description">This is a modal window.</p>
                                        <div class="vjs-modal-dialog-content" role="document"></div>
                                    </div>
                                    <div class="vjs-modal-dialog vjs-hidden  vjs-text-track-settings" tabindex="-1"
                                        aria-describedby="html5player_component_364_description" aria-hidden="true"
                                        aria-label="字幕设定视窗" role="dialog">
                                        <p class="vjs-modal-dialog-description vjs-control-text"
                                            id="html5player_component_364_description">开始对话视窗。离开会取消及关闭视窗</p>
                                        <div class="vjs-modal-dialog-content" role="document">
                                            <div class="vjs-track-settings-colors">
                                                <fieldset class="vjs-fg-color vjs-track-setting">
                                                    <legend id="captions-text-legend-html5player_component_364">文字
                                                    </legend><label
                                                        id="captions-foreground-color-html5player_component_364"
                                                        class="vjs-label">Color</label><select
                                                        aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-color-html5player_component_364">
                                                        <option
                                                            id="captions-foreground-color-html5player_component_364-White"
                                                            value="#FFF"
                                                            aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-color-html5player_component_364 captions-foreground-color-html5player_component_364-White">
                                                            白</option>
                                                        <option
                                                            id="captions-foreground-color-html5player_component_364-Black"
                                                            value="#000"
                                                            aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-color-html5player_component_364 captions-foreground-color-html5player_component_364-Black">
                                                            黑</option>
                                                        <option
                                                            id="captions-foreground-color-html5player_component_364-Red"
                                                            value="#F00"
                                                            aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-color-html5player_component_364 captions-foreground-color-html5player_component_364-Red">
                                                            红</option>
                                                        <option
                                                            id="captions-foreground-color-html5player_component_364-Green"
                                                            value="#0F0"
                                                            aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-color-html5player_component_364 captions-foreground-color-html5player_component_364-Green">
                                                            绿</option>
                                                        <option
                                                            id="captions-foreground-color-html5player_component_364-Blue"
                                                            value="#00F"
                                                            aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-color-html5player_component_364 captions-foreground-color-html5player_component_364-Blue">
                                                            蓝</option>
                                                        <option
                                                            id="captions-foreground-color-html5player_component_364-Yellow"
                                                            value="#FF0"
                                                            aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-color-html5player_component_364 captions-foreground-color-html5player_component_364-Yellow">
                                                            黄</option>
                                                        <option
                                                            id="captions-foreground-color-html5player_component_364-Magenta"
                                                            value="#F0F"
                                                            aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-color-html5player_component_364 captions-foreground-color-html5player_component_364-Magenta">
                                                            紫红</option>
                                                        <option
                                                            id="captions-foreground-color-html5player_component_364-Cyan"
                                                            value="#0FF"
                                                            aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-color-html5player_component_364 captions-foreground-color-html5player_component_364-Cyan">
                                                            青</option>
                                                    </select><span class="vjs-text-opacity vjs-opacity"><label
                                                            id="captions-foreground-opacity-html5player_component_364"
                                                            class="vjs-label">Transparency</label><select
                                                            aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-opacity-html5player_component_364">
                                                            <option
                                                                id="captions-foreground-opacity-html5player_component_364-Opaque"
                                                                value="1"
                                                                aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-opacity-html5player_component_364 captions-foreground-opacity-html5player_component_364-Opaque">
                                                                不透明</option>
                                                            <option
                                                                id="captions-foreground-opacity-html5player_component_364-SemiTransparent"
                                                                value="0.5"
                                                                aria-labelledby="captions-text-legend-html5player_component_364 captions-foreground-opacity-html5player_component_364 captions-foreground-opacity-html5player_component_364-SemiTransparent">
                                                                半透明</option>
                                                        </select></span>
                                                </fieldset>
                                                <fieldset class="vjs-bg-color vjs-track-setting">
                                                    <legend id="captions-background-html5player_component_364">背景
                                                    </legend><label
                                                        id="captions-background-color-html5player_component_364"
                                                        class="vjs-label">Color</label><select
                                                        aria-labelledby="captions-background-html5player_component_364 captions-background-color-html5player_component_364">
                                                        <option
                                                            id="captions-background-color-html5player_component_364-Black"
                                                            value="#000"
                                                            aria-labelledby="captions-background-html5player_component_364 captions-background-color-html5player_component_364 captions-background-color-html5player_component_364-Black">
                                                            黑</option>
                                                        <option
                                                            id="captions-background-color-html5player_component_364-White"
                                                            value="#FFF"
                                                            aria-labelledby="captions-background-html5player_component_364 captions-background-color-html5player_component_364 captions-background-color-html5player_component_364-White">
                                                            白</option>
                                                        <option
                                                            id="captions-background-color-html5player_component_364-Red"
                                                            value="#F00"
                                                            aria-labelledby="captions-background-html5player_component_364 captions-background-color-html5player_component_364 captions-background-color-html5player_component_364-Red">
                                                            红</option>
                                                        <option
                                                            id="captions-background-color-html5player_component_364-Green"
                                                            value="#0F0"
                                                            aria-labelledby="captions-background-html5player_component_364 captions-background-color-html5player_component_364 captions-background-color-html5player_component_364-Green">
                                                            绿</option>
                                                        <option
                                                            id="captions-background-color-html5player_component_364-Blue"
                                                            value="#00F"
                                                            aria-labelledby="captions-background-html5player_component_364 captions-background-color-html5player_component_364 captions-background-color-html5player_component_364-Blue">
                                                            蓝</option>
                                                        <option
                                                            id="captions-background-color-html5player_component_364-Yellow"
                                                            value="#FF0"
                                                            aria-labelledby="captions-background-html5player_component_364 captions-background-color-html5player_component_364 captions-background-color-html5player_component_364-Yellow">
                                                            黄</option>
                                                        <option
                                                            id="captions-background-color-html5player_component_364-Magenta"
                                                            value="#F0F"
                                                            aria-labelledby="captions-background-html5player_component_364 captions-background-color-html5player_component_364 captions-background-color-html5player_component_364-Magenta">
                                                            紫红</option>
                                                        <option
                                                            id="captions-background-color-html5player_component_364-Cyan"
                                                            value="#0FF"
                                                            aria-labelledby="captions-background-html5player_component_364 captions-background-color-html5player_component_364 captions-background-color-html5player_component_364-Cyan">
                                                            青</option>
                                                    </select><span class="vjs-bg-opacity vjs-opacity"><label
                                                            id="captions-background-opacity-html5player_component_364"
                                                            class="vjs-label">Transparency</label><select
                                                            aria-labelledby="captions-background-html5player_component_364 captions-background-opacity-html5player_component_364">
                                                            <option
                                                                id="captions-background-opacity-html5player_component_364-Opaque"
                                                                value="1"
                                                                aria-labelledby="captions-background-html5player_component_364 captions-background-opacity-html5player_component_364 captions-background-opacity-html5player_component_364-Opaque">
                                                                不透明</option>
                                                            <option
                                                                id="captions-background-opacity-html5player_component_364-SemiTransparent"
                                                                value="0.5"
                                                                aria-labelledby="captions-background-html5player_component_364 captions-background-opacity-html5player_component_364 captions-background-opacity-html5player_component_364-SemiTransparent">
                                                                半透明</option>
                                                            <option
                                                                id="captions-background-opacity-html5player_component_364-Transparent"
                                                                value="0"
                                                                aria-labelledby="captions-background-html5player_component_364 captions-background-opacity-html5player_component_364 captions-background-opacity-html5player_component_364-Transparent">
                                                                透明</option>
                                                        </select></span>
                                                </fieldset>
                                                <fieldset class="vjs-window-color vjs-track-setting">
                                                    <legend id="captions-window-html5player_component_364">视窗</legend>
                                                    <label id="captions-window-color-html5player_component_364"
                                                        class="vjs-label">Color</label><select
                                                        aria-labelledby="captions-window-html5player_component_364 captions-window-color-html5player_component_364">
                                                        <option
                                                            id="captions-window-color-html5player_component_364-Black"
                                                            value="#000"
                                                            aria-labelledby="captions-window-html5player_component_364 captions-window-color-html5player_component_364 captions-window-color-html5player_component_364-Black">
                                                            黑</option>
                                                        <option
                                                            id="captions-window-color-html5player_component_364-White"
                                                            value="#FFF"
                                                            aria-labelledby="captions-window-html5player_component_364 captions-window-color-html5player_component_364 captions-window-color-html5player_component_364-White">
                                                            白</option>
                                                        <option id="captions-window-color-html5player_component_364-Red"
                                                            value="#F00"
                                                            aria-labelledby="captions-window-html5player_component_364 captions-window-color-html5player_component_364 captions-window-color-html5player_component_364-Red">
                                                            红</option>
                                                        <option
                                                            id="captions-window-color-html5player_component_364-Green"
                                                            value="#0F0"
                                                            aria-labelledby="captions-window-html5player_component_364 captions-window-color-html5player_component_364 captions-window-color-html5player_component_364-Green">
                                                            绿</option>
                                                        <option
                                                            id="captions-window-color-html5player_component_364-Blue"
                                                            value="#00F"
                                                            aria-labelledby="captions-window-html5player_component_364 captions-window-color-html5player_component_364 captions-window-color-html5player_component_364-Blue">
                                                            蓝</option>
                                                        <option
                                                            id="captions-window-color-html5player_component_364-Yellow"
                                                            value="#FF0"
                                                            aria-labelledby="captions-window-html5player_component_364 captions-window-color-html5player_component_364 captions-window-color-html5player_component_364-Yellow">
                                                            黄</option>
                                                        <option
                                                            id="captions-window-color-html5player_component_364-Magenta"
                                                            value="#F0F"
                                                            aria-labelledby="captions-window-html5player_component_364 captions-window-color-html5player_component_364 captions-window-color-html5player_component_364-Magenta">
                                                            紫红</option>
                                                        <option
                                                            id="captions-window-color-html5player_component_364-Cyan"
                                                            value="#0FF"
                                                            aria-labelledby="captions-window-html5player_component_364 captions-window-color-html5player_component_364 captions-window-color-html5player_component_364-Cyan">
                                                            青</option>
                                                    </select><span class="vjs-window-opacity vjs-opacity"><label
                                                            id="captions-window-opacity-html5player_component_364"
                                                            class="vjs-label">Transparency</label><select
                                                            aria-labelledby="captions-window-html5player_component_364 captions-window-opacity-html5player_component_364">
                                                            <option
                                                                id="captions-window-opacity-html5player_component_364-Transparent"
                                                                value="0"
                                                                aria-labelledby="captions-window-html5player_component_364 captions-window-opacity-html5player_component_364 captions-window-opacity-html5player_component_364-Transparent">
                                                                透明</option>
                                                            <option
                                                                id="captions-window-opacity-html5player_component_364-SemiTransparent"
                                                                value="0.5"
                                                                aria-labelledby="captions-window-html5player_component_364 captions-window-opacity-html5player_component_364 captions-window-opacity-html5player_component_364-SemiTransparent">
                                                                半透明</option>
                                                            <option
                                                                id="captions-window-opacity-html5player_component_364-Opaque"
                                                                value="1"
                                                                aria-labelledby="captions-window-html5player_component_364 captions-window-opacity-html5player_component_364 captions-window-opacity-html5player_component_364-Opaque">
                                                                不透明</option>
                                                        </select></span>
                                                </fieldset>
                                            </div>
                                            <div class="vjs-track-settings-font">
                                                <fieldset class="vjs-font-percent vjs-track-setting">
                                                    <legend id="captions-font-size-html5player_component_364" class="">
                                                        字体尺寸</legend><select
                                                        aria-labelledby="captions-font-size-html5player_component_364">
                                                        <option id="captions-font-size-html5player_component_364-50"
                                                            value="0.50"
                                                            aria-labelledby="captions-font-size-html5player_component_364 captions-font-size-html5player_component_364-50">
                                                            50%</option>
                                                        <option id="captions-font-size-html5player_component_364-75"
                                                            value="0.75"
                                                            aria-labelledby="captions-font-size-html5player_component_364 captions-font-size-html5player_component_364-75">
                                                            75%</option>
                                                        <option id="captions-font-size-html5player_component_364-100"
                                                            value="1.00"
                                                            aria-labelledby="captions-font-size-html5player_component_364 captions-font-size-html5player_component_364-100">
                                                            100%</option>
                                                        <option id="captions-font-size-html5player_component_364-125"
                                                            value="1.25"
                                                            aria-labelledby="captions-font-size-html5player_component_364 captions-font-size-html5player_component_364-125">
                                                            125%</option>
                                                        <option id="captions-font-size-html5player_component_364-150"
                                                            value="1.50"
                                                            aria-labelledby="captions-font-size-html5player_component_364 captions-font-size-html5player_component_364-150">
                                                            150%</option>
                                                        <option id="captions-font-size-html5player_component_364-175"
                                                            value="1.75"
                                                            aria-labelledby="captions-font-size-html5player_component_364 captions-font-size-html5player_component_364-175">
                                                            175%</option>
                                                        <option id="captions-font-size-html5player_component_364-200"
                                                            value="2.00"
                                                            aria-labelledby="captions-font-size-html5player_component_364 captions-font-size-html5player_component_364-200">
                                                            200%</option>
                                                        <option id="captions-font-size-html5player_component_364-300"
                                                            value="3.00"
                                                            aria-labelledby="captions-font-size-html5player_component_364 captions-font-size-html5player_component_364-300">
                                                            300%</option>
                                                        <option id="captions-font-size-html5player_component_364-400"
                                                            value="4.00"
                                                            aria-labelledby="captions-font-size-html5player_component_364 captions-font-size-html5player_component_364-400">
                                                            400%</option>
                                                    </select>
                                                </fieldset>
                                                <fieldset class="vjs-edge-style vjs-track-setting">
                                                    <legend id="html5player_component_364" class="">字体边缘样式</legend>
                                                    <select aria-labelledby="html5player_component_364">
                                                        <option id="html5player_component_364-None" value="none"
                                                            aria-labelledby="html5player_component_364 html5player_component_364-None">
                                                            无</option>
                                                        <option id="html5player_component_364-Raised" value="raised"
                                                            aria-labelledby="html5player_component_364 html5player_component_364-Raised">
                                                            浮雕</option>
                                                        <option id="html5player_component_364-Depressed"
                                                            value="depressed"
                                                            aria-labelledby="html5player_component_364 html5player_component_364-Depressed">
                                                            压低</option>
                                                        <option id="html5player_component_364-Uniform" value="uniform"
                                                            aria-labelledby="html5player_component_364 html5player_component_364-Uniform">
                                                            均匀</option>
                                                        <option id="html5player_component_364-Dropshadow"
                                                            value="dropshadow"
                                                            aria-labelledby="html5player_component_364 html5player_component_364-Dropshadow">
                                                            下阴影</option>
                                                    </select>
                                                </fieldset>
                                                <fieldset class="vjs-font-family vjs-track-setting">
                                                    <legend id="captions-font-family-html5player_component_364"
                                                        class="">字体库</legend><select
                                                        aria-labelledby="captions-font-family-html5player_component_364">
                                                        <option
                                                            id="captions-font-family-html5player_component_364-ProportionalSansSerif"
                                                            value="proportionalSansSerif"
                                                            aria-labelledby="captions-font-family-html5player_component_364 captions-font-family-html5player_component_364-ProportionalSansSerif">
                                                            比例无细体</option>
                                                        <option
                                                            id="captions-font-family-html5player_component_364-MonospaceSansSerif"
                                                            value="monospaceSansSerif"
                                                            aria-labelledby="captions-font-family-html5player_component_364 captions-font-family-html5player_component_364-MonospaceSansSerif">
                                                            单间隔无细体</option>
                                                        <option
                                                            id="captions-font-family-html5player_component_364-ProportionalSerif"
                                                            value="proportionalSerif"
                                                            aria-labelledby="captions-font-family-html5player_component_364 captions-font-family-html5player_component_364-ProportionalSerif">
                                                            比例细体</option>
                                                        <option
                                                            id="captions-font-family-html5player_component_364-MonospaceSerif"
                                                            value="monospaceSerif"
                                                            aria-labelledby="captions-font-family-html5player_component_364 captions-font-family-html5player_component_364-MonospaceSerif">
                                                            单间隔细体</option>
                                                        <option
                                                            id="captions-font-family-html5player_component_364-Casual"
                                                            value="casual"
                                                            aria-labelledby="captions-font-family-html5player_component_364 captions-font-family-html5player_component_364-Casual">
                                                            舒适</option>
                                                        <option
                                                            id="captions-font-family-html5player_component_364-Script"
                                                            value="script"
                                                            aria-labelledby="captions-font-family-html5player_component_364 captions-font-family-html5player_component_364-Script">
                                                            手写体</option>
                                                        <option
                                                            id="captions-font-family-html5player_component_364-SmallCaps"
                                                            value="small-caps"
                                                            aria-labelledby="captions-font-family-html5player_component_364 captions-font-family-html5player_component_364-SmallCaps">
                                                            小型大写字体</option>
                                                    </select>
                                                </fieldset>
                                            </div>
                                            <div class="vjs-track-settings-controls"><button class="vjs-default-button"
                                                    title="恢复全部设定至预设值">重启<span class="vjs-control-text">
                                                        恢复全部设定至预设值</span></button><button
                                                    class="vjs-done-button">完成</button></div>
                                        </div><button class="vjs-close-button vjs-control vjs-button" type="button"
                                            aria-disabled="false" title="关闭弹窗"><span aria-hidden="true"
                                                class="vjs-icon-placeholder"></span><span class="vjs-control-text"
                                                aria-live="polite">关闭弹窗</span></button>
                                        <p class="vjs-control-text">结束对话视窗</p>
                                    </div> -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="mgCard_con fr">
                    <!-- 分享生成二维码 -->
                    <!-- <div class="card_share fr">
                        <span class="card_share_name">分享：</span>
                        <span class="card_share_post" style="cursor: pointer" onclick="getPoster()"><i
                                class="tips">生成海报</i></span>
                        <span class="card_share_code" onclick="getQrCode()"><i class="tips">生成二维码</i></span>
                    </div> -->
                    <dl class="mgCard_deta">
                        <dt>
                            <h2 class="mgCard_h2" title="装饰工程计量与计价">{{ course.data.courseName }}</h2>
                        </dt>
                        <dd class="teacher">{{$t('user.coursePage.lecturer')}}：{{ course.data.teacherName }}/{{ course.data.teacherSchool }}</dd>
    
                        <!-- <dd>期次：
                            <span class="mgCard_dijiqi">
                                <a class="mgCard_dijiqi_name" style="cursor: pointer">
                                    第3期
                                </a>
                                <span class="mgCard_dijiqi_con" style="display: none;">

                                    <a href="https://xueyinonline.com/detail/224993955">第1期</a>

                                    <a href="https://xueyinonline.com/detail/227040760">第2期</a>

                                    <a href="https://xueyinonline.com/detail/228416117">第3期</a>
                                </span>
                            </span>
                        </dd> -->
                        <!-- <iframe src="/video.mp4" width="100%" height="100%" border="0"></iframe> -->
                        <dd>{{$t('user.coursePage.startAndEndDate')}}：{{course.data.startDate}} - {{ course.data.endDate }}</dd>
                        <dd>{{$t('user.coursePage.teachinProgress')}}：
                            <span class="mgCard_state">
                                <!-- <a>预报名</a> -->
                                <a class="current">{{$t('user.coursePage.teachinProgress')}}</a>
                                <a>{{$t('user.coursePage.teachinProgress')}}</a>
                            </span>
                        </dd>
                        <dd>{{$t('user.coursePage.classHours')}}：{{ course.data.classHours }}{{$t('user.coursePage.classHours')}}</dd>
                        <dd style="color:firebrick">{{$t('user.coursePage.coursCategory')}}：{{ course.data.memberTab==0?this.$t('user.coursePage.freeCourse'):this.$t('user.coursePage.memberCourse')}}</dd>
                    </dl>
                    <div class="kechengIntr">
                        <div class="kechengIntr_con">{{$t('user.coursePage.courseIntroduction')}}： {{ course.data.courseIntroduction}}</div>
                        <a class="moreIntr fr" href="https://xueyinonline.com/detail/228416117#"></a>
                    </div>
                </div>
            </div>
            <div class="service">
                <!-- <dl class="service_dl fl">
                    <dt class="colorBlue" id="_viewTimes">503415</dt>
                    <dd>累计页面浏览量</dd>
                </dl> -->
                <dl class="service_dl fl">
                    <dt class="colorRed" id="_chooseCourseCount">{{ course.data.learnNumber }}</dt>
                    <dd>{{$t('user.coursePage.totalNumberOfCoursesSelected')}}</dd>
                </dl>
                <!-- <dl class="service_dl fl">
                    <dt class="colorYellow" id="_bbsAllCount">6747</dt>
                    <dd>累计互动次数</dd>
                </dl> -->
                <div class="service_bnt">
                    <a class="xsbntLiner" id="joinCourseBtn" href="javascript:void(0)" @click="joinCourse()" style="display:block">{{ $t('user.coursePage.joinCourse') }}</a>
                    <a class="xsbntLiner" id="withdrawalCourseBtn" href="javascript:void(0)" @click="withdrawalCourse()" style="display:none">{{ $t('user.coursePage.exitCourse') }}</a>
                </div>
            </div>
        </div>
        <!-- 下部分模块 -->
        <div class="mgCard_container">
            <!-- 导航栏 -->
            <div class="mgCard_tab mgCard_blue">
                <ul class="mgCard_tabName">
                    <li class="current" id="li_introduce" name="moduleBtn">{{ $t('user.coursePage.courseIntroduction') }}<span class="line"></span></li>
                    <li id="li_knowledge-catalog" class="" name="moduleBtn">{{ $t('user.coursePage.coursChapter') }}<span class="line"></span><span
                            class="mgCard_shidu"></span></li>
                    <li id="li_coursebbs" class="" name="moduleBtn">{{ $t('user.coursePage.comment') }}<span class="line"></span></li>
                    <li id="li_courseEvaluate" class="" name="moduleBtn">{{ $t('user.coursePage.curriculumEvaluation') }}<span class="line"></span></li>
                    <!-- <li class="">常见问题<span class="line"></span></li> -->
                </ul>
            </div>
            <!-- 显示模块 -->
            <div class="mgCard_tabCon">
                <div class="kc_intro" style="display: block;" name="displayModuel">
                    <link rel="stylesheet" type="text/css" href="">
                    <div>
                        <div class="maskBg" style="display:none">
                            <div class="imgPop"><img id="previewImg" src="https://xueyinonline.com/detail/228416117">
                            </div>
                            <div class="bomDiv">
                                <a href="javascript:;" class="jb" onclick="reportImg()" title="举报"></a>
                                <a href="javascript:;" class="close" title="关闭"></a>
                            </div>
                        </div>

                    </div>
                    <!-- 课程简介（文字叙述） -->
                    <div class="kc_intro_item">
                        <h2 class="kc_intro_h2">
                            {{ $t('user.coursePage.mes1') }}
                        </h2>
                        <div class="kc_intro_text ans-cc">
                            <p><span style="text-indent: 36px; "></span><span style="text-indent: 36px; ">&nbsp;{{ course.data.courseIntroduction }}</span></p>
                        </div>
                    </div>
                    <!-- <div class="kc_intro_item">
                        <h2 class="kc_intro_h2">你将收获什么？</h2>
                        <div class="kc_intro_text ans-cc">
                            <p>&nbsp;本课程引进企业典型工程项目，重构教学内容，任务驱动，使学生明确学什么、为什么学、学了做什么，从而调动学习主动性，增加学习的趣味性。通过本课程的学习，学生将掌握装饰工程造价理论知识、熟悉造价工作业务流程、熟练BIM软件定额套用、换算，清单计价等技能应用、获得造价员岗位初级技能。
                                同时提升职业认同感，树立专业自信；培养细致认真、精益求精的工匠精神；造就学科学、爱科学、用科学，为造价行业赋能的能力。</p>
                            <p><br style="white-space: normal;"></p>
                            <p><br></p>
                        </div>
                    </div>
                    <div class="kc_intro_item">
                        <h2 class="kc_intro_h2">适合什么人学习？</h2>
                        <div class="kc_intro_text ans-cc">
                            <p>本课程广泛适用于建筑类高职高专工程造价专业、建筑装饰技术专业、建筑工程管理专业的教学和自学；适用于施工企业造价人员、房地产企业成本控制人员、工程咨询企业审计人员以及个体家装从业者。
                            </p>
                            <p><br style="white-space: normal;"></p>
                            <p><br></p>
                        </div>
                    </div> -->

                    <!-- 师资团队 -->
                    <!-- <div class="kc_intro_item">
                        <h2 class="kc_intro_h2">师资团队</h2>
                        <ul class="mkTeam_list">
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/30eb3a64a03565237158b29b9f508d12" class="headPicture">
                                </div>

                                <dl>
                                    <dt>侯娟娟 讲师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">
                                            <p> </p>
                                            <p></p>
                                            <p></p>
                                            <p>主讲系东营建设工程造价专家库首批专家、国家一级注册造价工程师、山东省二级建造师（建筑和市政双专业）。先后在大明集团建设公司从事造价员工作5年多，山东中联工程造价咨询有限公司从事审计工作约1年，在教师岗位从事一线教学工作6年多，为双师型教师，主讲工程造价类课程。
                                            </p>
                                            <p></p>
                                            <p></p>
                                            <p>
                                            </p>
                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/51b688dbc230b63c315aadbe7abfca5d" class="headPicture">
                                </div>

                                <dl>
                                    <dt>王树军 讲师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">
                                            <p> </p>
                                            <p><span
                                                    style="box-sizing: border-box; color: rgb(24, 30, 51); text-indent: 2em; font-family: &quot;Times New Roman&quot;; font-size: 14px;">1995</span><span
                                                    style="box-sizing: border-box; color: rgb(24, 30, 51); font-family: 宋体; text-indent: 2em; font-size: 14px;">年毕业于沈阳建筑工程学院工程造价专业，工程硕士，建筑经济师，讲师，一级造价工程师，监理工程师，招标师，现主要从事工程造价、工程管理类教学，工程造价与管理教研室主任，专业带头人，省建设工程评标专家，省政府采购评标专家，市建设工程首批造价专家，市人大常委会预算审查监督专家，先后多次主讲了项目经理和继续教育培训，施工企业八大员培训，安全员培训，造价员培训等专业岗位培训，具有丰富的建筑专业知识和教学经验。</span><br>
                                            </p>
                                            <p>
                                            </p>
                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/021cad9edced715c17324726a2fd9a0d" class="headPicture">
                                </div>

                                <dl>
                                    <dt>王妍娉 讲师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">
                                            <p>讲师，山东省二级建造师（水利专业），先后在青岛建筑设计院东营分院，正泰房地产公司，北京维拓时代建筑设计有限公司东营分公司从事造价咨询工作近10年，在教师岗位从事一线教学工作5年多，为双师型教师，主讲工程造价类课程。
                                            </p>
                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/234945f9f6f067d2d628317e43177d6d" class="headPicture">
                                </div>

                                <dl>
                                    <dt>王康 讲师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">
                                            <p> </p>
                                            <p>2007年毕业于中国石油大学（华东）管理科学与工程专业，讲师，中级建筑经济师，现从事工程造价与工程管理专业教学工作。主要教授课程《装饰工程计量与计价》、《造价软件应用》、《建筑设备工程》等。
                                            </p>
                                            <p>
                                            </p>
                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/8d587424c3c783bea2df07fd17240a92" class="headPicture">
                                </div>

                                <dl>
                                    <dt>郭霞 助理 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">
                                            <p>2015年毕业于中国石油大学（华东），助理讲师，现从事工程造价与工程管理专业教学工作。主要教授课程《装饰工程计量与计价》、《造价软件应用》、《建筑材料》等。现为1+X工程造价数字化应用职业技能等级证书的考点负责人。<br>
                                            </p>
                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/9dfff9903f6f2fa58ef13931401932e6.png"
                                        class="headPicture">
                                </div>

                                <dl>
                                    <dt>燕孝农 讲师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">
                                            <p><span
                                                    style="text-indent: 2em;">燕孝农，中共党员，工程硕士，讲师，高级计算机辅导设计师、创业指导教师。2018年获山东省教师教学能力大赛一等奖，2018年全国教学能力大赛三等奖，2019年获山东省教师教学能力大赛二等奖。主持东营职业学院课程思政示范课程1门、精品资源课程1门、参与主持教学改革项目6项。获优秀共产党员、优秀教育工作者、文明校园建设先进个等称号。</span>
                                            </p>
                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/7ee848fbfd2942393d790371469de423.jpg"
                                        class="headPicture">
                                </div>

                                <dl>
                                    <dt>周婷婷 讲师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">
                                            <p>从事建筑技术专业教学多年，BIM技术课程负责人，拥有一级建造师、BIM建模师等证书，多次指导学生比赛获奖，参加教学能力大赛获省级校级奖项，多次参与课题、讲义编写。
                                            </p>
                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/4389098ffe416cdd2971d595b2589307.JPG"
                                        class="headPicture">
                                </div>

                                <dl>
                                    <dt>冯雪 讲师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">
                                            <p>从事工程造价专业教学五年，有二级建造师职业证书，多次指导学生职业技能比赛获奖，教学经验丰富，2019-2021年参加高职院校教师教学能力比赛获得多项省级、校级奖项，曾多次参与课题编写、课程建设、教材编写等工作。
                                            </p>
                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/b50003696cd0943e7a2f7edf816df56e.jpg"
                                        class="headPicture">
                                </div>

                                <dl>
                                    <dt>郭晓卓 讲师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">
                                            <p> </p>
                                            <p>多年课程平台运营经验、提供技术支持，在指导课程建设方面获得了一系列荣誉。</p>
                                            <p>
                                            </p>
                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/img_person.png" class="headPicture">
                                </div>

                                <dl>
                                    <dt>王树军 教师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">

                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/img_person.png" class="headPicture">
                                </div>

                                <dl>
                                    <dt>王妍娉 教师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">

                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/img_person.png" class="headPicture">
                                </div>

                                <dl>
                                    <dt>王康 教师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">

                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/img_person.png" class="headPicture">
                                </div>

                                <dl>
                                    <dt>郭霞 教师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">

                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/img_person.png" class="headPicture">
                                </div>

                                <dl>
                                    <dt>teacher-12 教师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">

                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/img_person.png" class="headPicture">
                                </div>

                                <dl>
                                    <dt>冯雪 教师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">

                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/img_person.png" class="headPicture">
                                </div>

                                <dl>
                                    <dt>周婷婷 教师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">

                                        </div>
                                    </dd>
                                </dl>
                            </li>
                            <li>
                                <div class="ans-cc">
                                    <img src="./装饰工程计量与计价_files/img_person.png" class="headPicture">
                                </div>

                                <dl>
                                    <dt>郭晓卓 教师 / 东营职业学院</dt>
                                    <dd>
                                        <div class="ans-cc">

                                        </div>
                                    </dd>
                                </dl>
                            </li>
                        </ul>
                    </div> -->
                </div>
                <div class="mkCata" style="display: none;" name="displayModuel">
                    <div class="mkCata">
                        <div class="mkCata_item" v-for="(value,index) in courseChapters.data" :key="index">
                            <h2 class="mkCata_name">{{ $t('user.editCourse.unit')+''+(index+1) }}</h2>
                            <ul class="mkCata_list" v-for="(subValue,subIndex) in value.subChapter" :key="subIndex">
                                <li class="tryingRead">
                                    <span class="mkCata_ico"></span>
                                    <!-- <a :href="'/#/chapterPage/'+course.data.courseNumber+'/'+(index+1)+'.'+(subIndex+1)">
                                        {{ index+1 }}.{{ subIndex+1 }}
                                        {{ subValue.title }}
                                    </a> -->
                                    <a href="javascript:void(0)" @click="chapterContent('/chapterPage/'+course.data.courseNumber+'/'+(index+1)+'.'+(subIndex+1))">
                                        {{ index+1 }}.{{ subIndex+1 }}
                                        {{ subValue.title }}
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="mkpt" style="display: none;" name="displayModuel">
                    <input type="hidden" id="isTeamTeacher" value="false">
                    <input type="hidden" id="isClazzPerson" value="false">
                    <input type="hidden" id="openc" value="">
                    <input type="hidden" id="jinkeType" value="0">
                    <input type="hidden" id="person_login" value="false">

                    <div class="mkpt_search">
                        <div class="mkpt_form">
                            <textarea class="mkpt_area fl" :placeholder="this.$t('user.coursePage.curriculumEvaluation')" id="askTopic"></textarea>
                            <input type="button" name="button" :value="this.$t('user.coursePage.askQuestions')" class="mkpt_bnt bgBlue fr"
                                @click="replyTopic(that.$route.params.courseNumber,that,0,myMes.data.userAccountNumber)">
                        </div>
                    </div>
                    <!-- 评论模块 -->
                    <div class="mkpt_con">
                        <ul class="mkpt_list" id="topicAll">
                            <li v-for="(value,index) in courseComments.data" :key="index" class="mkpt_row">
                                <img :src="'/api/images/'+value.mainCommentUserMes.imagePath">
                                <!-- <img src="./装饰工程计量与计价_files/a56626a15a1c2cc92d0b0972e3d086ba"> -->
                                <div class="mkpt_text">
                                    <div class="mkpt_right fr">
                                        <a class="kc_myHuida" href="javascript:"
                                            @click="viewReply('topic_replydiv'+value.mainComment.subId)">{{ $t('user.coursePage.wantAnswer') }}</a>
                                        <!-- <span class="kc_myZan" href="javascript:void(0)"
                                            onclick="parseOrCancel(&#39;445252756&#39;,1)"
                                            id="isPraise_445252756">3</span> -->
                                    </div>
                                    <div class="mkpt_student">
                                        <span class="spanName">{{ value.mainCommentUserMes.email }}</span>
                                        <span class="spanTime">{{ value.mainComment.createTime }}</span>
                                    </div>
                                    <!-- 提问 -->
                                    <div class="mkpt_ask">
                                        <h3 class="mkpt_ask_name">{{$t('user.editCourse.askQuestions')+'：'+value.mainComment.content }}</h3>
                                    </div>
                                    <div class="mkpt_answer" v-if="value.subComment.length!=0">
                                        <dl class="mkAnswer_box" v-for="(subValue,subIndex) in value.subComment" :key="subIndex">
                                            <dt>
                                                <span class="colorBlue fontWeight">{{ value.subCommentUserMes[subIndex].email }}：</span>
                                                {{ subValue.content }}
                                            </dt>
                                        </dl>
                                        <!-- <a class="mkAnswer_bnt fontWeight" href="javascript:void(0)"
                                            onclick="toBBs(&#39;228416117&#39;,&#39;445252756&#39;,&#39;63026763&#39;)">查看全部(共{{value.subComment.length}}条)
                                        </a> -->
                                    </div>

                                    <div class="mkpt_huida" :id="'topic_replydiv'+value.mainComment.subId" style="display:none;">
                                        <div class="mkpt_form">
                                            <textarea class="mkpt_area fl" placeholder="写下您的回答..."
                                                :id="'replyContents_'+value.mainComment.subId"></textarea>
                                            <input type="button" name="button" value="回复" class="mkpt_bnt bgBlue fr"
                                                @click="replyTopic(value.mainComment.subId,that,1,myMes.data.userAccountNumber)">
                                        </div>
                                    </div>

                                </div>
                            </li>

                            <p align="center">
                                <!-- <button onclick="newGetMoreTopic(&#39;228416117&#39;,&#39;63026763&#39;,&#39;69a1d2e37b888ff0eebb7c54c6cb6cf7&#39;)"
                                    id="getMoreTopic" class="moreBtn">查看更多</button> -->
                            </p>
                            <input type="hidden" id="firstquerynottoptopic" value="true">
                            <input type="hidden" id="lasttoptopicvalue" value="0">
                            <input type="hidden" id="lastnottoptopicvalue" value="0">
                        </ul>
                    </div>
                </div>
                <div class="mkEval" style="display: none;" name="displayModuel" onclick="getEvaluate()">
                    <input type="hidden"
                        id="isTeamTeacher" value="">
                    <input type="hidden" id="isClazzPerson" value="">
                    <input type="hidden" id="openc" value="">
                    <input type="hidden" id="jinkeType" value="">
                    <input type="hidden" id="person_login" value="false">
                    <!-- <a class="big_mypl fr" href="https://mooc1.xueyinonline.com/coursestar?courseId=227039651&amp;clazzId=59900316&amp;edit=false">我要评价</a> -->
                    <div class="mkEval_big">
                        <span class="big_name">{{ $t('user.coursePage.coursGrading') }}</span><span class="big_num"> 0.0</span>
                        <!-- 评分星星 -->
                        <!-- <span class="big_xing ss0"></span> -->
                        <span class="big_text">{{$t('user.coursePage.commentMes1')}}0{{$t('user.coursePage.commentMes2')}}</span>
                    </div>
                    <div class="mkEval_con">
                        <ul class="mkEval_ul" id="mkEvaluateUl">
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="temp" style="display: block">
        </div>
    </div>
  </div>
</template>

<script>
import coursePageJs from "@/assets/style/js/coursePageVue.js"
import axios from 'axios'
export default {
    name: 'coursePage',
    data(){
        return{
            that: this,
            course:{
                data:{
                    classHours:'',
                    commentsNumber:'',
                    courseIntroduction:'',
                    courseName:'',
                    courseNumber:'',
                    endDate:'',
                    imagePath:'',
                    learnNumber:'' ,
                    startDate:'',
                    state:'',
                    teacherAccountNumber:'',
                    teacherName:'',
                    teacherSchool:'',
                }
            },
            courseComments:{
                data:[]
            },
            courseChapters:{
                data:[]
            }
        }
    },
    props:['myMes'],
    methods:{
        resetLang: function(){
            this.$i18n.locale=='en'?this.$i18n.locale='zh':this.$i18n.locale='en'
        },
        pageInitialization: async function(callback){
            // 数据初始化
            await coursePageJs.pageInitialization(this.that).then(course=>{
                this.course = course[0]
                this.courseComments = course[1]
                this.courseChapters = course[2]
                callback(course)
            })
            this.isSelect()
        },
        viewReply: function(topic_replydiv){
            let replydiv = document.getElementById(topic_replydiv)
            replydiv.style.display=="none"?replydiv.style.display="block":replydiv.style.display="none"
        },
        // 评论上传
        replyTopic: function(sub_id,that,type,userAccountNumber){
            coursePageJs.replyTopic(sub_id,that,type,userAccountNumber)
        },
        pageInitializationStart: function(){
            let _this = this
            this.pageInitialization(function(arr){
            _this.$nextTick(()=>{
                console.log(arr)
            })
            })
            coursePageJs.moduleBtnClick(this.that)
            // setTimeout(()=>{this.isSelect()},20)
        },
        joinCourse: function(){
            if(this.myMes.data.email==null){
                alert("请先登录")
                 return
            }
            if(this.course.data.memberTab==1){
                // 会员课程
                if(this.myMes.data.memberTab==0){
                    alert('此课程为会员课程，您还不是会员')
                    return
                }
            }
            axios.get('/joinCourse?courseNumber='+this.course.data.courseNumber+'&userEmail='+this.myMes.data.userAccountNumber)
                .then(res=>{
                    console.log(res)
                    this.pageInitializationStart()
                }).catch(err=>{
                    alert(err)
                })
        },
        withdrawalCourse: function(){
            axios.get('/withdrawalCourse?courseNumber='+this.course.data.courseNumber+'&userEmail='+this.myMes.data.userAccountNumber)
                .then(res=>{
                    console.log(res)
                    this.pageInitializationStart()
                }).catch(err=>{
                    alert(err)
                })
        },
        // 判断是否已经选此课
        isSelect: function(){
            if(this.myMes.data.email==null){
                alert("请先登录")
                 return
            }
            if(this.course.data.memberTab==1){
                // 会员课程
                if(this.myMes.data.memberTab==0){
                    alert('此课程为会员课程，您还不是会员')
                    return
                }
            }
            axios.get('/isSelect?courseNumber='+this.course.data.courseNumber+'&userEmail='+this.myMes.data.userAccountNumber)
                .then(res=>{
                    if(res.data==true){
                        document.getElementById('withdrawalCourseBtn').style.display='block'
                        document.getElementById('joinCourseBtn').style.display='none'
                    }else{
                        document.getElementById('withdrawalCourseBtn').style.display='none'
                        document.getElementById('joinCourseBtn').style.display='block'
                    }
                }).catch(err=>{
                    alert(err)
                })
        },
        chapterContent: function(chapterPath){
            if(this.myMes.data.email==null){
                alert("请先登录")
                 return
            }
            axios.get('/isSelect?courseNumber='+this.course.data.courseNumber+'&userEmail='+this.myMes.data.userAccountNumber)
                .then(res=>{
                    if (res.data == true) {
                        let routeUrl = this.$router.resolve({
                            path: chapterPath,
                            // query: {
                            //     companyName: '课件'
                            // }
                        })
                        // this.$router.push(chapterPath)
                        window.open(routeUrl.href,'_blank')
                    }else{
                        alert("请先加入课程后观看章节内容")
                    }
                })
        }
    },
    mounted(){
        this.pageInitializationStart()
    }
}
</script>

<style>
@import '../assets/style/css/coursePage.css'
</style>