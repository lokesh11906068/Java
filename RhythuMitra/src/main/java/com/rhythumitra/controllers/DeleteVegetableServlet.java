package com.rhythumitra.controllers;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rhythumitra.client.Vegetable;
import com.rhythumitra.model.*;
import com.rhythumitra.service.*;
import com.rhythumitra.service.*;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/deleteVegetable")
public class DeleteVegetableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IVegetableService ivegetableService= new VegetableServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteVegetableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");

        PrintWriter out=response.getWriter();
        //Getting Value
        Integer id=Integer.parseInt(request.getParameter("id"));
 
        //Calling
        ivegetableService.deleteVegetable(id);
        request.setAttribute("message", "Vegetable Successfully Deleted");
        //send to view Message
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("final.jsp");
        requestDispatcher.forward(request, response);
        
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
