package 상속;

public class 예외상황발생사용 {

	public static void main(String[] args) {

		예외상황발생 test = new 예외상황발생();
		try {
			test.call();
		} catch (Exception e) {
			System.out.println("예외처리 메인에서 함");
		}

	}

}
