package 배열;

public class 값을모르고있는경우 {

	public static void main(String[] args) {
		int[] num = new int[1000];
		System.out.println(num); //주소값.
		System.out.println(num[0]); //위치값(index), 0부터 시작
		System.out.println(num[999]);
		//배열은 초기값이 다 들어있다.int->0, double->0.0
		num[500] = 1;
		num[666] = 1;
//		int num2 = 0;
//		System.out.println(num2);
		
		int[] seat = new int[21];
		//읽기 전용 변수: 배열의 개수
		System.out.println(seat.length);
		System.out.println(seat[0] == seat[2]);
		//System.out.println(seat == seat[0]);
		seat[2] = 1;
		seat[3] = 1;
		seat[4] = 1;
		seat[5] = 1;
		
		//for문 내에서의 i는 배열에서 index역할
		//i => index
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		
		
		
		
		
		
	}
}
