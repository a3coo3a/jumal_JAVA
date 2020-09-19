package 연산자;

import javax.swing.JOptionPane;

public class 비교연산자 {

	public static void main(String[] args) {
		int x = 300;
		int y = 200;
		System.out.println(x == y);	//false
		System.out.println(x != y); //true
		System.out.println(x >= y); //true
		System.out.println(x < y);  //false
		
		
		int id = 1000; //회원가입시 id
		//기본데이터만 비교연산자 사용 가능!
		int id2 = 1111;
		System.out.println(id == id2);	//false
		//조건 체크를 해서, 조건이 맞으면 로그인 ok
		//		`	       조건이 안맞으면 로그인 not
		//조건부분에는 반드시 비교연산자를 써야한다.!
		
		if (id == id2) { //true
			System.out.println("로그인 ok");
		} else { //false
			System.out.println("로그인 not");
			JOptionPane.showMessageDialog(null, "로그인not");

		}
		
		
		
		
		
		
		
		
	}

}
