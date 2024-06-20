package com.nit.bank;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/services")
public class BankingServices extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		String function=req.getParameter("function");
		System.out.println(function+"...........");
		if(function.equals("withdraw")) {
			res.sendRedirect("withdraw.html");
		}
		else if(function.equals("deposit")) {
			res.sendRedirect("deposit.html");
		}else if(function.equals("balance"))
		{
			req.getRequestDispatcher("/balance").forward(req, res);
		}else {
			res.sendRedirect("help.html");
		}
	
	}
}
