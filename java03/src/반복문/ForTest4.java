package �ݺ���;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {

		// ���ϰ��� �ϴ� ���۰� : 5
		// ���ϰ��� �ϴ� ���ᰪ : 10
		
		// �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϰ��� �ϴ� ���۰� : ");
		int start = scan.nextInt();
		System.out.print("���ϰ��� �ϴ� ���ᰪ : ");
		int end = scan.nextInt();
		
		// ó��
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		
		// ���
		System.out.println(start + "���� " + end + "������ �� : " + sum);

		scan.close();
	}
}
