package ch02;

public class Casting {

	public static void main(String[] args) {
		// int 타입을 char 타입으로
		// int(4), char(2) → 자동형변환((타입) 생략가능)
		char a='A';
		int b=a;
		
		// char 타입을 int 타입으로
		// char(2), int(4) → 강제형변환((타입) 생략 불가능)
		int c=65;
		char d=(char)c;
		
		// float 타입을 int 타입으로
		float e=3.14f;
		int f=(int)e;
		
		
		System.out.println(b);

	}

}
