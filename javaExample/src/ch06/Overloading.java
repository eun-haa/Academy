package ch06;
// ���ϱ�(add) ����� �ϴ� Ŭ����
public class Overloading {
	// 10 + 20(����+����)
	int add(int a, int b) {
		return a+b;
	}
	// 10.5 + 20(�Ǽ�+����)
	double add(double a, int b) {
		return a+b;
	}	
	// 10 + 20.5(����+�Ǽ�)
	double add(int a, double b) {
		return a+b;
	}
	// 10.5 + 20.5(�Ǽ�+�Ǽ�)
	double add(double a, double b) {
		return a+b;
	}
	
	// �迭��
	int add(int[] a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
