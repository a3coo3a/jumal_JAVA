package 정적;

public class 여러회사클롤링 {

	public static void main(String[] args) throws Exception {
		네이버화면크롤링2 naver = new 네이버화면크롤링2();
		//naver.finance("035720");
		//naver.finance("017670");
		//naver.finance("005930");
		String[] coms = {"035720", "017670", "005930"};
		for (int i = 0; i < coms.length; i++) {
			naver.finance(coms[i]);
		}
	}

}




