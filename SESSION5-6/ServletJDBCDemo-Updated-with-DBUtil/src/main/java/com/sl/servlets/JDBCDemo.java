package com.sl.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Properties;

import com.sl.util.DBUtil;

public class JDBCDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBUtil dbUtil;
	Connection connection;

	public void init(ServletConfig config) {

		try {
			// STEP 2 Load the properties file
			InputStream in = config.getServletContext().getResourceAsStream("/WEB-INF/database.properties");
			Properties props = new Properties();
			props.load(in);
			String url = props.getProperty("url");
			String userid = props.getProperty("userid");
			String password = props.getProperty("password");

			// STEP 3 Connect to the database;
			DBUtil dbUtil = new DBUtil(url, userid, password);
			connection = dbUtil.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<html>");

		// STEP 4 Create Statement object;
		Statement stmt = null;
		try {
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		;

		// STEP 5 Execute the SQL command on the statement object.
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("SELECT * FROM eproduct");

			// STEP 6 Extract the data from the result (response from the database)
			out.write("<table border=2>");
			while (rs.next()) {
				String ID = rs.getString("ID");
				String name = rs.getString("name");
				float price = rs.getFloat("price");
				String date_added = rs.getString("date_added");

				// Display the info on the webpage
				// out.write(ID +", " + name +", " +price +", " + date_added);
				// out.write("<br>");
				out.write("<tr>" + "<td>" + ID + "<td>" + name + "<td>" + price + "<td>" + date_added);

			}
			out.write("</table>");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		;

		out.write("</html>");
		out.close();

	}

	public void destroy() {
		// Close the DB connection and the Writer.
		try {
			dbUtil.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
