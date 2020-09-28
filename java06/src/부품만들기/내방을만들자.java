package 부품만들기;

public class 내방을만들자 {
	public static void main(String[] args) {
		휴대폰 phone1 = new 휴대폰();
		phone1.전화하다();
		phone1.color = "파랑색";
		phone1.company = "LG";

		System.out.println("내 휴대폰 색 : " + phone1.color);
		System.out.println("내 휴대폰 회사 : " + phone1.company);
		System.out.println(phone1);		
		
		System.out.println();
		
		휴대폰 phone2 = new 휴대폰();
		phone2.color = "빨강색";
		phone2.company = "삼성";
		phone2.인터넷하다();
		System.out.println("내 휴대폰 색 : " + phone2.color);
		System.out.println("내 휴대폰 회사 : " + phone2.company);
		
		
		
		
		
		
		
		
		
		
		
	}
}
