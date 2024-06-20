package com.nit.bank;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exit")
public class Exit extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		Cookie cookie[]=req.getCookies();
		cookie[0].setMaxAge(0);
		ServletContext context=req.getServletContext();
		context.removeAttribute("BankObj");
		context.removeAttribute("bankName");
		context.removeAttribute("bid");
		System.out.println("*********Log out*******");
		res.sendRedirect("Index.html");
				
	}
}
