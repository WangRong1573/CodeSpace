<template>
  <div id="app">
    <tab-bar>
      <tab-bar-item path="/home" activeColor="green">
        <img src="./assets/img/tabbar/home.svg" alt="" slot="item-img">
        <img src="./assets/img/tabbar/home_active.svg" alt="" slot="item-img-active">
        <div slot="item-text">首页</div>
      </tab-bar-item>
      <tab-bar-item path="/category" activeColor="green">
        <img src="./assets/img/tabbar/category.svg" alt="" slot="item-img">
        <img src="./assets/img/tabbar/category_active.svg" alt="" slot="item-img-active">
        <div slot="item-text">分类</div>
      </tab-bar-item>
      <tab-bar-item path="/cart" activeColor="green">
        <img src="./assets/img/tabbar/shopcart.svg" alt="" slot="item-img">
        <img src="./assets/img/tabbar/shopcart_active.svg" alt="" slot="item-img-active">
        <div slot="item-text">购物车</div>
      </tab-bar-item>
      <tab-bar-item path="/profile" activeColor="green">
        <img src="./assets/img/tabbar/profile.svg" alt="" slot="item-img">
        <img src="./assets/img/tabbar/profile_active.svg" alt="" slot="item-img-active">
        <div slot="item-text">我的</div>
      </tab-bar-item>
    </tab-bar>
    <router-view></router-view>
  </div>
</template>

<script>
import TabBar from "./components/tabbar/TabBar";
import TabBarItem from "./components/tabbar/TabBarItem";
export default {
  name: 'App',
  components:{
    TabBar,
    TabBarItem
  }
}
</script>

<style>
  @import "./assets/css/base.css";

</style>
