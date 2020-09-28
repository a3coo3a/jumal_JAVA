package 배열;

import java.util.Random;

public class 배열많은양만들기2 {

	public static void main(String[] args) {
//		0~50범위의 랜덤한 값 999개를 만들어서 
//		1. 이 중 0인 위치를 프린트해보세요.
//		2. 개수를 프린트해보세요.
		int[] num = new int[99999];//0~998
		Random r = new Random(42);//42는 seed값
		for (int i = 0; i < num.length; i++) {//999번 반복
			num[i] = r.nextInt(51);//0~50
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ":" + num[i]);
		}
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("0의 개수는 " + count);
		
	}

}





