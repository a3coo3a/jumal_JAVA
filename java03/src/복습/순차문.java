package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 순차문 { // 부품 하나하나 == class, class를 조립하는 거야

	public static void main(String[] args) {

		// 순차문 (입력 > 처리 > 출력)
		// 입력하는 방법 :
		// 1. 너무 많이 사용하는 것 : 대문자로 접근 , 미리 RAM에 복사
		// String today = JOptionPane.showInputDialog("온도 입력");
		// 모든 입력한 데이터 타입은 String !!

		// 2. 자주 사용하지 않는 것 : 필요할 때 RAM에 복사
		Scanner scan = new Scanner(System.in); // 어떤걸 복사해서 넣는지 + 변수 이름 = 복사할거야(new) + 복사할 것.
		System.out.print("오늘의 온도 입력  >> ");
		double todayTemp = scan.nextDouble(); // 모든 입력은 String인데 double로 바꿔 주는 입력

		if (todayTemp >= 30) {
			JOptionPane.showMessageDialog(null, "너무 더워~"); // 넣을게 없어 == null
		} else {
			JOptionPane.showMessageDialog(null, "괜찮아요~");
		}

		System.out.print("당신이 생각하는 적정 온도는? > ");
		double thinkTemp = scan.nextDouble();
		double diff = todayTemp - thinkTemp;
		// 자바에서는 연산시 하나라도 double이면  결과는 무조건 double
		
		System.out.println("--------------------------------");
		//System.out.println("결과 : 현재 온도와의 차이는 " + diff);
		JOptionPane.showMessageDialog(null, "결과 : 현재 온도와의 차이는 " + (int)diff);
		// int <-- double : 강제 데이터 형변환 , 강제 형변환
		
		
		
		scan.close();

		
		
	}

}
