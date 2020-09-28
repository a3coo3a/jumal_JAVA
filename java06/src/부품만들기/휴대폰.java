package 부품만들기;

public class 휴대폰 {
	// 상태 : 멤버변수		>> new 작성시 각각 복사
	// - 색, 회사
	String color;
	String company;
			
	// 기능(동작) : 함수(메서드, 방법) => 멤버 메서드		>> new 작성시 복사되지 않고 호출하여 사용
	// 메서드를 만드는 것 => 기능을 정의하다
	public void 전화하다() {
		System.out.println("휴대폰으로 전화하다");
	}
	public void 인터넷하다() {
		System.out.println("휴대폰으로 인터넷하다");
	}
}
