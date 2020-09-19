package 배열.응용;

import java.util.Scanner;

public class 입력받아서배열에넣자 {
	public static void main(String[] args) {
		// 입력을 5개 받아서 , 그 중에서 제일 큰수를 찾아 보세요
		// 위치를 찾아 보세요

		Scanner sc = new Scanner(System.in);

		int[] jumsu = new int[5];

		// 입력
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("점수 입력 >> ");
			jumsu[i] = sc.nextInt();
		}
		
		
		sc.close();
	}
	
	
	
}
