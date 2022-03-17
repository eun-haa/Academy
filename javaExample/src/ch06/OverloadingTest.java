package ch06;

public class OverloadingTest {

	public static void main(String[] args) {
		// 인스턴스 생성
		Overloading o = new Overloading();
		
		// 10 + 20(정수+정수)
		System.out.println(o.add(10, 20));
		// 10.5 + 20(실수+정수)
		System.out.println(o.add(10.5, 20));
		// 10 + 20.5(정수+실수)
		System.out.println(o.add(10, 20.5));
		// 10.5 + 20.5(실수+실수)
		System.out.println(o.add(10.5, 20.5));
		
		
		// 배열값
		int[] a = {100, 200, 300};
		System.out.println(o.add(a));
	}

}
