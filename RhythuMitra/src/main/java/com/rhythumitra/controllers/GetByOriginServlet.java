package com.rhythumitra.controllers;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rhythumitra.model.*;
import com.rhythumitra.service.*;
import com.rhythumitra.service.*;
import com.rhythumitra.client.Vegetable;
import com.rhythumitra.service.IVegetableService;
import com.rhythumitra.service.VegetableServiceImpl;

/**
 * Servlet implementation class GetAllBooksServlet
 */
@WebServlet("/getbyorigin")
public class GetByOriginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IVegetableService ivegetableService= new VegetableServiceImpl();
		
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetByOriginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String origin=request.getParameter("origin");
		List<Vegetable> vegetables=ivegetableService.getByOrigin(origin);
		request.setAttribute("vegetables", vegetables);
		
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
