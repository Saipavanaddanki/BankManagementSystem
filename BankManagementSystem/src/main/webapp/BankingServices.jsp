<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.nit.bank.BankRegistration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
background-color: aqua;
color:white;

}
body{
background-image: url("atm.jpg");
}
#form
{
height: 500px;
width:100vh;
color:white;
background:red;
margin-top:100px;
margin-left:300px;

}


.btn{
margin-top:100px;
margin-left:200px;
border-color:orange;
height:100px;
width:200px;
font:40px;
color:black;
background-color:red;

}
</style>

</head>

<body>
<h1>
<%BankRegistration bank1=(BankRegistration)application.getAttribute("BankObj");
out.println("hello welcome to Your Account  "+bank1.getName());
%>
</h1>
<div class="d1">
<a href="services?function=withdraw"><button class="btn" id="w1">WITHDRAW</button></a>
<a href="services?function=deposit"><button class="btn" id="d1">DEPOSIT</button></a>
<a href="services?function=balance"><button class="btn"  id="b1">BALANCE ENQUIRY</button></a>
<a href="services?function=help"><button class="btn"  id="h1">HELP</button> </a>


</div>


</body>
</html>