<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background:black;
}
#d1{
margin-top:300px;
margin-left:500px;
height:400px;
width:800px;
background:aqua;
color: Black;
text-align:center
}
#t1{
margin-left:250px;
}
#btn{
margin-top:30px;
height:50px;
width:60px;
}
</style>
</head>
<body>
<div id="d1">

<%
String bank=(String)request.getAttribute("bbb");
int bankId=(int)request.getAttribute("Id");
application.setAttribute("bankName", bank);
System.out.println(bankId);
%>

<h1><u>WELCOME TO THE <%=bank.toUpperCase() %></u></h1>
<a href="Login.html">Login.........</a>
<form action="register" method="post">
<table id="t1">
<tr>
<td>BankId</td>
<td><input type="text" name="id" value=<%=bankId %> disabled="disabled"></td>
</tr>
<tr>
<td>BankName</td>
<td><input type="text" name="bankName" value=<%=bank %> disabled="disabled"/></td>
</tr>
<tr>
<td>
Name: 
</td>
<td><input type="text" name="name"/><br></td>
</tr>
<tr>
<td>
Age:
</td>
<td><input type="number" name="age"/><br></td>
</tr>
<tr>
<td>
Email:
</td>
<td><input type="email" name="email"/><br></td>
</tr>
<tr>
<td>
Mobile:
</td>
<td> <input type="tel"   name="phno"/><br></td>
</tr>
<tr>
<td>
Address: 
</td>
<td><textarea rows="3" cols="20" name="address"></textarea><br></td>
</tr>
<tr>
<td>
State
</td>
<td><input type="text" name="state"/></td>
</tr>
</table>
<input type="submit" value="register" id="btn"/>
</form></div>
</body>
</html>