package �迭����;

public class �⺻���������迭 {

	public static void main(String[] args) {
		// �迭�� ���� �� �ִ� ���� Ÿ���� �Ȱ��ƾ� �Ѵ�
		// ó�� ũŰ�� ����, ũ�� ���� �Ұ�

		// �� ������ ����
		// �̸� �迭 ����� ���
		String[] names = { "ȫ�浿", "ȫ���", "ȫ���", "ȫ����", "ȫ��ö" };
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();

		// ���� �迭 ����� ���
		int[] ages = { 30, 31, 32, 33, 34 };
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println();

		// Ű �迭 ����� ���
		double[] hei = { 160.1, 160.3, 160.5, 160.4, 160.8 };
		for (int i = 0; i < hei.length; i++) {
			System.out.print(hei[i] + " ");
		}
		System.out.println();

		// ���� �迭 ����� ���
		char[] gender = { '��', '��', '��', '��', '��' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();

		// ������ �Ծ����� ���� �迭 ����� ���
		boolean[] lunch = { true, true, false, false, true };
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
		System.out.println("\n");

		for (int i = 0; i < names.length; i++) {
			System.out.println("* �̸� : " + names[i]);
			System.out.println("* ���� : " + ages[i]);
			System.out.println("* ���� : " + hei[i]);
			System.out.println("* ���� : " + gender[i]);
			System.out.println("* ���� : " + lunch[i]);
			System.out.println("==============================");
		}
		System.out.println("\n\t\t*** �츮 ����  ***");
		System.out.println("no\t�̸�\t����\t����\t����\t���ɿ���");
		for (int i = 0; i < lunch.length; i++) {
			System.out.println(i+1 + "\t" + names[i] + "\t" + ages[i] + "\t" + hei[i] + "\t" + gender[i] + "\t" + lunch[i]);

		}

	}
}
