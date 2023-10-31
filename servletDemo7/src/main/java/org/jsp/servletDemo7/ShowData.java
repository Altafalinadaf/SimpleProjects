package org.jsp.servletDemo7;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class ShowData extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String empid=req.getParameter("empId");
		String empname=req.getParameter("ename");
		String dob=req.getParameter("dob");
		String phn=req.getParameter("phone");
		
		PrintWriter out=resp.getWriter();
		
		out.print("emp Id : "+empid+"\n\n");
		out.print("emp name : "+empname+"\n\n");
		out.print("emp dob : "+dob+"\n\n");
		out.print("emp phone : "+phn+"\n\n");
	}

}
