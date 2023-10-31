package org.jsp.servletDemo6;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myForm")

public class Demo6 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		String myname = arg0.getParameter("name");
		String myemail = arg0.getParameter("email");
		String mypass=arg0.getParameter("pass");

		PrintWriter out = arg1.getWriter();
		out.print("Name  : "+myname+"\n\n");
		out.print("Email : "+myemail+"\n\n");
		out.print("password : "+mypass+"\n\n");
		
		destroy();

	}
}
