package 배열개념;

import java.util.Random;

public class 많은값다루기 {

	public static void main(String[] args) {

		int[] num = new int[1000];
		int[] num2 = new int[1000];
		Random r = new Random(42);	// 가짜 랜덤, 유사 랜덤
		
		// System.out.println(r.nextInt(1000));

		// 배열 생성
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
			num2[i] = r.nextInt(1000);
		}
		
		// 배열 값 출력
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + " : " + num[i] + " <-> " + num2[i]);
		}
		
		// 처리
		int count = 0;
		System.out.println("num2가 더 큰 위치는?");
		System.out.print(">> ");
		for (int i = 0; i < num.length; i++) {
			if (num2[i] > num[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\nnum2가 더 큰 수의 갯수 : " + count);
		

	}
}
