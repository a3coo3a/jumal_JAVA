package 반복문;

import java.util.Random;

public class 로또맞추기 {

	public static void main(String[] args) {

		Random r = new Random();
		int num = 0;
		
		
		for (int i = 0; i < 6; i++) {
			num = r.nextInt(46);		// 0~45까지니까 : 46이 들어가야 함.
			System.out.print(num + " ");
		}
		
		
		
	}

}
