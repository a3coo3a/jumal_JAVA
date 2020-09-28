package 정적;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버메인화면크롤링 {

	public static void main(String[] args) throws Exception {
		// 1. 네이버에 연결
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1. 네이버 연결 성공.!!");
		
		// 2. 메인화면에 해당하는 소스를 다운로드
		Document doc = con.get();
		System.out.println("2. 소스코드 다운로드. 성공!!");
		System.out.println(doc);
		
		
		// 3. 원하는 데이터를 추출
		// <>: element(tag,태그)
		// <>의 묶음: Elements(배열처럼 생각하면 됨.)
		Elements list1 = doc.select("a.nav");
		System.out.println("3. 데이터 추출 성공.!!");
		System.out.println("메뉴의 개수 " + list1.size());
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + "번째 element: " + list1.get(i).text());
		}
		System.out.println("증권만 가지고 오고 싶으면>> " + list1.get(9).text());
		
		
		
		
		
		
		
		
		
		

	}

}




