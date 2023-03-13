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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.sl.util.DBUtil;

public class JDBCPreparedStatementDemo extends HttpServlet {
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
		PreparedStatement pStmt = null;
		try {
			pStmt = connection.prepareStatement("INSERT INTO EPRODUCT(name,price) VALUES(?,?)");

			pStmt.setString(1, "HP MONITOR 1001");
			pStmt.setFloat(2, 10000);

			pStmt.executeUpdate();

			pStmt.setString(1, "HP MONITOR 1002");
			pStmt.setFloat(2, 20000);

			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		;

		// Close the DB connection and the Writer.
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
