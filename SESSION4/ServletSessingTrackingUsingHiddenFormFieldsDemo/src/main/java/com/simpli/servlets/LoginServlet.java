package com.simpli.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// is mapped to /login as shown in web.xml
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Fetch the userid parameter value from the request
		String userId = request.getParameter("userid");		
		
		// Pass the above userid to the other servlet (dashboard servlet)
		 //creating a new hidden form field
		PrintWriter out = response.getWriter();
        out.println("<form action='dashboard' method='post'>");
        out.println("<input type='hidden' name='userid' value='"+userId+"'>");
        out.println("<input type='submit' value='submit' >");
        out.println("</form>");
        out.println("<script>document.forms[0].submit();</script>");
        
        out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
