package 상속;

public class 슈퍼맨 extends 맨{
	// 슈퍼맨이 가지는 멤버 변수 개수 : 3개	(상속 3개)
	// 슈퍼맨이 가지는 멤버 메서드 개수 : 3개 (상속 2개 , 본인것 1개)
	// 상속 받은 것 중에서 기능을 재정의해서 쓸 수 있다.
	
	@Override
	public void run() {
		System.out.println("순간이동으로 달릴거야~");
	}
	public void space() {
		System.out.println("하늘을 날다");
	}

	@Override
	public String toString() {
		return "슈퍼맨 [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
