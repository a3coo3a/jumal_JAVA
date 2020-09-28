package 배열의응용;

import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		//답안지 999문제
		//내가푼답안 999문제
		int[] 답안지 = new int[999];
		int[] 내답안 = new int[999];
		Random r = new Random(17); //아무거나, 씨앗값
		//프로그램 실행할 때마다 아무거나 만들어주는 값이 달라지지 않고
		//동일한 값으로 만들어주므로 일관성을 가지고 테스트할 수 있다.
		for (int i = 0; i < 999; i++) {
			//1~4번까지 객관식
			답안지[i] = r.nextInt(4) + 1;//0부터 시작->1부터 시작
			//최소값 1~ 최대값4 발생
		}
		for (int i = 0; i < 내답안.length; i++) {
			내답안[i] = r.nextInt(4) + 1;
		}
		for (int i = 0; i < 999; i++) {
			System.out.println(i + ": " + 답안지[i] + ", " + 내답안[i]);
		}
		int count = 0;//몇 개 맞았는지 누적
		for (int i = 0; i < 내답안.length; i++) {
			if(답안지[i] == 내답안[i]) {
				count++;
			}
		}
		System.out.println("내 최종 점수는 " + count + "점");
		
	}
}







