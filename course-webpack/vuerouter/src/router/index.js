import vueRouter from 'vue-router'
import Vue from "vue";
// import Home from "../components/Home";
// import About from "../components/About";
// import User from "../components/User";

//路由懒加载
const Home = () => import('../components/Home')
const About = () => import('../components/About')
const User = () => import('../components/User')
const HomeNews = () => import('../components/HomeNews')
const HomeMessage = () => import('../components/HomeMessage')
const Profile = () => import('../components/Profile')


Vue.use(vueRouter)

const routes = [
  {
    //重定向到主页，path后可以是空字符串，也可以是 /
    path: '/',
    redirect: "/home"
  },
  {
    path: '/home',
    component: Home,
    //子路由
    children: [
      {
        path: "",
        redirect: 'news'
      },
      {
        //子路由路径不用/开头
        path: "news",
        component: HomeNews
      },
      {
        path: "message",
        component: HomeMessage
      }
    ],
    meta: {
      title: '首页'
    }
  },
  {
    path: '/about',
    component: About,
    meta: {
      title: '关于'
    }
  },
  {
    //动态路由
    path: "/user/:userId",
    component: User,
    meta: {
      title: '用户'
    }
  },
  {
    path: "/profile",
    component: Profile,
    meta: {
      title: '我的'
    }

  }
]

const router = new vueRouter({
  routes,
  //观察url变化
  mode: 'history'
})

router.beforeEach((to, from, next) => {
  next()
  document.title = to.matched[0].meta.title
})
export default router
