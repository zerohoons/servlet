package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex08")
public class Ex08 extends HttpServlet {
	private static final long SerialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("korean"));
		int eng = Integer.parseInt(request.getParameter("english"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		int sum = kor+eng+math;
		double avg = (double)((int)((sum/3)*100)/100);
		
		String level = "";
		
		if (avg>=90) {
			level = "A";
		}else if(avg>=80) {
			level = "B";
		}else if(avg>=70) {
		level = "C";
		}else {level = "F";}
		
		out.println("<h3>");
		out.println("<p>"+name+"의 총점은 "+sum+" 점, 평균은 "+ avg+"점 입니다.</p>");
		out.println("<p>"+name+"의 학점은 "+level+" 입니다.</p>");
		out.println("</h3>");
	}
}
