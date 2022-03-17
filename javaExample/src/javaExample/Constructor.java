package javaExample;
// 생성자 정리
public class Constructor {
	String name;
	String address;
	int age;
	
	// 디폴트 생성자를 만들기
	Constructor(){
		name = "이름없음";   // 멤버 변수의 초기화
		address = "주소없음";// 멤버 변수의 초기화
		age = 0;          // 멤버 변수의 초기화
	}
	
	void setData(String a, String b, int x) {
		name = a;
		address = b;
		age = x;
	}
	
	String getData() {
		String str = name + "," + address + "," + age;
		return str;
	}
	
	
	public static void main(String[] args) {
		// 객체 생성
		Constructor c = new Constructor();
		// 생성자 초기화된 값 받기
		String strValue = c.getData();
		System.out.println(strValue);
		
		
		// 멤버 변수 값 할당
		c.setData("박부장", "서울시 강남구", 40);
		// 할당된 값 받기
		strValue = c.getData();
		System.out.println(strValue);
	}

}
