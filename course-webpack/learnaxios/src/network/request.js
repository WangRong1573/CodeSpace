//网络请求的封装
import axios from "axios";

export function request(config, success, failure) {
  const instance = axios.create({
    baseURL: 'http://123.207.32.32:8000',
    timeout: 5000
  })

  instance(config)
    .then(res => {
      success(res)
    })
    .catch(err => {
      failure(err)
    })
}


export function request2(config) {
  return new Promise(((resolve, reject) => {
    const instance2 = axios.create({
      baseURL: 'http://123.207.32.32:8000',
      timeout: 5000
    })

    instance2(config)
      .then(res => {
        resolve(res)
      })
      .catch(err => {
        reject(err)
      })

  }))
}

export function request3(config) {
    const instance3 = axios.create({
      baseURL: 'http://123.207.32.32:8000',
      timeout: 5000
    })

    //axios的请求拦截器
  instance3.interceptors.request.use(config =>{
    //请求拦截，比如登录
    return config
  },error => {
  //  请求拒绝
  })

  //响应拦截
  instance3.interceptors.response.use(res=>{
    //响应成功
    return res.data
  },error => {
  //响应失败
  })
    //因为本身返回了类型就是一个Promise
    return instance3(config)
}
