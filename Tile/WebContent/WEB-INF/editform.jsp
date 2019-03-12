<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red" align="center">Durga Software Solutions</h1>
<h2 style="color:blue" align="center">Student Edit Form</h2>
<form method="post" action="update">
<table>
<tr>
<td>StudentId</td>
<td>${student.sid}</td>
<td><input type="hidden" name="sid" value="${student.sid}"></td>
</tr>
<tr>
<td>StudentName:</td>
<td><input type="text" name="sname" value="${student.sname}"/></td>
</tr>
<tr>
<td>StudentAddress</td>
<td><input type="text" name="saddr" value="${student.saddr}" /></td>m
</tr>
<tr>
<td><input type="submit" value="Update"></td>
</tr>
</table>
</form>
</body>
</