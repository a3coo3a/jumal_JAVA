package �迭��ȭ;


public class �����������迭 {
	public static void main(String[] args) {
		int[][] all = new int[3][3];

		all[0][0] = 1;
		all[0][1] = 1;
		all[2][2] = 1;
		System.out.println("���� ���� : " + all.length);
		System.out.println("[0]���� ���� : " + all[0].length);
		System.out.println("[1]���� ���� : " + all[1].length);
		System.out.println("[2]���� ���� : " + all[2].length);
		
		for (int i = 0; i < all.length; i++) {		// ��, ������
			for (int j = 0; j < all[i].length; j++) {	// ��, ������
				System.out.print(all[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
