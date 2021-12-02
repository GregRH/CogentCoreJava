package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.StudentDTO;
import com.nt.service.IStudentMgmtService;
import com.nt.service.StudentMgmtServiceImpl;

/**
 * Servlet implementation class MainController
 */

public class MainControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IStudentMgmtService service;
    
    public void init() {
    	System.out.println("main init");
    	try {
    		service=new StudentMgmtServiceImpl();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public MainControllerServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String sname=request.getParameter("sname");
		String addrs=request.getParameter("sadd");
		int marks1=Integer.parseInt(request.getParameter("marks1"));
		int marks2=Integer.parseInt(request.getParameter("marks2"));
		int marks3=Integer.parseInt(request.getParameter("marks3"));
		
		StudentDTO dto=new StudentDTO();
		dto.setSname(sname);dto.setSadd(addrs);
		dto.setMarks1(marks1);dto.setMarks2(marks2);dto.setMarks3(marks3);
		try {
			String result=service.generateResult(dto);
			pw.println("<h1 style='color:red;text-align:center'>Result is:: "+result+"</h1>");
		}catch(Exception e) {
			e.printStackTrace();
			pw.println(("<h1 style='color:red;text-align:center'>Problem in Student Registration</h1>"));
		}
		pw.println("<br><br><a href='student_register.html'>home</a>");
		pw.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
