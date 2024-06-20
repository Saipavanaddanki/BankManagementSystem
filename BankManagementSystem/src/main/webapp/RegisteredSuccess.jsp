<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.nit.bank.BankRegistration,javax.servlet.http.Cookie.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background=fuchsia;
color:black;
align-items:center;
justify-content:center;

}
#d1{

background:orange;
color:black;
text-align:center;
}
</style>
</head>
<body>
<div id="d1">
<h1>Registered Successfully</h1>
<h2><%
Cookie[] cookie= request.getCookies();
String name=null;
if(cookie[0]!=null){
	name=cookie[0].getValue();
}
BankRegistration bank1=(BankRegistration)request.getAttribute("Customer");



%>Welcome <%=bank1.getName() %></h2>

</div>
<a href="Login.html">Login......................</a>
</body>
</html>