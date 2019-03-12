<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<div align="center" class="addstyle">Durga Software Solutions</div>
<h2  align="center" class="addstyle">Student Add Form</h2>
<form:form method="post" action="add" modelAttribute="student">
<center>
 <table>
 <tr>
 <td class="addstyle"><form:label path="sid">StudentId</form:label></td>
 <td><form:input path="sid"/></td>
 </tr>
 <tr>
 <td class="addstyle"><form:label path="sname">StudentName</form:label></td>
 <td><form:input path="sname"/></td>
 </tr>
 <tr>
 <td class="addstyle"><form:label path="saddr">StudentAddress</form:label></td>
 <td><form:input path="saddr"/></td>
 </tr>
 <tr>
 <td><form:button>ADD</form:button></td>
 </tr>
 </table>

</center>
</form:form>
</body>
</html>