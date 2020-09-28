package 배열;

import java.util.Random;

public class 배열많은양만들기 {

	public static void main(String[] args) {
		//num에는 1000개를 "주소"가 들어가 있음.참조형 변수
		int[] num = new int[1000];//0~999
		//System.out.println(num);
		Random	r = new Random(42); //아무거나 만들어 주는 class(부품)
		//42는 아무 숫자나 넣어준 것임.(씨앗값, seed값)
		//Random안에 아무 숫자나 넣어두면, 테스트하는 동안
		//동일한 랜덤값을 만들어준다.
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(101); //0~100
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		//100점을 찾아라.
		//배열 전체를 다 처음부터 끝까지 찾아야 한다.
		for (int i = 0; i < num.length; i++) {
			//배열의 각 위치에 들어가 있는 값이 100인지를 체크
			if (num[i] == 100) {
				//i값을 프린트!
				System.out.println(i);
			}
		}
		
	}

}






