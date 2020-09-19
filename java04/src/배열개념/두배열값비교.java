package 배열개념;

public class 두배열값비교 {

	public static void main(String[] args) {
		
		String[] 과목명 = {"컴퓨터", "국어", "영어", "수학", "사회"};
		int[] 학기1 = { 77, 88, 99, 33, 22 };
		int[] 학기2 = { 66, 88, 99, 55, 33 };
		
		int count = 0;
		for (int i = 0; i < 학기2.length; i++) {
			if(학기1[i] == 학기2[i]) {
				count++;
			}
		}
		System.out.println("동일한 과목 수  : " + count);
		
		count = 0;
		for (int i = 0; i < 학기2.length; i++) {
			if(학기1[i] < 학기2[i]) {
				System.out.println(과목명[i]);
				count++;
			}
		}
		System.out.println("2학기가 더 높은 과목수  : " + count);
		
		
		
	}
}
