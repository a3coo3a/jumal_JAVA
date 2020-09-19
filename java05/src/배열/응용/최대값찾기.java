package 배열.응용;

public class 최대값찾기 {

	public static void main(String[] args) {
		// 선택의 기준
		// - 프로그램이 돌아가는 속도, RAM을 너무 많이 사용하지 않는지.
		int[] jumsu = { 55, 11, 22, 77, 88, 100 };
		int max = jumsu[0]; // 0으로 초기화 할경우 비교대상이 음수일경우 max값이 바뀌지 않기에!

		// 해당 index까지의 최대값을 max라는 변수에 넣어두자.
		// index를 늘려가면서 max에 넣어놓은 값보다 큰지를 비교
		// 크다면, 그 값이 현재 index까지의 최대 값이므로
		// 그 값을 max변수에 넣는다.
		int index = 0;
		for (int i = 1; i < jumsu.length; i++) {
			if (max < jumsu[i]) {
				max = jumsu[i];
				index = i;
			}
		}
		System.out.println("최대 값은 : " + max);
		System.out.println("최대값의 위치는 : " + index);
		

	}
}
