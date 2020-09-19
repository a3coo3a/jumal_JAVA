package ¹Ýº¹¹®;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ±×·¡ÇÈÀÔ¹® {

	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
	
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "°¡¿îµ¥ ¹öÆ°À» ´­·¶À½.");
			}
		});
		b1.setBackground(Color.GREEN);
		b1.setForeground(Color.RED);
		b1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 16));
		
		JTextField t1 = new JTextField();
	
		f.setSize(500, 500);
		
		f.getContentPane().add(b1);
		
		b1.setText("³ª¸¦ ´­·¯¿ä");
		
		JButton btnNewButton = new JButton("\uBD81\uCABD\uBC84\uD2BC");
		btnNewButton.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 17));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setForeground(Color.BLUE);
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("\uC11C\uCABD\uBC84\uD2BC");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 18));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uB0A8\uCABD\uBC84\uD2BC");
		btnNewButton_2.setForeground(Color.GREEN);
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 18));
		f.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("\uB3D9\uCABD\uBC84\uD2BC");
		btnNewButton_3.setForeground(Color.CYAN);
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		
		
		
		
		
		f.setVisible(true);
		
	}
}
