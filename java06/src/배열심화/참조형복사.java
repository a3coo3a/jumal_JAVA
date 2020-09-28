package 배열심화;

public class 참조형복사 {
	public static void main(String[] args) {

		// 참조형(기본형 이외, 배열) : 주소
		int[] x = { 100, 200, 300 };
		int[] y = x;					 // 얕은 복사 : 주소만 복사되는 것
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("x값 변경전 x배열 값 프린트 ============================");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("x값 변경전 y배열 값 프린트 ============================");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.println();
		x[0] = 999;
		System.out.println("x값 변경후 x배열 값 프린트 ============================");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("x값 변경후 y배열 값 프린트 ============================");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}

		System.out.println("\n\n깊은 복사를 해보자.");

		int[] a = { 1, 2, 3 };
		int[] b = a.clone(); 				// 깊은 복사
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
