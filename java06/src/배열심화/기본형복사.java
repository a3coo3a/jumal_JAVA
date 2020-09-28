package 배열심화;

public class 기본형복사 {
	public static void main(String[] args) {

		// 기본형(정수, 실수, 문자, 논리) 복사
		// 기본형에 대한 값이 변수에 저장
		int x = 100;
		int y = x;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("========================================");
		x = 200;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
