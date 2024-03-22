package com.xworkz.differentforms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="deathCertServlet", urlPatterns ="/deathperson",loadOnStartup = 1)
public class DeathCertServlet extends HttpServlet{
	
	public DeathCertServlet()
	{
		System.out.println("Running no param const in DeathCertServlet");
	}
	
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println("Running service method in DeathCertServlet");
        //System.out.println("Name" +"name"+ "father_name" +"father_name");
    	String  name = req.getParameter("name");
        System.out.println(name);
    	String  father_name = req.getParameter("father_name");
    	System.out.println(father_name);
    	String  place = req.getParameter("place");
    	System.out.println(place);
    	String  deathdate = req.getParameter("deathdate");
    	System.out.println(deathdate);
    	String  gender = req.getParameter("gender");
    	System.out.println(gender);
    	String  age = req.getParameter("age");
    	System.out.println(age);
    	String  cause = req.getParameter("cause");
    	System.out.println(cause);
    	String  applicant = req.getParameter("applicant");
    	System.out.println(applicant);
    	String  address = req.getParameter("address");
    	System.out.println(address);
    	
    	PrintWriter writer =resp.getWriter();
    	resp.setContentType("text/plain");
    	writer.write("Death Certificate is being process");
    	
    	
    	

}
}
