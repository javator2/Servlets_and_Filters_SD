<%--
  Created by IntelliJ IDEA.
  User: Z40A
  Date: 2018-10-14
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/signIn" method="POST">
    <input type="text" name="login"/>
    <input type="password" name="password"/>
    <input type="submit" value="LOGIN"/>
</form>

</body>
</html>
