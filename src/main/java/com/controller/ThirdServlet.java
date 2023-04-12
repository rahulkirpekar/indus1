package com.controller;

import java.io.IOException;

import com.bean.StudentBean;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("START :: ThirdServlet");
		
		StudentBean sbean = (StudentBean)request.getAttribute("studentrecord");
		
		sbean.disp();
		
//		ServletContext context = getServletContext();
		
//		String clang = context.getInitParameter("CLang");
//		String cplus = context.getInitParameter("Cplus");
//		String java =  context.getInitParameter("Java");
//		System.out.println("clang : " + clang);
//		System.out.println("cplus : " + cplus);
//		System.out.println("java : " + java);
		System.out.println("EXIT :: ThirdServlet");
	}
}
