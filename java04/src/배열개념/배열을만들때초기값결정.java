package 배열개념;

public class 배열을만들때초기값결정 {
	public static void main(String[] args) {
		// 배열을 만들때는 2가지를 생각해야 한다.
		// 1. 배열의 값이 이미 정해져 있는지
		// => 처음부터 정해진 값을 넣어서 배열을 만들면 됨.

		int[] s1 = { 10, 20, 30, 40, 50 };
		// 배열의 index의 역할 : i(index)
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
		s1[0] = 99;
		System.out.println();
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
		System.out.println();
		// 2. 배열의 값이 아직 정해져 있지 않는지
		// => 공간을 먼저 만들어 두고, 나중에 값을 넣어줌

		int[] s2 = new int[10];
		s2[1] = 100;
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i] + " ");
		}

	}
}
