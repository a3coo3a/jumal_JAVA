package �迭��ȭ;

import java.util.Random;

public class ��������Ȯ�� {

	public static void main(String[] args) {
		int[] ���� = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4) + 1; //1~4
		}
		for (int i = 0; i < ����.length; i++) {
			System.out.println(i + 1 + " : " + ����[i]);
		}
		
		int[] �л� = ����.clone();
		for (int i = 0; i < 300; i++) {
			int index = r.nextInt(300);
			int jumsu = r.nextInt(4) + 1;
			�л�[index] = jumsu;
		}
		//� ������ Ʋ�ȴ��� ���װ� ����/��� �� ���
		int no = 0;
		for (int i = 0; i < �л�.length; i++) {
			if(����[i] != �л�[i]) {
				System.out.println(i + ": " + ����[i] + ", " + �л�[i]);
				no++;
			}
		}
		int ok = 1000 - no;
		//�� ���� Ʋ�ȴ��� ã�ƺ�����.
		System.out.println("Ʋ�� ����: " + no + "��");
		//�ϳ��� 1���̶�� �Ѵٸ�, �������� ����Ʈ!
		System.out.println("���� ����: " + ok + "��");
	}
}
