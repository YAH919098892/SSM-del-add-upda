<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"/>
<body>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/all">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>