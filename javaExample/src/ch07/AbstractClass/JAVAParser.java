package ch07.AbstractClass;
// Parseable �������̽� ����
public class JAVAParser implements Parseable{
		// ���� ������ ���̴� ����? -> ������ ���� �ȵǾ��־(�ݵ�� �����ؾ���)
	public void parse(String fileName) {
		System.out.println(fileName + "- Java parsing completed.");
	}
}
