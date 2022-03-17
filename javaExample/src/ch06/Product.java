package ch06;

public class Product {
	// 클래스 변수 초기화(명시적 초기화)
	static int count=0;
	// 인스턴스 변수 초기화(명시적 초기화)
	int serialNo;
	// 초기화 블럭을 이용한 초기화(인스턴스 초기화블럭)
	{
		++count;
		serialNo=count;
	}
	// 생성자
	Product(){} // 기본 생성자(생략가능)
}
