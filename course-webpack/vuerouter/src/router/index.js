import vueRouter from 'vue-router'
import Vue from "vue";
import Home from "../components/Home";
import About from "../components/About";

Vue.use(vueRouter)

const routes = [
  {
    //重定向到主页，path后可以是空字符串，也可以是 /
    path: '/',
    redirect: "/home"
  },
  {
    path: '/home',
    component: Home
  },
  {
    path: '/about',
    component: About
  }
]

const router = new vueRouter({
  routes,
  //观察url变化
  mode:'history'
})

export default router
