package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
//		ctrl+/ : 자동주석
		
/* ctrl + shift + / : 여러줄 자동 주석
 * 정수 값 2개를 변수에 각각 넣고, 
 * 1)두 수의 합을 변수에 저장 
 * 2)합을 2로 나누어서 프린트
 */
		int x = 55;
		int y = 32;
		int sum = x + y;
		//자바에서는 정수와 정수계산은 무조건 정수결과!
		int avg = sum / 2;
		System.out.println("평균 : " + avg);
		//자바에서는 하나라도 실수이면 무조건 실수결과!
		//하나 이상을 실수로 강제로 바꾸어주면 해결됨!
		double avg2 = sum / 2.0;
		System.out.println("평균 : " + avg2);
		System.out.println("평균 : " + avg2);
		
		int parent = 2;
		double avg3 = (double)sum / parent;
		//강제타입변환(강제형변환)
		System.out.println("평균 : " + avg3);
		
		
	}

}
