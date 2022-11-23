<template>
  <div>
    <form method="get" action="tttt">
        <div style="display:none">
            <input type="text" value="隐藏元素1" name="11"><br>
            <input type="text" value="隐藏元素2" name="22"><br>
        </div>
        <div>
            <textarea name="简介"></textarea>
            <input type="hidden" value="hidden" name="type">
            <input type="text" value="显示元素1" name="33"><br>
        </div>
        <input type="submit" value="提交"><br>
    </form>
  </div>
</template>

<script>
export default {
    name: 'testTest',
}
</script>

<style>

</style>