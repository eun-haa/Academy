package examPractice;

public class Entry {
	// �� �����ϱ� ���� �ν��Ͻ� ����
	String word;
	
	// �⺻ ������
	Entry(){
		
	}
	// �� ���޹޾� word ������ �ʱ�ȭ �ϱ� ���� ������
	Entry(String w){
		word=w;
	}
	// �� ����ϱ� ���� ����� �ִ� �޼ҵ� ����
	// ���� Ÿ�Ե� ���� �Ű������� ���� �޼���
	public void writeView() {
		System.out.println("��� : " + word);
	}
}
