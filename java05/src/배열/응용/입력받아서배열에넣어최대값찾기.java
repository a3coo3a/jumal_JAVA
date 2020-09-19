package 배열.응용;

import java.util.Arrays;
import java.util.Scanner;

public class 입력받아서배열에넣어최대값찾기 {
	public static void main(String[] args) {
		// 입력을 5개 받아서 , 그 중에서 제일 큰수를 찾아 보세요
		// 위치를 찾아 보세요

		Scanner sc = new Scanner(System.in);

		int[] jumsu = new int[5];
		int max = jumsu[0];
		int index = 0;

		// 입력
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("점수 입력 >> ");
			jumsu[i] = sc.nextInt();
		}

		// 처리
		for (int i = 1; i < jumsu.length; i++) {
			if (max < jumsu[i]) {
				max = jumsu[i];
				index = i;
			}
		}

		System.out.println("----------결과----------");
		System.out.println("입력한 수 : " + Arrays.toString(jumsu));
		System.out.println("최대 값 : " + max);
		System.out.println("위치 값 : " + index);

		System.out.println("정렬 후 결과 -----------------");
		Arrays.sort(jumsu);
		System.out.println("정렬 후 목록");
		System.out.println(Arrays.toString(jumsu));

		System.out.println("최소 값 : " + jumsu[0]);
		System.out.println("최대 값 : " + jumsu[jumsu.length - 1]);
		sc.close();
	}

}
