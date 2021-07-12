<template>
  <div class="tab-bar-item">
    <slot name="item-img"></slot>
    <slot name="item-text"></slot>
  </div>
</template>

<script>
export default {
  name: "TabBarItem"
}
</script>

<style scoped>
.tab-bar-item {
  flex: 1;
  text-align: center;
  height: 49px;
  font-size: 14px;
}

.tab-bar-item img{
  height: 24px;
  width: 24px;
  margin-top: 3px;
  /*去除图片底部3个px的高度*/
  vertical-align: middle;
}
</style>
