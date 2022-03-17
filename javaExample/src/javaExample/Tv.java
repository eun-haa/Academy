package javaExample;
// 생성자 - 1번 문제
public class Tv {
	String brand;
	int year;
	int size;
	
	public Tv() {
		
	}
	void show(String brand, int year, int size) {
		System.out.println(brand + "에서 만든 ");
		System.out.println(year + "년 ");
		System.out.println(size + "인치 TV");
	}
}
