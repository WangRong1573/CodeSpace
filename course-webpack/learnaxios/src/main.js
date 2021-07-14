import Vue from 'vue'
import App from './App'
import axios from "axios";

Vue.config.productionTip = false

new Vue({
  el: '#app',
  render: h => h(App)
})

axios({
  //默认get请求
  url:'http://123.207.32.32:8000/home/multidata',
  //method:'post' ,可以发送post请求
}).then(res =>{
  console.log(res);
})

//带参数的get请求
axios({
  url:'http://123.207.32.32:8000/home/data',
  params:{
    type:'pop',
    page:1
  }
}).then(res =>{
  console.log(res);
})
