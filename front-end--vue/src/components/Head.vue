<template>
  <div style="zoom:1">
    <div class="qHeader">
      <div class="head">
        <!-- 功能列表 -->
        <a class="qLogo fl" href="/" target="_parent"></a>
        <ul class="funList fl" style="backgroud-color:red">
          <li><router-link to="/courseList">课程</router-link></li>
          <li><a href="/">网站公告</a></li>
          <li><a href="/">合作单位</a></li>
          <li><a href="/">关于我们</a></li>
        </ul>
        <div class="qLogin fr">
          <div class="qLogin_before" style="display:block">
            <img src="../assets/style/image/login.png">
            <!-- <a class="login" target="_top" href="/login">登录</a>             -->
            <router-link class="login" to="/login">登录</router-link>
            <span> | </span>
            <!-- <a class="regist" target="_top" href="/#">注册</a> -->
            <router-link class="regist" to="/register">注册</router-link>
          </div>
          <div class="qLogin_after" style="display:none">
            <router-link to="/mine/myMes" id="tospace">
              <img :src="loginSuccessMes.data.headImage">
            </router-link>
            <a href="#" id="logout" target="_top" @click="loginOut">退出</a>
          </div>
        </div>
        <div class="qSearch fr" style="backgroud-color:yellow">
          <input type="text" name="text" value class="qSearch_input fl" placeholder="搜索课程名、老师名或学校全称" id="searchWorld"
            autocomplete="off">
          <input type="button" name="button" value class="qSearch_btn" id="search">
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import headJs from '@/assets/style/js/headVue'
export default {
  name: "HeadTest",
  data() {
    return {
      // 状态查询api返回的数据
      loginSuccessMes: {
        data: {
          state: '',
          loginUser: '',
          headImage: '',
          userType: ''
        }
      }
    }
  },
  methods: {
    mesUpdata: function (callback) {
      headJs.headAccess().then(res => {
        this.loginSuccessMes = res
        callback(res)
      })
    },
    loginOut: async function(){
      await headJs.loginOut()
      location.reload()
    }
  },
  mounted() {
    let _this = this
    this.mesUpdata(function (arr) {
      _this.$nextTick(() => {
        headJs.loginJudge(arr.data)
        console.log(arr.data)
      })
    })

  }

};
</script>

<style>
@import "../assets/style/css/head.css"
</style>