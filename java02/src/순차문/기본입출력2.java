package ������;

import javax.swing.JOptionPane;

public class �⺻�����2 {

	public static void main(String[] args) {

		// �Է� >>
		// �̸� �Է� : ȫ�浿
		// ���� �Է� : 100
		// �Ҽ� �Է� : kg
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		String age = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
		String company = JOptionPane.showInputDialog("�Ҽ��� �Է��ϼ���");
				
		// ó�� >>
		// �� �Է� �����͸� ����
		String result = name+ "�� ���̰� " + age + "���̰�, �Ҽ��� " + company + "�̴�.";
		
		// ��� >>
		// ó���� ����� ���
		System.out.println(result);
	}

}
