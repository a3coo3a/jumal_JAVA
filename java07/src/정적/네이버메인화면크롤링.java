package ����;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹�����ȭ��ũ�Ѹ� {

	public static void main(String[] args) throws Exception {
		// 1. ���̹��� ����
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1. ���̹� ���� ����.!!");
		
		// 2. ����ȭ�鿡 �ش��ϴ� �ҽ��� �ٿ�ε�
		Document doc = con.get();
		System.out.println("2. �ҽ��ڵ� �ٿ�ε�. ����!!");
		System.out.println(doc);
		
		
		// 3. ���ϴ� �����͸� ����
		// <>: element(tag,�±�)
		// <>�� ����: Elements(�迭ó�� �����ϸ� ��.)
		Elements list1 = doc.select("a.nav");
		System.out.println("3. ������ ���� ����.!!");
		System.out.println("�޴��� ���� " + list1.size());
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + "��° element: " + list1.get(i).text());
		}
		System.out.println("���Ǹ� ������ ���� ������>> " + list1.get(9).text());
		
		
		
		
		
		
		
		
		
		

	}

}




