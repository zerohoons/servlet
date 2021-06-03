package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex05")
public class Ex05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 (파라미터)에 따른 한글 처리
		request.setCharacterEncoding("utf-8");
		// 응답(브라우저)에 따른 한글 처리
		response.setContentType("text/html; charset=utf-8");
		// 화면(브라우저)에 출력 설정
		PrintWriter out = response.getWriter();
		
		// 클라이언트가 서버에게 정보를 요청하면서 필요한 정보를 보낼 수 있다.
		// 이러한 요청을 처리하기 위해서 함께 전달되는 정보를 파라미터라고 한다.
		// 파리미터를 받아서 처리한 후 필요한 정보를 클라이어트에게 보낸다.
		
		// 파라미터의 자료형은 기본적으로 String 이거나 String[]이다.
		// 같은이름으로 여러개의 값이 넘어면 String[]이고 이름당 하나값이 넘어오면 String 이다.
		// get 방식은 주소창에 파라미터가 보인다.(?name=values&name=value&name=value....)
		// 그러나 post 방식은 주소창에 파라미터가 보이지 않는다.
		
		// 파라미터를 받아서 처리하는 메소드들 
		// 1. request.getParameter("name") : String  => 해당 이름에 매칭 값을 추출해서 저장한다.(값은 하나)
		// 2. request.getParameterValues("name") : String[]  => 해당 이름에 매칭 값을 추출해서 저장한다.(값은 여러개)
		// 3. request.getParameterMap(): Map<String,String[]>  => 맵 형식의 파라미터 일때 사용
		// 4. request.getParamenterNames(): Enumeration<String> => 열거형의 파라미터 일때 
		
		// 만약에 이름(name)과 나이(age)가 파라미터값으로 넘어왔을 때 처리하는 방법
		out.println("<h2> 서블릿 파라미터 예제 </h2>");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println("<h3>");
		out.println("<p>이름 : " + name +"</p>");
		out.println("<p>나이 : " + age +"</p>");
		out.println("</h3>");
		out.println("<hr>");
		
		// 만약, s1,s2,op라는 이름으로 두개의 숫자와 하나의 연산자가 넘어온 다고 할 때, 결과를 내보내자.
		String s1 = request.getParameter("s1");
		String s2 = request.getParameter("s2");
		String op = request.getParameter("op");
		
		int k1 = Integer.parseInt(request.getParameter(s1));
		int k2 = Integer.parseInt(request.getParameter(s2));
		int result = 0;
		
		out.println("<h3>");
		
		switch(op) {
		case"+": result = k1+k2; break;
		case"-": result = k1-k2; break;
		case"*": result = k1*k2; break;
		case"/": result = k1/k2; break;
		}
		
		out.println("<p>결과 : " + k1+op+k2+ "=" + result +"</p>");
		
		out.println("<hr>");
	}
}















