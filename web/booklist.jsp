<%--
  Created by IntelliJ IDEA.
  Author : luowenhao221
  Date: 2024/4/24
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>查询图书</title>
    <style>
        table{
            width: 60%;
            margin: 0 auto;
            border-collapse: collapse;
        }
        th,td{
            border: 1px solid #000;
            text-align: center;
        }
    </style>
</head>
<body>
<h1>根据书名模糊查询图书</h1>
<form action="/queryBookByName" method="post">
    书名：<input type="text" name="bookName">
    <input type="submit" value="查询">
</form>
<%--JSTL显示表格，查询出结果价格大于50标黄--%>
<table>
    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>作者</th>
        <th>价格</th>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.bookid}</td>
            <td>${book.bookname}</td>
            <td>${book.bookprice}</td>
            <c:choose>
                <c:when test="${book.bookprice>50}">
                    <td style="background-color: yellow">${book.bookprice}</td>
                </c:when>
                <c:otherwise>
                    <td>${book.bookprice}</td>
                </c:otherwise>
            </c:choose>
        </tr>
    </c:forEach>


</body>
</html>
