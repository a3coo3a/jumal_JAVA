package 배열개념;

public class 기본데이터형배열 {

	public static void main(String[] args) {
		// 배열로 만들 수 있는 경우는 타입이 똑같아야 한다
		// 처음 크키가 고정, 크기 조정 불가

		// 내 가족에 대한
		// 이름 배열 만들고 출력
		String[] names = { "홍길동", "홍길순", "홍기순", "홍나열", "홍동철" };
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();

		// 나이 배열 만들고 출력
		int[] ages = { 30, 31, 32, 33, 34 };
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println();

		// 키 배열 만들고 출력
		double[] hei = { 160.1, 160.3, 160.5, 160.4, 160.8 };
		for (int i = 0; i < hei.length; i++) {
			System.out.print(hei[i] + " ");
		}
		System.out.println();

		// 성별 배열 만들고 출력
		char[] gender = { '남', '여', '여', '여', '남' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();

		// 점심을 먹었는지 여부 배열 만들고 출력
		boolean[] lunch = { true, true, false, false, true };
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
		System.out.println("\n");

		for (int i = 0; i < names.length; i++) {
			System.out.println("* 이름 : " + names[i]);
			System.out.println("* 나이 : " + ages[i]);
			System.out.println("* 신장 : " + hei[i]);
			System.out.println("* 성별 : " + gender[i]);
			System.out.println("* 점심 : " + lunch[i]);
			System.out.println("==============================");
		}
		System.out.println("\n\t\t*** 우리 가족  ***");
		System.out.println("no\t이름\t나이\t신장\t성별\t점심여부");
		for (int i = 0; i < lunch.length; i++) {
			System.out.println(i+1 + "\t" + names[i] + "\t" + ages[i] + "\t" + hei[i] + "\t" + gender[i] + "\t" + lunch[i]);

		}

	}
}
