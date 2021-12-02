package com.nt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.BookDetailsDTO;
import com.nt.service.BookMgmtService;
import com.nt.service.BookMgmtServiceImpl;

/**
 * Servlet implementation class MainServletController
 */
@WebServlet("/controller")
public class MainServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    private BookMgmtService service;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		service = new BookMgmtServiceImpl();
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String category= request.getParameter("category");
		String outputType=request.getParameter("source");
		try {
			List<BookDetailsDTO> listDTO=service.searchBooksByCategory(category);
			request.setAttribute("booksList", listDTO);
			if(outputType.equalsIgnoreCase("HTML")) {
				System.out.println("HTML");
				
				RequestDispatcher rd=request.getRequestDispatcher("/html_print.jsp");
				rd.forward(request, response);
			}
			else {
				System.out.println("Excell");
				RequestDispatcher rd=request.getRequestDispatcher("/excel_screen.jsp");
				rd.forward(request, response);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
