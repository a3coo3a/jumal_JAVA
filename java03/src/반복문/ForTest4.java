package 반복문;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {

		// 더하고자 하는 시작값 : 5
		// 더하고자 하는 종료값 : 10
		
		// 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("더하고자 하는 시작값 : ");
		int start = scan.nextInt();
		System.out.print("더하고자 하는 종료값 : ");
		int end = scan.nextInt();
		
		// 처리
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		
		// 출력
		System.out.println(start + "부터 " + end + "까지의 합 : " + sum);

		scan.close();
	}
}
