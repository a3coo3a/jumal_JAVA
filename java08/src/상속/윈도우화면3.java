package 상속;

import javax.swing.JFrame;

import 인터페이스.버튼이벤트처리1;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class 윈도우화면3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);

		JButton b1 = new JButton("\uB098\uB97C \uB20C\uB7EC!");
		b1.setBackground(Color.ORANGE);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 50));
		f.getContentPane().add(b1, BorderLayout.NORTH);

		// 익명 클래스
		// - 인터페이스의 꼭 오버라이드 해야하는 메서드를 구현한 이름 없는 클래스
		// new 뒤에를 전체를 클래스 명으로 보는상황
		// ActionListener 인터페이스를 구현한 액션퍼폼드를 오버라딩한 클래스를 new! 찍어라

		b1.addActionListener(new ActionListener() { // 이름 없는 클래스, 익명클래스

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1누름");

			}
		});

		JButton b2 = new JButton("\uB098\uB3C4 \uB20C\uB7EC!");
		b2.setBackground(Color.ORANGE);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 50));
		f.getContentPane().add(b2, BorderLayout.SOUTH);

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 2누름");
			}
		});

		f.setVisible(true);
	}

}
