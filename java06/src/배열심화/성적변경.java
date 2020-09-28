package 배열심화;

public class 성적변경 {
	public static void main(String[] args) {
		int[] term1 = { 100, 80, 55, 77 };
		int[] term2 = term1.clone();
		System.out.println("----- 변경전 -----");
		System.out.print("1학기 점수 : ");
		for (int i = 0; i < term1.length; i++) {
			System.out.print(term1[i] + " ");
		}
		System.out.println();
		System.out.print("2학기 점수 : ");
		for (int i = 0; i < term2.length; i++) {
			System.out.print(term2[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("----- 변경후 -----");
		term2[0] = 99;
		term2[3] = 66;
		System.out.print("1학기 점수 : ");
		for (int i = 0; i < term1.length; i++) {
			System.out.print(term1[i] + " ");
		}
		System.out.println();
		System.out.print("2학기 점수 : ");
		for (int i = 0; i < term2.length; i++) {
			System.out.print(term2[i] + " ");
		}
		System.out.println();
		
		System.out.println();
		int count = 0;
		String[] subject = {"국어", "수학", "영어", "컴퓨터"};
		System.out.print("변경된 과목 명은 : ");
		for (int i = 0; i < term1.length; i++) {
			if(term1[i] != term2[i]) {
				count++;
				System.out.print(subject[i] + " ");
			}
		}
		System.out.println();
		System.out.println("변경된 과목 수는 : " + count + "개");
		
	}
}
