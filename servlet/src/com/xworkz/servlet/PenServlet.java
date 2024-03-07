package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="penServlet",urlPatterns = "/pen",loadOnStartup = 1)
public class PenServlet extends HttpServlet {
	
	public PenServlet()
	{
		System.out.println("no args constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running in PenServlet");
		System.out.println("server request:"+req.getRemoteAddr());
		
	}
	
	

}
