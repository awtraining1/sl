package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// As a first thing, get a Writer  from the response object
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<html>");
		
		pw.write("<b> Hello Simpli World </b>");
		pw.write("<br> Welcome to J FSD cohort!! ");
		
		pw.write("</html>");
		
		// Don't forget to close the writer object
		pw.close();
		
	}

	
}
