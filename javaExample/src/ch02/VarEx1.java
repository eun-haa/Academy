package ch02;

public class VarEx1 {
	
	// ��������
	int b;
	
	public static void main(String[] args) {
	// Ÿ�� ������
	char a = '��'; // ���� Ÿ��
	a = '��';
	
	char z = (char)65;
	
	String b = "�����ٴٴ�"; // ���ڿ� Ÿ��(������) String b = new String("������")
	b = "�󸶹�";
	
	// ���� Ÿ��(int)
	int c = 10;
	
	int True = 10;
	// Integer x = 10; // wrap Class, ������ ������
	
	// �Ǽ� Ÿ��(double)
	double d = 10.5;
	
	final double PI=3.14; // ���� ������ type �տ� final�� ���ָ� ���!
	
	// ���̻� EX 1
	// float y = 1.125;
	// double y = 1.125;
	float y = 1.125f;
	
	// ���̻� EX 2
	long x = 10000000000L;
	
	// ������ �ʱ�ȭ
	// ��������(main�ȿ� ������ �����߰�, �ȿ� �־ �� ����������)
//	byte b=10;
	
	char aa = ' '; // '' ���̿� ������ �����
	
	// ���ڿ� ���ڿ�
	//String sl = "A" + "B";
	//System.out.println(sl);
	
	
//	System.out.println("" + 7); // ���ڿ� + ����
//	System.out.println("" + 7 + 7); // ���ڿ�  + ����(���ڿ�) + ����
//	System.out.println(7 + 7 + ""); // ���� + ����(����) + ���� = ���ڿ� 14�� ��
	
	
//	System.out.println(a); 
//	System.out.println(b); // ���� ���� ���� ���
//	System.out.println("�󸶹�"); // ���ͷ�
//	System.out.println(10); // ���ͷ�
//	System.out.println(c);
//	System.out.println(d);
	
//	final long regNo = 9608202222222L;
//	System.out.println(regNo);
	
	System.out.println("1" + "2"); // ���ڿ�  + ���ڿ�
	System.out.println(true + ""); // boolean(����,1 byte) + ���ڿ�
	System.out.println('A' + 'B'); // �ƽ�Ű�ڵ尪 65 + 66, char�� int���� �۱⶧���� int��, �� �ƽ�Ű�� ��ȯ
	System.out.println('1' + 2); // �ƽ�Ű�ڵ尪 49 + 2
	System.out.println('1' + '2'); // �ƽ�Ű�ڵ尪 49 + 50
	System.out.println('J' + "ava");
//	System.out.println(true + null); // true�� ���� ���� �� ���϶�? ����
	
	System.out.println(3.14157 + ""); // double(8) + ���ڿ�(4) �׷��� ���ڿ��� �� ���� ����!
	// �׷��� "3.14157" + ���ڿ�, �� ���ڿ� + ���ڿ��� �ٲ�

	}
}
