<template>
  <div>
    <h3 class="title">{{message}}</h3>
    <p>我的名字叫：{{name}}</p>
    <button @click="btnClick">快点我</button>
  </div>
</template>

<script>
export default {
  name: "app",
  data(){
    return {
      message:"hello world",
      name:"jack4"
    }
  },
  methods:{
    btnClick(){
      console.log("我是打印日志");
    }
  }
}
</script>

<style scoped>
  .title{
    color: red;
  }
</style>