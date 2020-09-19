package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품을써보자 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(800, 600);		// 설정을 바꾸지 않으면 아무것도 보이지 않음.
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		b1.setText("노랑");
		b2.setText("파랑");
		b3.setText("빨강");
		
		f.add(b1);
				
		f.setVisible(true);			// 보여지게 바꾸는 설정/ 위에 있는걸 다 보여줘 라는 의미이기에 가장 아래에 두어야함.
		
		
		
		
	}
}
