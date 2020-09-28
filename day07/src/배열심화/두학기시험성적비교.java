package 배열심화;

public class 두학기시험성적비교 {

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
		
		System.out.println("1학기 평균 " + avg1);
		System.out.println("2학기 평균 " + avg2);
		
		if (avg1 > avg2) {
			System.out.println("1학기 평균이 더 높음.");
		} else if(avg1 == avg2) { 
			System.out.println("두 학기 평균이 동일.");
		} else {
			System.out.println("2학기 평균이 더 높음.");
			
		}
		
	}

}
