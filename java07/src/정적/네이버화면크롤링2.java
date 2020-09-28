package ����;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ȭ��ũ�Ѹ�2 {

	public void finance(String com) throws Exception {
		// 1. ���̹��� ����
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + com);
		//System.out.println("1. ���̹� ���� īī�� ����Ʈ ���� ����.!!");
		
		// 2. ����ȭ�鿡 �ش��ϴ� �ҽ��� �ٿ�ε�
		Document doc = con.get();
		//System.out.println("2. �ҽ��ڵ� �ٿ�ε�. ����!!");
		//System.out.println(doc);
		
		
		// 3. ���ϴ� �����͸� ����
		// <>: element(tag,�±�)
		// <>�� ����: Elements(�迭ó�� �����ϸ� ��.)
		Elements list1 = doc.select("span.code");
		//System.out.println("code�� ���� " + list1.size());
		String code = list1.get(0).text();
		System.out.println("code�� " + code);
		
		Elements list2 = doc.select("span.blind");
		//System.out.println("blind ���� " + list2.size());
		//System.out.println(list2);
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(i + ": " + list2.get(i).text());
//		}
		String start = list2.get(19).text();
		System.out.println("�ð��� " + start);
		String high = list2.get(16).text();
		System.out.println("�ְ��� " + high);
		String low = list2.get(15).text();
		System.out.println("�������� " + low);
		
		FileWriter file = new FileWriter(code + ".txt");
		file.write("�ڵ�� " + code + "\n");
		file.write("�ð��� " + start + "\n");
		file.write("�ְ��� " + high + "\n");
		file.write("�������� " + low + "\n");
		file.close();
		
		
		
		
		
		
		

	}

}




