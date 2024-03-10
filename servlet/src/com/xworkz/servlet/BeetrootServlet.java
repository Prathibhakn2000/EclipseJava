package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="beetrootServlet",urlPatterns = "/beetroot",loadOnStartup = 1)
public class BeetrootServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 7774715768333883613L;

	public BeetrootServlet()
	{
		System.out.println("No parameter constructor in BeetrootServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running in BeetrootServlet");
		System.out.println("server request:"+req.getRemoteAddr());
	}

}
