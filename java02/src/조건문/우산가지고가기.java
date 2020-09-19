package 조건문;

public class 우산가지고가기 {

	public static void main(String[] args) {
		
		boolean skyDark = true;
		boolean rain = false;
		
		if (skyDark || rain) {
			System.out.println("우산을 가지고 가자");
		} else {
			System.out.println("우산을 가지고 가지 말자");
		}
		
		
	}
}
