package �ݺ���;

import java.util.Scanner;

public class �α���ǥ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		while (true) {
			System.out.println("�α� ��ǥ : 1)������  2)���缮  3)BTS 4)����");
			System.out.print("���ù�ȣ >> ");
			int input = scan.nextInt();
			
			if(input == 4)	{	// ���� ���� üũ�ϴ� ���� ����
				System.out.println("�ý����� �����մϴ�.");
				System.out.println("������ : " + count1 + "ǥ");
				System.out.println("���缮 : " + count2 + "ǥ");
				System.out.println("BTS : " + count3 + "ǥ");
				System.out.println("�� ��ǥȽ�� : " + (count1 + count2 + count3) + "ȸ");
				
				System.exit(0);
			}
			
			
			if(input == 1) {
				count1++;
				System.out.println("������ ��ǥ ȹ��!");
			}else if(input == 2) {
				count2++;
				System.out.println("���缮 ��ǥ ȹ��");
			}else if(input == 3) {
				count3++;
				System.out.println("BTS ��ǥ ȹ��");
			}else {
				
				System.out.println("���� ��ȣ �Դϴ�. ��Ȯ�ϰ� Ȯ�� �� �ٽ� �Է��� �ּ���");
			}
			
					
		}//while end
		
	}//main end

}
