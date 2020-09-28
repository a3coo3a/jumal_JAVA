package 상속;

public class 예외상황발생하면 {
	// 예외(Exception), error!
	public static void main(String[] args) {
		try {
			int x = 5 / 0; // error발생 부분!
			// System.out.println(x);
			// 에러가 발생하면 프로그램은 stop! 
			// 에러가 발생하면, 부드럽게 대응을 해놓음.
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("이것만 예외이고 아래의 있는 정보를 실행해");
		}
		
		
		// 에러상황 대응 방법 2가지 
		// 1. 내가 대응법을 써넣음.
		// 2. 나를 부른 메서드에게 대응을 떠넘김
		
		
		System.out.println("나는 실행 될까요?");
		

	}
}
