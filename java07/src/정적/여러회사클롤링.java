package ����;

public class ����ȸ��Ŭ�Ѹ� {

	public static void main(String[] args) throws Exception {
		���̹�ȭ��ũ�Ѹ�2 naver = new ���̹�ȭ��ũ�Ѹ�2();
		//naver.finance("035720");
		//naver.finance("017670");
		//naver.finance("005930");
		String[] coms = {"035720", "017670", "005930"};
		for (int i = 0; i < coms.length; i++) {
			naver.finance(coms[i]);
		}
	}

}




