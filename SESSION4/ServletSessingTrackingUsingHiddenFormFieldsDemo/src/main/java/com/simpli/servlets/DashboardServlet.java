package com.simpli.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// mapped to /dashboard in web.xml
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		 out.println("<html><body>");         
         String userId = request.getParameter("userid");
         
         if (userId == null) {
             out.println("No UserId was found in hidden form field.<br>" );
         } else {
             out.println("UserId found in hidden form field: "  + userId + "<br>");
             
         }
         
		out.println("<html><body>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
