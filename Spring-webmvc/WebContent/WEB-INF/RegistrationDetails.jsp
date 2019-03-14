<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<h1 style="color:red" align="center">Durga Software Solutions</h1>
<h2 style="color:blue" align="center">User Registration Details</h2>

<center>
<table border="1">
<tr>
<td>UserName:</td>
<td>${register.uname}</td>
</tr>
<tr>
<td>Password:</td>
<td>${register.upwd}</td>
</tr>
<tr>
<td>Email:</td>
<td>${register.uemail}</td>
</tr>
<tr>
<td>Mobile:</td>
<td>${register.umobile}</td>
</tr>
</table>
</center>
</body>
</html>