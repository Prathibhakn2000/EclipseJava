package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "tomatoServlet",urlPatterns = "/tomato",loadOnStartup = 1)
public class TomatoServlet extends HttpServlet
{
  
	
	private static final long serialVersionUID = 1135303066478849031L;
	public TomatoServlet()
	{
		System.out.println("No parameter constructor in TomatoServlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running in TomatoServelt");
		System.out.println("server request:"+req.getRemoteAddr());
	}
}
