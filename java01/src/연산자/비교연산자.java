package ������;

import javax.swing.JOptionPane;

public class �񱳿����� {

	public static void main(String[] args) {
		int x = 300;
		int y = 200;
		System.out.println(x == y);	//false
		System.out.println(x != y); //true
		System.out.println(x >= y); //true
		System.out.println(x < y);  //false
		
		
		int id = 1000; //ȸ�����Խ� id
		//�⺻�����͸� �񱳿����� ��� ����!
		int id2 = 1111;
		System.out.println(id == id2);	//false
		//���� üũ�� �ؼ�, ������ ������ �α��� ok
		//		`	       ������ �ȸ����� �α��� not
		//���Ǻκп��� �ݵ�� �񱳿����ڸ� ����Ѵ�.!
		
		if (id == id2) { //true
			System.out.println("�α��� ok");
		} else { //false
			System.out.println("�α��� not");
			JOptionPane.showMessageDialog(null, "�α���not");

		}
		
		
		
		
		
		
		
		
	}

}
