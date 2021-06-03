package com.ict.model;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command02 {
	//계산기 메소드
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
		//계산 결과 구하기
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
		return msg;
	}
}
