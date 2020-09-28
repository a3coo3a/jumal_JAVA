package 부품만들기;

public class 작은방 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.ch = 15;
		tv1.color = "블랙";
		tv1.onOff = true;
		
		tv2.ch = 11;
		tv2.color = "화이트";
		tv2.onOff = false;
		
		tv1.채널변경하다();
		tv2.소리를키우다();
	}
}
