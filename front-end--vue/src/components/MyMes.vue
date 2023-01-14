<template>
  <div>
    <h1>我的信息</h1>
    <h1>{{ myMes.data }}</h1>
  </div>
</template>

<script>
import myMesJs from "../assets/style/js/myMesVue.js"
export default {
    name: "MyMes",
    data(){
      return{
      }
    },
    props:['myMes'],
    methods:{
    },
    mounted(){
    }
}
</script>

<style>

</style>