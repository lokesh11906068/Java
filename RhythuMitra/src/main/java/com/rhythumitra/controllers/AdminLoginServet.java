package com.rhythumitra.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLoginServet
 */
@WebServlet("/adminlogin")
public class AdminLoginServet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

        PrintWriter out=response.getWriter();
        
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(username.equals("lokesh")&&password.equals("123")) {
        	request.setAttribute("username", username);
        	RequestDispatcher requestDispatcher=request.getRequestDispatcher("adminpage.jsp");
        	requestDispatcher.forward(request, response);
        }
        else {
        	RequestDispatcher requestDispatcher=request.getRequestDispatcher("adminlogin.jsp");
        	requestDispatcher.forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
