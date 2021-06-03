package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/Ex10")
	public class Ex10 extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
			doPost(request,response);
		}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset = utf-8");
			PrintWriter out = response.getWriter();
			
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			
			out.println("<h2> Ex10 페이지 </h2>");
			out.println("<h3>");
			out.println("<li>이름 : "+name+"</li>");
			out.println("<li>나이 : "+age+"</li>");
			out.println("</h3>");
			
			//페이지 이동
			//=> 현재 페이지에서 작업한 후, 다른 페이지로 이동하는 것.
			//1. 리다이렉트 : 다른 페이지로 이동하면서 기존의 request 와 response 정보가 사라지고, 새로운 request와 response가 만들어진다.
			//				> 이 과정에서 파라미터 값이 사라지게 되며, 주소창에는 최종 지점의 주소가 보인다.
			
			// 사용방법 : response.sendRedirect("이동할 주소");
			// 이 때, 이동할 주소가 servlet인 경우, 확장자는 생략가능하다. 다만, html 경우 확장자를 기재해야한다.
			
			response.sendRedirect("Ex11");
		
		}
}