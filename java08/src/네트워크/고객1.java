package 네트워크;

import java.net.Socket;

public class 고객1 {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost",9100);  //"localhost", 작성시 자동으로 내 아이피가 들어감.
		System.out.println("고객 1이 서버로 요청하여 연결됨.");
	}
}
