package ���;

public class ī���ͽ����� extends Thread {
	@Override
	public void run() {
		// ����ó���� ��� 
		// - network, file, cpu  ���� �޼����� ��� ����ó���� �ؾ���.
		for (int i = 500; i > 0; i--) {
			System.out.println("ī��Ʈ : " + i);
			//l1.setText("ī���� : "+i);
			try {		// �������̵��ϴ� ��� throws�� ����ó�� �Ұ� (���� �Һ�) try-catch ����ؾ� ��.
				Thread.sleep(500);	// 1��
			} catch (InterruptedException e) {
				System.out.println("cpu�� �����ϴ� �� ���� �߻�");
			}		
		}

	}
}
