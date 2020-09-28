package 배열의응용;

import java.util.Random;

public class 많은수최대값찾기 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[1000];
		//1. 0부터 1000미만의 값을 배열에 넣어서,위치와 함께 값 출력
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
			System.out.println(i + ": " + num[i]);
		}
		//2. 최대값을 찾아보세요.
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("최대값은 " + max);
		//3. 최대값이 몇 개인가?
		//4. 최대값의 위치를 찾아보세요.
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i] == max) {
				count++;
				System.out.println("최대값의 위치는 " + i);
			}
		}
		System.out.println("최대값의 개수는 " + count + "개");
		//5. 평균을 구해보세요.
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		double avg = (double)sum / num.length;
		System.out.println("평균은 " + avg);
		//6. 평균보다 높은 점수는 몇 개인가요?
		int count2 = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > avg) {
				count2++;
			}
		}
		System.out.println("평균보다 높은 개수는  " + count2);
	}
}




