package �迭��ȭ;

import java.util.Random;

public class ���б���輺����2 {

	public static void main(String[] args) {
		int[] term1 = new int[300];
		Random r = new Random(5); //���Ѱ�, seed��
		for (int i = 0; i < term1.length; i++) {
			term1[i] = r.nextInt(101);//0~100
		}
		int[] term2 = term1.clone();
		term2[0] = 99;
		term2[100] = 55;
		term2[200] = 88;
		term2[299] = 66;
		
		for (int i = 0; i < term2.length; i++) {
			System.out.println(i + ": " +  term1[i] + " " + term2[i]);
		}
		int sum1 = 0, sum2 =0;
		for (int i = 0; i < term2.length; i++) {
			sum1 = sum1 + term1[i];
			sum2 = sum2 + term2[i];
		}
		double avg1 = (double)sum1 / term1.length;
		double avg2 = (double)sum2 / term2.length;
		
		System.out.println("1�б� ��� " + avg1);
		System.out.println("2�б� ��� " + avg2);
		
		if (avg1 > avg2) {
			System.out.println("1�б� ����� �� ����.");
		} else if(avg1 == avg2) { 
			System.out.println("�� �б� ����� ����.");
		} else {
			System.out.println("2�б� ����� �� ����.");
			
		}
		System.out.println("----��ġ��----");
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			//���� �迭�� ����ִ� ���� �������� üũ
			if (term1[i] != term2[i]) {
				count++;
				System.out.println("���� �ٸ� ��ġ�� : " + i);
			}
		}
		System.out.println("������ �ٸ� �ο��� " + count);
		
	}

}
