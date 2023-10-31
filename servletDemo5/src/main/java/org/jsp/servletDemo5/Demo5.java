package org.jsp.servletDemo5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myForm")

public class Demo5 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name1=req.getParameter("name");
		String email1=req.getParameter("email");
		
		
		PrintWriter out=res.getWriter();
		
		out.print("name : "+name1+"\n\n"); 
		
		out.print("email : "+email1);
	}

}
