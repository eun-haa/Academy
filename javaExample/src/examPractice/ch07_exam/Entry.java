package examPractice.ch07_exam;
// �θ�Ŭ����
public class Entry {
	// �� ���� ����
	String word;
	
	// �ʱ�ȭ
	Entry(){
		
	}
	
	Entry(String w){
		word=w;
	}
	
	// ��� ��� �޼ҵ�
	public void writeView() {
		System.out.println("��� : " + word);
	}
}
