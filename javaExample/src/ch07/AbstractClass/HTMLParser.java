package ch07.AbstractClass;
//Parseable �������̽� ����
public class HTMLParser implements Parseable{
		// ���� ������ ���̴� ����? -> ������ ���� �ȵǾ��־(�ݵ�� �����ؾ���)
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed.");
	}
}
