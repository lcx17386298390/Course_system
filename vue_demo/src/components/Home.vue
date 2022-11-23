// 带有公共头
<template>
    <div id="home">
      <Head/>
      <router-view></router-view>
    </div>
</template>
  
  <script>
    import Head from '../components/Head'
    export default {
        name: 'HomeTest',
        components:{
            Head,
        }
    }
  </script>
  <style>
  </style>
  