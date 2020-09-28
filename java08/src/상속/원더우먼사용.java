package 상속;

public class 원더우먼사용 {

	public static void main(String[] args) {
		원더우먼 wonder = new 원더우먼();
		
		wonder.name = "이쁜이";
		wonder.age = 100;
		wonder.wAge = 20;
		wonder.먹다();
		wonder.beauty();
		wonder.beam();
		
		System.out.println(wonder);
	}

}
