<template>
  <div id="app">
   <router-link to="/home" replace>首页</router-link>
    <router-link to="/about" replace>关于</router-link>

<!--    动态路由也可以传递参数 通过：$route.params.userId-->
    <router-link :to="'/user/'+userId">用户</router-link>
<!--    <router-link to="/profile">我的</router-link>-->
    <router-link :to="{path:'/profile',query:{'id':1001,'name':'wr','height':1.88}}">我的</router-link>
<!--   点击进入我的页面，查看地址栏显示 http://localhost:8080/profile?id=1001&name=wr&height=1.88-->

    <router-view></router-view>
<!--    <router-link to="/home" replace tag="button" active-class="active">首页</router-link>-->


<!--    通过代码方式实现路由跳转-->
<!--    <button @click="homeClick">首页</button>-->
<!--    <button @click="aboutClick">关于</button>-->
  </div>
</template>

<script>
export default {
  name: 'App',
  methods:{
    homeClick(){
      this.$router.push('/home',()=>{});
      console.log("homeClick");
    },
    aboutClick(){
      this.$router.push("/about",()=>{});
      console.log("aboutClick");
    }
  },
  data(){
    return {
      userId:1002
    }
  }
}
</script>

<style>

</style>
