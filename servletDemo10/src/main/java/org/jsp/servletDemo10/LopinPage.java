package org.jsp.servletDemo10;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class LopinPage extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myname=req.getParameter("name");
		String myemail=req.getParameter("email");
		String pass=req.getParameter("pass");
		String pass2=req.getParameter("pass2");
		PrintWriter out=res.getWriter();
		
		if(myname!=null && myemail!=null && pass!=null && pass2!=null) {
			if(pass.equals(pass2)) {
				req.setAttribute("my-name", myname);
				RequestDispatcher rd=req.getRequestDispatcher("/loginPage.jsp");
				rd.forward(req, res);
			}
			else {
				res.setContentType("text/html");
				out.print("<h1 style='color:red'> mismatch password </h1>");
				RequestDispatcher rd=req.getRequestDispatcher("index10.html");
				rd.include(req, res);
			}
		}
		else {
			res.setContentType("text/html");
			out.print("<h1 style='color:red'>Please enter blank space </h1>");
			RequestDispatcher rd=req.getRequestDispatcher("index10.html");
			rd.include(req, res);
		}
		
	}

}
