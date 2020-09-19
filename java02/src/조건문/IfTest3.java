package 조건문;

public class IfTest3 {

	
	public static void main(String[] args) {
		
		int 가입id = 1000;
		int 가입pw = 2000;
		
		int 입력id = 1000;
		int 입력pw = 2222;
		String result = "";
		
		// 논리 연산자 : and(&&), or(||), not(!)		
		
		if (가입id == 입력id && 가입pw == 입력pw) {	
			// 여러조건이 있을때 모두다 true여야 하는 경우
			// and조건 : &&
			result = "로그인 ok";
		}else {
			result = "로그인 not";
		}
		
		System.out.println(result);
	}
}
