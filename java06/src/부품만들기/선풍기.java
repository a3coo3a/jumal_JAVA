package ��ǰ�����;

public class ��ǳ�� {
	public void on() {
		System.out.println("��ǳ�⸦ �Ѵ�");
	}

	public int cold(int now, int down) {
		return now - down;
	}

	public int hot(int now, int up) {
		return now + up;
	}
	public void show(int now) {
		System.out.println("���� �µ��� " + now + "�� �Ǿ����ϴ�.");
	}
	public void off() {
		System.out.println("��ǳ�Ⱑ �����ϴ�.");
	}
}
