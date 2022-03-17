package ch07;

public class Point {
	// x좌표
	int x;  // 인스턴스 변수
	// y좌표
	int y;  // 인스턴스 변수
	Point(int x, int y){// x, y 2개인 생성자
		this.x=x;
		this.y=y;
	}
//	Point(){            // 매개변수가 0개인 생성자(기본 생성자)
//		this(0,0);      // this():한 클래스(Point)에서 다른 생성자()를 호출 
//	}
	String getXY() {    // x와 y 변수에 저장되어 있는 값을 출력하기 위한 메소드
		return "(" +x+","+y+")";
	}
}
