package �ݺ���;

import java.util.Scanner;

public class �μ��� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int allCount = 0;

		while (true) {
			System.out.println("���� ũ�� �Ǻ�");
			System.out.println("------------");

			System.out.print("���� �Է� >> ");
			int n1 = scan.nextInt();
			System.out.print("���� �Է� >> ");
			int n2 = scan.nextInt();
			allCount++;
			
			if (n1 > n2) {
				System.out.println("���� ���ڰ� �� Ů�ϴ�");
				count1++;
			} else if (n1 < n2) {
				System.out.println("�� ���ڰ� �� Ů�ϴ�");
				count2++;
			} else if (n1 == n2) {
				System.out.println("�� ���ڴ� �����ϴ�.");
			} else {
				System.out.println("���� �� �����ϴ�.");
			}

			System.out.print("��� �Ͻðڽ��ϱ�? (��� : o, �ߴ� : x) : ");
			String go = scan.next();		// �ѱ��ڷ� �Է� �޴°͵� char�� �Է� ���� �� ����.
			// ���� �ѱ��ڶ�� �ϴ��� ��δ� String 
			// �⺻�����Ͱ� �ƴ϶� �񱳿����ڷ� �� �Ұ�
//			if(go.equals("x"))  // ()���� ���ڿ� ���� �������� Ȯ��
			
			// ���� �ߴܴܿ� ����̶� �Ǵ��Ͽ� x�� if�� Ȯ�� �� �ý��� ���� ����
			
			switch (go) {
			case "0":
			case "O":
			case "o":
				System.out.println();
				break;
			case "X":
			case "x":
				System.out.println("���α׷��� �����մϴ�.\n");
				System.out.println("�õ�Ƚ�� :" + allCount + "ȸ \n�� ���ڰ� ū Ƚ�� : " + count1 + "ȸ \n�޼��ڰ� ū Ƚ�� : " + count2 + "ȸ");
				System.exit(0);
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}

	}

}
