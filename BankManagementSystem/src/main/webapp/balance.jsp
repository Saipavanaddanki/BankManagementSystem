<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.nit.bank.BankRegistration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-image: url("atm.jpg");
}
h1{
background-color: red;
color:white;
font-size: 30px;
font-weight: bolder;
text-align:center;
}
.btn{
margin-top:500px;
margin-left:150px;
border-color:orange;
height:100px;
width:200px;
font:40px;
color:black;
background-color:green;

}
</style>
</head>
<body>
<%
BankRegistration bank=(BankRegistration)request.getAttribute("bankbalance");
String message=(String)request.getAttribute("msg");
%>
<h1><%=message %></h1>
<div class="d1">
<a href="services?function=withdraw"><button class="btn" id="w1">WITHDRAW</button></a>
<a href="services?function=deposit"><button class="btn" id="d1">DEPOSIT</button></a>
<a href="services?function=balance"><button class="btn"  id="b1">BALANCE ENQUIRY</button></a>
<a href="services?function=help"><button class="btn"  id="h1">HELP</button> </a>
<a href="exit"><button class="btn" id="h1">Exit</button></a>
</div>
</body>
</html>