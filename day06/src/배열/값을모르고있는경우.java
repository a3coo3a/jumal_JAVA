package �迭;

public class �����𸣰��ִ°�� {

	public static void main(String[] args) {
		int[] num = new int[1000];
		System.out.println(num); //�ּҰ�.
		System.out.println(num[0]); //��ġ��(index), 0���� ����
		System.out.println(num[999]);
		//�迭�� �ʱⰪ�� �� ����ִ�.int->0, double->0.0
		num[500] = 1;
		num[666] = 1;
//		int num2 = 0;
//		System.out.println(num2);
		
		int[] seat = new int[21];
		//�б� ���� ����: �迭�� ����
		System.out.println(seat.length);
		System.out.println(seat[0] == seat[2]);
		//System.out.println(seat == seat[0]);
		seat[2] = 1;
		seat[3] = 1;
		seat[4] = 1;
		seat[5] = 1;
		
		//for�� �������� i�� �迭���� index����
		//i => index
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		
		
		
		
		
		
	}
}
