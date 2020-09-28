package 정적;

public class Day {
	//클래스 전체영역에서 사용될 수 있는 변수: 전역변수
	//멤버변수는 전역변수 성격을 가짐.
//	전역변수는 자동초기화!
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
		//static메서드내에서는 static변수만 써야한다.!
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
