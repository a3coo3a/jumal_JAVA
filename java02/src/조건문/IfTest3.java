package ���ǹ�;

public class IfTest3 {

	
	public static void main(String[] args) {
		
		int ����id = 1000;
		int ����pw = 2000;
		
		int �Է�id = 1000;
		int �Է�pw = 2222;
		String result = "";
		
		// �� ������ : and(&&), or(||), not(!)		
		
		if (����id == �Է�id && ����pw == �Է�pw) {	
			// ���������� ������ ��δ� true���� �ϴ� ���
			// and���� : &&
			result = "�α��� ok";
		}else {
			result = "�α��� not";
		}
		
		System.out.println(result);
	}
}
