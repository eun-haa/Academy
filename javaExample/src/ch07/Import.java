package ch07;
import ch06.Car;
public class Import {

	public static void main(String[] args) {
		// Tv 클래스 불러오기
		Tv t = new Tv(); // import가 필요없는 경우
						 // Tv 클래스와 import 모두 같은 패키지에 있음(ch07)
		
		// Car 클래스 불러오기
		Car c = new Car(); 

	}

}
