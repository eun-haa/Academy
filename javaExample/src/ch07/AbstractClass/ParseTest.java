package ch07.AbstractClass;
// ���� �޼��尡 �ִ� Ŭ������ ���� ���� ����
public class ParseTest {

	public static void main(String[] args) {
		// Ŭ���� �޼���� Ŭ�����̸�.�޼����̸����� ȣ������(new ����)
		// getParser() => Ŭ�����޼���
		// Ŭ�����޼��� �տ��� static�� ����  8
		Parseable parser = ParserManager.getParser("JAVA");
		parser.parse("document.java");
		parser = ParserManager.getParser("HTML");
		parser.parse("document.html");

	}

}
