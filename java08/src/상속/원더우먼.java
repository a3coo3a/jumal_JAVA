package 상속;

public class 원더우먼 extends 우먼{
	public void beam() {
		System.out.println("빔을 쏘다!");
	}

	@Override
	public String toString() {
		return "원더우먼 [wAge=" + wAge + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
