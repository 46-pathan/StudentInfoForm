package com.tcs;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */

//Write a Java program to submit student information (fname, lname, email, mobile, 
//gender, password) using jsp form to servlet. Fetch data at servlet and print all the 
//data in console. 


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		String password=request.getParameter("password");
		
		System.out.println("firstname: "+fname);
		System.out.println("lastname: "+lname);
		System.out.println("email: "+email);
		System.out.println("mobile: "+mobile);
		System.out.println("gender: "+gender);
		System.out.println("password: "+password);
		
		
		
	}

}
