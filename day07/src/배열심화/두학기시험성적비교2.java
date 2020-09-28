package 배열심화;

import java.util.Random;

public class 두학기시험성적비교2 {

	public static void main(String[] args) {
		int[] term1 = new int[300];
		Random r = new Random(5); //씨앗값, seed값
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
		
		System.out.println("1학기 평균 " + avg1);
		System.out.println("2학기 평균 " + avg2);
		
		if (avg1 > avg2) {
			System.out.println("1학기 평균이 더 높음.");
		} else if(avg1 == avg2) { 
			System.out.println("두 학기 평균이 동일.");
		} else {
			System.out.println("2학기 평균이 더 높음.");
			
		}
		System.out.println("----위치는----");
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			//양쪽 배열에 들어있는 값이 동일한지 체크
			if (term1[i] != term2[i]) {
				count++;
				System.out.println("값이 다른 위치는 : " + i);
			}
		}
		System.out.println("점수가 다른 인원은 " + count);
		
	}

}
