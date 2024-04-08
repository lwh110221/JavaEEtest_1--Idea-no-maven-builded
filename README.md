# javaee课程测验1
## 使用Servlet，javabean，mysql实现的一个简单图书增加，修改，查询的web应用

```
## 项目目录结构
```
    javaeeby_lwhao
    ├── README.md
    ├── src
    │   ├── com.lwh.bean
    │   │   ├── Book.java
    │   │—— com.lwh.dao
    │   │   ├── BookDao.java
    │   │—— com.lwh.servlet
    │   │   ├── AddBookServlet.java
    │   │   ├── QueryBookServlet.java
    │   │   ├── UpdateBookServlet.java
    │   │—— com.lwh.util
    │   │   ├── DBUtil.java
    │   ├── web
    │   │   ├── WEB-INF
    │   │   │   ├── lib
    │   │   │   │   ├── mysql-connector-java-5.1.47.jar
    │   │   │   ├   ├── servlet-api.jar
    │   │   │   ├── web.xml
    │   │   ├── add_book.jsp
    │   │   ├── query_book.jsp
    │   │   ├── index.jsp

```
    ###  项目功能
    - 添加图书
    - 查询图书
    - 修改图书价格
    
    
    ###  项目运行
    - 配置tomcat     tomcat版本：8.5   应用程序上下文设置为：/xxxxxx     url设置为：http://localhost:8080/xxxxx/index.jsp
    - 配置mysql   数据库名：自定义  表名：t_book     字段：bookid，bookname，bookprice
    - 导入项目     
    - 运行项目    运行坏境：jdk1.8   tomcat8.5   mysql5.7

```
- 作者：[lwh]
- 邮箱：[lwh](lwh110221@outlook.com
- 时间：2024-04-07

```

