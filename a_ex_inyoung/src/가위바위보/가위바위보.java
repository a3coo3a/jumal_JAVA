package 가위바위보;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class 가위바위보 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setSize(1077, 512);
		j.getContentPane().setLayout(null);
		
		JButton ss = new JButton("");
		ss.setIcon(new ImageIcon("D:\\course\\java\\java_jumal\\a_ex_inyoung\\ss.png"));
		ss.setBounds(713, 68, 340, 340);
		j.getContentPane().add(ss);
		
		JButton rr = new JButton("");
		rr.setIcon(new ImageIcon("D:\\course\\java\\java_jumal\\a_ex_inyoung\\rr.png"));
		rr.setBounds(12, 68, 340, 340);
		j.getContentPane().add(rr);
		
		JButton pp = new JButton("");
		pp.setIcon(new ImageIcon("D:\\course\\java\\java_jumal\\a_ex_inyoung\\pp.png"));
		pp.setBounds(362, 68, 340, 340);
		j.getContentPane().add(pp);
		
		JLabel top = new JLabel("\uAC00\uC704 \uBC14\uC704 \uBCF4 \uAC8C\uC784\uC744 \uC2DC\uC791\uD569\uB2C8\uB2E4. \uC6D0\uD558\uB294 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694");
		top.setFont(new Font("굴림", Font.BOLD, 20));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setBounds(12, 10, 1041, 48);
		j.getContentPane().add(top);
		
		JLabel under = new JLabel("\uC544\uC9C1 \uAC8C\uC784\uC2DC\uC791 \uC804\uC785\uB2C8\uB2E4");
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 20));
		under.setBounds(12, 418, 1041, 48);
		j.getContentPane().add(under);
		j.setVisible(true);
	}
}
