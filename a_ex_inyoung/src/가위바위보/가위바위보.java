package 가위바위보;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class 가위바위보 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setSize(725, 526);
		j.getContentPane().setLayout(null);
		
		JButton ss = new JButton("");
		ss.setBounds(533, 297, 340, 340);
		j.getContentPane().add(ss);
		
		JButton rr = new JButton("");
		rr.setIcon(new ImageIcon("D:\\course\\java\\java_jumal\\a_ex_inyoung\\rr.png"));
		rr.setBounds(12, 10, 340, 340);
		j.getContentPane().add(rr);
		
		JButton pp = new JButton("");
		pp.setBounds(533, 132, 340, 340);
		j.getContentPane().add(pp);
		j.setVisible(true);
	}
}
