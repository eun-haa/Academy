package examPractice;

public class CellPhone {
	// ����κ� -> �θ� Ŭ������ �������
	// �ڵ����� "�Ӽ�"
	// ��
	String model;
	// ����
	String color;
	
	//-----------------------------------
	
	CellPhone(String model, String color){
		this.model=model; //�Ű������� cellphone�� �ִ� ���� ���Ƽ� this ����ؾ���
		this.color=color;
	}
	
	//-----------------------------------
	
	// �ڵ����� "���"
	// ������ �մϴ�.
	void powerOn() {
		System.out.println("������ �մϴ�.");
		//return "������ �մϴ�.";
	}
	// ������ ���ϴ�.
	void powerOff() {
		System.out.println("������ ���ϴ�.");
		//return "������ ���ϴ�.";
	}
	// �� �︲
	void bell() {
		System.out.println("���� �︳�ϴ�.");
		//return "���� �︳�ϴ�.";
	}
	// ���� ��Ҹ� ����(��)
	void recVoice(String re_msg) {
		System.out.println("�� : " + re_msg);
		//return "���� ��Ҹ� ����";
	}
	// �۽� ��Ҹ� ����(����)
	void senVoice(String sa_msg) {
		System.out.println("���� : " + sa_msg);
		//return "�۽� ��Ҹ� ����";
	}
	// ��ȭ�� �����ϴ�.
	void callOff() {
		System.out.println("��ȭ�� �����ϴ�.");
		//return "��ȭ�� �����ϴ�.";
	}
	

}


