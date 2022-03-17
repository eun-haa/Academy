package ch07.AbstractClass;
// ParserManagerŬ������ getParser�޼����
// �Ű������� �Ѱܹ޴� type�� ���� ����
// XMLParser�ν��Ͻ� �Ǵ� HTMLParser�ν��Ͻ� ��ȯ
public class ParserManager {
// ����������/Ŭ�����޼��� /����Ÿ��      /�޼����       /�Ű�����
	public static Parseable getParser(String type) {
//			              �� �������̽��� �޼����� ����Ÿ������ ������ �� ����
		if(type.equals("JAVA")) {
			// �������̽� ������
			Parseable p = new JAVAParser();
			return p;
			//return new JAVAParser();
		}else {
			// �������̽� ������
			// �������̽� Ÿ�� = Ŭ���� Ÿ��
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser();
		}
	}
}
