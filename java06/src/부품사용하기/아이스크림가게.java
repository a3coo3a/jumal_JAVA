package 부품사용하기;

import 부품만들기.계산기;

public class 아이스크림가게 {

	public static void main(String[] args) {
		int ice = 3;
		int coffee = 5;

		계산기 cal = new 계산기();
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
			System.out.println((sum - 3000) + "원을 결제합니다.");
		} else {
			System.out.println(sum + "원을 결제합니다.");
		}

	}
}
