package ���ǹ�;

import java.util.Date;

public class ifTest2 {

	public static void main(String[] args) {
		// �Է�
		Date date = new Date();
		int hour = date.getHours();
		String hello = "";
		// ó��
		if (hour <= 11) {
			hello = "�¸��";
		}else if (hour <= 15) {
			hello = "�¿����ʹ�";
		}else if (hour <= 20) {
			hello = "���̺��";
		}else {
			hello = "�³���";
		}
		// ���
		System.out.println(hello);

	}

}
