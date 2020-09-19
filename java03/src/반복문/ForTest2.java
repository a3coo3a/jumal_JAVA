package 반복문;

public class ForTest2 {

	public static void main(String[] args) {
		
		 
//		for (int i = 0; i < 10 ; i++) {
//			System.out.print("*");
//		}
		// i : 횟수를 카운트할 때 사용
		// 	      연산할 데이터로 사용
		
		// 1~10 모두 더하자.
		int sum = 0;		// 0으로 초기화 하지 않으면 쓰레기 값이 들어가 있어 계산의 혼돈을 줄 수 있다.
		// 누적시키는 변수는 반복문 안에서 변수를 만들지 않는다.
		// 누적시키는 변수는 반복문 안에서 선언을 하면 안된다.
		for (int i = 1; i <= 10000; i++) {
			// 1 + 2  + 3 + 4 .....
			sum += i;
		//System.out.println(sum);
		}
		System.out.println("1~10까지 합 : "+ sum);
		
		
		
		
		
		
	}
}
