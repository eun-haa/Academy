package ch08;

public class FinallyTest {

	public static void main(String[] args) {
		try {
			startInstall();// ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� ���
			copyFiles();// ������ �����ϴ� ���
			//deleteTempFiles();// ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����ϴ� ���
		}catch(Exception e) {

			
		}finally {
			// ��ġ�� �� �Ǿ �ӽ������� ����, �ȵǾ �ӽ������� ����
			deleteTempFiles();// ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����ϴ� ���
		}
	}// main�޼ҵ� ��
	//�޼ҵ� ����
	// new��� Ű���� ���� �޼ҵ带 �������ؼ�, static�� �ٿ��� ��!
	static void startInstall() {}
	static void copyFiles() {}
	static void deleteTempFiles() {}

}
