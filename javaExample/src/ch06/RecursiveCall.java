package ch06;

public class RecursiveCall {

	public static void main(String[] args) {
		int result=factorial(4); //���� �ٸ� Ŭ�������� �� �Լ��� ȣ���ߴٸ�.
								 //factorial �տ� RecursiveCall �ٿ�����
		System.out.println(result);

	}// main �޼ҵ� ��
	
	// factorial�޼ҵ� ����
	static int factorial(int n) {
		// factorial ����� �����ϴ� ����
		int result=0;
		if(n==1) {
			result=1;
		}else {
			result = n*factorial(n-1);
		}
		
		return result;
	}

}
