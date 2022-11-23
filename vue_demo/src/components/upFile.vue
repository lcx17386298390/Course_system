<template>
    <div>

        <!-- 文件上传测试 -->
        <form method="post" action="/upload" enctype="multipart/form-data">
            <input type="file" name="file" multiple><br>
            课程名称：<input type="text" name="courseName"><br>
            
            <!-- 姓名、学校这个模块暂不更改，完善后直接从账号信息获取 -->
            开课老师姓名：<input type="text" name="teacherName"><br>
            开课老师学校：<input type="text" name="teacherSchool"><br>
            <input type="submit" value="提交">
        </form>

        <!-- 登录测试 -->
        <!-- <form method="get" action="/login">
            <input type="text" name="userName"><br>
            <input type="text" name="userPaw"><br>
            <input type="submit" value="提交">
        </form> -->
    </div>
</template>

<script>
export default {
    name:"upFileTest"
}
</script>

<style>

</style>