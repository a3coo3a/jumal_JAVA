package �迭����;

import java.util.Scanner;

public class �α���ǥ {
	public static void main(String[] args) {
		int[] ��ǥ�� = new int[5];
		String[] �̸� = {"������", "��", "��ȿ��", "���缮", "��ź"};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.print("���ϴ� ��ȣ�� �Է��ϼ��� . (0~4), 5���� ����  >> ");
			int choice = sc.nextInt();
			
			if (choice == 5) {		// ���� �ȳ�
				System.out.println("�ý��� ����");
				for (int i = 0; i < �̸�.length; i++) {
					System.out.println(�̸�[i] + " : " + ��ǥ��[i]);
				}
				sc.close();
				System.exit(0);
			}
						
			��ǥ��[choice]++;
			
		}
		
		
		
	}
}
