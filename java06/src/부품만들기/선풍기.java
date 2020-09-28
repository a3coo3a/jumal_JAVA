package 부품만들기;

public class 선풍기 {
	public void on() {
		System.out.println("선풍기를 켜다");
	}

	public int cold(int now, int down) {
		return now - down;
	}

	public int hot(int now, int up) {
		return now + up;
	}
	public void show(int now) {
		System.out.println("현재 온도가 " + now + "가 되었습니다.");
	}
	public void off() {
		System.out.println("선풍기가 꺼집니다.");
	}
}
