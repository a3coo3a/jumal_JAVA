package 배열의응용;

import java.util.Scanner;

public class 극장예약 {

	public static void main(String[] args) {
		//좌석을 나타내는 10개의 공간이 필요
		int[] seat = new int[10];//{0,0,0,....}
		Scanner sc = new Scanner(System.in);
		int count = 0;//예매 좌석 개수
		final int PRICE = 10000; //변수값을 변하지 않게 설정할 수 있음.
		//항상 똑같은 수가 들어가는 공간: 상수(final, 변수명을 모두 대문자로!)
		while (true) {
			System.out.println("-------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n-------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.print("\n좌석 선택(종료 -1)>> ");
			int choice = sc.nextInt();//좌석 번호 입력
			if (choice == -1) {
				//프로그램 종료
				//반복문안에 있다면, 반복문을 종료
				System.out.println("예약시스템을 종료합니다.");
				System.out.println("예약좌석 개수는 " + count);
				System.out.println("예약금액은 " + count* PRICE + "원");
				break;//반복문을 종료
			} 
			//예약처리.0번 입력
			//예약처리하기 전에 해당 번호 좌석이 이미 예약이 되었는지 체크할
			//필요 있음. 예약안된 경우만 예약처리
			if (seat[choice] != 1) {
				seat[choice] = 1;
				count++;
				System.out.println(choice + "번 예약완료");
			}else {
				System.out.println("이미 예약된 좌석입니다.");
				System.out.println("다른 좌석번호를 입력해주세요.");
			}
		}
	}
}





