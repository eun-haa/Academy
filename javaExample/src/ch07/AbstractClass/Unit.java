package ch07.AbstractClass;
// �߻� Ŭ����
public abstract class Unit {
	// Marine,Tank,Dropship�� ����κ��� 
	// �߻�Ŭ������ ���Ƴ���
	int x, y; // ���� ��ġ
	
	// �߻� �޼���� (); <- �̷��� ������
	// Marine,Tank,Dropship Ŭ�������� �ݵ��! �����ؾ���
	abstract void move(); // ������ ��ġ�� �̵�
	abstract void stop(); // ���� ��ġ�� ����
}
