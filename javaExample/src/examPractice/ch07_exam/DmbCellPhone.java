package examPractice.ch07_exam;
// �ڽ�Ŭ����
public class DmbCellPhone extends CellPhone{
	// �θ� Ŭ���� ��� �ȷ�
	
	// �Ӽ�
	// ä���� �����ϴ� ����
	int channel;
	
	//------------------------------------
	// �ʱ�ȭ ������
	DmbCellPhone(String model, String color, int channel){
		super(model, color);
		this.channel=channel;
		
	}
	
	//------------------------------------
	// Dmb on
	void dmbOn() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	// ä�� ����
	void changeChannel() {
		System.out.println("ä�� 12������ �ٲߴϴ�.");
	}
	
	// DMB off
	void dmbOff() {
		System.out.println("DMB ��� ������ �����մϴ�.");
	}
}
