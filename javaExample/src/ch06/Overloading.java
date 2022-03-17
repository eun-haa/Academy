package ch06;
// 더하기(add) 기능을 하는 클래스
public class Overloading {
	// 10 + 20(정수+정수)
	int add(int a, int b) {
		return a+b;
	}
	// 10.5 + 20(실수+정수)
	double add(double a, int b) {
		return a+b;
	}	
	// 10 + 20.5(정수+실수)
	double add(int a, double b) {
		return a+b;
	}
	// 10.5 + 20.5(실수+실수)
	double add(double a, double b) {
		return a+b;
	}
	
	// 배열값
	int add(int[] a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
