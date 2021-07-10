<template>
  <div>
    <h3>我是profile页</h3>
    <p>
      我是内容哈哈哈哈哈哈哈哈哈
    </p>

    <h3>取出query中的参数
      {{$route.query}}
    </h3>
    <p>取出query对象中其中一个: {{$route.query.name}}</p>
  </div>
</template>

<script>
export default {
  name: "Profile"
}
</script>

<style scoped>

</style>
