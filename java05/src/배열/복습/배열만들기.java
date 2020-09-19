package 배열.복습;

public class 배열만들기 {

	public static void main(String[] args) {

		// 배열을 만들때는 많은 데이터를 넣으려고 하는 경우사용
		// 배열을 만들때는 아직 값이 결정 안된 경우
		int[] jumsu1 = new int[5];
		// 배열을 만들 때 값이 정해져 있는 경우
		int[] jumsu0 = { 55, 66, 77, 88, 99 };

		jumsu1[0] = 100;
		jumsu1[1] = 55;
		jumsu1[2] = 99;
		jumsu1[3] = 56;
		jumsu1[4] = 66;
		
		for (int i = 0; i < jumsu1.length; i++) {
			System.out.println(jumsu1[i]);
		}
		
		int count = 0;
		for (int i = 0; i < jumsu0.length; i++) {
			if(jumsu0[i] < jumsu1[i]) {
				System.out.println("위치는 " + i);
				count++;
			}
		}
		
		System.out.println(count+"과목의 점수가 올랐습니다");
		
	}

}
