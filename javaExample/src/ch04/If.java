package ch04;

public class If {

	public static void main(String[] args) {
		// 1. if��(����)
		// �� ������ �����ϴ� ����
//		int score = 70;
		// ���� ������ 60�� �̻��̸� �հ�
//		if(���� ������ 60�� �̻�) {
//			�հ�
//		}
		
//		if(score >= 60) {
//			System.out.println("�հ�");
//		}

		// 2. if-else
		
//		// �� ������ �����ϴ� ����
//		int score = 70;
//		
//		// ���� ������ 60�� �̻��̸� �հ�
//		// �׷��� ������ ���հ�
//		if(score>=60) {
//			System.out.println("�հ�");
//		} else {
//			System.out.println("���հ�");
//		}
//		
//		int score=70;
//		String result="";
//		
//		if(score>=60) {
//			result="�հ�";
//		} else {
//			result="���հ�";
//		}
//		
//		System.out.println(result);
		
		// 3. if-else if

		// ���� ������ 60�� �̻��̸� �հ�
		// ���� ������ 55�� �̻��̸� ����
		// �׷��� ������ ���հ�
		
//		int score = 50;
//		String result = ""; // if ���忡�� ��������, �׷��� �������͵� ����� ������� �� ����
//		
//		if(score>=60) {
//			result="�հ�"; // �����̸� �Ʒ��� ���Ե�
//		} else if(score>=55) {
//			result="����";
//		} else {
//			result="���հ�";
//		}
//		
//		System.out.println(result);
		
		
		// ��ø if��
		
		int score=70;
		char grade=' ', opt='0';
		
		if(score>=90) { // 90�� �̻� �߿����� 
			grade='A';
			
			if(score>=98) {// 98�� �̻��̸� A+ : 98, 99, 100
				opt='+';
			}else if(score<94) {// 94�� �̸��̸� A- : 94, 93, 92, 91, 90
				opt='-';
			}			// 95~97     A0 : 95, 96, 97
			
		}else if(score>=80) { // 80�� �̻� �߿�����
			grade='B';

			if(score>=88) {// 88�� �̻��̸� B+ : 88, 89
				opt='+';
			}else if(score<84) {// 84�� �̸��̸� B- : 84, 83, 82, 81, 80
				opt='-';
			}			// 85 ~ 87  B0 : 85, 86, 87
		}else {
			grade='C';
		}
		// �߰��� ���ڿ��� �̾��ִ� ""�� �־�� ����� ����
		// ���� �ȳ����� �ƽ�Ű�ڵ�� ��ȯ�ؼ� ���ڷ� ����
		System.out.println(grade+""+opt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
