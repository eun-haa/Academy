package ch06;

public class Remote {
	// �Ӽ�
	// ������ ����
	String bgcolor; // ���������� �ʱⰪ ���൵ ��(���������� �ʱ�ȭ �ʼ�)
	// ������ ���� ����
	String fontcolor;
	// ���� ����
	int volume;
	// ä�� ����
	int channel;
	// ���� ����
	boolean power; // boolean Ÿ���� �ʱⰪ�� false(tv�� �����ִ� ����)
	
	
	
	// ���
	// ������ �ø��� ���
	int volumeUp() { //Ŭ����, void�� ������ ���� ���ٴ� ��!, �׷��� int�� �ٲ���
		volume++; // ++�� ����������
		
		return volume; // �������� ȭ�鿡 �������.(return) 
	}
	// ������ ���ߴ� ���
	int volumeDown() {
		volume--;
		return volume;
	}
	
	// ä���� �ø��� ���
	int channelUp() {
		channel++;
		return channel;
	}
	// ä���� ������ ���
	int channelDown() {
		channel--;
		return channel;
	}
	
	// �Ŀ� on/off
	void power() { // �����ٰ� �����ϱ� return �ʿ����, �� void
		power=!power; // �� ���� ������
	}
}
