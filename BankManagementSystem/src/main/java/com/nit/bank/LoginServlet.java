package com.nit.bank;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.bank.repository.DbServiceLayer;

@WebServlet("/Service")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		BankRegistration bank=new BankRegistration();
		ServletContext context=req.getServletContext();
		bank.setBankName(String.valueOf(context.getAttribute("bankName")));
		bank.setName(req.getParameter("name"));
		bank.setMobile(Long.parseLong(req.getParameter("password")));
		DbServiceLayer service=new DbServiceLayer();
		System.out.println("test before"+bank);
		try {
			BankRegistration bank1=service.login(bank);
			if(bank1.getName()!=null) {
		    if(bank1!=null) {
		    	System.out.println("testing at LoginServlet"+bank1);
				context.setAttribute("BankObj", bank1);
				req.getRequestDispatcher("BankingServices.jsp").forward(req, res);
		    }
			}
			else {
				System.out.println("Invalid User");
				req.setAttribute("error", "Invalid User");
				req.getRequestDispatcher("Error.jsp").forward(req, res);
			}
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
