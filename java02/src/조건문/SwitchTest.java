package 조건문;

public class SwitchTest {

	public static void main(String[] args) {
		//컨트롤 +쉬프트+f : 자동정렬
		int jumsu = 100;
		String result = "";
		switch (jumsu) {
		case 100:
			result = "만점";
			break;
		case 90:
			result = "만점에 가까움";
			break;
		default:
			result = "만점에서 멀어요";
			break;
		}
		System.out.println(result);
		
		
		
		
		String food = "아이스크림";
		String go = "";
		switch (food) {
		case "아이스크림":
			go = "편의점으로 가자";
			break;
		case "냉면":
			go = "분식집으로 가자";
			break;
		default:
			go = "집에서 먹어요";
			break;
		}

		System.out.println(go);
	}

}
