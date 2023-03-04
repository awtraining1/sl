package com.simpli;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// As a first thing, get a Writer  from the response object
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<html>");
		
		pw.write("<b> Hello Simpli World </b>");
		pw.write("<br> Welcome to J FSD cohort!! ");
		
		// ServletContext is an object that represents the
		// Servlet Container
		ServletContext sc = this.getServletContext();
		String serverInfo = sc.getServerInfo();
		
		pw.write("<br> This output is from  "+serverInfo);
		
		pw.write("<br><br> LIST of all servlets in this project/application");
		Enumeration<Servlet> servlets = sc.getServlets();
		while(servlets.hasMoreElements()) {
			pw.write("<li>"+servlets.nextElement());
		};
		
		// Let's forward the request to some other servlet
		//sc.getRequestDispatcher("/gs").forward(request, response);
		
		// Let's include the request to some other servlet (MyGenericServlet)
		sc.getRequestDispatcher("/gs").include(request, response);
		
		pw.write("<BR> End of HomeServlet content");
		pw.write("</html>");
		
		// Don't forget to close the writer object
		pw.close();
		
	}

	
}
