package �迭��ȭ;

public class ���б���輺���� {

	public static void main(String[] args) {
		int[] term1 = { 100, 88, 96 };
		int[] term2 = term1.clone();
		term2[0] = 99;
		for (int i = 0; i < term2.length; i++) {
			System.out.println(term1[i] + " " + term2[i]);
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
		
	}

}
