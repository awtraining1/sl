package com.sl.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCStroredProcedureDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<html>");

		// STEP 1 Register the JDBC Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		;

		// STEP 2 Load the properties file
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/database.properties");
		Properties props = new Properties();
		props.load(in);
		String url = props.getProperty("url");
		String userid = props.getProperty("userid");
		String password = props.getProperty("password");

		// STEP 3 Connect to the database;
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userid, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// STEP 4 Create CallableStatement object;
		try {
			CallableStatement callableStmt = 
					connection.prepareCall("{ call add_product(?, ?) }");
			
			callableStmt.setString(1, "HP Hard disk");
			callableStmt.setFloat(2, 5000);
			
			callableStmt.execute();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		

		// Close the DB connection and the Writer.
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.write("</html>");
		
		response.sendRedirect("list");
		
		out.close();

	}

}
