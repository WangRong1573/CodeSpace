//网络请求的封装
import axios from "axios";

export function request(config,success,failure){
  const instance = axios.create({
    baseURL:'http://123.207.32.32:8000',
    timeout:5000
  })

  instance(config)
    .then(res=>{
      success(res)
    })
    .catch(err=>{
      failure(err)
    })
}
