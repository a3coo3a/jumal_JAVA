package 정적;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권화면크롤링 {

	public static void main(String[] args) throws Exception {
		// 1. 네이버에 연결
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=035720");
		System.out.println("1. 네이버 증권 카카오 사이트 연결 성공.!!");
		
		// 2. 메인화면에 해당하는 소스를 다운로드
		Document doc = con.get();
		System.out.println("2. 소스코드 다운로드. 성공!!");
		System.out.println(doc);
		
		
		// 3. 원하는 데이터를 추출
		// <>: element(tag,태그)
		// <>의 묶음: Elements(배열처럼 생각하면 됨.)
		Elements list1 = doc.select("span.code");
		System.out.println("code의 개수 " + list1.size());
		String code = list1.get(0).text();
		System.out.println("code는 " + code);
		
		Elements list2 = doc.select("td.first");
		System.out.println("시가의 개수 " + list2.size());
		System.out.println(list2);
		
		String start = list2.get(0).text();
		System.out.println("시가는 " + start);
		
		
		
		
		
		
		
		
		
		

	}

}




