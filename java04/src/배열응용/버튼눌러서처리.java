package �迭����;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ��ư������ó�� {

	public static void main(String[] args) {
		
		// �⺻Ʋ�� �ش��ϴ� ��ǰ
		JFrame f = new JFrame();
		f.setTitle("\uACC4\uC808");
		f.getContentPane().setBackground(new Color(51, 51, 51));
		f.setSize(300, 300);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uBD04");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "���� �����ؿ�");
			}
		});
		btnNewButton.setForeground(new Color(255, 102, 102));
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setFont(new Font("������� ExtraBold", Font.BOLD, 50));
		btnNewButton.setBounds(47, 28, 190, 80);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uC5EC\uB984");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "�ʹ� ������");
			}
		});
		button.setForeground(new Color(0, 0, 255));
		button.setBackground(new Color(204, 255, 255));
		button.setFont(new Font("�ü�ü", Font.BOLD | Font.ITALIC, 50));
		button.setBounds(47, 144, 190, 80);
		f.getContentPane().add(button);
		
		
		
		
		
			
		
		
		
		f.setVisible(true);
	}
}
