package ch07.polymorphism;

public class Test {
	public static void main(String[] args) {
		// ����
//		Man m = new Man();
//		Woman w = new Woman();
//		
//		m.printInfo();
//		w.printInfo();
		
		//------------------------------
		// ������
		People p = new Man(); // ���������� ������
		p.printInfo();
		
		// ���� enlist()�� makeUp()�� ȣ���ϰ� �ʹٸ�?
		// ������ ���� �°� ĳ���� ���־ ����� �� ����
		((Man)p).enlist();
		
		p = new Woman();      // ���������� ������
		p.printInfo();
		//p.enlist(); // People class�� ��� ȣ�� �Ұ�
		//p.makeUp(); // People class�� ��� ȣ�� �Ұ�
		
		// ���� enlist()�� makeUp()�� ȣ���ϰ� �ʹٸ�?
		// ������ ���� �°� ĳ���� ���־ ����� �� ����
		((Woman)p).makeUp();

	}
}
