<template>
  <div>
    <h3>我是用户页</h3>
    <p>我是用户页显示内容，嘿嘿嘿</p>
    <h4>当前用户id为：{{ $route.params.userId }}</h4>
  </div>
</template>

<script>
export default {
  name: "User",

  // created() {
  //   console.log("user")
  //   document.title = 'user'
  //
  // }
}
</script>

<style scoped>

</style>
