package 조건문;

import java.util.Date;

public class SwitchTest02 {

	public static void main(String[] args) {

		Date date = new Date();
		int month = date.getMonth() + 1; // 8

//		if (3 <= month && month <= 5) {
//			
//		}
		// key에 들어갈수 있는 변수 : 정수(byte, short, int), char, String
		// key에 들어갈 수 없는 변수 : 정수 (long), 실수 
		// break가 자동으로 들어있지 않아 수동으로 써줘야 한다. 
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
		
		
		

	}

}
