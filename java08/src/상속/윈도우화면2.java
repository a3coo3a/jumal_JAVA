package ���;

import javax.swing.JFrame;

import �������̽�.��ư�̺�Ʈó��1;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ������ȭ��2 implements ActionListener{

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JButton b1 = new JButton("\uB098\uB97C \uB20C\uB7EC!");
		b1.setBackground(Color.ORANGE);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("������� ExtraBold", Font.BOLD, 50));
		f.getContentPane().add(b1, BorderLayout.NORTH);
		������ȭ��2 win2 = new ������ȭ��2();
		b1.addActionListener(win2);
		
		JButton b2 = new JButton("\uB098\uB3C4 \uB20C\uB7EC!");
		b2.setBackground(Color.ORANGE);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("������� ExtraBold", Font.BOLD, 50));
		f.getContentPane().add(b2, BorderLayout.SOUTH);

		b2.addActionListener(win2);
		
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("��ư ���������� ���� �ڵ� ȣ���.");
		
	}

}
