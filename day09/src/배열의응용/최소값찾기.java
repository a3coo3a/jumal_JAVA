package 배열의응용;

public class 최소값찾기 {

	public static void main(String[] args) {
		int[] num = {90, 80, 20, 60, 70};
		int min = num[0];//0을 넣으면 오류가 발생할 여지!
		//최소값을 찾을 때는 임의로 넣은 0이 최소값
		//최대값을 찾을 때는 임의로 넣은 0이 최대값(음수일 수 있음)
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("최소값은 " + min);
	}

}
