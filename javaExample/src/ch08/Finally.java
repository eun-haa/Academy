package ch08;

public class Finally {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {						 // try ������
			System.out.println(0/0); // ���� �߻� -> catch �� -> finally ��
									 // ���� �߻� X -> finally ��

		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("������� ���ܴ� �����...");
		}finally {
			System.out.println(4);
		}

	}

}
