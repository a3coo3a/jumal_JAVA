package ��Ʈ��ũ;

import java.net.ServerSocket;
import java.net.Socket;

public class ���� {
	public static void main(String[] args) throws Exception {
		// ��Ʈ��ũ ����� �Ϸ��� ��ȭ�� ������ Ŭ���� �ʿ� : socket
		// TCP��Ŀ����� ��ν��ο� ����
		// ip�ּ� �ȿ� ������ ������ �� �� �־� ���� ��ȣ �ο� : port��ȣ
		// �Ķ���͸� ���� ������ ip�� �ڵ����� �� ip�� ����.
		// port��ȣ�� ���� �ο�, �� �����.
		ServerSocket server = new ServerSocket(9100);
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��");
		// ������ ���ۿ� ����			
		int count = 0;
		while (true) {
			Socket socket = server.accept(); // ������ ���ۿ� ���� ����
			count++;
			System.out.println(count+"��° Ŭ���̾�Ʈ�� ������.");
		}
		
		
	
	
	
	}
}
