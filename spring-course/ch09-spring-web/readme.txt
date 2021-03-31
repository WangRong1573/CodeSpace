spring-web项目
实现步骤：
1.创建maven web项目
2.加入依赖
    jsp
    servlet
    spring
    mybatis
    。。
3.创建学生实体类，dao，service和配置文件
4.创建jsp发送请求，参数有id，name，age
5.创建servlet，接收请求参数，调用service，dao完成注册
6.创建jsp作为结果显示页面


在web项目中容器对象只需要创建一次就够了
把容器对象放到全局作用域中
实现：
    使用监听器，当全局作用域对象被创建时，创建容器，存入ServletContext
    监听器作用：
        1.创建容器对象
        2.把容器对象放入到ServletContext