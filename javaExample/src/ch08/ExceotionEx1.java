package ch08;
// ��Ƽĳġ
public class ExceotionEx1 {

	public static void main(String[] args) {
		System.out.println("������");  // ������ ����(���ܰ� �ƴ϶� ������ ����), 
									 //	���� ������ �� ������ �� ���̴� ��
		System.out.println(1);
		System.out.println(2);
		
		// ���ܰ� �߻��� �� ���� ������ try-catch ���
		try { // ���ܰ� �߻��� �� �ִٰ� �ǴܵǴ� ��
			System.out.println(3);
			System.out.println(0/0); // ���� �߻�!!
			System.out.println(4);	 // ���ܰ� �߻��ϸ� �ǳʶپ���
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("���� �޼��� : " + ae.getMessage());
			
			System.out.println(5);	// ���� �߻����� ������ ���� X, ���ܹ߻��ϸ� ���� O
			System.out.println("ArithmeticException"); // ���� �߻����� ������ ���� X, ���ܹ߻��ϸ� ���� O
		}catch(Exception e) {
			System.out.println("ArithmeticException"); // ���� �߻����� ������ ���� X, ���ܹ߻��ϸ� ���� O
		}

	}

}
