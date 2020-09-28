package 부품만들어사용하기;

public class 계좌 {
	String 이름;
	String 계좌이름;
	int 금액;
	
	//new를 가지고 객체를 생성하게 되는데,
	//객체생성시 반드시 멤버변수값을 넣어주고자 하는 경우에는
	//생성자 메서드를 만들어준다.
	//객체생성시 자동호출되는 메서드: 생성자메서드(생성자)
	public 계좌(String 이름, String 계좌이름, int 금액) {
		//내가 넣고자하는 값으로 초기화시킬때!
		this.이름 = 이름;
		this.계좌이름 = 계좌이름;
		this.금액 = 금액;
	}
	
	
	
//	public 계좌(String 이름, String 계좌이름) {
//		this.이름 = 이름;
//		this.계좌이름 = 계좌이름;
//	}



	//한꺼번에 변수값 모두 프린트하고자 하는 경우
	//toString을 override(재정의, 오버라이드)
	@Override
	public String toString() {
		return "계좌 [이름=" + 이름 + ", 계좌이름=" + 계좌이름 + ", 금액=" + 금액 + "]";
	}

	

	
	
	
}
