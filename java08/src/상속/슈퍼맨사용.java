package 상속;

public class 슈퍼맨사용 {
	
	public static void main(String[] args) {
		슈퍼맨 sup = new 슈퍼맨();
		
		sup.name = "클라크";		// 사람
		sup.age = 1000;			// 사람
		sup.power = 30000;		// 맨
		sup.먹다();				// 사람
		sup.run();				// 맨 -> 슈퍼맨 : 오버라이딩
		sup.space();			// 슈퍼맨
		
		System.out.println(sup);
		
	}
	
}
