package 상속;

public class 스레드사용1 {

	public static void main(String[] args) {

		스타스레드 star = new 스타스레드();
		달러스레드 dollar = new 달러스레드();
		
		star.start();		// cpu에게 스레드를 실행하도록 안내 
		dollar.start();
		
		
		
	}

}
