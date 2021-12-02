package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */

public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("pname");
		int age=Integer.parseInt(request.getParameter("page"));
		String gender=request.getParameter("gender");
		String addrs=request.getParameter("paddrs");
		String ms=request.getParameter("ms");
		if(ms==null)
			ms="single";
		String qlfy=request.getParameter("qlfy");
		String hobies[]=request.getParameterValues("hb");
		if(hobies==null)
			hobies=new String[] {"no hobies are selected"};
		String languages[]=request.getParameterValues("languages");
		if(languages==null)
			languages=new String[] {"no languages are selected"};
		long phone=Long.parseLong(request.getParameter("phone"));
		String email=request.getParameter("email");
		int favNumber=Integer.parseInt(request.getParameter("favNumber"));
		String dob=request.getParameter("dob");
		String tob=request.getParameter("tob");
		String month=request.getParameter("birthMonth");
		String favColor=request.getParameter("favColor");
		long salary=Long.parseLong(request.getParameter("salary"));
		String fburl=request.getParameter("fbUrl");
		if(gender.equalsIgnoreCase("M")) {
			if(age<5)
				pw.println("<h1 style='color;text-align:center'>Master."+name+" u r baby boy</h1>");
			else if(age<13)
				pw.println("<h1 style='color;text-align:center'>Master."+name+" u r small boy</h1>");
			else if (age<20)
				pw.println("<h1 style='color;text-align:center'>Mr."+name+" u r teenage boy</h1>");
			else if(age<35)
				pw.println("<h1 style='color;text-align:center'>Mr."+name+" u r young man</h1>");
			else if (age<50)
				pw.println("<h1 style='color;text-align:center'>Mr."+name+" u r middle-aged man</h1>");
			else
				pw.println("<h1 style='color;text-align:center'>Mr." +name+" u r old man</h1>");
		}
		else {
			if(age<5)
				pw.println("<h1 style='color;text-align:center'>Master."+name+"u r baby girl</h1>");
			else if(age<13)
				pw.println("<h1 style='color;text-align:center'>Master."+name+"u r small girl</h1>");
			else if(age<20) {
				if(ms.equalsIgnoreCase("married"))
					pw.println("<h1 style='color;text-align:center'>Mrs."+name+"u r teenage girl</h1>");
				else
					pw.println("<h1 style='color;text-align:center'>Miss."+name+"u r teenage girl</h1>");
			}
			else if (age<35) {
				if(ms.equalsIgnoreCase("married"))
					pw.println("<h1 style='color;text-align:center'>Mrs."+name + "ur young woman</h1>");
				else
					pw.println("<h1 style='color;text-align:center'>Miss."+name+ "ur young woman</h1>");
			}
			else if(age<50) {
				if(ms.equalsIgnoreCase("married"))
					pw.println("<h1 style='color;text-align:center'>Mrs."+name+ "ur middle-aged woman</h1>");
				else
					pw.println("<h1 style='color;text-align:center'>ss."+name+ "ur middle-aged woman</h1>");
			}
			else {
				if(ms.equalsIgnoreCase("married"))
					pw.println("<h1 style='color;text-align:center'>Mrs."+name+ "ur old woman</h1>");
				else
					pw.println("<h1 style='color;text-align:center'>ss."+name+ "ur old woman</h1>");
			}
		}
		
		pw.println("<h2 style='color:blue'>The submitted Details are</h2>");
		pw.println("<br><b>name::"+name+"</b>");
		pw.println("<br><b>age::"+age+"</b>");
		pw.println("<br><b>addrs::"+addrs+"</b>");
		pw.println("<br><b>gender::"+gender+"</b>");
		pw.println("<br><b>Marital status::"+ms+"</b>");
		pw.println("<br><b>Qualification::"+qlfy+"</b>");
		pw.println("<br><b>hobies::"+Arrays.toString(hobies)+"</b>");
		pw.println("<br><b>Languages::"+Arrays.toString(languages)+"</b>");
		pw.println("<br><b>favNumber::"+favNumber+"</b>");
		pw.println("<br><b>fav color::"+favColor+"</b>");
		pw.println("<br><b>phone::"+phone+"</b>");
		pw.println("<br><b>DOB::"+dob+"</b>");
		pw.println("<br><b>TOB::"+tob+"</b>");
		pw.println("<br><b>fb URL::"+fburl+"</b>");
		pw.println("<br><b>salary::"+salary+"</b>");
		pw.println("<br><b>email::"+email+"</b>");
		pw.println("<br><br><a href='input.html>home</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
