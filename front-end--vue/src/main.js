import Vue from 'vue'
import App from './App.vue'
import Router from './router/index.js'
import VueRouter from 'vue-router'
import axios from 'axios'
import { ajaxPrefilter } from 'jquery'
import i18n from './i18n/i18n'

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
  i18n
}).$mount('#app')