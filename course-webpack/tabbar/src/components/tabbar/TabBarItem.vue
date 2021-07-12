<template>
  <!--    注意点：
  slot会被替换，在有逻辑判断slot显示或者样式显示的情况时，比如动态属性，属性判断等，最好外层包div，将逻辑写在div中，插槽写在div内控制
  -->
  <div class="tab-bar-item" @click="itemClick">
    <div v-if="isActive">
      <slot name="item-img"></slot>
    </div>
    <div v-else>
      <slot name="item-img-active"></slot>
    </div>
    <div>
      <slot :class="{active:isActive}" name="item-text"></slot>
    </div>
  </div>
</template>

<script>
export default {
  name: "TabBarItem",
  props:{
    path:String
  },
  data(){
    return {
      isActive:true
    }
  },
  methods:{
    itemClick(){
      this.$router.replace(this.path,()=>{})
    }
  }
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
