package javaExample;

public class ConOverloading {
	String name = "�ں���";
	String address = "���� �߱�";
	int age = 40;
	
	// ����Ʈ ������ �� ����
	public ConOverloading() {
		
	}
	
	// �Ű������� �ִ� �������� ���
	public ConOverloading(String a, String b) {
		this.name = a;
		this.address = b;
	}
	
	// �Ű������� �ִ� �������� ���
	public ConOverloading(String a, String b, int x) {
		this.name = a;
		this.address = b;
		this.age = x;
	}

}
