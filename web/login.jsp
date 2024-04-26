<%--
  Created by IntelliJ IDEA.
  Author : luowenhao221
  Date: 2024/4/23
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <style>
        h1{
            text-align: center;
        }
        form{
            width: 300px;
            margin: 0 auto;
        }
        input{
            width: 100%;
            margin: 10px 0;
        }
        body{
            background-color: #cbf1ff;
        }
    </style>
</head>
<body>
<h1>登录</h1>
<form action="login" method="post">
    学号：<input type="text" name="stuno"><br>
    密码：<input type="password" name="stupassword"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
