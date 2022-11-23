<template>
  <div>
    <h1>我是学生</h1>
    <button @click="testFun">电我</button>
  </div>
</template>

<script>
export default {
    name:'StudentTest',
    methods:{
      testFun:function(){
        this.$router.push({
          path: '/teacher',
          query: {mes:"老师好"}
        })
      }
    }
}
</script>

<style>

</style>