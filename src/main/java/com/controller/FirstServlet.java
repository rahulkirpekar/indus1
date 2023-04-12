package com.controller;

import java.io.IOException;

import com.bean.StudentBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("START :: FirstServlet");

		StudentBean sbean = new StudentBean(1, "Rahul Kirpekar", 12);
		
		request.setAttribute("studentrecord", sbean);
		
		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
		
		rd.forward(request, response);

		
		
//		ServletConfig config = 	getServletConfig();
//		ServletContext context = getServletContext();
//		String clang = context.getInitParameter("CLang");
//		String cplus = context.getInitParameter("Cplus");
//		String java =  context.getInitParameter("Java");
//		System.out.println("clang : " + clang);
//		System.out.println("cplus : " + cplus);
//		System.out.println("java : " + java);
		// data -- store into---request
//		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//		rd.forward(request, response);

		// new Request--->"ThirdServlet"
//		response.sendRedirect("ThirdServlet");
		System.out.println("EXIT :: FirstServlet");
	}
}
