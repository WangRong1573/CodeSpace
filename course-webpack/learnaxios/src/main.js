import Vue from 'vue'
import App from './App'
import axios from "axios";

Vue.config.productionTip = false

new Vue({
  el: '#app',
  render: h => h(App)
})
//全局配置
axios.defaults.baseURL = 'http://123.207.32.32:8000'
//超时时间，单位是毫秒
axios.defaults.timeout = 5000

axios({
  //默认get请求
  url: '/home/multidata',
  //method:'post' ,可以发送post请求
}).then(res => {
  console.log(res);
})

//带参数的get请求
axios({
  url: '/home/data',
  params: {
    type: 'pop',
    page: 1
  }
}).then(res => {
  console.log(res);
})

//发送并发请求
axios([axios({
  url: '/home/multidata'
}), axios({
  url: '/home/data',
  params: {
    type: 'sell',
    page: 3
  }
})]).then(results => {
  console.log(results);
  // console.log(results[0]);
  // console.log(results[1]);
})

//并发请求的结果处理另一种方式
axios([axios({
  url: '/home/multidata'
}), axios({
  url: '/home/data',
  params: {
    type: 'sell',
    page: 3
  }
})]).then(axios.spread((res1, res2) => {
  console.log(res1);
  console.log(res2);
}))

//对象的解构
const obj = {
  name: 'zs',
  age: 18,
  height: 1.88
}

const {name, age, height} = obj;

//因为在实际开发中，baseUrl可能不同，所以使用axios的实例,每个实例就可以有独立的配置
const instance = axios.create({
  baseURL: 'http://127.0.2.23:8000',
  timeout: 5000
})
instance({
  url: '/home/a'
})

instance({
  url: '/home/b',
  params: {
    p1: '',
    p2: ''
  }
})

const instance2 = axios.create({
  baseURL: 'http://132.233.23.2',
  timeout: 2000,
  headers: {}
})

instance2({
  url: '/profile/a'
})
console.log("-----------------------------------------------------------");
//封装后发送网络请求
import {request} from "./network/request";

request({
  url: '/home/multidata'
}, res => {
  console.log(res);
}, err => {
  console.log(err);
})

//使用promise写法
import {request2} from "./network/request";
request2({
  url:'/home/multidata'
}).then(res=>{
  console.log(res);
}).catch(err=>{
  console.log(err);
})

//写法同上
import {request3} from "./network/request";
request3({
  url:'/home/multidata'
}).then(res=>{
  console.log(res);
}).catch(err=>{
  console.log(err);
})

