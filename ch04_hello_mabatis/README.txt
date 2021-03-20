实现步骤：
1.新建Student表
2.加入maven的mybatis依赖，mysql依赖
3.创建实体类
4.创建dao接口，定义操作数据库的方法
5.创建mybatis使用的配置文件，sql映射文件，写sql语句的，一个表一个mapper文件，xml格式
    前期规范：写在dao接口目录中，文件名和接口保持一致
6.创建mybatis的主配置文件，配置文件提供了数据库的连接信息和sql映射文件的位置信息
7.创建mybatis类，通过mybatis访问数据库

