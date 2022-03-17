package ch02;

public class VarEx1 {
	
	// 전역변수
	int b;
	
	public static void main(String[] args) {
	// 타입 변수명
	char a = '가'; // 문자 타입
	a = '나';
	
	char z = (char)65;
	
	String b = "가나다다다"; // 문자열 타입(참조형) String b = new String("가나다")
	b = "라마바";
	
	// 정수 타입(int)
	int c = 10;
	
	int True = 10;
	// Integer x = 10; // wrap Class, 숫자의 참조형
	
	// 실수 타입(double)
	double d = 10.5;
	
	final double PI=3.14; // 변수 선언의 type 앞에 final을 써주면 상수!
	
	// 접미사 EX 1
	// float y = 1.125;
	// double y = 1.125;
	float y = 1.125f;
	
	// 접미사 EX 2
	long x = 10000000000L;
	
	// 변수의 초기화
	// 지역변수(main안에 변수를 선언했고, 안에 있어서 다 지역변수임)
//	byte b=10;
	
	char aa = ' '; // '' 사이에 공백을 줘야함
	
	// 문자와 문자열
	//String sl = "A" + "B";
	//System.out.println(sl);
	
	
//	System.out.println("" + 7); // 문자열 + 숫자
//	System.out.println("" + 7 + 7); // 문자열  + 숫자(문자열) + 슷지
//	System.out.println(7 + 7 + ""); // 숫자 + 숫자(숫자) + 문자 = 문자열 14가 됨
	
	
//	System.out.println(a); 
//	System.out.println(b); // 변수 안의 값을 출력
//	System.out.println("라마바"); // 리터럴
//	System.out.println(10); // 리터럴
//	System.out.println(c);
//	System.out.println(d);
	
//	final long regNo = 9608202222222L;
//	System.out.println(regNo);
	
	System.out.println("1" + "2"); // 문자열  + 문자열
	System.out.println(true + ""); // boolean(논리형,1 byte) + 문자열
	System.out.println('A' + 'B'); // 아스키코드값 65 + 66, char이 int보다 작기때문에 int로, 즉 아스키로 변환
	System.out.println('1' + 2); // 아스키코드값 49 + 2
	System.out.println('1' + '2'); // 아스키코드값 49 + 50
	System.out.println('J' + "ava");
//	System.out.println(true + null); // true에 값이 없는 걸 더하라? 오류
	
	System.out.println(3.14157 + ""); // double(8) + 문자열(4) 그래도 문자열이 더 힘이 세다!
	// 그래서 "3.14157" + 문자열, 즉 문자열 + 문자열로 바뀜

	}
}
