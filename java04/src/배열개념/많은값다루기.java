package �迭����;

import java.util.Random;

public class �������ٷ�� {

	public static void main(String[] args) {

		int[] num = new int[1000];
		int[] num2 = new int[1000];
		Random r = new Random(42);	// ��¥ ����, ���� ����
		
		// System.out.println(r.nextInt(1000));

		// �迭 ����
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
			num2[i] = r.nextInt(1000);
		}
		
		// �迭 �� ���
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + " : " + num[i] + " <-> " + num2[i]);
		}
		
		// ó��
		int count = 0;
		System.out.println("num2�� �� ū ��ġ��?");
		System.out.print(">> ");
		for (int i = 0; i < num.length; i++) {
			if (num2[i] > num[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\nnum2�� �� ū ���� ���� : " + count);
		

	}
}
