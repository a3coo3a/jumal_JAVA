package ���;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;
import javax.swing.SwingConstants;


public class �׷��Ƚ����� extends JFrame {
	JLabel l1 = new JLabel("\uCE74\uC6B4\uD130\uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
	JLabel l2 = new JLabel("");
	JLabel l3 = new JLabel("\uB0A0\uC9DC \uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
	// new�� �̿��ؼ� ��ü������ �ڵ�ȣ��Ǵ� Ŭ������ �̸��� ������ �޼���
	// -> ������ �޼���
	public �׷��Ƚ�����() {
		setTitle("\uCE74\uC6B4\uD130");
		getContentPane().setBackground(Color.PINK);
		setSize(450, 250);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		
		l1.setFont(new Font("������� ExtraBold", Font.PLAIN, 20));
		getContentPane().add(l1, BorderLayout.NORTH);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		
		l2.setFont(new Font("������� ExtraBold", Font.PLAIN, 20));
		getContentPane().add(l2, BorderLayout.CENTER);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		
		l3.setFont(new Font("������� ExtraBold", Font.PLAIN, 20));
		getContentPane().add(l3, BorderLayout.SOUTH);
		
		ī���ͽ�����2 c = new ī���ͽ�����2();
		��¥������2 d = new ��¥������2();
		�̹���������2 img = new �̹���������2();
		c.start();
		d.start();
		img.start();
		setVisible(true);
		
	}
	// Ŭ���� �ȿ� Ŭ������ ���� �ִ� �� : ���� Ŭ����
	// ������ ����ϰ� �; �̷��� ��.
	// ���� : ������ ���·� ���� ��� �Ұ���.
	public class ī���ͽ�����2 extends Thread {
		@Override
		public void run() {
			// ����ó���� ��� 
			// - network, file, cpu  ���� �޼����� ��� ����ó���� �ؾ���.
			for (int i = 500; i > 0; i--) {
				//System.out.println("ī��Ʈ : " + i);
				l1.setText("ī���� : "+i);
				try {		// �������̵��ϴ� ��� throws�� ����ó�� �Ұ� (���� �Һ�) try-catch ����ؾ� ��.
					Thread.sleep(500);	// 1��
				} catch (InterruptedException e) {
					System.out.println("cpu�� �����ϴ� �� ���� �߻�");
				}		
			}

		}
	} // ī��Ʈ������ end
	public class ��¥������2 extends Thread {
		@Override
		public void run() {
			
			for (int i = 0; i < 300; i++) {
				Date date = new Date();
				//System.out.println(date);
				///String dates = date.toString();
				//l3.setText(dates);
				l3.setText(date+"");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("��¥ ��ȭ�� ���� �߻�");
				}
				
			}
		}
	}
	public class �̹���������2 extends Thread {
		@Override
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				//System.out.println("�׸� : " + list[i]);
				l2.setIcon(icon);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("�̹��� ��ȭ�� ���� �߻�");
				}
			}
		}
	}
	 
	 
}
