package ch06;

public class Calculator2 {
	// +(�ν��Ͻ� �޼��� ����)
	int add(int num1, int num2) {
		return num1+num2;
	}
	// -(�ν��Ͻ� �޼��� ����)
	int substract(int num1, int num2) {
		return num1-num2;
	}
	// *(Ŭ���� �޼��� ����)
	static int multiply(int num1, int num2) {
		return num1*num2;
	}
	// /(Ŭ���� �޼��� ����)
	// ������ �Ҽ��� ǥ���Ϸ��� ����ȯ �ʼ� !
	static float divide(int num1, int num2) {
		return num1/(float)num2;
	}
}
