package �迭��ȭ;

import java.util.Scanner;

public class ���忹�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[21];
		//�迭�� �ڵ� �ʱ�ȭ, int=>0���� �ʱ�ȭ
		//���Ű� �Ǵ� �ڸ��� 1�� ����
		int count = 0;
		while (true) {
			
			System.out.println("--------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			System.out.print("������ ��ȣ �Է�(���� -1)>> ");
			int number = sc.nextInt(); //-1
			if (number == -1) {
				System.out.println("�ý����� �����մϴ�.");
				System.out.println("���ż�>> " + count);
				break;//�ݺ��� ����!
			}
			
			//�����ϱ� ���� �� �ڸ��� �̹� ���Ű� �� �ڸ����� Ȯ���ؾ� ��.
			if (seat[number - 1]  == 1) { //���ŵ� �ڸ�
				System.out.println("���� �Ұ���!!");
				System.out.println("�ٸ� �¼��� �������ּ���.!!");
			} else {
				//����ó��
				seat[number - 1] = 1;
				System.out.println("���ſϷ�!");
				count++;
			}
		}
	}

}
