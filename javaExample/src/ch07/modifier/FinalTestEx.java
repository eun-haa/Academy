package ch07.modifier;
// �������̵�
public class FinalTestEx extends FinalTest {
	// ���� ���� ��������� FinalTest�� Final Ű���� ����!
	// Final�� ������ ��ӵ� �� ����, �Ʒ�ó�� �������̵��� �Ұ���
	void getMaxSize() {
		System.out.println("finalŰ���尡 ������ ���氡��");
	}
	
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.MAX_SIZE=20; // ����� �����صּ� ���� �Ұ���
	}
}
