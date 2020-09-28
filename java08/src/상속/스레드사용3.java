package 상속;

public class 스레드사용3 {

	public static void main(String[] args) {

		카운터스레드 counter = new 카운터스레드();
		이미지스레드 image = new 이미지스레드();
		날짜스레드 date = new 날짜스레드();
		
		counter.start();
		image.start();
		date.start();
		
		
		
	}

}
