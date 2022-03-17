package ch07.modifier;

public class A {
	private String one; // private는 본인 클래스 안에서만 접근 허용, 다른데서는 불가
	                    // 주민등록번호와 같은 개념
	public String getOne() {// void가 아니라서 return 작성해주어야함!
		one="one";
		return one;
	}
}
