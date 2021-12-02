package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class MarriageServlet
 */

public class MarriageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarriageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Marriage Servlet.doGet(-,-)");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("Marriage Servlet.doPost(-,-)");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("pname");
		String tage= req.getParameter("page");
		String gender=req.getParameter("gender");
		String vstatus=req.getParameter("vflag");
		int age = 0;
		if(vstatus.equalsIgnoreCase("no")) {
			List<String>errList=new ArrayList();
			System.out.println("MarriageServlet.doPost()::Server side form validation logic");
			if(name==null||name.equals("")||name.length()==0) {
				errList.add("Person name is required");
			}else if(name.length()<5) {
				errList.add("Person name must have minimum 5 characters");
			}
			if(tage==null||tage.equals("")||tage.length()==0) {
				errList.add("Person age is required");
			}
			else {
				try {
					age=Integer.parseInt(tage);
					if(age<1||age>125) {
						errList.add("Person age must be given 1 through 125");
					}
				}
				catch(NumberFormatException nfe) {
					errList.add("Person age must be numeric value");
				}
			}
			if(!errList.isEmpty()) {
				errList.forEach(msg->{
					pw.println("<li><span style='color:red'>"+msg+"</span></li>");
				});
				return;
				}
			}
		else {
			age=Integer.parseInt(tage);
		}
		System.out.print("MarriageServlet.doPost()::Server side b.logic");
		pw.println("<h1 style='color:blue;text-align:center'>Marriage.com</h1>");
		if(gender.equalsIgnoreCase("M")) {
			if(age<21) {
				pw.println("<h1 style='color:red;text-align:center'>Mr."+name+" u r not eligible for marriage enjoy life</h1>");
			}else {
				pw.println("<h1 style='color:red;text-align:center'>Mr."+name+" u r  eligible for marriage, But think once </h1>");
			}
		}
		else {
			if(age<18)
				pw.println("<h1 style='color:red;text-align:center'>Ms."+name+" u r not eligible for marriage be happy</h1>");
			else
				pw.println("<h1 style='color:red;text-align:center'>Ms."+name+" u r eligible for marriage but think trice</h1>");
		}
		pw.println("<br><a href='input.html'><img src='images/home.png' width='50' height='50'></a>");
		pw.close();
	}

}
