package 배열.응용;

import java.util.Scanner;

public class 극장예매시스템 {
	public static void main(String[] args) {

		// 예매하지 않은 상황 : 0
		// 예매한 상황 : 1

		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10]; // 0으로 초기화 되어 있는 상태
		int count = 0;
		final int PRICE = 10000; // 바꿀 수 없는 값
		// 항상 똑같은 값이 들어가는 변수, 상수!
		// final, 변수 이름을 모두 대문자로 쓰는 편!
		while (true) {
			System.out.println("----------  좌석 예매     ----------");
			for (int i = 0; i < seat.length; i++) {
				System.out.printf("%-3d", i + 1);
			}
			System.out.println();
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.printf("%-3d", seat[i]);
			}
			System.out.println();

			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			int choice = sc.nextInt();

			if (choice == -1) {
				System.out.println("종료합니다");
				System.out.println(">>> 예매수 : " + count + "매");
				System.out.println(">>> 총 결제 금액 : " + (count * PRICE) + "원 ");
				break;
			}
			if(choice < -1 || choice > seat.length) {
				System.out.println("유효한 값이 아닙니다. \n다시 선택해 주세요");
			}else {
				if (seat[choice - 1] != 1) {
					System.out.println("당신이 선택한 번호는 -> " + choice);
					seat[choice - 1] = 1; // 예매처리
					System.out.println("예매되었습니다.");
					System.out.println();
					count++;
				} else {
					System.out.println("이미 예매되었습니다.");
					System.out.println("다른 자리를 선택해 주세요~^^");
					System.out.println();
				}
			}
		}

		sc.close();

	}
}
