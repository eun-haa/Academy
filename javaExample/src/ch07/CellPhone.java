package ch07;

public class CellPhone {
	// ����(�Ӽ�)
	// �𵨰� ���� ����
	String model; // ��
	String color; // ����
	
	// ������(�𵨰� ������ �ʱ�ȭ �ϱ� ���� �Ű����� 2���� ������)
	CellPhone(String model, String color){
		this.model=model;
		this.color=color;
	}
	
	// �޼���(���)
	// ������ �մϴ�
	String PowerOn() {// return Ÿ���̶� void ��ſ� String! 
		return "������ �մϴ�."; // ȭ�鿡 ��ȯ�ؾ� �ϴϱ� return
	}
	
	// ������ ���ϴ�
	String PowerOff() {
		return "������ ���ϴ�.";
	}
	// ���� �︳�ϴ�
	String Bell() {
		return "���� �︳�ϴ�.";
	}
	// ���Ÿ�Ҹ�����
	String ReceiveVoice(String msg) {// ���� �� �ٸ��⿡ �Ű������� ���� �޾ƿ;���
		return msg;
	}
	// �۽Ÿ�Ҹ�����
	String SendVoice(String msg) {
		return msg;
	}
	// ��ȭ�� �����ϴ�
	String CallOff() {
		return "��ȭ�� �����ϴ�.";
	}
	
	
}
