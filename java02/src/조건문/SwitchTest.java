package ���ǹ�;

public class SwitchTest {

	public static void main(String[] args) {
		//��Ʈ�� +����Ʈ+f : �ڵ�����
		int jumsu = 100;
		String result = "";
		switch (jumsu) {
		case 100:
			result = "����";
			break;
		case 90:
			result = "������ �����";
			break;
		default:
			result = "�������� �־��";
			break;
		}
		System.out.println(result);
		
		
		
		
		String food = "���̽�ũ��";
		String go = "";
		switch (food) {
		case "���̽�ũ��":
			go = "���������� ����";
			break;
		case "�ø�":
			go = "�н������� ����";
			break;
		default:
			go = "������ �Ծ��";
			break;
		}

		System.out.println(go);
	}

}
