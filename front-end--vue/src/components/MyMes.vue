<template>
  <div>
    <!-- <h1>{{ myMes.data }}</h1> -->
    <div style="height: 70px;position:relative"><img :src="imageApi+userMes.imagePath" style="width: 60px;height: 60px;border-radius: 50%;margin-left:40%;"/>
    <input type="file" id="file" accept="image/*" style="display:none"/>
    <button class="imageBtn" id="modifyImageBtn">{{ $t('user.myMesDiv.modifyPicture') }}</button></div>  
    <table style="width:80%;height: 200px;margin-left:10%;font-size:large;">
      <tr>
        <td>{{ $t('user.myMesDiv.name') }}</td>
        <td><input type="text" v-model="userMes.name"></td>
        <td>{{ $t('user.myMesDiv.school') }}</td>
        <td><input type="text" v-model="userMes.school"></td>
      </tr>
      <tr>
        <td>{{$t('user.myMesDiv.email')}} </td>
        <td><input type="text" v-model="userMes.email"></td>
        <td>{{ $t('user.myMesDiv.memberMes') }}： </td>
        <td><label>{{ userMes.memberTab==0?$t('user.myMesDiv.nonMember'):$t('user.myMesDiv.member') }}</label></td>
      </tr>
      <tr>
        <td>{{ $t('user.myMesDiv.oldPassword') }} </td>
        <td><input type="password" id="oldPaw" v-model="modifyPaw.oldPaw" @change="oldPawFun()" :placeholder="this.$t('user.myMesDiv.oldPasMes')"></td>            
        <td>{{ $t('user.myMesDiv.newPassword') }} </td>
        <td><input type="password" id="newPaw" v-model="modifyPaw.newPaw" @change="newPawFun()" :placeholder="this.$t('user.myMesDiv.newPasMes')" ></td>
      </tr>
      <tr name="teacherMes" :style="userMes.type==0?'visibility:hidden':''">
        <td>{{ $t('user.myMesDiv.position') }} </td>
        <td><input type="text" v-model="userMes.position"></td>            
        <td>{{ $t('user.myMesDiv.introduction') }} </td>
        <td><textarea rows="2" cols="25" style="font-size:small" v-model="userMes.introduction"></textarea>
        </td>
      </tr>
    </table>
    <div><button id="modifyBtn" class="modifyBtn modifyBtn1" @click="modifyClick()">{{ $t('user.myMesDiv.saveChanges') }}</button></div>
  </div>
</template>

<script>
import myMesJs from "../assets/style/js/myMesVue.js"
import $ from 'jquery'
export default {
    name: "MyMes",
    data(){
      return{
        // userMes:{
        //   email:this.myMes.data.email,
        //   imagePath:'',
        //   introduction:'',
        //   memberTab:'',
        //   name: '',
        //   position:'',
        //   school: '',
        //   type:''
        // },
        userMes : JSON.parse(JSON.stringify(this.myMes.data)),
        imageApi : '/api/images/',
        modifyPaw: {
          oldPaw: null,
          newPaw: null
        }
      }
    },
    props:['myMes'],
    watch:{
      myMes: function(newVal,oldVal){
        this.userMes = JSON.parse(JSON.stringify(newVal.data))
        console.log(this.myMes)
      },
    },
    methods:{
      modifyClick: function(){
        myMesJs.modifyClickFun(this.userMes,this.modifyPaw,this)
      },
      newPawFun: function(){
        if(!this.oldPawFun()){
          this.modifyPaw.newPaw = null
          return
        }
        // 输入新密码验证
        console.log('允许修改密码')
      },
      oldPawFun: function(){
        if(this.modifyPaw.oldPaw!=this.myMes.data.userPaw){
          alert('原密码错误，请重新输入')
          this.modifyPaw.oldPaw = null
          return false
        }
        return true
      }
    },
  mounted() {
    let _this = this
    $('#modifyImageBtn').click(function () {
      $('#file').click()
    })
    $('#file').change(function () {
      let f = document.getElementById('file').files[0];
      var reads = new FileReader();
      reads.readAsDataURL(f);
      reads.onload = function (e) {
        _this.imageApi = ''
        _this.userMes.imagePath = this.result
      }
    })
  }
}
</script>

<style>
.imageBtn {
  position: absolute;
  background: #288cdd;
  border: none;
  width: 90px;
  height: 40%;
  /* line-height: 40px; */
  font-size: 15px;
  color: #fde;
  border-radius: 20px;
  top: 35%;
  margin-left: 10px;
}

.modifyBtn {
  background-color: #008CBA; /* Green */
    border: none;
    color: white;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    border-radius: 20px;
    font-size: 16px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
    float: right;
}

.modifyBtn1 {
    background-color: white; 
    color: black; 
    border: 2px solid #008CBA;
}

.modifyBtn1:hover {
    background-color: #008CBA;
    color: white;
}
</style>