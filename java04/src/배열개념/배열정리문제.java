package �迭����;

import java.util.Scanner;

public class �迭�������� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		// 1.-------------------------------------------------------
//		int[] num = new int[5];
//
//		for (int i = 0; i < num.length; i++) {
//			num[i] = 10 * (i + 1);
//		}
//		System.out.println("ù��° ���� �ι�° ���� ���ؼ� ��� : " + (num[0] + num[1]));
//		System.out.println();
//
//		// 2.-------------------------------------------------------
//		String[] str = new String[3];
//		for (int i = 0; i < str.length; i++) {
//			System.out.print("������ �Է��ϼ��� > ");
//			str[i] = scan.next();
//		}
//		System.out.println("**" + str[0] + "���ٴ� " + str[1] + "**");
//		System.out.println();
//
//		// 3.-------------------------------------------------------
//		int[] nnum = new int[4];
//		for (int i = 0; i < nnum.length; i++) {
//			nnum[i] = 11 * (i + 1);
//		}
//		for (int i = 0; i < nnum.length; i++) {
//			if (nnum[i] == 33) {
//				System.out.println("33�� ���� ���� ��ġ�� : " + i);
//			}
//		}
//		System.out.println();
//		
//		// 4.-------------------------------------------------------
//		int[] num2 = new int[5];
//		for (int i = 0; i < num2.length; i++) {
//			num2[i] = 100 + i;
//		}
//		for (int i = 0; i < num2.length; i++) {
//			System.out.print(num2[i] + " ");
//		}
//		System.out.println();
		
		// 5.-------------------------------------------------------
		int[] num3 = { 66, 77, 88, 99 };
		int max = 0;
		for (int i = 0; i < num3.length; i++) {
			if(max < num3[i]) {
				max = num3[i];
			}
		}
		System.out.println("\n�ִ� ���� : " + max);
		System.out.println();
		
		// 6.-------------------------------------------------------
		int temp = num3[3];
		num3[3] = num3[0];
		num3[0] = temp;
		
		for (int i = 0; i < num3.length; i++) {
			System.out.print(num3[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		

	}

}
