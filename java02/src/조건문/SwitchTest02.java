package ���ǹ�;

import java.util.Date;

public class SwitchTest02 {

	public static void main(String[] args) {

		Date date = new Date();
		int month = date.getMonth() + 1; // 8

//		if (3 <= month && month <= 5) {
//			
//		}
		// key�� ���� �ִ� ���� : ����(byte, short, int), char, String
		// key�� �� �� ���� ���� : ���� (long), �Ǽ� 
		// break�� �ڵ����� ������� �ʾ� �������� ����� �Ѵ�. 
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("�ܿ�");
			break;
		}
		
		
		

	}

}
