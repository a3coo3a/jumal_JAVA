package 복습;

import java.util.Scanner;

public class 외부입력저장2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];//크기가 고정! 
		//배열은 자동초기화 확인! {0,0,0,0,0} //0~4
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자입력>> ");
			num[i] = sc.nextInt();
		}
		//입력했던 값들 배열에 잘 들어있난 확인
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}





