package ch06;
// ��Ģ���� ����
public class Calculator {
	// + (10+20) �Ű������� 10, 20. return �ִ�.(Ÿ���� int) �޼ҵ� �̸��� add
	int add(int firstNum, int secondNum) { //�����
		//int result=firstNum+firstNum;
		//return result;
		return firstNum+secondNum;	
	}
	
	//            �Ǽ�                 ,     ����
	double add(double firstNum, int secondNum) {
		return firstNum+secondNum;
	}
	
	//            ����                 ,     �Ǽ�
	double add(int firstNum, double secondNum) {
		return firstNum+secondNum;
	}
	
	//            �Ǽ�                 ,     �Ǽ�
	double add(double firstNum, double secondNum) {
		return firstNum+secondNum;
	}
	
	//-------------------------------------------
	
	// -
	int substract(int firstNum, int secondNum) {
		//int result=firstNum-firstNum;
		//return result;
		return firstNum-secondNum;
	}
	
	//-------------------------------------------
	
	// *
	int multiply(int firstNum, int secondNum) {
		//int result=firstNum*firstNum;
		//return result;
		return firstNum*secondNum;
	}
	
	//-------------------------------------------
	
	// /
	float divide(int firstNum, int secondNum) {
		//int result=firstNum/firstNum;
		//return result;
		return firstNum/(float)secondNum;
	}
	
	int max(int a, int b){
		int result=0;
		if(a>b) { //a�� b���� ũ��
			result=a;
		}else { //a�� b���� �۰ų� ������
			result=b;
		}
		return result;
	}

}
