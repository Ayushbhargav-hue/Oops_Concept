<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is first code</h1>
<% String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");
List<String> friend=(List<String>)request.getAttribute("a");
%>
<h1>Name is:<%=name%></h1>
<h1>Id is:<%=id%></h1>
<%for(String s:friend){
out.println(s);}
%>

</body>
</html>