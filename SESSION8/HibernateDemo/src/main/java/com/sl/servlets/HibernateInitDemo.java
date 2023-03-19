package com.sl.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sl.util.HBUtil;

@WebServlet("/hib-init")
public class HibernateInitDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Get the Writer object
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// Get the SessionFactory object and the Session object
		SessionFactory sessionFactory = HBUtil.getSessionFactory();
		Session session = sessionFactory.openSession();		

		 out.println("Hibernate Session opened.<br>");
         session.close();
         out.println("Hibernate Session closed.<br>");		

		out.println("</body></html>");
		out.close();
	}

}
