<template>
    <h1>我是老师</h1>
</template>

<script>
import $ from 'jquery'
export default {
    name: "teacherTest",
    created:function(){
        console.log(this.$route.query.mes)
    }
}
</script>

<style>

</style>