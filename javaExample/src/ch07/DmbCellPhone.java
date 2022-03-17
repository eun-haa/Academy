package ch07;
// �θ�Ŭ���� ���(CellPhone)
public class DmbCellPhone extends CellPhone{
	// �Ӽ�(DMB ä��)
	int channel;
	
	// �����ڸ� ���� �𵨰� ��, ä���� �ʱ�ȭ �մϴ�.
	DmbCellPhone(String model, String color, int channel){
		// �θ� �ʱ�ȭ�� ���־���ؼ� super()�� �ʿ�!
		super(model, color);
		this.channel=channel;
	}
	
	// ���
	// DMB ��� ������ �����մϴ�.
	String DmbOn() {
		return "ä�� "+channel+"�� DMB ��� ������ �����մϴ�.";
	}
	// ä���� �����մϴ�. 
	String ChangeChannel(int channel) {// �Ű������� �޾ƾ� ��
		return "ä�� " + channel +"������ �ٲߴϴ�.";
	}
	// DMB ��� ������ �����մϴ�.
	String DmbOff() {
		return "DMB ��� ������ �����մϴ�.";
	}
}
