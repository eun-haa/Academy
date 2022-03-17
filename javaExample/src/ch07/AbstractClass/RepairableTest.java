package ch07.AbstractClass;

public class RepairableTest {

	public static void main(String[] args) {
		Tank1 tank = new Tank1();// Tank
		Mechanic m = new Mechanic();// Mechanic
		Army a = new Army();// Army
		Airplane ap = new Airplane();// Airplane
		
		m.repair(tank);
		// Mechanic클래스의 repair 메서드에 tank의 주소를 인수로 넘김
		m.repair(ap);
		// Mechanic클래스의 repair 메서드에 airplane의 주소를 인수로 넘김
		
		//m.repair(a); // army에는 implements Repairable 안했음 그래서 에러 발생
		               // -> Army 클래스는 Repairable 인터페이스를 구현하지 않았으므로
		               // Mechanic 클래스의 repair 메서드의 매개변수로 사용할 수 없음
		
		

	}

}
