package ��ǰ�����;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �׷��Ȱ��� {
	private static JTextField textField;
	private static JTextField textField_1;
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(350,500);
		f.setTitle("���� �׷��� ����");
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC7901");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("�������", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 26, 100, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("�������", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 86, 100, 51);
		f.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(105, 29, 203, 50);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 90, 203, 50);
		f.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uACC4\uC0B0\uACB0\uACFC");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("������� ExtraBold", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 252, 310, 44);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ΰ��� �Էµ� ���� ������ �´�.
				String t1 = textField.getText();
				String t2 = textField_1.getText();
				// �ܺο��� �Էµ� ������ ��� String -> int ��ȯ �ʿ�
				int x = Integer.parseInt(t1);
				int y = Integer.parseInt(t2);
				// ����ؼ�, ����� �־��ش�.
				int result = x + y;
				lblNewLabel_2.setText("���� ����� "+result);
			}
		});
		button.setFont(new Font("������� ExtraBold", Font.BOLD, 20));
		button.setBounds(33, 160, 60, 60);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ΰ��� �Էµ� ���� ������ �´�.
				String t1 = textField.getText();
				String t2 = textField_1.getText();
				// �ܺο��� �Էµ� ������ ��� String -> int ��ȯ �ʿ�
				int x = Integer.parseInt(t1);
				int y = Integer.parseInt(t2);
				// ����ؼ�, ����� �־��ش�.
				int result = x - y;
				lblNewLabel_2.setText("���� ����� "+result);
			}
		});
		button_1.setFont(new Font("������� ExtraBold", Font.BOLD, 20));
		button_1.setBounds(105, 160, 60, 60);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		
		button_2.setFont(new Font("������� ExtraBold", Font.BOLD, 20));
		button_2.setBounds(175, 160, 60, 60);
		f.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		
		button_3.setFont(new Font("������� ExtraBold", Font.BOLD, 20));
		button_3.setBounds(248, 160, 60, 60);
		f.getContentPane().add(button_3);
		
		f.setVisible(true);
	}
}
