package 네트워크;

import java.net.ServerSocket;
import java.net.Socket;

public class 서버 {
	public static void main(String[] args) throws Exception {
		// 네트워크 통신을 하려면 전화기 역할의 클래스 필요 : socket
		// TCP방식에서는 경로승인용 소켓
		// ip주소 안에 서버가 여러개 돌 수 있어 별도 번호 부여 : port번호
		// 파라미터를 넣지 않으면 ip는 자동으로 내 ip가 잡힘.
		// port번호는 임의 부여, 꼭 써야함.
		ServerSocket server = new ServerSocket(9100);
		System.out.println("클라이언트의 요청을 기다리는 중");
		// 데이터 전송용 소켓			
		int count = 0;
		while (true) {
			Socket socket = server.accept(); // 데이터 전송용 소켓 생성
			count++;
			System.out.println(count+"번째 클라이언트가 접속함.");
		}
		
		
	
	
	
	}
}
