package �ݺ���;

public class ForTest2 {

	public static void main(String[] args) {
		
		 
//		for (int i = 0; i < 10 ; i++) {
//			System.out.print("*");
//		}
		// i : Ƚ���� ī��Ʈ�� �� ���
		// 	      ������ �����ͷ� ���
		
		// 1~10 ��� ������.
		int sum = 0;		// 0���� �ʱ�ȭ ���� ������ ������ ���� �� �־� ����� ȥ���� �� �� �ִ�.
		// ������Ű�� ������ �ݺ��� �ȿ��� ������ ������ �ʴ´�.
		// ������Ű�� ������ �ݺ��� �ȿ��� ������ �ϸ� �ȵȴ�.
		for (int i = 1; i <= 10000; i++) {
			// 1 + 2  + 3 + 4 .....
			sum += i;
		//System.out.println(sum);
		}
		System.out.println("1~10���� �� : "+ sum);
		
		
		
		
		
		
	}
}
