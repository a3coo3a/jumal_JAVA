package 배열개념;

import java.util.Scanner;

public class 입력받아배열에넣자 {

	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			num[i] = scan.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		
		System.out.println();
		System.out.println("평균 합계 : " + sum);
		
		double avg = (double)sum / num.length;
		System.out.println("평균 성적 : " + avg);
		
		scan.close();
	}
}

