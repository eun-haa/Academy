package examPractice;
// ��ӵǴ� �� : ����/�޼���(�����ڴ� ��� X, �����ڵ� ���������� super�����)
public class SubEntry extends Entry{
	// ���Ǹ� �����ϱ� ���� �ν��Ͻ� ����
	String definirion;
	// �⵵�� �����ϱ� ���� �ν��Ͻ� ����
	int year;
	
	// �⺻ ������
	// ���������� �� ���Ϸ��� �̸� �������� ��� ����
	SubEntry(String w){
		// ����� �޾ұ� ������ word�� ���°� ����
		word=w;
	}
	// SubEntry(string w) ȣ�� -> this()�����.
	// �� ���� �ٸ� ������ ȣ���� �� ����ϴ� �� -> this()
	SubEntry(String w, String d, int y){
		this(w);
		definirion=d;
		year=y;
	}
	public void printView() {
		System.out.println("���� : "+definirion);
		System.out.println("�ñ� : "+year);
	}
	
}
