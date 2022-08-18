<%--
  Created by IntelliJ IDEA.
  User: LiJin
  Date: 2022/7/12
  Time: 19:22
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.util.* " %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>所有学生信息</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="topheader">
                <h1 id="title">
                    <a href="${pageContext.request.contextPath}/user/queryAll">查询</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                list:
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        编号
                    </td>
                    <td>
                        姓名
                    </td>
                    <td>
                        年龄
                    </td>
                </tr>
                <c:forEach var="one" items="${sessionScope.list}" varStatus="vs">
                    <tr <c:if test="${vs.count%2!=0}">class="row1"</c:if>
                        <c:if test="${vs.count%2==0}">class="row2"</c:if>>
                            <td>${one.id}</td>
                            <td>${one.name}</td>
                            <td>${one.age}</td>
                            <td><fmt:formatDate value="" pattern="yyyy-MM-dd"/></td>
                        </tr>
                </c:forEach>
            </table>
            <p>&nbsp;</p>
            <p>
                <input type="button" class="button" value="添加员工" onclick="location='AddView.jsp'"/>
            </p>
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
