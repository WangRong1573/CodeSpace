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
