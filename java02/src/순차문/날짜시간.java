package ������;

import java.util.Date;
import java.util.Random;

import javax.swing.JButton;

public class ��¥�ð� {
	
	public static void main(String[] args) {
		// new �����ؿö� ����ϴ� Ű����
		// �������� �������� �ؼ� RAM���ٰ�  Date�� �����ؼ� ������ ������ 
		Date date = new Date();
//		Random r = new Random();
//		JButton b = new JButton();
		
		int year = date.getYear(); //�⵵ �����ִ� ��ɾ�
		int year2 = year + 1900;	// 1900���� �������� ����
		System.out.println("���� ������ " + year2 + "��");
	
		int month = date.getMonth();	
		int month2 = month + 1;	//������ ������ �Ǿ ������� �������
		System.out.println("�̹� ���� " + month2 + "��");
		
		int today = date.getDate();
		System.out.println("������ " + today + "��");
	
		
		// �ú���
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println("���� �ð��� " + hour + "�� " + min + "�� " + sec +"�� ");
	
	
	
	}
}
