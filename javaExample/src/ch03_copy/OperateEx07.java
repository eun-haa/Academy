package ch03_copy;

public class OperateEx07 {
	public static void main(String[] args) {
//		String a="hi";
//		String b="hello";
//		
//		System.out.println(a==b);
		
		
		float f=0.1f; // �����δ� 0.10000000149011612���� �����
		double d=0.1; // 0.1d�ص� �ǰ� 0.1 �ص� �� / �����δ� 0.10000000000000000���� �����
		double d2=(double)f; // float Ÿ���� double Ÿ������. / �����δ� 0.10000000149011612���� �����
		
		// System.out.printf -> C��� ��¹��� �ڹٿ��� ����ϱ� ���� ����
		System.out.printf("f = %19.17f%n", f); // �Ҽ����� 17�ڸ����� �÷��� �����ִ� ��
		System.out.printf("d = %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);
		
		
		System.out.println(f==d); // false
		System.out.println(f==d2);
		
	} // main �޼ҵ� ��

}
