package �迭;

public class �迭1 {

	public static void main(String[] args) {
		// �Ѳ����� ���� ���� �����͸� �ٷ� �� �ִ� ���
		int[] list = new int[10000];
	
		list[0] = 100;		// ù��°
		list[49] = 200;		// 50��°
		list[9999] = 300;	// ��������°
		
		// ���� ����999, ��� 999��  => ���� �����ΰ�?
		
		int[] ���� = new int[999];
		int[] ��� = new int[999];
		
		����[0] = 3;
		���[0] = 4;
		
		System.out.println(����[0] == ���[0]);
		
	}
	
}
