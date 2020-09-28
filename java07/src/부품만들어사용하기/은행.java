package 부품만들어사용하기;

public class 은행 {

	public static void main(String[] args) {
		계좌 account1 = new 계좌("홍길동", "적금", 1000);
		계좌 account2 = new 계좌("박길동", "예금", 2000);
		계좌 account3 = new 계좌("송길동", "예적금", 3000);
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		
	}

}
