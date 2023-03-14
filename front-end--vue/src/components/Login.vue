<template>
    <div class="body">
        <div class="lg-container">
            <!--登录 start -->
            <div class="main default-login-main">
                <!--默认登录 start-->
                <div class="default-login">
                    <div class="lg-top fs14">
                        <!-- <a href="https://passport2.xueyinonline.com/v5/toCustomer" target="_blank" class="service col-lightblue">客服</a> -->
                    </div>
                    <div class="left login-tab-box" style="position:relative;">
                        <!--<h3 class="lg-title">登录</h3>-->
                        <div class="tab-head">
                            <a href="javascript:void(0);" class="tab-t current" index="1">{{ $t('user.loginMes') }}</a>
                            <!-- <a href="javascript:void(0);" class="tab-t" index="2">  机构账号登录</a> -->
                        </div>
                        <input type="hidden" id="needVcode" name="needVcode" value="">
                        <input type="hidden" id="fid" name="fid" value="-1">
                        <input type="hidden" id="pid" name="pid" value="-1">
                        <input type="hidden" id="refer" name="refer" value="https%3A%2F%2Fwww.xueyinonline.com%2F">
                        <input type="hidden" id="startFid" name="startFid" value="-1">
                        <!--初始fid-->
                        <input type="hidden" id="fidName" name="fidName" value="">
                        <input type="hidden" name="productid" id="productid" value="">
                        <input type="hidden" name="orgfirst" id="orgfirst" value="0">
                        <input type="hidden" name="shownotice" id="shownotice" value="1">
                        <input type="hidden" id="showthird" value="0">
                        <input type="hidden" id="t" name="t" value="true">
                        <input type="hidden" id="ebook" name="ebook" value="0">
                        <input type="hidden" id="hidecompletephone" name="hidecompletephone" value="0">
                        <input type="hidden" id="doubleFactorLogin" name="doubleFactorLogin" value="0">
                        <input type="hidden" id="independentId" name="independentId" value="0">
                        <div class="tab-body">
                            <div class="tab-list" style="display: block;">
                                <!-- <form
                                    action="https://passport2.xueyinonline.com/login?loginType=4&amp;fid=&amp;newversion=true&amp;refer=https%3A%2F%2Fwww.xueyinonline.com%2F"> -->
                                <form>
                                    <!--电话号码-->
                                    <div class="lg-item icon-tel margin-btm24">
                                        <input type="text" class="ipt-tel" :placeholder="this.$t('user.email')" id="phone" maxlength="50"
                                            name="userName" v-model="username">
                                        <p class="err-txt" id="phoneMsg"></p>
                                    </div>
                                    <!--密码-->
                                    <div class="lg-item item-pwd icon-pwd">
                                        <input type="password" class="ipt-pwd" :placeholder="this.$t('user.password')" id="pwd" maxlength="20"
                                            name="userPaw" v-model="userpaw">
                                        <!-- <i class="icon-eye icon-eye-close" onclick="initPassword(this)"></i> -->
                                        <a href="javaScript:void(0)" onclick="toFindPwd()"
                                            class="col-lightblue pos-r24">{{ $t('user.forgetPas') }}</a>
                                        <p class="err-txt" id="pwdMsg"></p>
                                    </div>
                                    <!--按钮不可点击 加上class：disable -->
                                    <div class="btns-box">
                                        <p class="err-tip" id="err-txt"></p>
                                        <input type="button" class="btn-big-blue margin-btm24"
                                        @click="loginByPhoneAndPwd()" :value="this.$t('user.login')">
                                    </div>
                                </form>
                                <div class="clearaft fs14 pd-lr-24">
                                    <a href="/#/register" onclick="toRegister()" class="col-blue fr">{{ $t('user.newRegistration') }}</a>
                                    <!-- <a href="javaScript:void(0)" onclick="otherLogin(2)" class="col-blue fr">手机验证码登录</a> -->
                                </div>
                            </div>
                        </div>
                        <p class="Agreement">{{ $t('user.loginPagePrompt') }} <a
                                href="https://homewh.chaoxing.com/agree/privacyPolicy?appId=900001"
                                target="_blank">《隐私政策》</a>和 <a
                                href="https://homewh.chaoxing.com/agree/userAgreement?appId=900001"
                                target="_blank">《用户协议》</a></p>
                    </div>
                </div>
                <!--默认登录 end-->

                <!--通知-->
                <div class="lg-notice" id="notice" style="display:none;">
                    <h2 class="msg-title">通知</h2>
                    <p id="noticeContent">

                    </p>
                </div>
            </div>
            <!--登录 end-->
        </div>
    </div>
</template>

<script>
import loginJs from '@/assets/style/js/loginVue'
import axios from 'axios'

export default {
    name: 'loginTest',
    data(){
        return{
            username:"",
            userpaw:"",
            pasType:"",

        }
    },
    methods: {
        loginByPhoneAndPwd: async function() {
            let params = new URLSearchParams()
            params.append('userName',this.username)
            params.append('userPaw',this.userpaw)
            await loginJs.loginByPhoneAndPwd(params)
        }
    },
    mounted(){
        
    }
}
</script>
<style>
@import "../assets/style/css/login.css"
</style>