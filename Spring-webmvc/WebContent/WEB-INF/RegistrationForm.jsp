<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<br><br>
<h1 style="color:red" align="center">Durga Software Solutions</h1>
<h2 style="color:blue" align="center">User Registration Form</h2>
<form:form method="post" action="register" modelAttribute="register">
<center>
<table>
<tr>
<td><form:label path="uname">UserName:</form:label></td>
<td><form:input path="uname"/></td>
<td><form:errors path="uname"/></td>
</tr>
<tr>
<td><form:label path="upwd">Password:</form:label></td>
<td><form:password path="upwd"/></td>
</tr>
<tr>
<td><form:label path="uemail">Email:</form:label></td>
<td><form:input path="uemail"/></td>
</tr>
<tr>
<td><form:label path="umobile">MobileNo:</form:label></td>
<td><form:input path="umobile"/></td>
</tr>
<tr><td><form:button>Register</form:button></td></tr>
</table>


</center>


</form:form>


</body>
</html>