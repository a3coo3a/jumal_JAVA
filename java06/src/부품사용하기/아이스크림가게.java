package ��ǰ����ϱ�;

import ��ǰ�����.����;

public class ���̽�ũ������ {

	public static void main(String[] args) {
		int ice = 3;
		int coffee = 5;

		���� cal = new ����();
		cal.add(ice, coffee);

		int team1 = 10;
		int team2 = 35;
		cal.minus(team1, team2);

		int coffeePrice = 5000;
		int icePrice = 3000;
		int coffeeResult = cal.mul(coffee, coffeePrice);
		int iceResult = cal.mul(ice, icePrice);
		int sum = cal.add(coffeeResult, iceResult);
		if (sum >= 30000) {
			System.out.println((sum - 3000) + "���� �����մϴ�.");
		} else {
			System.out.println(sum + "���� �����մϴ�.");
		}

	}
}
