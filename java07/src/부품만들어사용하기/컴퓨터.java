package 부품만들어사용하기;

//틀의 역할
public class 컴퓨터 {
	// 멤버변수
	int 가격;
	String 제조회사;
	int 모니터크기;

	// 다른 생성자가 하나도 없으면, 입력값이 없는
	// 생성자를 자동으로 만들어준다.
	public 컴퓨터() {
	}

	// 멤버메서드
	public void 게임하다() {
		System.out.println("인터넷 게임하다.");
	}

	@Override // 오버라이드
	public String toString() {
		return "[가격=" + 가격 + ", 제조회사=" + 제조회사 + ", 모니터크기=" + 모니터크기 + "]";
	}

	// 컴퓨터클래스로 객체생성시, 객체를 프린트하면,
	// 참조형이므로 주소가 출력!
	/*
	 * public String toString() { return "가격: " + 가격 + "\n" + "제조회사: " + 제조회사 + "\n"
	 * + "모니터의 크기: " + 모니터크기; }
	 */

}
