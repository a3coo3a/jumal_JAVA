package ��ǰ����ϱ�;

import ��ǰ�����.��ǳ��;

public class �츮���ǽ�1102 {
	public static void main(String[] args) {
		
		��ǳ�� cool = new ��ǳ��();
		int now = 25; // ����µ�
		
		cool.on();
		
		now = cool.cold(now, 10);
		cool.show(now);
		
		now = cool.hot(now, 20);
		cool.show(now);
		
		cool.off();
	}
}
