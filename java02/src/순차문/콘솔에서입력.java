package 순차문;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		
		// 콘솔에서 입력을 받아보자
//		Scanner scan = new Scanner(System.in);	// System.in : 키보드에서 입력해서 가져오겠다.
//		System.out.print("이름을 입력 >> ");
//		String name = scan.next();
//		System.out.print("나이를 입력 >> ");
//		int age = scan.nextInt();		// int <- String 변환하는 역할
//		System.out.print("키를 입력 >> ");
//		double height = scan.nextDouble();
//		
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("키    : " + height);
//		
		/*
		 * 나이 입력 >> 100
		 * 내년 나이는 101세
		 * 키를 입력 >> 88.8
		 * 내년 키는 98.8
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력 >> ");
		int age2 = scan.nextInt();
		int nextAge = age2 + 1;
		System.out.println("내년 나이는 " + nextAge + "세");
		
		System.out.print("키를 입력 >> ");
		double height2 = scan.nextDouble();
		double nextHeight = height2 + 10;
		System.out.println("내년 키는 " + nextHeight);
		
		
		
		
	}
}
