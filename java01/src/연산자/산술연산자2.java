package ������;

public class ���������2 {

	public static void main(String[] args) {
//		ctrl+/ : �ڵ��ּ�
		
/* ctrl + shift + / : ������ �ڵ� �ּ�
 * ���� �� 2���� ������ ���� �ְ�, 
 * 1)�� ���� ���� ������ ���� 
 * 2)���� 2�� ����� ����Ʈ
 */
		int x = 55;
		int y = 32;
		int sum = x + y;
		//�ڹٿ����� ������ ��������� ������ �������!
		int avg = sum / 2;
		System.out.println("��� : " + avg);
		//�ڹٿ����� �ϳ��� �Ǽ��̸� ������ �Ǽ����!
		//�ϳ� �̻��� �Ǽ��� ������ �ٲپ��ָ� �ذ��!
		double avg2 = sum / 2.0;
		System.out.println("��� : " + avg2);
		System.out.println("��� : " + avg2);
		
		int parent = 2;
		double avg3 = (double)sum / parent;
		//����Ÿ�Ժ�ȯ(��������ȯ)
		System.out.println("��� : " + avg3);
		
		
	}

}
