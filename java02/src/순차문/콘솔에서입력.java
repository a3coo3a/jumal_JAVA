package ������;

import java.util.Scanner;

public class �ֿܼ����Է� {

	public static void main(String[] args) {
		
		// �ֿܼ��� �Է��� �޾ƺ���
//		Scanner scan = new Scanner(System.in);	// System.in : Ű���忡�� �Է��ؼ� �������ڴ�.
//		System.out.print("�̸��� �Է� >> ");
//		String name = scan.next();
//		System.out.print("���̸� �Է� >> ");
//		int age = scan.nextInt();		// int <- String ��ȯ�ϴ� ����
//		System.out.print("Ű�� �Է� >> ");
//		double height = scan.nextDouble();
//		
//		System.out.println("�̸� : " + name);
//		System.out.println("���� : " + age);
//		System.out.println("Ű    : " + height);
//		
		/*
		 * ���� �Է� >> 100
		 * ���� ���̴� 101��
		 * Ű�� �Է� >> 88.8
		 * ���� Ű�� 98.8
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� >> ");
		int age2 = scan.nextInt();
		int nextAge = age2 + 1;
		System.out.println("���� ���̴� " + nextAge + "��");
		
		System.out.print("Ű�� �Է� >> ");
		double height2 = scan.nextDouble();
		double nextHeight = height2 + 10;
		System.out.println("���� Ű�� " + nextHeight);
		
		
		
		
	}
}
