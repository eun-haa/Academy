package examPractice;
// �θ�κ��� ��ӹ��� �⺻ �����ڸ� ȣ���ϴ� super() ����
// but �θ� �⺻�����ڰ� �ƴ� �����ڰ� ���־, �θ�Ŭ������ �⺻�����ڰ� �����
// �׷��� �ڽĿ��� �����־�� �� DmbCellPhone((super());
public class DmbCellPhone extends CellPhone{
	// �ΰ� ��� -> �ڽ� Ŭ������ �������
	// Dmb on
	// Dmb off
	// Dmb ä�� ����
	
	// �Ӽ�(DMB ä��)
	int channel;
	
	//-----------------------------------
	
	// �����ڷ� �ʱ�ȭ
	DmbCellPhone(String model, String color, int channel){
		super(model, color);
		this.channel=channel;
	}
	
	//-----------------------------------
	// �ΰ� ��� -> �ڽ� Ŭ������ �������
	
	// Dmb on
	void dmbOn(int channel) {
		System.out.println("ä�� " + channel +"�� DMB ��� ������ �����մϴ�.");
		//return "ä�� " + channel +"�� DMB ��� ������ �����մϴ�.";
	}
	// Dmb off
	void dmbOff() {
		System.out.println("DMB ��� ������ �����մϴ�.");
		//return "DMB ��� ������ �����մϴ�.";
	}
	// Dmb ä�� ����
	void channelChange() { // �Ű������� �޾ƾ� �ؼ� int channel ��
		System.out.println("ä���� �ٲߴϴ�.");
		//return "ä���� " + channel + "������ �ٲߴϴ�.";
	}


	
}
