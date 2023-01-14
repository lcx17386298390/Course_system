// 带有公共头
<template>
    <div id="home">
      <Head/>
      <router-view v-bind:myMes="myMes"></router-view>
    </div>
</template>
  
<script>
  import Head from '../components/Head'
  import homeJs from '@/assets/style/js/homeVue.js'
  export default {
      name: 'HomeTest',
      components:{
          Head,
      },
      data(){
        return{
            myMes:{
              data:{
                imagePath: "",
                introduction: "",
                name:"",
                phone:"",
                position:"",
                school:"",
                type:1,
                userPaw:""
              }
            }
        }
    },
    methods:{
      getMes: function(callback){
        homeJs.getMyMes().then(res=>{
          this.myMes = res
          callback(res)
        })
      }
    },
    mounted(){
      let _this = this
      // 加载信息
      this.getMes(function(arr){
          _this.$nextTick(() => {
          console.log(arr)
          })
      })
    }
  }
</script>
<style>
</style>
