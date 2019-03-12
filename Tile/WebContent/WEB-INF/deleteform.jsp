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
<h2 style="color:red" align="center">Student Delete Form</h2>
<form:form method="post" action="delete" modelAttribute="student">
<center>
<table>
<tr>
<td><form:label path="sid">StudentId</form:label></td>
<td><form:input path="sid"/></td>
</tr>
<tr>
<td><form:button>DELETE</form:button></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>