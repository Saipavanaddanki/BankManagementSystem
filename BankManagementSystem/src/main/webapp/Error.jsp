<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h1{
font-size:100px;
font-weight:bold;
color:white;
background:rgba(100,0,0,0.5);
}
a{
background:orange;
color:black;
font-size:100px;
font-weight:bold;
list-style-type: none;
}
</style>
</head>

<body>
<h1><%=(String)request.getAttribute("error") %></h1>
<a href="Login.html">Back To Login...</a>
</body>
</html>