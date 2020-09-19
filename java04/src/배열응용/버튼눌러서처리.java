package 배열응용;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼눌러서처리 {

	public static void main(String[] args) {
		
		// 기본틀에 해당하는 부품
		JFrame f = new JFrame();
		f.setTitle("\uACC4\uC808");
		f.getContentPane().setBackground(new Color(51, 51, 51));
		f.setSize(300, 300);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uBD04");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "아직 선선해요");
			}
		});
		btnNewButton.setForeground(new Color(255, 102, 102));
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 50));
		btnNewButton.setBounds(47, 28, 190, 80);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uC5EC\uB984");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "너무 더워요");
			}
		});
		button.setForeground(new Color(0, 0, 255));
		button.setBackground(new Color(204, 255, 255));
		button.setFont(new Font("궁서체", Font.BOLD | Font.ITALIC, 50));
		button.setBounds(47, 144, 190, 80);
		f.getContentPane().add(button);
		
		
		
		
		
			
		
		
		
		f.setVisible(true);
	}
}
