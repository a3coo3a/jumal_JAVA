package Á¶°Ç¹®;

import java.util.Date;

public class ifTest2 {

	public static void main(String[] args) {
		// ÀÔ·Â
		Date date = new Date();
		int hour = date.getHours();
		String hello = "";
		// Ã³¸®
		if (hour <= 11) {
			hello = "±Â¸ð´×";
		}else if (hour <= 15) {
			hello = "±Â¿¡ÇÁÅÍ´«";
		}else if (hour <= 20) {
			hello = "±ÂÀÌºê´×";
		}else {
			hello = "±Â³ªÀÕ";
		}
		// Ãâ·Â
		System.out.println(hello);

	}

}
