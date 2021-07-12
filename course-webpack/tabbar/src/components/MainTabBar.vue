<template>
  <tab-bar>
    <tab-bar-item path="/home" activeColor="green">
<!--      属性中的路径不可以使用别名来直接表示，会报错，需要使用 ~ 开头 -->
      <img src="~assets/img/tabbar/home.svg" alt="" slot="item-img">
      <img src="~assets/img/tabbar/home_active.svg" alt="" slot="item-img-active">
      <div slot="item-text">首页</div>
    </tab-bar-item>
    <tab-bar-item path="/category" activeColor="green">
      <img src="../assets/img/tabbar/category.svg" alt="" slot="item-img">
      <img src="../assets/img/tabbar/category_active.svg" alt="" slot="item-img-active">
      <div slot="item-text">分类</div>
    </tab-bar-item>
    <tab-bar-item path="/cart" activeColor="green">
      <img src="../assets/img/tabbar/shopcart.svg" alt="" slot="item-img">
      <img src="../assets/img/tabbar/shopcart_active.svg" alt="" slot="item-img-active">
      <div slot="item-text">购物车</div>
    </tab-bar-item>
    <tab-bar-item path="/profile" activeColor="green">
      <img src="../assets/img/tabbar/profile.svg" alt="" slot="item-img">
      <img src="../assets/img/tabbar/profile_active.svg" alt="" slot="item-img-active">
      <div slot="item-text">我的</div>
    </tab-bar-item>
  </tab-bar>
</template>

<script>
//起别名后可以直接使用别名开头
import TabBarItem from "components/tabbar/TabBarItem";
import TabBar from "components/tabbar/TabBar";

export default {
  name: "MainTabBar",
  components:{
    TabBar,
    TabBarItem
  }
}
</script>

<style scoped>

</style>
