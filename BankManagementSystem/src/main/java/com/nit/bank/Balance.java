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

@WebServlet("/balance")
public class Balance  extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	
		ServletContext context=req.getServletContext();
		Cookie cookie[]=req.getCookies();
		String name=cookie[0].getValue();
		if(name!=null) {
		BankRegistration bank=(BankRegistration)context.getAttribute("BankObj");
		if(bank!=null) {
			try {
			 DbServiceLayer service=new DbServiceLayer();
				BankRegistration bank1=service.money(bank);
				req.setAttribute("bankbalance", bank1);
				req.setAttribute("msg", "your BankBalance is  :"+bank1.getBalance());
				req.getRequestDispatcher("balance.jsp").forward(req, res);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		}
	}
}
