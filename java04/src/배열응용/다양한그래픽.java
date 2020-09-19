package 배열응용;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 다양한그래픽 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD64D\uAE38\uB3D9\uC758 \uADF8\uB798\uD53D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("궁서체", Font.BOLD, 20));
		lblNewLabel.setBounds(277, 156, 176, 27);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("궁서체", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(218, 193, 55, 27);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		t1.setBackground(Color.PINK);
		t1.setBounds(273, 193, 180, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PW :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("궁서체", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(218, 233, 55, 27);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		t2.setColumns(10);
		t2.setBackground(Color.PINK);
		t2.setBounds(273, 233, 180, 30);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_1 = new JButton("\uB098\uB97C \uB20C\uB7EC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력한 id, pw를 가지고 와야 함.
				String id2 = "root";
				String pw2 = "1234";
				
				String id = t1.getText();
				String pw = t2.getText();
				System.out.println("당신의 입력한 id는 : " + id + "\n당신이 입력한 pw는 : " + pw);
				// 가지고 온 id, pw가 맞는지 비교 (논리연산자)
				if (id.equals(id2) && pw.equals(pw2)) {
					JOptionPane.showMessageDialog(f, "로그인 ok");
				} else {
					JOptionPane.showMessageDialog(f, "로그인 not");
				}
				// 비교한 결과 맞으면, 로그인 ok
				// 		안 맞으면, 로그인not
				
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("나눔고딕", Font.BOLD, 80));
		btnNewButton_1.setBounds(26, 287, 428, 131);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("\uB098\uC774 :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("궁서체", Font.BOLD, 13));
		lblNewLabel_1.setBounds(30, 176, 55, 27);
		f.getContentPane().add(lblNewLabel_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		t3.setColumns(10);
		t3.setBackground(Color.PINK);
		t3.setBounds(86, 176, 120, 30);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("PUSH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "나를 눌렀네 ^0^");
				// 나이 입력한 값을 가지고 오세요
				String age = t3.getText();
				// 모든 입력 타입은 String -> int
				int age2 = Integer.parseInt(age);
				//내년 나이를 구해서 화면으로 출력
				JOptionPane.showMessageDialog(f, "내년 나이는 " + (age2+1) +"세");
				
				
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 45));
		btnNewButton.setBounds(26, 213, 180, 50);
		f.getContentPane().add(btnNewButton);
		
		t4 = new JTextField();
		t4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		t4.setColumns(10);
		t4.setBackground(Color.YELLOW);
		t4.setBounds(26, 21, 180, 30);
		f.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		t5.setColumns(10);
		t5.setBackground(Color.YELLOW);
		t5.setBounds(26, 61, 180, 30);
		f.getContentPane().add(t5);
		
		JButton btnPlus = new JButton("PLUS");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = t4.getText();
				String n2 = t5.getText();
				int num1 = Integer.parseInt(n1);
				int num2 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, "두수를 더한 값은 : " + (num1+num2));
				
			}
		});
		btnPlus.setForeground(Color.GREEN);
		btnPlus.setFont(new Font("Arial Black", Font.PLAIN, 45));
		btnPlus.setBackground(Color.YELLOW);
		btnPlus.setBounds(26, 101, 180, 50);
		f.getContentPane().add(btnPlus);
		
			
		f.setVisible(true);
	}
}
