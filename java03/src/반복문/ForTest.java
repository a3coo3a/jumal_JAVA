package 반복문;

public class ForTest {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("i값 : " + i);
		}
		System.out.println();
		
		
		// 5부터 시작해서 20번 돌게
		int count = 1;
		for (int i = 5; i < 25; i++) {
			System.out.println("i값 : " + i + " / count : "+count++);
			
		}

		
		
		
	}

}
