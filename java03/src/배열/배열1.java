package 배열;

public class 배열1 {

	public static void main(String[] args) {
		// 한꺼번에 많은 양의 데이터를 다룰 수 있는 기술
		int[] list = new int[10000];
	
		list[0] = 100;		// 첫번째
		list[49] = 200;		// 50번째
		list[9999] = 300;	// 마지막번째
		
		// 토익 정답999, 답안 999개  => 나는 몇점인가?
		
		int[] 정답 = new int[999];
		int[] 답안 = new int[999];
		
		정답[0] = 3;
		답안[0] = 4;
		
		System.out.println(정답[0] == 답안[0]);
		
	}
	
}
