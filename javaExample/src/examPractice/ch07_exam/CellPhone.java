package examPractice.ch07_exam;
// �θ�Ŭ����
public class CellPhone {
	// �Ӽ�
	// ���� �����ϴ� ����
	String model;
	// ������ �����ϴ� ����
	String color;
	
	//------------------------------------
	// �ʱ�ȭ ������
	CellPhone(String model, String color){
		this.model=model;
		this.color=color;
	}
	
	//------------------------------------
	// ���
	// ������ �մϴ�.
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	// ������ ���ϴ�.
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	// ���� �︳�ϴ�.
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	
	// ���� ��Ҹ� ����
	void recVoice(String re_msg) {
		System.out.println("�� : " + re_msg);
	}
	
	// �۽� ��Ҹ� ����
	void sandVoice(String sa_msg) {
		System.out.println("���� : " + sa_msg);
	}
	
	// ��ȭ�� �����ϴ�.
	void callOff() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
