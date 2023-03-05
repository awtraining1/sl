package com.simpli.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

// is mapped to /login as shown in web.xml
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Fetch the userid parameter value from the request
		String userId = request.getParameter("userid");		
		
		// Create a HttpSession and put the userid in it.
		HttpSession httpSession = request.getSession(true);
		// true means create a new session. 
		// Otherwise use the existing session
		
		httpSession.setAttribute("userid", userId);
		
		response.sendRedirect("dashboard");
       
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
