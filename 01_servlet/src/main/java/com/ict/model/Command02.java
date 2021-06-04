package com.ict.model;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command02 implements Command{
	//계산기 메소드
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
		//계산 결과 구하기
		try {
		
		int s1 = Integer.parseInt(request.getParameter("s1"));
		int s2 = Integer.parseInt(request.getParameter("s2"));
		String op = request.getParameter("op");
		
		int k = 0;
		
		switch(op) {
		case "+" : k=(s1+s2); break;
		case "-" : k=(s1-s2); break;
		case "*" : k=(s1*s2); break;
		case "/" : k=(s1/s2); break;
		}
		
		msg = s1+op+s2+" = " + k + " 입니다.";
		
		} catch (Exception e) {
			msg =  "나눌 수 없는 숫자가 입력되었습니다.";
		}
		return msg;
	}
}
