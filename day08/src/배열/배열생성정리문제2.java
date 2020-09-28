package 배열;

public class 배열생성정리문제2 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		for (int x : num) {
			if (x % 2 == 0) { //2로 나누어서 나머지가 0이면 짝수
				System.out.println(x);
			}
		}
	}

}
