package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int target = r.nextInt(100);	//0~99	// () 안의 숫자보다 작은 값 발생. 비워둘경우 int 의 범위

		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
			while (true) {
				System.out.print("당신이 생각한 값 입력 >> ");
				int think = scan.nextInt(); // 입력한 값은 String인데 int로 바꿔주는 역할을 nextInt()
				count++;
				if (target == think) {
					System.out.println("정답입니다.");
					System.out.println("축하드립니다. 시스템을 종료합니다");
					System.out.println("당신의 시도 횟수는 " + count + "회");
					//break;		
					// if는 break가 없어도 필요시 알아서 종료가 잘 되는걸 보아서 break는 if것이 아니다. while문 것이다.
					// 반복문을 stop
					
					System.exit(0); 
					// 프로그램을 종료
					// 내가 필요시 종료는 '0'/ 그외의 수는 무슨 다른 문제가 있는 것
					// while이 끝남과 동시에 끝나므로 while 밖의 문장은 도달할 수 없는 문장이므로 필요 없는 문장이라 에러 발생
					
				} else {
					System.out.println("정답이 아닙니다~ ");
					// 맞추고자 하는 값보다 큰값을 입력했으면 "너무커요"
					// 맞추고자 하는 값보다 작은값을 입력했으면 "너무작아요"
					if(target < think) {
						System.out.println("너무 커요~");
					}else {
						System.out.println("너무 작아요~");
					}
					System.out.println();
				} 
			}
//			System.out.println("당신의 시도 횟수는 " + count + "회");
			

	}

}
