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
<h1>Hello</h1>
<%
/*String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");*/
%>
<h1>Subject name:${name}<%--<%=name%>--%></h1>
<h1>Subject id:${id}<%--<%=id%>--%></h1>
<hr>
<h1>List are:${marks}</h1>
</body>
</html>