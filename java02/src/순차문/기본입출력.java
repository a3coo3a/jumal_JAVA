package 순차문;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		
		// 1. 입력
		String name = JOptionPane.showInputDialog("이름을 입력");
		
		// 2. 검색결과 찾아오는 처리
		String result = name + " 검색 결과 목록";
				
		// 3. 찾아온 것을 출력
		System.out.println(name + "에 대한 검색결과는 : " + result);
		
	}

}
