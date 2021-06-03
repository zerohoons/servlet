package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Command01;

/**
 * Servlet implementation class Ex14_1
 */
@WebServlet("/Ex16")
public class Ex16 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		//자바 클래스를 별도로 만들어 실행한다.
		String cmd = request.getParameter("cmd");
		switch(cmd) {
		case "1	" :
			// 오늘의 날짜와 운세
			Command01 cmd1 = new Command01();
			String msg1 = cmd1.exec(request, response);
			out.println(msg1);
			System.out.println(msg1);
			break;
		case "2" :
			Command01 cmd2 = new Command01();
			String msg2 = cmd2.exec(request, response);
			// 계산기 실행
			break;
		case "3" :
			Command01 cmd3 = new Command01();
			String msg3 = cmd3.exec(request, response);
			// 성적처리 실행
			break;
		}
	

}
}
