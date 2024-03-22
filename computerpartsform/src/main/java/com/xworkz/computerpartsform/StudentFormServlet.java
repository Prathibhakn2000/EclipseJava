package com.xworkz.computerpartsform;
	
    import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(name="studentFormServlet",urlPatterns = "/read",loadOnStartup = 2)


	public class StudentFormServlet extends HttpServlet {
		
		
		
		public StudentFormServlet()
		{
			System.out.println("No parameter Constructor In StudentFormServlet");
		}
		
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			
			
			System.err.println("Service method running in StudentFormServlet");
			
			 String student = req.getParameter("student");
		        String studentnum = req.getParameter("studentnum");
		        String gender = req.getParameter("gender");
		        String email = req.getParameter("email");
		        String collegename = req.getParameter("collegename");
		        String degreeprogram = req.getParameter("degreeprogram");
		        String  yearlevel= req.getParameter("yearlevel");
		        String confirm = req.getParameter("confirm");
		    	System.out.println("Student Name :" + student + "\n Student Number :"+ studentnum + "\n Gender : " +gender+ "\n Email : "  +email+"\n College Name : "+ collegename +"\n Degree Program : + degreeprogram + Year Level : + yearlevel + \"\n Confirm :"+confirm);


			
			PrintWriter writer=resp.getWriter();
			//resp.setContentType("text/plain");
			resp.setContentType("text/html");

			//writer.write("Application is Processing");
			writer.write("<html>");  
		    writer.write("<head>");
		    writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		  
		    writer.write("</head>");
	// Navbar start
			writer.write("<nav class=\"navbar navbar-dark bg-success\">");
		    writer.write("<div class=\"container-fluid\">");
		    writer.write("<div class=\"navbar-header\">");

		    writer.write("<a class=\"navbar-brand\" href=\"index.html\">Home</a>"); 
		    writer.write("<a class=\"navbar-brand\" href=\"ComputerParts.html\">ComputerParts</a>");
		    writer.write("<a class=\"navbar-brand\" href=\"TvCableRecharge.html\">TvRecharge</a>");
		    writer.write("<a class=\"navbar-brand\" href=\"StudentForm.html\">StudentForm</a>");




		    writer.write("</div>");
		    writer.write("</div>");
		    writer.write("</nav>");
		    
		    
		    // Navbar end
		    //writer.write("<body class=\"bg-secondary\">");
		    writer.write("<body>");
			writer.write("StudentForm  Application is processing...."+"\n");
			writer.write("<br>");
			writer.write("<b>Student Details</b>"+"\n");
			writer.write("<br>");
		   
			//writer.write("<b>Total Cost:</b>"+"\n"+totalCost);

	 writer.write("<br>");
			
	 writer.write("Student Name:"+student+"<br>"+"Student Number:"+studentnum+"<br>"+"Gender:"+gender+"<br>"+"Email:"+email+"<br>"+"College Name:"+collegename+"<br>"+"Degree Program:"+degreeprogram+"<br>"+"Year Level "+yearlevel+"<br>"+"Confirm:"+confirm+"<br>");
		
		

		

		    writer.write("</body>");
		    writer.write("</html>");

		    
			
		}


}
