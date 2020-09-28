package 네트워크;

import java.net.Socket;

public class 고객2 {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost",9100);
		System.out.println("고객 2 서버로 요청하여 연결됨.");
	}
}
