<template>
    <div class="qFooter" style="min-width:1280px">
        <p class="foot_gywm">
            <a target="_parent" @click="changeVersion();" style="text-decoration: none;" href="javascript:">{{ $t('language.name') }}</a><span>丨</span>
            <a target="_parent" href="javascript:" style="text-decoration: none;">{{ $t('user.aboutUs') }}</a><span>丨</span>
            <a style="text-decoration: none;" target="_parent" href="javascript:">{{ $t('user.contactUs') }}</a><span>丨</span>
            <a style="text-decoration: none;" target="_parent" href="javascript:">{{ $t('user.privacyPolicy') }}</a>
        </p>
        <p>xxxxxxxxxxxxxxxxx（公司详情）</p>
        <p><a style="color: #c2c2c2;text-decoration: none;" target="_blank" href="">xxxxxxxxxx公安备号</a></p>
        <p><a style="color: #c2c2c2;text-decoration: none;" target="_blank" href="">xxxxxxxxxx公安备号</a></p>
        <div class="qfoot_logo">
            <span class="qfoot_span"><img src="">合作方1</span>
            <span class="qfoot_span"><img src="">合作方2</span>
        </div>
    </div>
</template>
<script>
export default {
    name: 'TailTest',
    methods:{
        changeVersion: function(){
            this.$i18n.locale == 'en'? this.$i18n.locale ='zh': this.$i18n.locale ='en'
        }
    }
}
</script>
<style>
@import '../assets/style/css/tail.css';
</style>