package ch02;

public class Casting {

	public static void main(String[] args) {
		// int Ÿ���� char Ÿ������
		// int(4), char(2) �� �ڵ�����ȯ((Ÿ��) ��������)
		char a='A';
		int b=a;
		
		// char Ÿ���� int Ÿ������
		// char(2), int(4) �� ��������ȯ((Ÿ��) ���� �Ұ���)
		int c=65;
		char d=(char)c;
		
		// float Ÿ���� int Ÿ������
		float e=3.14f;
		int f=(int)e;
		
		
		System.out.println(b);

	}

}
