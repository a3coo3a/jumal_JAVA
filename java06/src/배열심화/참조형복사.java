package �迭��ȭ;

public class ���������� {
	public static void main(String[] args) {

		// ������(�⺻�� �̿�, �迭) : �ּ�
		int[] x = { 100, 200, 300 };
		int[] y = x;					 // ���� ���� : �ּҸ� ����Ǵ� ��
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("x�� ������ x�迭 �� ����Ʈ ============================");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("x�� ������ y�迭 �� ����Ʈ ============================");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.println();
		x[0] = 999;
		System.out.println("x�� ������ x�迭 �� ����Ʈ ============================");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("x�� ������ y�迭 �� ����Ʈ ============================");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}

		System.out.println("\n\n���� ���縦 �غ���.");

		int[] a = { 1, 2, 3 };
		int[] b = a.clone(); 				// ���� ����
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		a[0] = 999;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
	}
}
