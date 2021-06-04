package com.ict.model;

import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command01 implements Command{
	
	//오늘 날짜와 운세를 구하는 메소드.
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
		//날짜와 운세 구하기.
		Calendar now = Calendar.getInstance();
		int lucky = (int)(Math.random()*101);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH+1);
		int date = now.get(Calendar.DATE);
		msg = ("<h3> 오늘은 "+year+"년 "+month+"월 "+date+"일로 오늘의 운세는 "+lucky+"% 입니다. </h3>");
		
		return msg;
	}
}
