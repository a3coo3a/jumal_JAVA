package 반복문;

public class WhileTest {

	public static void main(String[] args) {
		// 반복해야 하는 경우 => 조건이 맞아야 반복하게 된다.
		// 무한반복, 횟수지정반복 중 선택 사용

		// 무한반복 : true 라고 조건문에 작성시 계속 반복
//		while (true) {	// true여야 반복하게 된다.
//			System.out.println("무한루프 : 무한으로 계속 반복");
//		}

		// 횟수 지정 반복
		int start = 1; // 시작값
		while (start <= 10) { // 반복할 조건
			System.out.println("start변수 값  >> " + start);
			start++; // 증감값 : 증감연산자를 활용하였음.
		}
		
		
		
		
		

	}

}
