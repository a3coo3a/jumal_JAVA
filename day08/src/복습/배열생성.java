package 복습;

public class 배열생성 {

	public static void main(String[] args) {
		//많은 양의 데이터를 다룰 때=>배열을 사용
		//배열을 사용할 때는 
		//처음에 값을 알고 있는 경우, 배열 생성시 바로 넣음.
		//처음에 값을 모르고 있는 경우, 배열 생성하고 나서 나중에 넣음.
		int[] jumsu1 = {100, 90, 88, 77}; //1학기 점수
		System.out.print("1학기: ");
		for (int i = 0; i < jumsu1.length; i++) {
			System.out.print(jumsu1[i] + " ");
		}
		System.out.println();
		for (int x : jumsu1) {
			System.out.println(x);
		}
		int[] jumsu2 = new int[4]; //2학기 점수
		jumsu2[0] = 99;//수학점수
		jumsu2[1] = 88;//국어
		jumsu2[2] = 77;//컴퓨터
		jumsu2[3] = 100;//체육
		System.out.print("2학기: ");
		//i의 역할은 위치값(index)
		for (int i = 0; i < jumsu2.length; i++) {
			System.out.print(jumsu2[i] + " ");
		}
		//for-each: 처음부터 하나씩 반복함.
		for (int x : jumsu2) { //i의 역할은 int의 저장공간
			//10, 20, 30, 40(x는 하나씩 꺼내왔을 때의 임시변수)
			System.out.println(x);
		}
		
	}

}
