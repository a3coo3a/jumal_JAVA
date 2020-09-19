package 배열개념;

public class 배열을만들어보자 {

	public static void main(String[] args) {
		int[] s = new int[10];
		int[] s2 = new int[10];
		
		// s에는 int배열을 가르키는 주소가 들어가게 된다.
		// 참조형 변수
		System.out.println("s에 저장된 주소 : " + s);
		System.out.println("s2에 저장된 주소 : " + s2);
		System.out.println("배열의 개수 : " + s.length);
		// length : 읽기전용 개수가 들어가는 변수 
		
		// 배열 10개짜리를 만들면 -> 배열 10개, 배열 가리키는 참조변수 1개, length 변수 1개 해서 총 개수의 +2개 생성됨
		
		s[0] = 100;
		s[5] = 500;
		s[9] = 900;	// s[s.length-1] = 900; 과 같은 코드
		
		// for문에서의 i는 인덱스의 역할 : 위치 지정 
		// i는 0부터 시작
		// 
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + " : " + s[i]);
		}
		
		
		
		
		
	}

}
