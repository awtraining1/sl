package com.simpli;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Initialization
	int ageLimit;
	public void init(ServletConfig config) {
		
		ageLimit = Integer.parseInt(config.getInitParameter("AGE_LIMIT"));
		
		System.out.println(" Inside init method of Profile Servlet");
		
	}
	

	// Handle Get Requests
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(" Inside GET  method of Profile Servlet");
		
		PrintWriter pw = response.getWriter();
		
		// Process the request object (form processing)
		String name = request.getParameter("firstName");
		// code for capturing the age and speciality
		String age = request.getParameter("age");
		String specility = request.getParameter("speciality");
		
		// Business logic
		int ageInt = Integer.parseInt(age);
		if(ageInt < ageLimit) {
			pw.write("<b> Sorry, we don't accept profiles with age less than " + ageLimit);
		}
		else {		

		pw.write("<html>");

		pw.write("<b> Thank you,  " + name + ". Your profile details has been accepted (GET) </b>");
		pw.write("<br>Here is what you submitted age="+age + 
				" AND speciality="+specility);

		pw.write("</html>");
		}
		
		// Forward to another servlet

		// Don't forget to close the writer object
		pw.close();

	}

	// Handle Post Requests
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		
		System.out.println(" Inside doPost method of Profile Servlet");
		
		// Extract data/info from the request object (headers, form processing etc)
				String name = request.getParameter("firstName");
				// code for capturing the name, age and specialty
				String ageStr = request.getParameter("age");
				String specility = request.getParameter("speciality");


				PrintWriter pw = response.getWriter();

				// Business logic
				int age = Integer.parseInt(ageStr);
				if(age < ageLimit) {
					pw.write("<b> Sorry, we don't accept profiles with age less than " + ageLimit);
				}
				else {		

				pw.write("<html>");

				pw.write("<b> Thank you,  " + name + ". Your profile details has been accepted (GET) </b>");
				pw.write("<br>Here is what you submitted age="+age + 
						" AND speciality="+specility);

				pw.write("</html>");
				}
				
				
				// Forward to another servlet

				// Don't forget to close the writer object
				pw.close();

	}
	
	
	public void destroy() {
		System.out.println(" Inside destroy method of Profile Servlet");
		try {
			FileWriter fw = new FileWriter("F:\study\simpli.txt");
			fw.append("Inside destroy method of Profile Servlet");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
