package ������;

import javax.swing.JOptionPane;

public class �⺻��������� {

	public static void main(String[] args) {
		
		/*
		 * ������ : 3.5
		 * pi = 3.14
		 * ���� ���� ���� pi * r * r
		 * 
		 */
		// �Է�
		double pi = 3.14;
		String r = JOptionPane.showInputDialog("������ ���� �Է��ϼ���");
		double rr = Double.parseDouble(r);
		// ó��
		double area1 = pi * rr * rr;
		// ���
		System.out.println("�������� : " + rr + "��\n���� ���̴� : " + area1 + "\n");
		
		/*
		 * ���� 33.4
		 * ���� 11.5
		 * �簢���� ���� : ���� * ����
		 * 
		 */
		// �Է�
		String wid = JOptionPane.showInputDialog("���� ���� �Է��ϼ���");
		String hei = JOptionPane.showInputDialog("���� ���� �Է��ϼ���");
		double width = Double.parseDouble(wid);
		double height = Double.parseDouble(hei);
		// ó��
		double area2 = width * height;
		// ��� 
		System.out.println("���� "+ wid + ", ���� " + hei + "��\n�簢���� ���̴� : " + area2 + "\n");
		
		
		// ���� �簢�� �� ���� �� ū��
		if (area1 > area2) {
			System.out.println("���� ���̰� �� Ů�ϴ�.");
		}else {
			System.out.println("�簢���� ���̰� �� Ů�ϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
