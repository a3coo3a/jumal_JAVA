package �迭����;

public class �ι迭���� {

	public static void main(String[] args) {
		
		String[] ����� = {"��ǻ��", "����", "����", "����", "��ȸ"};
		int[] �б�1 = { 77, 88, 99, 33, 22 };
		int[] �б�2 = { 66, 88, 99, 55, 33 };
		
		int count = 0;
		for (int i = 0; i < �б�2.length; i++) {
			if(�б�1[i] == �б�2[i]) {
				count++;
			}
		}
		System.out.println("������ ���� ��  : " + count);
		
		count = 0;
		for (int i = 0; i < �б�2.length; i++) {
			if(�б�1[i] < �б�2[i]) {
				System.out.println(�����[i]);
				count++;
			}
		}
		System.out.println("2�бⰡ �� ���� �����  : " + count);
		
		
		
	}
}
