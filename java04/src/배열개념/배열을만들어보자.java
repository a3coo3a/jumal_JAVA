package �迭����;

public class �迭�������� {

	public static void main(String[] args) {
		int[] s = new int[10];
		int[] s2 = new int[10];
		
		// s���� int�迭�� ����Ű�� �ּҰ� ���� �ȴ�.
		// ������ ����
		System.out.println("s�� ����� �ּ� : " + s);
		System.out.println("s2�� ����� �ּ� : " + s2);
		System.out.println("�迭�� ���� : " + s.length);
		// length : �б����� ������ ���� ���� 
		
		// �迭 10��¥���� ����� -> �迭 10��, �迭 ����Ű�� �������� 1��, length ���� 1�� �ؼ� �� ������ +2�� ������
		
		s[0] = 100;
		s[5] = 500;
		s[9] = 900;	// s[s.length-1] = 900; �� ���� �ڵ�
		
		// for�������� i�� �ε����� ���� : ��ġ ���� 
		// i�� 0���� ����
		// 
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + " : " + s[i]);
		}
		
		
		
		
		
	}

}
