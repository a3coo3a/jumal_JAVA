package �迭;

public class �����˰��ִ°�� {
	int win = 0; //��������(global)-
	
	public static void main(String[] args) {
		//���� ������ ����� �ñ�: ����! 
		//������ ��ġ�� ������ ����!!!
		//�Լ����� ���������� ������ �� �ִ� ����: ��������
		//���� = local
		//names[0]  = 100;
		String[] names = {"ȫ�浿", "ȫ���", "ȫ����"};
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		for (String x : names) {
			System.out.print(x  + " ");
		}
		System.out.println();
		
		
		char[] gender = {'��','��','��'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		for (char c : gender) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		int[] ages = {100, 25, 11};
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println();
		for (int x : ages) { //i=>int
			System.out.print(x + " ");
		}
		System.out.println();
		
		double[] height = {187.3, 154.2, 140};
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
		System.out.println();
		
		for (double d : height) {
			System.out.print(d + " ");
		}
	}

}
