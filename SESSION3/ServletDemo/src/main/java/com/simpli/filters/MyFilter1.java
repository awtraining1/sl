package com.simpli.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter1 extends HttpFilter implements Filter {
       
   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Inside MyFilter1 doFilter");
		PrintWriter out = response.getWriter();
		
		// Business logic
		// If age is -ve number then reject the request
		// else allow it to proceed to the target servlet(s)
		
		
			
		
		int age = Integer.parseInt(request.getParameter("age"));
		if(age<0) {
			out.write(" Invalid age (negative number). "
					+ "Request won't proceed to target servlet");
		}
		else {		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);	
		}
	}
	

}
