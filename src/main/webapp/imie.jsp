<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Z40A
  Date: 2018-10-07
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IMIE</title>
</head>
<body>
Moje imie:
<br/>
<%= request.getAttribute("imie") %>
</body>
</html>
