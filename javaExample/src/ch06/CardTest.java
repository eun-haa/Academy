package ch06;

public class CardTest {

	public static void main(String[] args) {
		// Ŭ���� ����
		System.out.println("ī���� ���� : " + Card.width); //Ŭ���� ���� �ҷ�����
		System.out.println("ī���� ���� : " + Card.height);//Ŭ���� ���� �ҷ�����
		
		// �ν��Ͻ� ����
		// AŬ�ι�
		Card c1 = new Card();
		c1.kind="Ŭ�ι�";
		c1.number=1;
		// 2Ŭ�ι�
		Card c2 = new Card();
		c2.kind="Ŭ�ι�";
		c2.number=2;
		// 3Ŭ�ι�
		Card c3 = new Card();
		c3.kind="Ŭ�ι�";
		c3.number=3;
		
		System.out.println("c1�� ������ "+c1.kind +", ���ڴ�"+c1.number+"�̸�, ũ���("+c1.width+", " +c1.height+")");
		System.out.println("c2�� ������ "+c2.kind +", ���ڴ�"+c2.number+"�̸�, ũ���("+c2.width+", " +c2.height+")");
		System.out.println("c3�� ������ "+c3.kind +", ���ڴ�"+c3.number+"�̸�, ũ���("+c3.width+", " +c3.height+")");
		
		c2.width=50;
		c2.height=50;
		
		// Ŭ���������� Ư¡ : c2�� �ٲٷ��� ������ ���� �� �ٲ�!
		System.out.println("c1�� ������ "+c1.kind +", ���ڴ�"+c1.number+"�̸�, ũ���("+c1.width+", " +c1.height+")");
		System.out.println("c2�� ������ "+c2.kind +", ���ڴ�"+c2.number+"�̸�, ũ���("+c2.width+", " +c2.height+")");
		System.out.println("c3�� ������ "+c3.kind +", ���ڴ�"+c3.number+"�̸�, ũ���("+c3.width+", " +c3.height+")");
	}

}
