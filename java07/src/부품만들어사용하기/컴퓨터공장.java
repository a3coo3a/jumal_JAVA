package 부품만들어사용하기;

public class 컴퓨터공장 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터();
		//com1: 대상(object, 객체)
		//컴퓨터 class로 com1객체를 생성
		//객체생성할 때 new를 가지고 함.
		com1.가격 = 1000;
		com1.모니터크기 = 21;
		com1.제조회사 = "apple";
		System.out.println(com1);
	
		컴퓨터 com2 = new 컴퓨터();
		com2.가격 = 2000;
		com2.모니터크기 = 35;
		com2.제조회사 = "banane";
		
		
	}

}
