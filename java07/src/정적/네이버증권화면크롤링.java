package ����;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹�����ȭ��ũ�Ѹ� {

	public static void main(String[] args) throws Exception {
		// 1. ���̹��� ����
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=035720");
		System.out.println("1. ���̹� ���� īī�� ����Ʈ ���� ����.!!");
		
		// 2. ����ȭ�鿡 �ش��ϴ� �ҽ��� �ٿ�ε�
		Document doc = con.get();
		System.out.println("2. �ҽ��ڵ� �ٿ�ε�. ����!!");
		System.out.println(doc);
		
		
		// 3. ���ϴ� �����͸� ����
		// <>: element(tag,�±�)
		// <>�� ����: Elements(�迭ó�� �����ϸ� ��.)
		Elements list1 = doc.select("span.code");
		System.out.println("code�� ���� " + list1.size());
		String code = list1.get(0).text();
		System.out.println("code�� " + code);
		
		Elements list2 = doc.select("td.first");
		System.out.println("�ð��� ���� " + list2.size());
		System.out.println(list2);
		
		String start = list2.get(0).text();
		System.out.println("�ð��� " + start);
		
		
		
		
		
		
		
		
		
		

	}

}




