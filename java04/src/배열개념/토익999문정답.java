package 배열개념;

import java.util.Random;

public class 토익999문정답 {
	public static void main(String[] args) {
		/*
		 * 토익 999문제의 정답 0~3까지 넣어서 랜덤하게 만들고 
		 *          내답안 0~3까지 넣어서 랜덤하게 만드세요.
		 * 
		 * 정답과 내답이 맞으면 1점 부여 
		 * => 저는 몇점 일까요?
		 */

		int[] 정답 = new int[999];
		int[] 내답 = new int[999];

		Random r = new Random();
		
		for (int i = 0; i < 내답.length; i++) {
			정답[i] = r.nextInt(4);
			내답[i] = r.nextInt(4);
		}
		
//		for (int i = 0; i < 내답.length; i++) {
//			System.out.println("정답 : " + 정답[i] + " - 내답 : " + 내답[i]);
//		}
		
		
		int point = 0;
		for (int i = 0; i < 내답.length; i++) {
			if(정답[i] == 내답[i]) {
				point++;
			}
		}
		
		System.out.println("나의 점수는  : " + point);
		
	}
}
