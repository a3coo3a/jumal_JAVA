package �迭����;

public class �迭�����鶧�ʱⰪ���� {
	public static void main(String[] args) {
		// �迭�� ���鶧�� 2������ �����ؾ� �Ѵ�.
		// 1. �迭�� ���� �̹� ������ �ִ���
		// => ó������ ������ ���� �־ �迭�� ����� ��.

		int[] s1 = { 10, 20, 30, 40, 50 };
		// �迭�� index�� ���� : i(index)
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
		s1[0] = 99;
		System.out.println();
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
		System.out.println();
		// 2. �迭�� ���� ���� ������ ���� �ʴ���
		// => ������ ���� ����� �ΰ�, ���߿� ���� �־���

		int[] s2 = new int[10];
		s2[1] = 100;
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i] + " ");
		}

	}
}
