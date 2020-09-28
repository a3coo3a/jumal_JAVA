package 배열심화;

import java.util.Scanner;

public class 극장예매 {
	public static void main(String[] args) {
		int[][] seat = new int[4][];
		seat[0] = new int[6];
		seat[1] = new int[4];
		seat[2] = new int[5];
		seat[3] = new int[2];
		

		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.println("------- 예매전 -------");
			System.out.println("    1  2  3  4  5  6");
			System.out.println("-----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " : ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "  ");

				}
				System.out.println();
			}
			System.out.print("세로좌석을 선택해주세요 (종료 -1)> ");
			int row = sc.nextInt();
			if(row == -1) break;
			System.out.print("가로좌석을 선택해주세요 (종료 -1)> ");
			int col = sc.nextInt();
			if(col == -1) break;
			System.out.println("------- 예매후 -------");
			//		seat[1][2] = 1;
			//		seat[1][3] = 1;
			//		seat[3][0] = 1;
			//		seat[3][1] = 1;
			seat[row - 1][col - 1] = 1;
			System.out.println("    1  2  3  4  5  6");
			System.out.println("-----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " : ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "  ");

				}
				System.out.println();
				System.out.println();
			} 
		}

	}
}
