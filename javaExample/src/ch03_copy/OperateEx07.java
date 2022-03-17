package ch03_copy;

public class OperateEx07 {
	public static void main(String[] args) {
//		String a="hi";
//		String b="hello";
//		
//		System.out.println(a==b);
		
		
		float f=0.1f; // 실제로는 0.10000000149011612으로 저장됨
		double d=0.1; // 0.1d해도 되고 0.1 해도 됨 / 실제로는 0.10000000000000000으로 저장됨
		double d2=(double)f; // float 타입을 double 타입으로. / 실제로는 0.10000000149011612으로 저장됨
		
		// System.out.printf -> C언어 출력문을 자바에서 사용하기 위한 문법
		System.out.printf("f = %19.17f%n", f); // 소수점뒤 17자리까지 늘려서 보여주는 식
		System.out.printf("d = %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);
		
		
		System.out.println(f==d); // false
		System.out.println(f==d2);
		
	} // main 메소드 끝

}
