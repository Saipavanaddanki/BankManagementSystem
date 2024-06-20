 package com.nit.bank;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.bank.repository.DbServiceLayer;
@WebServlet("/register")
public class BankingRegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        
		ServletContext context=req.getServletContext();
		System.out.println(context.getAttribute("bid"));
	   int bankId= (Integer)context.getAttribute("bid");
	   
	    String bankName=(String) context.getAttribute("bankName");
	    String name=req.getParameter("name");
	    int age=Integer.parseInt(req.getParameter("age"));
	    String email=req.getParameter("email");
	    long mobile=Long.parseLong(req.getParameter("phno"));
	    String address=req.getParameter("address");
	    String state=req.getParameter("state");
	    BankRegistration register=new BankRegistration();
	    register.setAddress(address);
	    register.setAge(age);
	    register.setBankId(bankId);
	    register.setBankName(bankName);
	    register.setEmail(email);
	    register.setMobile(mobile);
	    register.setMobile(mobile);
	    register.setName(name);
	    register.setState(state);
	    DbServiceLayer service=new DbServiceLayer();
	    try {
	    	System.out.println(register.toString());
			BankRegistration bank1=service.register(register);
			Cookie cookie=new Cookie("nameOfCustomer",bank1.getName());
			res.addCookie(cookie);
			req.setAttribute("Customer", bank1);
			req.getRequestDispatcher("RegisteredSuccess.jsp").forward(req, res);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}
