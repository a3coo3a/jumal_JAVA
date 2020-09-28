package 부품사용하기;

import 부품만들기.선풍기;

public class 우리강의실1102 {
	public static void main(String[] args) {
		
		선풍기 cool = new 선풍기();
		int now = 25; // 현재온도
		
		cool.on();
		
		now = cool.cold(now, 10);
		cool.show(now);
		
		now = cool.hot(now, 20);
		cool.show(now);
		
		cool.off();
	}
}
