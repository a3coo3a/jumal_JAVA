package 배열의응용;

public class 채점문제 {

	public static void main(String[] args) {
		int[] 답지 = {1, 4, 2, 1, 3, 2, 4, 1, 2, 3};
		int[] 내답 = {3, 2, 1, 1, 3, 1, 4, 2, 2, 3};
		//하나씩 10점씩
		//점수를 계산해보세요.
		int count = 0;
		for (int i = 0; i < 내답.length; i++) {
			char ox = 'x';
			if (답지[i] == 내답[i]) {
				count = count + 10;
				ox = 'o'; //맞을 때만 o로 변수값을 변경.
			}
			System.out.println(i + ": " + 답지[i] + " <-> " + 내답[i] + "=> " + ox);
		}
		System.out.println("최종점수는 " + count + "점");
		
		
	}

}
