package ch06;
//생성자를 이용한 초기화
public class Car2Test {

	public static void main(String[] args) {
		// 생성자를 이용한 초기화
		Car2 c1 = new Car2("black", "auto",4);
		// 생성자를 이용한 초기화
		Car2 c2 = new Car2("white", "auto",4);
		// 생성자를 이용한 초기화
		Car2 c3 = new Car2("yellow", "auto",4);
		
		//System.out.println("c1 차의 색상은 "+c1.color+"이고, 기어타입은 "+c1.gearType+"이고, 문의 갯수는 " +c1.door);
		//System.out.println("c2 차의 색상은 "+c2.color+"이고, 기어타입은 "+c2.gearType+"이고, 문의 갯수는 " +c2.door);
		//System.out.println("c3 차의 색상은 "+c3.color+"이고, 기어타입은 "+c3.gearType+"이고, 문의 갯수는 " +c3.door);
		
		//-------------------------------------------------
		
		// 생성자에서 다른 생성자 호출하기 - this()
		Car2 c4 = new Car2();
		
		// 생성자를 이용한 인스턴스의 복사
		Car2 c5 = new Car2(c4);
		
		System.out.println("c4 차의 색상은 "+c4.color+"이고, 기어타입은 "+c4.gearType+"이고, 문의 갯수는 " +c4.door);
		System.out.println("c5 차의 색상은 "+c5.color+"이고, 기어타입은 "+c5.gearType+"이고, 문의 갯수는 " +c5.door);
	}

}
