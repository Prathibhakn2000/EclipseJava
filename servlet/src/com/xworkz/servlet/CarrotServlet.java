package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="carrotServlet",urlPatterns = "/carrot",loadOnStartup = 1)
public class CarrotServlet extends HttpServlet{
	
	
	private static final long serialVersionUID = -5259152000545943535L;

	public CarrotServlet()
	{
		System.out.println("no parameter constructor in Carrot");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running in CarrotServlet");
		System.out.println("server request:"+req.getRemoteAddr());
		
		String path=req.getPathInfo();
		String method=req.getMethod();
		String headerAccept=req.getHeader("Accept");
		System.out.println("Sec-Ch-Ua-Platform"+req.getHeader("Sec-Ch-Ua-Platform"));
		System.out.println("User-Agent"+req.getHeader("User-Agent"));
		
		res.setContentType("vedio");//set the content type
		
		PrintWriter writer=res.getWriter();
		writer.print("this is Carrot 1st response text from service");
		
	}

}
