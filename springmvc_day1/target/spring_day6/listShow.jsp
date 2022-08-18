<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LiJin
  Date: 2022/8/17
  Time: 19:41
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.util.* " %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <c:forEach items="${requestScope.users}" var="user">
            <tr>
                <td>${user.username}</td>
                <td>${user.birthday}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
