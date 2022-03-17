package ch06;
//명시적  초기화
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		// 명시적 초기화
		c1.color="black";
		c1.gearType="auto";
		c1.door=4;
		
		
		Car c2 = new Car();
		
		// 명시적 초기화
		c2.color="white";
		c2.gearType="auto";
		c2.door=4;
		
		
		Car c3 = new Car();
		
		// 명시적 초기화
		c3.color="yellow";
		c3.gearType="auto";
		c3.door=4;
		
		
		System.out.println("c1 차의 색상은 "+c1.color+"이고, "+ "기어타입은 "+c1.gearType+"이고, 문의 갯수는 " +c1.door);
		System.out.println("c1 차의 색상은 "+c2.color+"이고, "+ "기어타입은 "+c2.gearType+"이고, 문의 갯수는 " +c2.door);
		System.out.println("c1 차의 색상은 "+c3.color+"이고, "+ "기어타입은 "+c3.gearType+"이고, 문의 갯수는 " +c3.door);

	}

}
