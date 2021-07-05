import {muSum,mul} from "./js/aaa.js";
import css from "./css/normal.css"

console.log(muSum(10, 20));
console.log(mul(10, 20));

import Vue from 'vue'

//03 vue 第一版本 演示转换步骤
/*
new Vue({
  el:"#demo",
  data:{
    message:"hello webpack",
    name:"wang rong"
  },
  methods:{
    btnClick(){
      console.log("我被点击了，我是打印");
    }
  }
})*/

//第二版本，使用template
/*
new Vue({
  el:"#demo",
  template:`
    <div>
      <h3>{{message}}</h3>
      <p>我的名字叫：{{name}}</p>
      <button @click="btnClick">快点我</button>
    </div>
  `,
  data:{
    message:"hello world",
    name:"jack"
  },
  methods:{
    btnClick(){
      console.log("我是打印日志");
    }
  }
})*/

//第三版本 将template和数据，函数抽离成组件
/*
const app = {
  template:`
    <div>
    <h3>{{message}}</h3>
    <p>我的名字叫：{{name}}</p>
    <button @click="btnClick">快点我</button>
    </div>
  `,
  data(){
    return {
      message:"hello world",
      name:"jack"
    }
  },
  methods:{
    btnClick(){
      console.log("我是打印日志");
    }
  }
}
new Vue({
  el:"#demo",
  template:"<app/>",
  components:{
    app
  }
})*/

//第四版本 将对象写在独立的js文件中导入
/*
import app from "./vue/app.js"
new Vue({
  el:"#demo",
  template:"<app/>",
  components:{
    app
  }
})*/

//第五版本 模板和js代码、css样式分离  需要配置loader
import app from "./vue/app.vue"
new Vue({
  el:"#demo",
  template:"<app/>",
  components:{
    app
  }
})