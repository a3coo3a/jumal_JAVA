package 상속;

public class 스레드사용2 {

	public static void main(String[] args) {
		플러스스레드 plus = new 플러스스레드();
		마이너스스레드 min = new 마이너스스레드();
		
		plus.start();
		min.start();
		
		
	}

}
