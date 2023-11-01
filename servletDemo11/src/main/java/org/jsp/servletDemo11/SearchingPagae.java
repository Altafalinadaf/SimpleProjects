package org.jsp.servletDemo11;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class SearchingPagae extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String web=req.getParameter("webname");
		String find=req.getParameter("name");
		//https://www.google.com/search?q="
		// https://www.google.com/search?q=code+
		
		res.sendRedirect("https://www."+web+".com/search?q="+find);
		
		destroy();
	}
	
	

}
