package 반복문;

import java.util.Scanner;

public class 두수비교 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int allCount = 0;

		while (true) {
			System.out.println("숫자 크기 판별");
			System.out.println("------------");

			System.out.print("숫자 입력 >> ");
			int n1 = scan.nextInt();
			System.out.print("숫자 입력 >> ");
			int n2 = scan.nextInt();
			allCount++;
			
			if (n1 > n2) {
				System.out.println("앞의 숫자가 더 큽니다");
				count1++;
			} else if (n1 < n2) {
				System.out.println("뒷 숫자가 더 큽니다");
				count2++;
			} else if (n1 == n2) {
				System.out.println("두 숫자는 같습니다.");
			} else {
				System.out.println("비교할 수 없습니다.");
			}

			System.out.print("계속 하시겠습니까? (계속 : o, 중단 : x) : ");
			String go = scan.next();		// 한글자로 입력 받는것도 char로 입력 받을 수 없다.
			// 글자 한글자라고 하더라도 모두다 String 
			// 기본데이터가 아니라 비교연산자로 비교 불가
//			if(go.equals("x"))  // ()안의 글자와 같은 글자인지 확인
			
			// 보통 중단외는 계속이라 판단하여 x만 if로 확인 후 시스템 종료 진행
			
			switch (go) {
			case "0":
			case "O":
			case "o":
				System.out.println();
				break;
			case "X":
			case "x":
				System.out.println("프로그램을 종료합니다.\n");
				System.out.println("시도횟수 :" + allCount + "회 \n앞 숫자가 큰 횟수 : " + count1 + "회 \n뒷숫자가 큰 횟수 : " + count2 + "회");
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}

	}

}
