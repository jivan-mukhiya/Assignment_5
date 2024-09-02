package com.area;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AreaSelvate")
public class AreaSelvate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AreaSelvate() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Area.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int l=Integer.parseInt(request.getParameter("length"));
		int b=Integer.parseInt(request.getParameter("breadth"));
		int area=l*b;
		request.setAttribute("area", area);
		request.getRequestDispatcher("Result.jsp").forward(request, response);	
	}

}
