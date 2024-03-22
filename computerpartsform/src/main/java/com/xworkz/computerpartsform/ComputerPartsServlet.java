package com.xworkz.computerpartsform;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="computerPartsServlet", urlPatterns = "/computerparts", loadOnStartup = 1)
public class ComputerPartsServlet extends HttpServlet{
	
	public ComputerPartsServlet()
	{
		System.out.println("Running no param const in ComputerPartsServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	System.out.println("Running Service methodin ComputerPartsServlet");
		

		String brand=req.getParameter("brandname");
		System.out.println("Brand Name :"+brand);
		
		String model=req.getParameter("model");
		System.out.println("Model :"+model);
		
		String color=req.getParameter("color");
		System.out.println("Color :"+color);
		
		String type=req.getParameter("type");
		System.out.println("Type :"+type);
		
		
		String ram=req.getParameter("ram");
		System.out.println("RAM :"+ram);
		
		
		String harddisk=req.getParameter("harddisk");
		System.out.println("Hard Disk :"+harddisk);
		
		String processor=req.getParameter("processor");
		System.out.println("Processor :"+processor);
		
		
		
		String generation=req.getParameter("generation");
		System.out.println("Generation :"+generation);
		
		
		String motherboard=req.getParameter("motherboard");
		System.out.println("Mother Board:"+motherboard);
		
		String cachesize=req.getParameter("cachesize");
		System.out.println("Cache Size :"+cachesize);
		
		String cost=req.getParameter("cost");
		//System.out.println("Cost :"+Cost);
		
		String quantity=req.getParameter("quantity");
		//System.out.println("Quntity :"+convtQuality);
		
		
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		/*writer.write(" Computer Parts Application is processing\n");*/
		
		
		
		double convtCost = Double.valueOf(cost);
		System.out.println("Cost :"+convtCost);
		
	    int convtQuality = Integer.parseInt(quantity);
	    System.out.println("Quntity :"+convtQuality);
	    
	    if (convtCost>60000)
	    {
	    	System.out.println("too cost");
	    }
	    
	    if(convtQuality==3)
	    {
	    	System.out.println("equal");
	    }
	
	double total = convtCost*convtQuality;
	
	System.out.println("total cost:"+total);
	
	writer.write("<html>");
	writer.write("<head>");
	writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
	writer.write("</head>");
	writer.write("<nav class=\"navbar navbar-dark bg-success\">");
	writer.write("<div class=\"container-fluid\">");
	writer.write("<div class=\"navbar-header\">");
	writer.write("<a class=\"navbar-brand\" href=\"index.html\" ><b>Home</b></a>");
	writer.write("<a class=\"navbar-brand\" href=\"ComputerParts.html\"><b>ComputerParts</b></a>");
	
	
	writer.write("</div>");
	writer.write("</nav>");
	writer.write("<body>");
	writer.write(" Computer Parts Application is processing\n");
	writer.write("<br>");
	writer.write("Total Cost computer parts is processing...."+"\n");
	writer.write("<br>");
	writer.write("<b>Total Cost:</b>"+"\n"+total);
	writer.write("<br>");
	writer.write("<b>Computer Parts Information</b>"+"\n");
	writer.write("<br>");

	
	writer.write("</body>");
	
	writer.write("</html>");
	writer.write("<br>");
	writer.write("Brand:"+brand+"<br>"+"Model:"+model+"<br>"+"Color:"+color+"<br>"+"Type:"+type+"<br>"+"Ram:"+ram+"<br>"+"HardDisk:"+harddisk+"<br>"+"Processor"+processor+"<br>"+"Generation:"+generation+"<br>"+"MotherBoard:"+motherboard+"<br>"+"CacheSize:"+cachesize+"<br>"+"Cost:"+cost+"<br>"+"Quantity:"+quantity+"<br>");
	
	

	}

}
