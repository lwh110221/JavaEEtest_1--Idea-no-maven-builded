<%--
  Created by IntelliJ IDEA.
  Author : luowenhao221
  Date: 2024/4/7
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<style>
    h1{
        text-align: center;
    }
    a{
        display: block;
        width: 100px;
        margin: 0 auto;
        text-align: center;
        text-decoration: none;
        color: #000;
        background-color: #f5f5f5;
        border: 1px solid #ccc;
        border-radius: 5px;
        padding: 5px;
        margin-top: 10px;
    }
    a:hover{
        background-color: #e5e5e5;
    }
</style>
<body>
<h1>添加图书</h1>
<a href="add_book.jsp">添加图书</a>
<h1>查询和修改</h1>
<a href="query_book.jsp">查询和修改</a>
<h1>模糊查询图书</h1>
<a href="booklist.jsp">模糊查询图书</a>

</body>
</html>
