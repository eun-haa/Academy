package javaExample;
// ������ ����
public class Constructor {
	String name;
	String address;
	int age;
	
	// ����Ʈ �����ڸ� �����
	Constructor(){
		name = "�̸�����";   // ��� ������ �ʱ�ȭ
		address = "�ּҾ���";// ��� ������ �ʱ�ȭ
		age = 0;          // ��� ������ �ʱ�ȭ
	}
	
	void setData(String a, String b, int x) {
		name = a;
		address = b;
		age = x;
	}
	
	String getData() {
		String str = name + "," + address + "," + age;
		return str;
	}
	
	
	public static void main(String[] args) {
		// ��ü ����
		Constructor c = new Constructor();
		// ������ �ʱ�ȭ�� �� �ޱ�
		String strValue = c.getData();
		System.out.println(strValue);
		
		
		// ��� ���� �� �Ҵ�
		c.setData("�ں���", "����� ������", 40);
		// �Ҵ�� �� �ޱ�
		strValue = c.getData();
		System.out.println(strValue);
	}

}
