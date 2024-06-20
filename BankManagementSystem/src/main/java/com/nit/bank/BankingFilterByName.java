package com.nit.bank;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/selectingBank")
public class BankingFilterByName extends HttpServlet{


	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		String bank=req.getParameter("bank");
	
		if(bank.equals("andhra")) {
			System.out.println(bank);
			req.getRequestDispatcher("/AndhraBank").forward(req, res);
		}
		else if(bank.equals("sbi")) {
			req.getRequestDispatcher("SbiBank").forward(req, res);
		}
		else {
			req.getRequestDispatcher("HdfcBank").forward(req, res);
		}
		
	}

}
