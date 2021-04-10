使用拦截器检测登录

实现步骤：
1.新建maven项目
2.修改web.xml注册中央调度器
3.新建index.jsp发起请求
4.创建MyController处理请求
5.新建show.jsp接收结果
6.创建一个login.jsp，模拟登录（将用户信息写入到session中）
    创建一个logout.jsp，模拟退出（从session中删除数据）
7.创建拦截器，从session中获取用户登录数据，验证能否访问系统
8.创建一个验证的jsp，如果验证失败，给出提示
9.创建springMVC配置文件
    创建组件扫描器
    声明拦截器