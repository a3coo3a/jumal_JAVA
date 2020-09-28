package 복습;

import javax.swing.JOptionPane;

public class 외부입력저장 {

	public static void main(String[] args) {
		//데이터를 3개를 입력을 받으려고 함.
		String[] data = new String[3]; //{null, null, null}
		for (int i = 0; i < 3; i++) { //100, 200, 300
			 data[i] = JOptionPane.showInputDialog("숫자입력");
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
