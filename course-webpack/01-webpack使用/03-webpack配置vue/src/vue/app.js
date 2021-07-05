export default {
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
      name:"jack4"
    }
  },
  methods:{
    btnClick(){
      console.log("我是打印日志");
    }
  }
}