package ch08;
// 5.���� �߻���Ű��
public class ExcepcionEx2 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("������ ���ܸ� �߻����Ѻ���");
			throw e;
		}catch(Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");

	}

}
