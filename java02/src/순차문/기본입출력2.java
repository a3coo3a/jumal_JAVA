package 순차문;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {

		// 입력 >>
		// 이름 입력 : 홍길동
		// 나이 입력 : 100
		// 소속 입력 : kg
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		String age = JOptionPane.showInputDialog("나이를 입력하세요");
		String company = JOptionPane.showInputDialog("소속을 입력하세요");
				
		// 처리 >>
		// 위 입력 데이터를 결합
		String result = name+ "은 나이가 " + age + "세이고, 소속은 " + company + "이다.";
		
		// 출력 >>
		// 처리한 결과를 출력
		System.out.println(result);
	}

}
