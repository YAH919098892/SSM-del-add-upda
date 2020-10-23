<%--
  Created by IntelliJ IDEA.
  User: Windows10
  Date: 2020/10/22
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/del?no=${student.no}">
    <input type="text" name="no" value="${student.no}"/>
    <input type="text" name="name" value="${student.name}"/>
    <input type="text" name="gender" value="${student.gender}"/>
    <input type="text" name="birthdate" value="${student.birthdate}"/>
    <input type="text" name="hometown" value="${student.hometown}"/>
    <input type="text" name="classid" value="${student.classid}"/>
    <input type="text" name="idcard" value="${student.idcard}"/>
    <input type="submit" value="删除"/>
</form>
</body>
</html>
