package 상속;

public class 예외상황발생 {

	public void call() throws Exception{
		int[] num = new int[3];
		num[3] = 100;	// 에러 배열 사이즈보다 큰 곳에 값을 입력
	}
}
