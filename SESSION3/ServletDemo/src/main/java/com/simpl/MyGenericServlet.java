package com.simpl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

public class MyGenericServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	// We can code the init method also
	
	@Override
	public void service(ServletRequest req,  ServletResponse res) throws IOException {
		
		//Get a writer tyo send the response
		PrintWriter out = res.getWriter();
		
		out.write("<html> Hello from MyGenericServlet </html>");
		
		//out.close();
		
	}
	
	// We can code the destroy method also

}
