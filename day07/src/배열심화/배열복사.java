package �迭��ȭ;

public class �迭���� {

	public static void main(String[] args) {
		int[] x = {100, 200, 300};
		int[] y = x; //�������� ����
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " + x[i] + ", " + 
							   "y:" + y[i]);
		}
		System.out.println("-----------------------");
		x[0] = 999;
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " + x[i] + ", " + 
							   "y:" + y[i]);
		}
		System.out.println("���� ����x�ּ�: " + x);
		System.out.println("���� ����y�ּ�: " + y);
		System.out.println("------------------");
		
		int[] a = {100, 200, 300};
		int[] b = a.clone();//���� ����
		System.out.println("���� ����a�ּ�: " + a);
		System.out.println("���� ����b�ּ�: " + b);
		a[0] = 999;
		for (int i = 0; i < a.length; i++) {
			System.out.println("x: " + a[i] + ", " + 
							   "y:" + b[i]);
		}
//		int x = 100;
//		int y = x; //�⺻���� ����
//		System.out.println("x: " + x);
//		System.out.println("y: " + y);
//		
//		x = 200;
//		System.out.println("x: " + x);
//		System.out.println("y: " + y);
	}

}
