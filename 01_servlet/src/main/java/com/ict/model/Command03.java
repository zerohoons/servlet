package com.ict.model;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command03 implements Command{
	//성적조회 메소드
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
		//성적을 구하기
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
		
		msg = name+"의 총점은 "+sum+" 점, 평균은 "+ avg+"점 입니다.\n"+name+"의 학점은 "+level+" 입니다.";
		
		return msg;
	}
}
