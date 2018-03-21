<%--
  Created by IntelliJ IDEA.
  User: segni.lencho
  Date: 3/21/2018
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Register Human being</h3>
<form action="/register" method="GET">
    Key=<input type="text" name="key"/>
    First Name=<input type="text" name="firstName"/>
    Last Name=<input type="text" name="lastName"/>
    <input type="submit" value="Register"/>s
</form>
<h4>Already registered human</h4>
<table border="1">
    <tr>
        <td>Key</td>
        <td>First Name</td>
        <td>Last Name</td>
    </tr>
    <c:if test="${personlist!=null}">
        <c:forEach var="persons" items="${personlist}">
            <tr>
                <td>${persons.key}</td>
                <td>${persons.firstName}</td>
                <td>${persons.lastName}</td>
            </tr>
        </c:forEach>

    </c:if>

</table>


</body>
</html>
