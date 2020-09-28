package 배열;

import java.util.Scanner;

public class 배열생성정리문제3 {

	public static void main(String[] args) {
		//반복 입력해서 각각 다른 공간에 넣어두려면, 배열을 사용
		double[] w = new double[3];//0,1,2
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < w.length; i++) {
			System.out.print("가족 몸무게: ");
			w[i] = sc.nextDouble();
		}
		System.out.println("제일 많이 나가는 몸무게는 " + w[0]);
		System.out.println("제일 조금 나가는 몸무게는 " + w[2]);
		double sum = 0;
		for (int i = 0; i < w.length; i++) {
			sum = sum + w[i];
		}
		System.out.println("몸무게의 합은 " + sum);
		System.out.println("몸무게의 평균은 " + sum/w.length);
	}
}





