package 상속;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;
import javax.swing.SwingConstants;


public class 그래픽스레드 extends JFrame {
	JLabel l1 = new JLabel("\uCE74\uC6B4\uD130\uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
	JLabel l2 = new JLabel("");
	JLabel l3 = new JLabel("\uB0A0\uC9DC \uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
	// new를 이용해서 객체생성시 자동호출되는 클래스와 이름이 동일한 메서드
	// -> 생성자 메서드
	public 그래픽스레드() {
		setTitle("\uCE74\uC6B4\uD130");
		getContentPane().setBackground(Color.PINK);
		setSize(450, 250);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		
		l1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		getContentPane().add(l1, BorderLayout.NORTH);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		
		l2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		getContentPane().add(l2, BorderLayout.CENTER);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		
		l3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		getContentPane().add(l3, BorderLayout.SOUTH);
		
		카운터스레드2 c = new 카운터스레드2();
		날짜스레드2 d = new 날짜스레드2();
		이미지스레드2 img = new 이미지스레드2();
		c.start();
		d.start();
		img.start();
		setVisible(true);
		
	}
	// 클래스 안에 클래스를 집어 넣는 것 : 내부 클래스
	// 변수를 사용하고 싶어서 이렇게 옴.
	// 단점 : 독립된 형태로 따로 사용 불가능.
	public class 카운터스레드2 extends Thread {
		@Override
		public void run() {
			// 예외처리의 경우 
			// - network, file, cpu  관련 메서드의 경우 예외처리를 해야함.
			for (int i = 500; i > 0; i--) {
				//System.out.println("카운트 : " + i);
				l1.setText("카운터 : "+i);
				try {		// 오버라이딩하는 경우 throws로 예외처리 불가 (원본 불변) try-catch 사용해야 함.
					Thread.sleep(500);	// 1초
				} catch (InterruptedException e) {
					System.out.println("cpu와 연결하던 중 에러 발생");
				}		
			}

		}
	} // 카운트스레드 end
	public class 날짜스레드2 extends Thread {
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
					System.out.println("날짜 변화중 오류 발생");
				}
				
			}
		}
	}
	public class 이미지스레드2 extends Thread {
		@Override
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				//System.out.println("그림 : " + list[i]);
				l2.setIcon(icon);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("이미지 변화중 오류 발생");
				}
			}
		}
	}
	 
	 
}
