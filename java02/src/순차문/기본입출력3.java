package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class �⺻�����3 {

	public static void main(String[] args) {
		// �ܺο����� ��� �Է�Ÿ����  String
		// 18�� �̻� �������� �Ǻ�
		// ���ڷ� �ν��ؾ����� �񱳰���
		// 2000��� ���� ���
		String year = JOptionPane.showInputDialog("�¾ �⵵ �Է��ϼ���");
		
		// String -> int : �⺻���� �⺻���� �ƴ� ���̶� ���� ����ȯ�� �Ұ�
		// �⺻�������� ����ȯ ����
		// String�� int�� ����ȯ ���� �� �� : Integer.parseInt()
		// parse = �м��ϴ�.
		int year2 = Integer.parseInt(year);	// '2000��'�̶�� �Է½� int�� �м��� ���� �ʾ� ��ȯ���� ����. '2000'�̶�� �Է��ؾ� ��.
		Date date = new Date();
		int year3 = date.getYear() + 1900;
		int age = year3 - year2 + 1;
		
		System.out.println("���ش� " + year3 + "��");
		if ( age >= 18 ) {	// true
			System.out.println("����");
		}else {		// false
			System.out.println("�̼�����");
		}
		System.out.println("����� ���̴� "+ age + "�� �̽ñ���.");
		
		
		
		
		
		
	}

}
