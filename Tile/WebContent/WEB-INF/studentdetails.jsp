<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red" align="center">Durga Software Solutions</h1>
<h2 style="color:blue" align="center">Student Search Details</h2>
<center>
<table border="1">
<tr>
<td>StudentId</td>
<td>${student.sid}</td>
</tr>
<tr>
<td>StudentName</td>
<td>${student.sname}</td>
</tr>
<tr>
<td>StudentAddress</td>
<td>${student.saddr}</td>
</tr>
</table>
</center>
</body>
</html>