package ch06;

public class OverloadingTest {

	public static void main(String[] args) {
		// �ν��Ͻ� ����
		Overloading o = new Overloading();
		
		// 10 + 20(����+����)
		System.out.println(o.add(10, 20));
		// 10.5 + 20(�Ǽ�+����)
		System.out.println(o.add(10.5, 20));
		// 10 + 20.5(����+�Ǽ�)
		System.out.println(o.add(10, 20.5));
		// 10.5 + 20.5(�Ǽ�+�Ǽ�)
		System.out.println(o.add(10.5, 20.5));
		
		
		// �迭��
		int[] a = {100, 200, 300};
		System.out.println(o.add(a));
	}

}
