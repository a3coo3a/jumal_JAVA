package 배열;

public class 배열생성정리문제 {

	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		int sum = num[0] + num[1];
		System.out.println("합은 " + sum);
		int sum2 = 0;//누적시키는 변수
		for (int i = 0; i < num.length; i++) {
			sum2 = sum2 + num[i];
		}
		System.out.println("전체 합은 " + sum2);
		
		//for-each로 전체를 더해보세요.
		int sum3 = 0;
		for (int x : num) { //{10, 20, 30, 40, 50}
			sum3 = sum3 + x;
		}
		System.out.println("전체 합은 " + sum3);
	}
}



