package ch03_copy;
// ��ȣ ������
public class OperateEx02 {

	public static void main(String[] args) {
		int i=-10; // i��� ������ -10 ����
		
		i=+i; // i=+(-10) : -10 * 1 => i�������� -10�� ����
		System.out.println(i);
		
		i=-10;
		i=-i; //i=-(-10) : -10 * -1 => i�������� +10�� ����
		System.out.println(i);

	}

}

