package �迭��ȭ;

public class �������� {
	public static void main(String[] args) {
		int[] term1 = { 100, 80, 55, 77 };
		int[] term2 = term1.clone();
		System.out.println("----- ������ -----");
		System.out.print("1�б� ���� : ");
		for (int i = 0; i < term1.length; i++) {
			System.out.print(term1[i] + " ");
		}
		System.out.println();
		System.out.print("2�б� ���� : ");
		for (int i = 0; i < term2.length; i++) {
			System.out.print(term2[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("----- ������ -----");
		term2[0] = 99;
		term2[3] = 66;
		System.out.print("1�б� ���� : ");
		for (int i = 0; i < term1.length; i++) {
			System.out.print(term1[i] + " ");
		}
		System.out.println();
		System.out.print("2�б� ���� : ");
		for (int i = 0; i < term2.length; i++) {
			System.out.print(term2[i] + " ");
		}
		System.out.println();
		
		System.out.println();
		int count = 0;
		String[] subject = {"����", "����", "����", "��ǻ��"};
		System.out.print("����� ���� ���� : ");
		for (int i = 0; i < term1.length; i++) {
			if(term1[i] != term2[i]) {
				count++;
				System.out.print(subject[i] + " ");
			}
		}
		System.out.println();
		System.out.println("����� ���� ���� : " + count + "��");
		
	}
}
