 package com.xworkz.metro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="metroServlet", urlPatterns = "/click",loadOnStartup = 1)
public class MetroServlet extends HttpServlet {
	
	public MetroServlet()
	{
		System.out.println("no param const in MetroServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	System.out.println("service method running in MetroServlet");	
	
	res.setContentType("text/plain");
	PrintWriter writer=res.getWriter();
	writer.write("this  is metro response from servlet" );
	}
	
	

}
