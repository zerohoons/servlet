package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Command;
import com.ict.model.Command01;
import com.ict.model.Command02;
import com.ict.model.Command03;

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
		
		
		//Command01,Command02,Command03이 모두 같은 형태의 메소드를 사용하고 있기 때문에,
		//Command라는 이름의 interface를 만들어 사용하는 것도 가능하다.
		Command comm = null;
		switch(cmd) {
		case "1" :
			// 오늘의 날짜와 운세
			comm = new Command01();
			break;
		case "2" :
			comm = new Command02();
			// 계산기 실행
			break;
		case "3" :
			comm = new Command03();
			// 성적처리 실행
			break;
		}
		String msg = comm.exec(request, response);
		out.println(msg);
	}
}
