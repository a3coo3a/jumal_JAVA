package 배열.응용;

import java.util.Random;

public class 랜덤한값100정렬 {
	public static void main(String[] args) {

		Random r = new Random();
		int[] number = new int[1000];

		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(1000); // 1000보다 작게 입력해 0~999까지
		}

		// 1. 최대 값과 최소 값을 찾아 보세요
		int max = number[0];
		int min = number[0];
		int indexMax = 0;
		int indexMin = 0;

		for (int i = 1; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
				indexMax = i;
			}
			if (min > number[i]) {
				min = number[i];
				indexMin = i;
			}
		}

		System.out.println("----------결과----------");
		// 2. 999가 있는지 확인해 보고, 위치를 찾아 보세요
		
		for (int i = 0; i < number.length; i++) {
			if (number[i] == 999) {
				System.out.println(number[i] + "의 위치 :" + i);
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최대값의 index : " + indexMax);
		System.out.println("최소값 : " + min);
		System.out.println("최소값의 index : " + indexMin);

	}
}
