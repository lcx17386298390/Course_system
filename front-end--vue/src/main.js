import Vue from 'vue'
import App from './App.vue'
import Router from './router/index.js'
import VueRouter from 'vue-router'
import axios from 'axios'
import { ajaxPrefilter } from 'jquery'
// import { VueI18n } from 'vue-i18n'

// Vue.use(VueI18n)

// const i18n=new VueI18n({
//   locale:localStorage.getItem('languageSet')||'zh',   //从localStorage里获取用户中英文选择，没有则默认中文
//   messages:{
//       'zh':require('./components/language/zh'),
//       'en':require('./components/language/en')
//   }
// })

// import $ from 'jquery'

// window.jQuery= $;
// window.$=$;

axios.defaults.baseURL = 'http://localhost:8443'
axios.defaults.withCredentials = true

// cookie跨域配置
Vue.prototype.$axios = axios

Vue.config.productionTip = false
Vue.use(VueRouter)

//全局挂在axios
Vue.prototype.$axios = axios
new Vue({
  axios,
  render: h => h(App),
  router: Router,
  // i18n
}).$mount('#app')