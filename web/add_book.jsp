<%--
  Created by IntelliJ IDEA.
  Author : luowenhao221
  Date: 2024/4/7
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加书</title>
</head>
<style>
    h1 {
        text-align: center;
    }
    form {
        width: 300px;
        margin: 0 auto;
    }
    input {
        width: 100%;
        margin: 10px 0;
    }
    input[type="submit"] {
        width: 100px;
        margin: 10px auto;
    }
    body{
        background-color: #fee5ca;
    }
</style>
<body>
<h1>添加图书</h1>
<div class="main">
<form action="addBook" accept-charset="UTF-8" method="post">
    书名: <input type="text" name="bookname"><br>
    价格: <input type="number" step="0.01" name="bookprice"><br>
    <input type="submit" value="提交">
</form>
</div>
</body>
</html>

