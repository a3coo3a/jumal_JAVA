package 부품만들어사용하기;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		//하나의 이름으로 입력값이 다르다면
		//메서드 이름을 동일하게 사용 가능
		//오버로딩
		//하나의 이름으로 다양한 형태를 구현하는 자바의 특성(다형성)
		JFrame f = new JFrame();
		JFrame f2 = new JFrame("test");
		
		JOptionPane.showInputDialog("이름입력");
		//클래스이름으로 객체생성하지 않고, 바로 접근해서 사용할 수 있는 메서드
		//static메서드
		Integer.parseInt("100");
		
		
		
		
		
		
	}

}
