package 상속;

import javax.swing.JFrame;

import 인터페이스.버튼이벤트처리1;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class 윈도우화면2 implements ActionListener{

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JButton b1 = new JButton("\uB098\uB97C \uB20C\uB7EC!");
		b1.setBackground(Color.ORANGE);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 50));
		f.getContentPane().add(b1, BorderLayout.NORTH);
		윈도우화면2 win2 = new 윈도우화면2();
		b1.addActionListener(win2);
		
		JButton b2 = new JButton("\uB098\uB3C4 \uB20C\uB7EC!");
		b2.setBackground(Color.ORANGE);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 50));
		f.getContentPane().add(b2, BorderLayout.SOUTH);

		b2.addActionListener(win2);
		
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("버튼 누를때마다 내가 자동 호출됨.");
		
	}

}
