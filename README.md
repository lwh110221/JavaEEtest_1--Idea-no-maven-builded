# javaee课程测验
## 使用Servlet，javabean，mysql实现的一个简单图书增加，修改，查询的web应用,4月23日新加入登录功能，附带登录过滤器。

```
## 项目目录结构
```
    javaeeby_lwhao
    ├── README.md
    ├── src
    │   ├── com.lwh.bean
    │   │   ├── Book.java
    │   │   ├── Student.java
    │   │—— com.lwh.dao
    │   │   ├── BookDAO.java
    │   │   ├── StudentDAO.java
    │   │—— com.lwh.dao.impl
    │   │   ├── BookDAOImpl.java
    │   │   ├── StudentDAOImpl.java
    │   │—— com.lwh.servlet
    │   │   ├── AddBookServlet.java
    │   │   ├── QueryBookServlet.java
    │   │   ├── UpdateBookServlet.java
    │   │   ├── LoginServlet.java
    │   │—— com.lwh.util
    │   │   ├── DBUtil.java
    │   │—— com.lwh.filter
    │   │   ├── LoginFilter.java
    │   ├── web
    │   │   ├── WEB-INF
    │   │   │   ├── lib
    │   │   │   │   ├── mysql-connector-java-5.1.47.jar
    │   │   │   ├   ├── servlet-api.jar
    │   │   │   ├── web.xml
    │   │   ├── add_book.jsp
    │   │   ├── query_book.jsp
    │   │   ├── index.jsp
    │   │   ├── login.jsp

```
    ###  项目功能
    - 登录
    - 添加图书
    - 查询图书
    - 修改图书价格
    
    
    ###  项目运行
    - 配置tomcat     tomcat版本：8.5   应用程序上下文设置为：/xxxxxx     
    - 配置mysql   数据库名：自定义  
        表名：t_book     字段：bookid，bookname，bookprice
        表名 t_student  字段：stuno，stuname，stupassword,stusex
    - 导入项目     
    - 运行项目    运行坏境：jdk1.8   tomcat8.5   mysql5.7

```
- 作者：[lwh]
- 邮箱：[lwh](lwh110221@outlook.com
- 时间：2024-04-07

```

