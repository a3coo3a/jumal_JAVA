package 복습;

public class 배열하나씩 {

	public static void main(String[] args) {
		char[] gender = {'남','여','남'};
		//반복해서 하나씩 꺼낼때는 임시변수 char이어야 함.
		//반복해서 꺼낸 후, 연산을 하거나, 출력하는 경우 사용
		for (char x : gender) {
			System.out.println(x);
		}
		String[] subject = {"수학","국어","컴퓨터"};
		for (String s : subject) {
			System.out.println(s);
		}
		double[] weight = {88.8, 99.9, 77.7};
		for (double d : weight) {
			System.out.println(d);
		}
		
	}

}



