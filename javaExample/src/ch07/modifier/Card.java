package ch07.modifier;

public class Card {
	final int NUMBER;   // Ŭ���� ���� // ����� �ݵ�� �ʱ�ȭ(�ʱ�ȭ ���ϸ� ����)
	final String KIND;  // Ŭ���� ���� 
	static int width=100;  // �ν��Ͻ� ����
	static int hedith=250; // �ν��Ͻ� ����
	
	// ������
	// �⺻������
	//Card(){
		
	//}
	
	// ������ �ΰ��� ������
	Card(int number, String kind){
		NUMBER=number;
		KIND=kind;
	}

}
