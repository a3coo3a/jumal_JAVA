package �迭��ȭ;

public class �������迭 {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 11 };
		int[] y = { 4, 5 };
		int[] z = { 7, 8, 9 };

		
		// [][] > > [������][������]
		int[][] all = new int[3][]; // ���� ������ �ʼ��� ����� ��.
		all[0] = x;
		all[1] = y;
		all[2] = z;
		all[0][3] = 99;
		all[2][2] = 100;
		
		
		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < all[i].length; j++) {
				System.out.print(all[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
