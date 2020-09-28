package 부품만들기;

public class 계산기 {
	public int price;

	// 부품이 가지는 기능은 메서드로 만들면 된다.
	public int add(int x, int y) { // 더할때는 값이 필요하다.
		int result = x + y;
		return result;		
	}

	public void minus(int x, int y) {
		System.out.println(x - y);
	}

	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	public void div() {
		
	}

}
