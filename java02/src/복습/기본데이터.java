package 복습;

public class 기본데이터 {

	public static void main(String[] args) {

		// 기본데이터는 변수에 해당 타입의 값이 바로 저장
		int day = 23;		//4byte
		double temp = 26.5;	//8byte
		char color = '흰';	//2byte
		boolean hot = true;	//논리, 1byte
		
		String company = "kgitbank";
		
		// 결합연산자 (+) : 하나라도 String이면 ! 결합연산자 역할을 함. 
		// system - 컴퓨터, out - 모니터 , 
		System.out.println("오늘 날짜는 " + day + "일");
		System.out.println("오늘 온도는 " + temp + "도");
		System.out.println("오늘 색깔은 " + color);
		System.out.println("오늘 체감은 " + hot );
		System.out.println("오늘 회사는 " + company);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
