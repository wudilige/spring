<%--
  Created by IntelliJ IDEA.
  User: LiJin
  Date: 2022/8/18
  Time: 13:58
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.util.* " %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>文件上传</title>
</head>
<body>
<!--form表单提交方式必须为post，enctype属性必须为multipart/form-data-->
<form action="${pageContext.request.contextPath}/a/b" method="post" enctype="multipart/form-data">
    <input type="file" name="photo"/>
    <input type="submit" value="上传文件"/>
    <a href="${pageContext.request.contextPath}/a/b">2312312</a>
    ${requestScope.error}
</form>
</body>
</html>
