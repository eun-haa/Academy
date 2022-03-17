package javaExample;

public class Salary {
	// 1. 필드
	String name; // 이름
	int salary; // 연봉
	
	// 2. 생성자
	Salary(String n, int s){
		name = n;
		salary = s;
	}
	
	// 3. 메서드(기능)
	void getInformation1() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
	}
}
