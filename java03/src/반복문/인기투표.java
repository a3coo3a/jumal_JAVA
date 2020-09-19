package 반복문;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		while (true) {
			System.out.println("인기 투표 : 1)아이유  2)유재석  3)BTS 4)종료");
			System.out.print("선택번호 >> ");
			int input = scan.nextInt();
			
			if(input == 4)	{	// 종료 먼저 체크하는 것이 좋음
				System.out.println("시스템을 종료합니다.");
				System.out.println("아이유 : " + count1 + "표");
				System.out.println("유재석 : " + count2 + "표");
				System.out.println("BTS : " + count3 + "표");
				System.out.println("총 투표횟수 : " + (count1 + count2 + count3) + "회");
				
				System.exit(0);
			}
			
			
			if(input == 1) {
				count1++;
				System.out.println("아이유 한표 획득!");
			}else if(input == 2) {
				count2++;
				System.out.println("유재석 한표 획득");
			}else if(input == 3) {
				count3++;
				System.out.println("BTS 한표 획득");
			}else {
				
				System.out.println("없는 번호 입니다. 정확하게 확인 후 다시 입력해 주세요");
			}
			
					
		}//while end
		
	}//main end

}
