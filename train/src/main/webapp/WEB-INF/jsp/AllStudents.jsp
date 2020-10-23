<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<body>
<%--<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/all">--%>
<%--    <input type="text" name="username"/>--%>
<%--    <input type="password" name="password"/>--%>
<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column-header">
            <div class="page-header">
                <h1>
                    <small>学生列表---------------------显示所有的学生</small>
                </h1>
            </div>
        </div>
    </div>

    <table>
        <tr>
                                <td>学号</td>
                                <td>姓名</td>
                                <td>性别</td>
                                <td>生日</td>
                                <td>住址</td>
                                <td>班级</td>
                                <td>身份证号</td>
                                <td>操作</td>
        </tr>

        <c:forEach var="student" items="${list}">
            <tr>
       <td>${student.no}</td>
       <td>${student.name}</td>
     <td>${student.gender}</td>
   <td>${student.birthdate}</td>
      <td>${student.hometown}</td>
    <td>${student.classid}</td>
     <td>${student.idcard}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/upda?no=${student.no}">修改</a>
                    &nbsp;| &nbsp;
                    <a href="${pageContext.request.contextPath}/del2?no=${student.no}">删除</a>
                    &nbsp;| &nbsp;
                    <a href="${pageContext.request.contextPath}/toadd">增加</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>
