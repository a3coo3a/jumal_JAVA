package 배열;

import java.util.Scanner;

public class 반복입력 {

	public static void main(String[] args) {
		// 5번 입력
		// 입력하기위해서 Scanner필요
		Scanner sc = new Scanner(System.in);
		//키보드로 입력할 수 있는 부품을 사용함.
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("성적을 입력하시오>> ");
			 num[i] = sc.nextInt();//String->int
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		int sum = num[1] + num[3];
		System.out.println("두번째와 네번째의 합은 " + sum);
		int sum2 = 0;//전체 더해서 누적
		for (int i = 0; i < num.length; i++) {
			sum2 = sum2 + num[i]; 
		}
		System.out.println("전체 합은 " + sum2);
		System.out.println("전체 개수는 " + num.length + "개");
		System.out.println("전체 평균은 " + sum2/num.length);
	}

}
