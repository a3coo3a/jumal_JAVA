package ��Ʈ��ũ;

import java.net.Socket;

public class ������ {

	public static void main(String[] args) throws Exception{

		for (int i = 0; i < 100; i++) {
			Socket socket = new Socket("localhost",9100);
			System.out.println((i+1)+"�� ���� ������ ��û�Ͽ� �����Ͽ����ϴ�.");
		}
	}

}
