package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/emp")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		    String eName=request.getParameter("eName");
		    String dob=request.getParameter("dob");
		    String email=request.getParameter("emailId");
		    String password=request.getParameter("pass");
		    String gender=request.getParameter("gender");
		    String dept=request.getParameter("dept");
		    String[] shift=request.getParameterValues("shift");
		    out.print("<h1><body><html>Employee Details</h1></body></html><h2>");
		    out.print("<br>Employee eName"+eName);
		    out.print("<br>Employee dob"+dob);
		    out.print("<br>Employee email"+email);
		    out.print("<br>Employee password"+password);
		    out.print("<br>Employee gender"+gender);
		    out.print("<br>Employee dept"+dept);
		    out.print("<br>Employee shift:");
		    	for(int i=0;i<shift.length;i++){
		    		out.print(shift[i]);
		    	}
		    	out.print("</h2></body></html>");
		    
		    
	}

}
