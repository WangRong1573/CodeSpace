拦截器

实现步骤：
1.新建maven项目
2.加入依赖
3.创建controller类
4.创建普通类，作为拦截器使用
    1.实现HandlerInterceptor接口
    2.实现接口中的三个方法
5.创建处理异常的视图页面
6.springMVC配置文件
    声明组件扫描器，扫描@Controller注解包
    声明拦截器，指定拦截的请求的uri地址