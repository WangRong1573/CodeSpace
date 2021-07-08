import vueRouter from 'vue-router'
import Vue from "vue";
import Home from "../components/Home";
import About from "../components/About";

Vue.use(vueRouter)

const routes = [
  {
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
  routes
})

export default router
