package ch07.modifier;

public class FinalCardTest{

	public static void main(String[] args) {
		//Card c = new Card(); // �⺻�����ڰ� ��� ����.
		  					   // ���� ���ִ� ��?
		                       // 1.Card Ŭ������ �⺻������ Card() ����
							   // 2. new Card()�� ���� 2�� �־��ֱ�
		
		Card c = new Card(10,"Heart");
		// �����ڸ� �̿��ؼ� ����� �ʱ�ȭ
		// 1.number��� ������������ 10, kind���� "Heart"�� ���Ե�
		// 2.number=NUMBER, kind=KIND ���Ե�
		// 3.���������� NUMBER, KIND�� �ʱ�ȭ�� ��
	}

}
