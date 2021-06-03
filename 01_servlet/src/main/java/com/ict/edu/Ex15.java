package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex14_1
 */
@WebServlet("/Ex15")
public class Ex15 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//하나의 servlet에 많은 양의 데이터를 처리하는 단점이 생긴다.
		//이러한 문제를 해결하기 위해 별도의 일처리를 하는 자바클래스를 만들어 호출한다.
		String cmd = request.getParameter("cmd");
		switch(cmd) {
		case "1" :
			Calendar now = Calendar.getInstance();
			out.println("<h2> Ex15 오늘의 날짜 페이지 입니다. </h2>");
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH+1);
			int date = now.get(Calendar.DATE);
			out.println("<h3> 오늘은 "+year+"년 "+month+"월 "+date+"일 입니다. </h3>");
			break;
		case "2" :
			out.println("<h2> Ex15 오늘의 운세 페이지 입니다. </h2>");
			int lucky = (int)(Math.random()*101);
			out.println("<h3> 오늘은 "+lucky+"% 좋은 하루입니다. </h3>");
			break;
		case "3" :
			Calendar now2 = Calendar.getInstance();
			out.println("<h2> Ex15 오늘의 날짜와 운세 페이지 입니다. </h2>");
			int lucky2 = (int)(Math.random()*101);
			int year2 = now2.get(Calendar.YEAR);
			int month2 = now2.get(Calendar.MONTH+1);
			int date2 = now2.get(Calendar.DATE);
			out.println("<h3> 오늘은 "+year2+"년 "+month2+"월 "+date2+"일로 오늘의 운세는 "+lucky2+"% 입니다. </h3>");
			break;
		}
	

}
}
