package �迭����;

public class �迭�⺻������������ {
	public static void main(String[] args) {

		// 1. int�迭 20�ڸ��� �����
		int[] arr = new int[20];
		// 2. �迭�� ������ ����Ʈ
		// .(��)������ : ���ٿ�����(������ �ǹ�)
		System.out.println("�迭�� ����  : " + arr.length);

		// 3.
		arr[0] = 100;
		arr[19] = 1000;
		arr[2] = 300;
		arr[12] = 1300;

		// 4.
		System.out.println(arr[0] + arr[19]);
		// 5.
		System.out.println(arr[2] + arr[12]);
		// 6.
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}

}
