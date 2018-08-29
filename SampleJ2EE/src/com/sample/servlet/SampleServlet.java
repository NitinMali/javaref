package com.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {

	//@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		
		out.print("<html><h1>Welcome.............!"+request.getLocalAddr()+"</h1></html>");
	}
}
