package com.xworkz.differentforms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="serviceFormServlet", urlPatterns ="/servicevehicle",loadOnStartup = 1)
public class ServiceFormServlet extends HttpServlet{
	
	public ServiceFormServlet()
	{
		System.out.println("Running No param const in ServiceFormServlet ");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method in ServiceFormServlet");
        String name   = req.getParameter("name");
        System.out.println(name);
    	String contactnumber  = req.getParameter("contactnumber");
    	System.out.println(contactnumber);
    	String  date = req.getParameter("date");
    	System.out.println(date);
    	String  time = req.getParameter("time");
    	System.out.println(time);
    	String  vehiclename = req.getParameter("vehiclename");
    	System.out.println(vehiclename);
    	String  vehiclenumber = req.getParameter("vehiclenumber");
    	System.out.println(vehiclenumber);
    	String  model = req.getParameter("model");
    	System.out.println(model);
    	String  year = req.getParameter("year");
    	System.out.println(year);
    	String   mileage= req.getParameter("mileage");
    	System.out.println(mileage);
    	String   service= req.getParameter("service");
    	System.out.println(service);
    	String  additionalService = req.getParameter("additionalService");
    	System.out.println(additionalService);
    	
    	PrintWriter writer =resp.getWriter();
    	resp.setContentType("text/plain");
    	writer.write("Successfully filled Service Application!!");
    
	}

}
