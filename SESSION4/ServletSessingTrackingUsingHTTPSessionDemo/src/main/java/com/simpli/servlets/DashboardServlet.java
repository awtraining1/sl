package com.simpli.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// mapped to /dashboard in web.xml
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		// make sure to not pass true here;
		HttpSession httpSession = request.getSession();

		if (httpSession != null) {
			String userId = (String) httpSession.getAttribute("userid");

			if (userId == null) {
				out.println("No UserId was found in http session .<br>");
			} else {
				out.println("UserId found in http session : " + userId + "<br>");

			}

		}
		else {
			out.println("No http session in the request" + "<br>");
		}		

		out.println("<html><body>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
