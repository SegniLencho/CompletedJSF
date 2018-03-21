<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: segni.lencho
  Date: 3/21/2018
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculate" method="POST">
    <select name="operator">
        <option value="0">select</option>
        <option value="+">+</option>
        <option value="-">-</option>
    </select>
    <input type="text" name="firstNumber"> <br>
    <input type="text" name="secondNumber">
    <input type="submit" value="Calculate">
</form>
<h3>${results}</h3>
<h3>History</h3>
<ul>
    <c:forEach var="list" items="${historys}">
        <li>${list}</li>
    </c:forEach>

</ul>
</body>
</html>
