package com.xworkz.computerpartsform;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	

	@WebServlet(urlPatterns = "/tvcablerecharge",loadOnStartup = 1)

	public class TvCableRechargeServlet extends HttpServlet{
		
		
		
		public TvCableRechargeServlet()
		{
			System.out.println("No parameter in TvReachargeServlet");
		}
		
		
		
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			System.out.println("Service method running TvReachargeServlet");
		
	String customerId=	req.getParameter("custid");
	String vendor=	req.getParameter("vendor");
	String rechargeAmount=	req.getParameter("amount");
	String rechargeType=	req.getParameter("rechargetype");
	String accept=	req.getParameter("accept");

		
		
		
		
		
		
		
		System.out.println("Customer Id :" + customerId + "\n Select Vendor :"+vendor+ "\n Reacharge Amount  : " +rechargeAmount+"\n Reacharge Type :" +rechargeType+"\n Accept :"+accept);
		
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		
		//resp.setContentType("text/html");
		//writer.write("Application is processing");
		System.out.println("Application is processing");
		System.out.println("Customer Id :" + customerId + "\n Select Vendor :"+vendor+ "\n Reacharge Amount  : " +rechargeAmount+"\n Reacharge Type :" +rechargeType+"\n Accept :"+accept);

		
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		writer.write("</head>");
		writer.write("<nav class=\"navbar navbar-dark bg-success\">");
		writer.write("<div class=\"container-fluid\">");
		writer.write("<div class=\"navbar-header\">");
		writer.write("<a class=\"navbar-brand\" href=\"index.html\" ><b>Home</b></a>");
		writer.write("<a class=\"navbar-brand\" href=\"ComputerParts.html\"><b>ComputerParts</b></a>");
		writer.write("<a class=\"navbar-brand\" href=\"TvCableRecharge.html\"><b>TvRecharge</b></a>");
		
		writer.write("</div>");
		writer.write("</nav>");
		//writer.write("<body class= \"bg-success\">");
		writer.write("<body>");
		writer.write(" Application is processing...."+"\n");
		writer.write("<br>");
		writer.write("<b>Recharge Details</b>"+"\n");
		writer.write("<br>");
	

		writer.write("Customer Id :" + customerId);
		writer.write("<br>");
		writer.write(" Select Vendor :" + vendor);
		writer.write("<br>");
		writer.write("  Reacharge Amount :" + rechargeAmount);
		writer.write("<br>");
		writer.write(" Reacharge Type :" + rechargeType);
		writer.write("<br>");
        writer.write("  Accept :" + accept);
        
        writer.write("</body>");
		
		writer.write("</html>");
        

			

		
		
		}

	}


