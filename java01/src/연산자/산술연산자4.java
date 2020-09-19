package 연산자;


public class 산술연산자4 {

	public static void main(String[] args) {
		// 산술연산자4
		// 수학100 국어88 영어77
		// 총점, 평균을 구해서 변수에 넣어보세요.
		// 각 점수와 총점, 평균을 출력
		// 코드 자동 정리: ctrl + shift + f
		//String 점수 = JOptionPane.showInputDialog("평점입력");
		
//		double rate = 8.64;
		
		int 수학 = 100;
		int 국어 = 88;
		int 영어 = 77;
		int sum = 수학 + 국어 + 영어;
		double avg = sum / 3.0;
		System.out.println(sum);
		System.out.println(avg);
		System.out.printf("평균은 %.1f", avg);
	}
}




