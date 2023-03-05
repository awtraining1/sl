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

		Cookie cookie = null;
		boolean found = false;
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// Extract all available cookies
		Cookie[] cookies = request.getCookies();

		// Loop through all cookies found in user's browser
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
				// Check if there is a cookie named userid
				if (cookie.getName().contentEquals("userid") && cookie.getValue() != null) {
					out.println("UserId read from cookie:" + cookie.getValue() + "<br>");
					found = true;
				}
			}
		}

		if (!found) {
			out.println("No UserId was found in cookie.<br>");
			out.println("</body></html>");

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
