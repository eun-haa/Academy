package ch03_copy;
// ���������� ����
public class OperateEx01 {

	public static void main(String[] args) {
		/*
		 * ���� Ÿ���϶��� ���ٷ� ǥ�� ����
		 * int i=5;
		 * int j=0;
		 * */
		int i=5, j=0; 
		
		j=i++; // ������, i�� �ִ� ���� j ������ �����Ų �� i���� ����
			   // �� i���� 5�� ����ǰ�, j���� 6�� ����
		System.out.println("������ = i : " +i+ " j : " +j);
		
		i=5;   // �ٽ� i�� 5 ����, 
		j=0;
		
		j=++i; // ������, ���� i�� ���� ��Ű�� j�� ����
		       // �� i=6, j=6
		System.out.println("������ = i : " +i+ " j : " +j);

	}

}
