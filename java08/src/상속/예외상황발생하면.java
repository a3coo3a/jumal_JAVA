package ���;

public class ���ܻ�Ȳ�߻��ϸ� {
	// ����(Exception), error!
	public static void main(String[] args) {
		try {
			int x = 5 / 0; // error�߻� �κ�!
			// System.out.println(x);
			// ������ �߻��ϸ� ���α׷��� stop! 
			// ������ �߻��ϸ�, �ε巴�� ������ �س���.
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�̰͸� �����̰� �Ʒ��� �ִ� ������ ������");
		}
		
		
		// ������Ȳ ���� ��� 2���� 
		// 1. ���� �������� �����.
		// 2. ���� �θ� �޼��忡�� ������ ���ѱ�
		
		
		System.out.println("���� ���� �ɱ��?");
		

	}
}
