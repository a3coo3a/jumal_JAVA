package 순차문;

import java.util.Date;
import java.util.Random;

import javax.swing.JButton;

public class 날짜시간 {
	
	public static void main(String[] args) {
		// new 복사해올때 사용하는 키워드
		// 변수명을 만듬으로 해서 RAM에다가  Date를 복사해서 가져다 놓은것 
		Date date = new Date();
//		Random r = new Random();
//		JButton b = new JButton();
		
		int year = date.getYear(); //년도 구해주는 명령어
		int year2 = year + 1900;	// 1900년을 기준으로 만들어서
		System.out.println("올해 연도는 " + year2 + "년");
	
		int month = date.getMonth();	
		int month2 = month + 1;	//음력이 기준이 되어서 양력으로 맞춰야함
		System.out.println("이번 달은 " + month2 + "월");
		
		int today = date.getDate();
		System.out.println("오늘은 " + today + "일");
	
		
		// 시분초
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println("현재 시각은 " + hour + "시 " + min + "분 " + sec +"초 ");
	
	
	
	}
}
