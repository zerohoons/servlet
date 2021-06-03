package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07")
public class Ex07 extends HttpServlet {
	private static final long SerialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ doPost(request, response);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		try {
		String n1 = request.getParameter("s1");
		String n2 = request.getParameter("s2");
		String op = request.getParameter("op");
		
		int s1 = Integer.parseInt(n1);
		int s2 = Integer.parseInt(n2);
		
		int k = 0;
		
		switch(op) {
		case "+" : k=(s1+s2); break;
		case "-" : k=(s1-s2); break;
		case "*" : k=(s1*s2); break;
		case "/" : k=(s1/s2); break;
		}
		
		out.println("<h3>");
		out.println("<p> 값은 " + k + " 입니다." + "</p>");
		out.println("</h3>");
		
		} catch (Exception e) {
			out.print("<h2> 나눌 수 없는 숫자가 입력되었습니다. </h2>");
		}
	}
}
