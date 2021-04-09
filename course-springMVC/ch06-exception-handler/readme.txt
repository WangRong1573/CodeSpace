全局异常处理

实现步骤：
1.新建maven项目
2.加入依赖
3.创建异常处理类 MyException，异常处理的子类NameException，AgeException
4.创建全局异常处理类，处理controller类中抛出的异常
    1.类上方加入@ControllerAdvice
    2.创建对应异常处理方法，加入@ExceptionHandler（value=对应异常类.class）
5.创建处理异常的视图页面
6.springMVC配置文件
    声明组件扫描器，扫描@Controller注解包
    声明扫描器，扫描@ControllerException注解包
    声明注解驱动