import Vue from 'vue'
import i18n from 'vue-i18n'
Vue.use(i18n)

import zh from './config/zh.js'  //中文
import en from './config/en.js'	//英文


// 自动设置多语言 默认选择浏览器系统语言
// const navLang       = navigator.language;    //判断当前浏览器使用的语言
// const localLang     = (navLang === 'zh' || navLang === 'en') ? navLang : false;
// let lang = localStorage.getItem('language') || localLang || 'en';    //如果有缓存，取缓存的语言

/*---------使用语言包-----------*/
const vueI18n = new i18n({
    // locale: 'zh', //语言标识
    locale: localStorage.getItem('lang')||'zh',
    messages: {  //使用语言包
        'zh': zh,
        'en':en
    },
      // 语言切换
    // handleCommand(command) {
    //     if (command == "ZH") {
    //     this.$i18n.locale = "zh";
    //     localStorage.setItem('lang',"zh")
    //     //  console.log(this.$i18n)
    //     } else if (command == "FT") {
    //     this.$i18n.locale = "ft";
    //         localStorage.setItem('lang',"ft")
    //     // console.log(2)
    //     } else if (command == "EN") {
    //     // console.log(3)
    //     this.$i18n.locale = "en";
    //         localStorage.setItem('lang',"en")
    //     }
    // },
    //localeStorage中没有值得时候，默认语言‘zh’
    silentFallbackWarn: true //仅在根本没有可用的转换时生成警告，而不是在回退时
})

// localStorage.setItem('language',lang);    //最后缓存当前使用的语言

export default vueI18n; //导出
