package examPractice.ch07_exam;
// �ڽ�Ŭ����
public class SubEntry extends Entry {
	// �θ�Ŭ������ �������־��⿡ �θ� Ŭ������ �ִ� �͵��� ��ӵ�
	// ������(�ʱ�ȭ) ����!
	
	// ��� ���� ����
	String definition;
	// �ñ⸦ ���� ����
	int year;
	
	// ������ �ʱ�ȭ
	SubEntry(String w){
		word=w;
	}
	SubEntry(String w, String d, int y){
		this(w);
		definition=d;
		year=y;
	}
	
	// ����, �ñ� ����ϴ� �޼ҵ�
	public void printView() {
		System.out.println("���� : " + definition);
		System.out.println("�ñ� : "+ year);
	}
	
	
}
