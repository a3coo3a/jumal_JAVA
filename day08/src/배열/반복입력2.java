package 배열;

import java.util.Scanner;

public class 반복입력2 {

	public static void main(String[] args) {
		//입력받아서 넣을 공간들을 만들어두어라.
		int[] num = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자입력>> ");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 33) {
				System.out.println(i + "인덱스에 있음.");
			}
		}
	}
}


