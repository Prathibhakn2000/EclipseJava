package com.xworkz.differentforms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="gymFormServlet", urlPatterns ="/gymperson",loadOnStartup = 1)
public class GymFormServlet extends HttpServlet {
	
	private static final String CustomerName = null;
	private static final String Customer_Phone_Number = null;
	private static final String Customer_Email = null;
	private static final String Age = null;
	private static final String Gender = null;
	private static final String Pay = null;

	public GymFormServlet()
	{
		System.out.println("Running No param const in GymFormServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("CustomerName" +CustomerName+ "Customer_Phone_Number"+Customer_Phone_Number+ "Customer_Email" +Customer_Email+ "Age" + Age + "Gender" +Gender+ "Pay" +Pay);
    	
		System.out.println("Running service method in GymFormServlet");
		        String  CustomerName  = req.getParameter("name");
		        System.out.println(CustomerName);
		    	String  Customer_Phone_Number = req.getParameter("ph_no");
		    	System.out.println(Customer_Phone_Number);
		    	String  Customer_Email = req.getParameter("email");
		    	System.out.println(Customer_Email);
		    	String  Age = req.getParameter("age");
		    	System.out.println(Age);
		    	String  Gender = req.getParameter("gender");
		    	System.out.println(Gender);
		    	String  Pay = req.getParameter("pay");
		    	System.out.println(Pay);
		    	
		    	PrintWriter writer =resp.getWriter();
		    	resp.setContentType("text/plain");
		    	writer.write("Successfully Register!!");
		    	
		     	writer.write(CustomerName +" "+ Customer_Phone_Number +" "+ Customer_Email +" "+ Age +" "+ Gender +" "+ Pay +" ");
		    	
	}

}
