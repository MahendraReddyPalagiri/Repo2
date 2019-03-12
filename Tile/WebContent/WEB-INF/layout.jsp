<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%",height="650">
<tr align="center" bgcolor="maroon">
<td colspan="2">
<tiles:insertAttribute name="header"/>
</td>
</tr>
<tr height="65%">
<td width="25%" align="center" bgcolor="lightyellow">
<tiles:insertAttribute name="menu"/>
</td>
<td width="75%" align="center" bgcolor="white">
<tiles:insertAttribute name="body"/>
</td>
</tr>

<tr height="15%" align="center" bgcolor="blue">
<td colspan="2"><tiles:insertAttribute name="footer"/>
</tr>

</table>
</body>
</html>