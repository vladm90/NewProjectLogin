<%--
  Created by IntelliJ IDEA.
  User: vmotoroiu
  Date: 15.03.2016
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h1>HTTP Status 403 - Access is denied</h1>

<c:choose>
  <c:when test="${empty user.email}">
    <h2>You do not have permission to access this page!</h2>
  </c:when>
  <c:otherwise>
    <h2>Username :'${user.email}' '${role}'<br/>You do not have permission to access this page!</h2>
  </c:otherwise>
</c:choose>
<h2>Username :'${user.email}' '${role}'<br/>You do not have permission to access this page!</h2>

</body>
</html>
