package �迭����;

import java.util.Scanner;

public class �Է¹޾ƹ迭������ {

	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			num[i] = scan.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		
		System.out.println();
		System.out.println("��� �հ� : " + sum);
		
		double avg = (double)sum / num.length;
		System.out.println("��� ���� : " + avg);
		
		scan.close();
	}
}

