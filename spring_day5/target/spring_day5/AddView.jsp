<%--
  Created by IntelliJ IDEA.
  User: LiJin
  Date: 2022/7/12
  Time: 17:20
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.util.* " %>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>添加学生</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="topheader">
                <h1 id="title">
                    <a href="${pageContext.request.contextPath}/user/queryAll">Main</a>
                </h1>
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                add info:
            </h1>
            <form action="${pageContext.request.contextPath}/user/Insert" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            姓名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="user.name" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            年龄:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="user.age" />
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="Confirm" />
                </p>
            </form>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            li1599185635@163.com
        </div>
    </div>
</div>
</body>
</html>
