package ch06;

public class Product {
	// Ŭ���� ���� �ʱ�ȭ(����� �ʱ�ȭ)
	static int count=0;
	// �ν��Ͻ� ���� �ʱ�ȭ(����� �ʱ�ȭ)
	int serialNo;
	// �ʱ�ȭ ���� �̿��� �ʱ�ȭ(�ν��Ͻ� �ʱ�ȭ��)
	{
		++count;
		serialNo=count;
	}
	// ������
	Product(){} // �⺻ ������(��������)
}
