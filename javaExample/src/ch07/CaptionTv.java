package ch07;

public class CaptionTv extends Tv{ // extends Tv => Tv Ŭ������ �״�� �Űܿ�
	// �Ӽ�
	// ĸ��(�ڸ�) ����
	boolean caption;
	// ���
	// ȭ�鿡 ĸ��(�ڸ�)�� �����ش�.
	void displayCaption(String text) {// ĸ�ǻ��°� true�϶��� text�� �����ش�.
		if(caption) {
		System.out.println(text);
		}
	}
}
