package ch07.polymorphism;
	// 멤버 변수가 중복 정의된 경우,
	// 참조변수의 타입에 따라 연결되는 멤버변수가 달라짐
	// (참조변수타입에 영향받음)
	// 여기서는 참조변수 = (p,c)

	// 메서드가 중복 정의된 경우,
	// 참조변수의 타입에 관계없이
	// 항상 실제 인스턴스의 타입에 정의된 메서드가 호출된다
	// (참조변수타입에 영향 받지 않음)
	// 여기서는 인스턴스 타입 = (new "Child1()")

public class BindingTest {

	public static void main(String[] args) {
		Parent1 p = new Child1();
		Child1 c = new Child1();
		
		System.out.println(p.x); // parant1에 있는 x값을 출력
		p.method();
		System.out.println(c.x); // child1에 있는 x값을 출력
		c.method();

	}

}
