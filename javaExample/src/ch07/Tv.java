package ch07;

public class Tv {
	// �Ӽ�
	// ��������(on/off)
	boolean power; // �ν��Ͻ� ����
	// ä��
	int channel;   // �ν��Ͻ� ����
	
	// ���
	// ������ Ű�ų� ����
	void power() {
		power = !power;
	}
	// ä���� �ø���.
	void channelUp() {++channel;}
	// ä���� ������.
	void channelDown() {--channel;}
}
