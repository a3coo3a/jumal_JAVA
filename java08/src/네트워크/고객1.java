package ��Ʈ��ũ;

import java.net.Socket;

public class ��1 {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost",9100);  //"localhost", �ۼ��� �ڵ����� �� �����ǰ� ��.
		System.out.println("�� 1�� ������ ��û�Ͽ� �����.");
	}
}
