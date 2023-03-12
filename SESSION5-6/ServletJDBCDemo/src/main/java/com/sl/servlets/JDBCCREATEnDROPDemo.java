package com.sl.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCCREATEnDROPDemo extends HttpServlet {
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

		// STEP 4 Create Statement object;
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			//boolean result1 = stmt.execute("CREATE DATABASE XYZ");
			//boolean result1 = stmt.execute("DROP DATABASE XYZ");
			
			boolean result2 = stmt.execute(			
					"CREATE TABLE mytable(name varchar(40)); ");
			
			/*
			 * We can use the execute method to QUERY also!
			 * In that case the return boolean value will true.
			boolean result3 = stmt.execute(			
					"SELECT * FROM EPRODUCT; ");
			if (result3==true) {
				ResultSet rs = stmt.getResultSet();
				while(rs.next()) {
					// extract the row data...
				}
			}
			*/
			
			out.write("<b>Created a database succesfully "+ "</b>");
		} catch (SQLException e) {

		}

		// Close the DB connection and the Writer.
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.write("</html>");
		out.close();

	}

}