package ����;

public class Day {
	//Ŭ���� ��ü�������� ���� �� �ִ� ����: ��������
	//��������� �������� ������ ����.
//	���������� �ڵ��ʱ�ȭ!
	String doing;
	int time;
	String location;
	static int count = 0;
	static int sum = 0;
	
	public Day(String doing, int time, String location) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	public static void avg() {
		System.out.println(sum/count);
		//static�޼��峻������ static������ ����Ѵ�.!
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
