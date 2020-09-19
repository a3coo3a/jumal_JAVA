package 부품만들기;

public class 모니터 {
	// 상태 => 변수
	int size;
	String color;
	
	// 기능 => 명령어
	public void 켜다() {
		System.out.println("모니터가 켜진다");
	}
	public void 끄다() {
		System.out.println("모니터가 꺼진다.");
	}
}
