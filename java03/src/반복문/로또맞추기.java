package �ݺ���;

import java.util.Random;

public class �ζǸ��߱� {

	public static void main(String[] args) {

		Random r = new Random();
		int num = 0;
		
		
		for (int i = 0; i < 6; i++) {
			num = r.nextInt(46);		// 0~45�����ϱ� : 46�� ���� ��.
			System.out.print(num + " ");
		}
		
		
		
	}

}
