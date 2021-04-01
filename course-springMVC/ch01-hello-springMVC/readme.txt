springMVC第一个项目练习
web开发底层是Servlet，springMVC中有一个对象是servlet：DispatcherServlet（中央调度器）
DispatcherServlet（中央调度器）：负责接收用户的所有请求，用户把请求给了DispatchServlet之后，DispatchServlet将请求分发给
controller对象，最后是controller对象处理请求

实现步骤：
1.创建maven web项目
2.加入依赖
    spring-webmvc 依赖，间接的把spring依赖都加入到了项目中
    jsp
    servlet
3.在web.xml中注册springMVC的核心对象DispatchServlet
    1.叫做中央调度器，是一个servlet，父类是继承HttPServlet
    2.也叫作前端控制器，front controller，负责接收用户请求，调用其他控制对象，并把请求的处理结果展示给用户

4.创建一个发起请求的页面，index.jsp

5.创建一个控制器类
    1.在类的上面加入@Controller注解，创建对象，并放入到springMVC容器中
    2.在类中的方法加入@RequestMapping注解

6.创建结果jsp，显示处理结果

7.创建springMVC的配置文件（和spring配置文件一样）
    1.声明组件扫描器，指定@Controller注解所在的包名
    2.声明视图解析器，帮助处理视图的