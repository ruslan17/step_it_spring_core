<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: taghiyevr
  Date: 22.12.2018
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${list}" var="item">
    <h1>${item.name}</h1>
    <h2>${item.age}</h2>
</c:forEach>

</body>
</html>
