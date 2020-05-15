<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phdan
  Date: 15/05/2020
  Time: 09:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
</head>
<body>
<h1> Create new customer </h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message"> ${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/customers"> Back to customer list</a>
</p>
<form me method="post">
    <fieldset>
        <legend> Customer Infomation</legend>
        <table>
            <tr>
                <td> Name </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td> Email </td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            <tr>
                <td> Address</td>
                <td><input type="text" name="address" id="address"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create Customer"/td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
