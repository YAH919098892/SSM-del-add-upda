<%--
  Created by IntelliJ IDEA.
  User: Windows10
  Date: 2020/10/22
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/add">
    <input type="text" name="no" placeholder="编号"/>
    <input type="text" name="name" placeholder="名字"/>
    <input type="text" name="gender" placeholder="性别" />
    <input type="text" name="birthdate" placeholder="生日：****-**-**格式"/>
    <input type="text" name="hometown" placeholder="住址"/>
    <input type="text" name="classid" placeholder="班级编号"/>
    <input type="text" name="idcard" placeholder="身份证照"/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
