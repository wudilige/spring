<%--
  Created by IntelliJ IDEA.
  User: LiJin
  Date: 2022/8/17
  Time: 19:11
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.util.* " %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>提交姓名和生日</title>
</head>
<body>
<%--    <form action="${pageContext.request.contextPath}/user/receive" method="post">--%>
    <form action="${pageContext.request.contextPath}/user/receive2" method="post">
        <input type="text" name="username"><br><br>
        <input type="date" name="birthday"><br><br>
        <input type="submit" value=提交">
    </form>
</body>
</html>
