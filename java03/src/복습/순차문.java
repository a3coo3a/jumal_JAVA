package ����;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ������ { // ��ǰ �ϳ��ϳ� == class, class�� �����ϴ� �ž�

	public static void main(String[] args) {

		// ������ (�Է� > ó�� > ���)
		// �Է��ϴ� ��� :
		// 1. �ʹ� ���� ����ϴ� �� : �빮�ڷ� ���� , �̸� RAM�� ����
		// String today = JOptionPane.showInputDialog("�µ� �Է�");
		// ��� �Է��� ������ Ÿ���� String !!

		// 2. ���� ������� �ʴ� �� : �ʿ��� �� RAM�� ����
		Scanner scan = new Scanner(System.in); // ��� �����ؼ� �ִ��� + ���� �̸� = �����Ұž�(new) + ������ ��.
		System.out.print("������ �µ� �Է�  >> ");
		double todayTemp = scan.nextDouble(); // ��� �Է��� String�ε� double�� �ٲ� �ִ� �Է�

		if (todayTemp >= 30) {
			JOptionPane.showMessageDialog(null, "�ʹ� ����~"); // ������ ���� == null
		} else {
			JOptionPane.showMessageDialog(null, "�����ƿ�~");
		}

		System.out.print("����� �����ϴ� ���� �µ���? > ");
		double thinkTemp = scan.nextDouble();
		double diff = todayTemp - thinkTemp;
		// �ڹٿ����� ����� �ϳ��� double�̸�  ����� ������ double
		
		System.out.println("--------------------------------");
		//System.out.println("��� : ���� �µ����� ���̴� " + diff);
		JOptionPane.showMessageDialog(null, "��� : ���� �µ����� ���̴� " + (int)diff);
		// int <-- double : ���� ������ ����ȯ , ���� ����ȯ
		
		
		
		scan.close();

		
		
	}

}
