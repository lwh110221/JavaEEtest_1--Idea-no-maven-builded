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
<body>
<h1>添加图书</h1>
<form action="addBook" accept-charset="UTF-8" method="post">
    Book Name: <input type="text" name="bookname"><br>
    Book Price: <input type="number" step="0.01" name="bookprice"><br>
    <input type="submit" value="Add Book">
</form>
</body>
</html>

