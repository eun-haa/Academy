package javaExample;

public class Salary {
	// 1. �ʵ�
	String name; // �̸�
	int salary; // ����
	
	// 2. ������
	Salary(String n, int s){
		name = n;
		salary = s;
	}
	
	// 3. �޼���(���)
	void getInformation1() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + salary);
	}
}
