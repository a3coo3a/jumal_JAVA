package ���ǹ�;


public class ifTest {

	public static void main(String[] args) {
		// ������ ������
		int jumsu = 88;
		String result = "";
		if (jumsu >= 90) {
			result = "A����";
		}else if (jumsu >= 80) {
			result = "B����";		// ���ǿ� �����Ƿ� ó���ϰ� break! else�� �ֱ� ������  break ȿ���� ���°�
		}else if (jumsu >= 70) {
			result = "C����";
		}else if (jumsu >= 60) {
			result = "D����";
		}else {
			result = "F����";
		}	// cpu�� �۾��� �ٿ��ټ� ����.

		System.out.println("����� ������ " + result);

	}
}
