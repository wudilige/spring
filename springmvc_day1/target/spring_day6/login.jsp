<%--
  Created by IntelliJ IDEA.
  User: LiJin
  Date: 2022/8/17
  Time: 19:48
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.util.* " %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>请登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login/check" method="post">
    <input type="text" name="username"><br><br>
    <input type="password" name="password"><br><br>
    <input type="submit" value=提交">
    <span style="color: red;size: A3">${requestScope.error}</span>
</form>
</body>
</html>
