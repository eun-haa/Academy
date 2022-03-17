package ch07.modifier;
// public vs private
public class AccessModifier {

	public static void main(String[] args) {
		A a = new A();
		a.getOne(); // getOne()메서드는 접근제어자가 public이니까, 누구든지 접근 가능
		
	}
}
