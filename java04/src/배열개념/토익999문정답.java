package �迭����;

import java.util.Random;

public class ����999������ {
	public static void main(String[] args) {
		/*
		 * ���� 999������ ���� 0~3���� �־ �����ϰ� ����� 
		 *          ����� 0~3���� �־ �����ϰ� ���弼��.
		 * 
		 * ����� ������ ������ 1�� �ο� 
		 * => ���� ���� �ϱ��?
		 */

		int[] ���� = new int[999];
		int[] ���� = new int[999];

		Random r = new Random();
		
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4);
			����[i] = r.nextInt(4);
		}
		
//		for (int i = 0; i < ����.length; i++) {
//			System.out.println("���� : " + ����[i] + " - ���� : " + ����[i]);
//		}
		
		
		int point = 0;
		for (int i = 0; i < ����.length; i++) {
			if(����[i] == ����[i]) {
				point++;
			}
		}
		
		System.out.println("���� ������  : " + point);
		
	}
}
