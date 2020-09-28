package 배열;

public class 배열비교문제 {

	public static void main(String[] args) {
		////국어, 영어, 수학
//		int[] 철수 = {100, 88, 99};
//		int[] 영희 = {100, 77, 89};
//		1)철수와 영희의 점수가 동일한 과목은 몇번째 인가요? //배열의 인덱스
//		2)철수와 영희의 점수가 동일한 과목의 점수는? 
		//배열의 특정한 인덱스에 들어있는 값
//		3)철수와 영희의 점수가 동일한 과목의 개수는? //count로 누적
		//국어, 영어, 수학
		int[] 철수 = {100, 88, 99};
		int[] 영희 = {100, 77, 89};
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if(철수[i] == 영희[i]) {
				count++;
				System.out.println(i);
				System.out.println(철수[i]);
			}
		}
		System.out.println(count);
	}
}
