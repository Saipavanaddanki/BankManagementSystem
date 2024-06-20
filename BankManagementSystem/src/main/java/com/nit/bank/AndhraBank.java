package com.nit.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AndhraBank
 */
@SuppressWarnings("serial")
@WebServlet("/AndhraBank")
public class AndhraBank extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bank=request.getParameter("bank");
		bank=bank+" bank";
		int bankId=100923;
		ServletContext context=request.getServletContext();
		context.setAttribute("bid", bankId);
		request.setAttribute("Id", bankId);
		PrintWriter out=response.getWriter();
		request.setAttribute("bbb", bank);
		request.getRequestDispatcher("BankWelcome.jsp").forward(request, response);
	}

}
