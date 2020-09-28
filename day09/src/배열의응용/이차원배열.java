package 배열의응용;

public class 이차원배열 {

	public static void main(String[] args) {
		// 2차원 배열: 1차원배열을 여러줄 써놓은 것.
		int[] n1 = { 1, 2, 3 };//3
		int[] n2 = { 4, 5, 6, 7 };//4
		int[][] n3 = new int[2][];
		n3[0] = n1; 
		n3[1] = n2;
		//2차원 배열의 길이는 행(가로줄, row)의 개수
		System.out.println(n3.length);
		System.out.println(n3[0].length);
		System.out.println(n3[1].length);
		for (int i = 0; i < n3[0].length; i++) {
			System.out.println(n3[0][i]);
		}
		for (int i = 0; i < n3[1].length; i++) {
			System.out.println(n3[1][i]);
		}
	}

}
