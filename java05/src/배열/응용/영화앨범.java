package 배열.응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class 영화앨범 {
	static int index = 2;
	
	public static void main(String[] args) {
		//세개의 배열
		String[] title = {"테넷","뮬란","오!문희","기기괴괴성형수","테스와 보낸 여름"};
		String[] img = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"};
		String[] order = {"41.74%","31.34%","6.52%","5.42%","1.94%"};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 228, 196));
		f.setBackground(new Color(255, 228, 196));
		f.setSize(342, 349);
		
		JLabel center = new JLabel("");
		center.setBackground(new Color(255, 228, 196));
		center.setHorizontalAlignment(SwingConstants.CENTER);
		center.setIcon(new ImageIcon(img[2]));
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 30));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel sub = new JLabel(order[2]);
		sub.setHorizontalAlignment(SwingConstants.CENTER);
		sub.setFont(new Font("나눔고딕", Font.BOLD, 20));
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.setBackground(new Color(188, 143, 143));
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("왼쪽버튼을 눌렀음.");
				index--;
//				if(index == 0) {
//					JOptionPane.showMessageDialog(f, "왼쪽 끝입니다.");
//				}
				if(index < 0) {
					index = title.length-1;
				}
				top.setText(title[index]);
				sub.setText(order[index]);
				ImageIcon icon = new ImageIcon(img[index]);	// icon코드의 경우 이미지 수정이 안됨.
				 center.setIcon(icon);
			}
		});
		btnNewButton.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("오른쪽버튼을 눌렀음.");
				index++;
//				if(index == title.length-1) {
//					JOptionPane.showMessageDialog(f, "오른쪽 끝입니다.");
//				}
				if(index > title.length-1) {
					index = 0;
				}
				top.setText(title[index]);
				sub.setText(order[index]);
				ImageIcon icon = new ImageIcon(img[index]);
				center.setIcon(icon);
			}
		});
		btnNewButton_1.setBackground(new Color(188, 143, 143));
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
