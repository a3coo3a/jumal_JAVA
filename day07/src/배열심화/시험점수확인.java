package 배열심화;

import java.util.Random;

public class 시험점수확인 {

	public static void main(String[] args) {
		int[] 정답 = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < 정답.length; i++) {
			정답[i] = r.nextInt(4) + 1; //1~4
		}
		for (int i = 0; i < 정답.length; i++) {
			System.out.println(i + 1 + " : " + 정답[i]);
		}
		
		int[] 학생 = 정답.clone();
		for (int i = 0; i < 300; i++) {
			int index = r.nextInt(300);
			int jumsu = r.nextInt(4) + 1;
			학생[index] = jumsu;
		}
		//어떤 문항이 틀렸는지 문항과 정답/답안 비교 출력
		int no = 0;
		for (int i = 0; i < 학생.length; i++) {
			if(정답[i] != 학생[i]) {
				System.out.println(i + ": " + 정답[i] + ", " + 학생[i]);
				no++;
			}
		}
		int ok = 1000 - no;
		//몇 개나 틀렸는지 찾아보세요.
		System.out.println("틀린 개수: " + no + "개");
		//하나당 1점이라고 한다면, 몇점인지 프린트!
		System.out.println("최종 점수: " + ok + "점");
	}
}
