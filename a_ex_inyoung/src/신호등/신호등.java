package ��ȣ��;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ��ȣ�� {
	public static void main(String[] args) {
		String[] img = {"red.png", "yellow.png","blue.png"};
		JFrame j = new JFrame();
		j.setSize(260, 507);
		j.getContentPane().setLayout(null);
		
		JLabel imgBox = new JLabel("");
		imgBox.setIcon(new ImageIcon(img[0]));
		imgBox.setBounds(12, 196, 220, 262);
		j.getContentPane().add(imgBox);
		
		JButton red = new JButton("\uBE68\uAC15\uC2E0\uD638");
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("������ư ����");
				ImageIcon icon = new ImageIcon(img[0]);
				imgBox.setIcon(icon);
			}
		});
		red.setForeground(Color.WHITE);
		red.setFont(new Font("�޸տ�ü", Font.BOLD, 30));
		red.setBackground(Color.RED);
		red.setBounds(12, 10, 220, 52);
		j.getContentPane().add(red);
		
		JButton yellow = new JButton("\uB178\uB791\uC2E0\uD638");
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("�����ư ����");
				ImageIcon icon = new ImageIcon(img[1]);
				imgBox.setIcon(icon);
			}
		});
		yellow.setForeground(Color.WHITE);
		yellow.setFont(new Font("�޸տ�ü", Font.BOLD, 30));
		yellow.setBackground(Color.YELLOW);
		yellow.setBounds(12, 72, 220, 52);
		j.getContentPane().add(yellow);
		
		JButton blue = new JButton("\uD30C\uB791\uC2E0\uD638");
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("�Ķ���ư ����");
				ImageIcon icon = new ImageIcon(img[2]);
				imgBox.setIcon(icon);
			}
		});
		blue.setForeground(Color.WHITE);
		blue.setFont(new Font("�޸տ�ü", Font.BOLD, 30));
		blue.setBackground(Color.BLUE);
		blue.setBounds(12, 134, 220, 52);
		j.getContentPane().add(blue);
		
		
		j.setVisible(true);
	}
}
