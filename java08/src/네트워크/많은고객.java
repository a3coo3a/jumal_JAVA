package 네트워크;

import java.net.Socket;

public class 많은고객 {

	public static void main(String[] args) throws Exception{

		for (int i = 0; i < 100; i++) {
			Socket socket = new Socket("localhost",9100);
			System.out.println((i+1)+"번 고객이 서버로 요청하여 연결하였습니다.");
		}
	}

}
