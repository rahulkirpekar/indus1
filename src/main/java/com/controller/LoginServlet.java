package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("START :: LoginServlet");
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
		
		System.out.println("START :: FirstServlet");

		ServletContext context = getServletContext();
		
		String clang = context.getInitParameter("CLang");
		String cplus = context.getInitParameter("Cplus");
		String java =  context.getInitParameter("Java");


		
		System.out.println("clang : " + clang);
		System.out.println("cplus : " + cplus);
		System.out.println("java : " + java);
//		System.out.println("UserName : " + username);
//		System.out.println("Password : " + password);

//		PrintWriter out = response.getWriter();
		
//		out.write("<b>UserName : </b>" + username+"</br>");
//		out.write("<b>Password : </b>" + password);
		
		System.out.println("EXIT :: LoginServlet");
	}
}
