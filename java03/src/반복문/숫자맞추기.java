package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class ���ڸ��߱� {

	public static void main(String[] args) {
		Random r = new Random();
		
		int target = r.nextInt(100);	//0~99	// () ���� ���ں��� ���� �� �߻�. ����Ѱ�� int �� ����

		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
			while (true) {
				System.out.print("����� ������ �� �Է� >> ");
				int think = scan.nextInt(); // �Է��� ���� String�ε� int�� �ٲ��ִ� ������ nextInt()
				count++;
				if (target == think) {
					System.out.println("�����Դϴ�.");
					System.out.println("���ϵ帳�ϴ�. �ý����� �����մϴ�");
					System.out.println("����� �õ� Ƚ���� " + count + "ȸ");
					//break;		
					// if�� break�� ��� �ʿ�� �˾Ƽ� ���ᰡ �� �Ǵ°� ���Ƽ� break�� if���� �ƴϴ�. while�� ���̴�.
					// �ݺ����� stop
					
					System.exit(0); 
					// ���α׷��� ����
					// ���� �ʿ�� ����� '0'/ �׿��� ���� ���� �ٸ� ������ �ִ� ��
					// while�� ������ ���ÿ� �����Ƿ� while ���� ������ ������ �� ���� �����̹Ƿ� �ʿ� ���� �����̶� ���� �߻�
					
				} else {
					System.out.println("������ �ƴմϴ�~ ");
					// ���߰��� �ϴ� ������ ū���� �Է������� "�ʹ�Ŀ��"
					// ���߰��� �ϴ� ������ �������� �Է������� "�ʹ��۾ƿ�"
					if(target < think) {
						System.out.println("�ʹ� Ŀ��~");
					}else {
						System.out.println("�ʹ� �۾ƿ�~");
					}
					System.out.println();
				} 
			}
//			System.out.println("����� �õ� Ƚ���� " + count + "ȸ");
			

	}

}
