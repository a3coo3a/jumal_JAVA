package 조건문;


public class ifTest {

	public static void main(String[] args) {
		// 조건이 많을때
		int jumsu = 88;
		String result = "";
		if (jumsu >= 90) {
			result = "A학점";
		}else if (jumsu >= 80) {
			result = "B학점";		// 조건에 맞으므로 처리하고 break! else가 있기 때문에  break 효과가 나는것
		}else if (jumsu >= 70) {
			result = "C학점";
		}else if (jumsu >= 60) {
			result = "D학점";
		}else {
			result = "F학점";
		}	// cpu의 작업을 줄여줄수 있음.

		System.out.println("당신의 학점은 " + result);

	}
}
