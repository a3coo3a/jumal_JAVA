package 배열개념;

import java.util.Scanner;

public class 인기투표 {
	public static void main(String[] args) {
		int[] 투표수 = new int[5];
		String[] 이름 = {"아이유", "비", "이효리", "유재석", "방탄"};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.print("원하는 번호를 입력하세요 . (0~4), 5번은 종료  >> ");
			int choice = sc.nextInt();
			
			if (choice == 5) {		// 종료 안내
				System.out.println("시스템 종료");
				for (int i = 0; i < 이름.length; i++) {
					System.out.println(이름[i] + " : " + 투표수[i]);
				}
				sc.close();
				System.exit(0);
			}
						
			투표수[choice]++;
			
		}
		
		
		
	}
}
