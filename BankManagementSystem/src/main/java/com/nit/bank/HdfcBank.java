package com.nit.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HdfcBank  extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String bank=request.getParameter("bank");
		bank=bank+" bank";
		int bankId=200321;
		PrintWriter out=response.getWriter();
		System.out.println(bank);
		ServletContext context=request.getServletContext();
		context.setAttribute("bid", bankId);
		request.setAttribute("Id", bankId);
		request.setAttribute("bbb", bank);
		request.getRequestDispatcher("BankWelcome.jsp").forward(request, response);
		
	}

}
