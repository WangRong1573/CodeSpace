<template>
  <div id="app">
<!--   <router-link to="/home" replace>首页</router-link>-->
<!--    <router-link to="/about" replace>关于</router-link>-->
<!--    <router-view></router-view>-->
<!--    <router-link to="/home" replace tag="button" active-class="active">首页</router-link>-->


<!--    通过代码方式实现路由跳转-->
    <button @click="homeClick">首页</button>
    <button @click="aboutClick">关于</button>
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
  }
}
</script>

<style>

</style>
