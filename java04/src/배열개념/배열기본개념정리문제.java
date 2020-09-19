package 배열개념;

public class 배열기본개념정리문제 {
	public static void main(String[] args) {

		// 1. int배열 20자리를 만들고
		int[] arr = new int[20];
		// 2. 배열의 개수를 프린트
		// .(점)연산자 : 접근연산자(선택의 의미)
		System.out.println("배열의 개수  : " + arr.length);

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
