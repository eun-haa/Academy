package ch07.modifier;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12,35,30); // 12�� 35�� 30��
		
		// �޼ҵ带 ����ؼ� ��ȸ�ؼ� ���� ������ ����(���� private ������ �Ǿ�����)
		
		t.setHour(30);
		System.out.println(t.toString());
	}

}
