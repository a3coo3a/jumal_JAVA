package ����;

public class �����ϱ��� {

	public static void main(String[] args) {
		Day	day1 = new Day("�ڹٰ���", 10, "����");
		System.out.println(day1);
		System.out.println(Day.count + "��°");
		System.out.println(Day.sum + "�ð�");
		//System.out.println("��սð�: " + Day.sum/Day.count + "�ð�");
		Day.avg();
		
		Day	day2 = new Day("����", 15, "������");
		System.out.println(day2);
		System.out.println(Day.count + "��°");
		System.out.println(Day.sum + "�ð�");
		//System.out.println("��սð�: " + Day.sum/Day.count + "�ð�");
		Day.avg();
		
		Day	day3 = new Day("�", 11, "��Ʈ�Ͻ�");
		System.out.println(day3);
		System.out.println(Day.count + "��°");
		System.out.println(Day.sum + "�ð�");
		//System.out.println("��սð�: " + Day.sum/Day.count + "�ð�");
		Day.avg();
	}

}
