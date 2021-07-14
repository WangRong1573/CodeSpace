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
})]).then(axios.spread((res1,res2)=>{
  console.log(res1);
  console.log(res2);
}))

//对象的解构
const obj = {
  name:'zs',
  age:18,
  height:1.88
}

const {name,age,height} = obj;


