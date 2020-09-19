package 순차문;

import java.util.Date;

import javax.swing.JOptionPane;

public class 기본입출력3 {

	public static void main(String[] args) {
		// 외부에서의 모든 입력타입은  String
		// 18세 이상 성인으로 판별
		// 숫자로 인식해야지만 비교가능
		// 2000년생 나이 계산
		String year = JOptionPane.showInputDialog("태어난 년도 입력하세요");
		
		// String -> int : 기본형과 기본형이 아닌 것이라 서로 형변환은 불가
		// 기본형끼리만 형변환 가능
		// String을 int로 형변환 가능 한 것 : Integer.parseInt()
		// parse = 분석하다.
		int year2 = Integer.parseInt(year);	// '2000년'이라고 입력시 int로 분석이 되지 않아 변환되지 않음. '2000'이라고 입력해야 함.
		Date date = new Date();
		int year3 = date.getYear() + 1900;
		int age = year3 - year2 + 1;
		
		System.out.println("올해는 " + year3 + "년");
		if ( age >= 18 ) {	// true
			System.out.println("성인");
		}else {		// false
			System.out.println("미성년자");
		}
		System.out.println("당신의 나이는 "+ age + "세 이시군요.");
		
		
		
		
		
		
	}

}
