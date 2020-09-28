package 상속;

public class 이미지스레드 extends Thread {
	@Override
	public void run() {
		String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("그림 : " + list[i]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("이미지 변화중 오류 발생");
			}
		}
	}
}
