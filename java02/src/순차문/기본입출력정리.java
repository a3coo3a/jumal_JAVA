package 순차문;

import javax.swing.JOptionPane;

public class 기본입출력정리 {

	public static void main(String[] args) {
		
		/*
		 * 반지름 : 3.5
		 * pi = 3.14
		 * 원의 넓이 공식 pi * r * r
		 * 
		 */
		// 입력
		double pi = 3.14;
		String r = JOptionPane.showInputDialog("반지름 값을 입력하세요");
		double rr = Double.parseDouble(r);
		// 처리
		double area1 = pi * rr * rr;
		// 출력
		System.out.println("반지름은 : " + rr + "인\n원의 넓이는 : " + area1 + "\n");
		
		/*
		 * 가로 33.4
		 * 세로 11.5
		 * 사각형의 넓이 : 가로 * 세로
		 * 
		 */
		// 입력
		String wid = JOptionPane.showInputDialog("가로 값을 입력하세요");
		String hei = JOptionPane.showInputDialog("세로 값을 입력하세요");
		double width = Double.parseDouble(wid);
		double height = Double.parseDouble(hei);
		// 처리
		double area2 = width * height;
		// 출력 
		System.out.println("가로 "+ wid + ", 세로 " + hei + "의\n사각형의 넓이는 : " + area2 + "\n");
		
		
		// 원과 사각형 중 누가 더 큰지
		if (area1 > area2) {
			System.out.println("원의 넓이가 더 큽니다.");
		}else {
			System.out.println("사각형의 넓이가 더 큽니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
