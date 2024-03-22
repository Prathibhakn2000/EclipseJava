package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="onionServelt",urlPatterns = "/onion",loadOnStartup = 1)
public class OnionServelt extends HttpServlet{
	
	
	private static final long serialVersionUID = 3160906387812115070L;

	public OnionServelt()
	{
		System.out.println("No parameter constructor in OnionServelt");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running in OnionServelt");
		System.out.println("server request:"+req.getRemoteAddr());
		
		String path=req.getPathInfo();
		String method=req.getMethod();
		String headerAccept=req.getHeader("Accept");
		System.out.println("Sec-Ch-Ua-Platform"+req.getHeader("Sec-Ch-Ua-Platform"));
		System.out.println("User-Agent"+req.getHeader("User-Agent"));
		
		res.setContentType("image");//set the content type
		
		PrintWriter writer=res.getWriter();
		writer.print("this is Onion 1st response text from service");
		
	}

}
