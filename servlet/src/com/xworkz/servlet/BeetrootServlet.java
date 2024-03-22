package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		String path=req.getPathInfo();
		String method=req.getMethod();
		String headerAccept=req.getHeader("Accept");
		System.out.println("Sec-Ch-Ua-Platform"+req.getHeader("Sec-Ch-Ua-Platform"));
		System.out.println("User-Agent"+req.getHeader("User-Agent"));
		
		res.setContentType("pdf");//set the content type
		
		PrintWriter writer=res.getWriter();
		writer.print("this is Beetroot 1st response text from service");
		
	}

}
