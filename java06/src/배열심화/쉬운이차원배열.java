package 배열심화;


public class 쉬운이차원배열 {
	public static void main(String[] args) {
		int[][] all = new int[3][3];

		all[0][0] = 1;
		all[0][1] = 1;
		all[2][2] = 1;
		System.out.println("행의 개수 : " + all.length);
		System.out.println("[0]행의 개수 : " + all[0].length);
		System.out.println("[1]행의 개수 : " + all[1].length);
		System.out.println("[2]행의 개수 : " + all[2].length);
		
		for (int i = 0; i < all.length; i++) {		// 행, 가로줄
			for (int j = 0; j < all[i].length; j++) {	// 열, 세로줄
				System.out.print(all[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
