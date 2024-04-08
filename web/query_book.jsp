<%@ page import="com.lwh.bean.Book" %>
<%@ page import="java.util.List" %>
<%--
  Author : luowenhao221
  Date: 2024/4/7
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.lwh.bean.Book" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询书籍</title>
</head>
<style>
    body{
        font-family: Arial, sans-serif;
        background-color: antiquewhite;
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }

    table, th, td {
        border: 1px solid black;
    }

    th, td {
        padding: 10px;
        text-align: left;
    }

    th {
        background-color: #f2f2f2;
    }
    .search{
        margin: 0 auto;
        width: 50%;
        text-align: center;
    }
</style>
<body>
<div class="search">
    <h2>请输入价格区间查询书籍</h2>
        <form action="queryBook" method="post">
            最低价: <input type="number" name="minPrice" required><br>
            最高价: <input type="number" name="maxPrice" required><br>
        <input type="submit" value="查询">
</form>
</div>

                        <%-- 检查是否有查询结果 --%>
<% if(request.getAttribute("books") != null && !((List<Book>)request.getAttribute("books")).isEmpty()){ %>
<h2>查询结果：</h2>
<table>
    <tr>
        <th>书籍ID</th>
        <th>书名</th>
        <th>价格</th>
        <th>修改价格</th>
    </tr>
    <% for(Book book : (List<Book>)request.getAttribute("books")){ %>
    <tr>
        <td><%= book.getBookid() %></td>
        <td><%= book.getBookname() %></td>
        <td><%= book.getBookprice() %></td>
        <td>
            <form action="updateBookPrice" method="post">
                <input type="hidden" name="bookid" value="<%= book.getBookid() %>">
                <label>
                    新价格:
                    <input type="number" name="newPrice" required>
                </label>
                <input type="submit" value="修改">
            </form>
        </td>
    </tr>
    <% } %>
</table>
<% } else if(request.getAttribute("books") != null && ((List<Book>)request.getAttribute("books")).isEmpty()){ %>
<p>未找到符合条件的书籍。</p>
<% } %>
</body>

