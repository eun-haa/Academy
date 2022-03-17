package ch07;

public class Circle extends Shape {// shape를 Circle에 포함
	// 원의 원점 좌표
	Point center;
	// 반지름
	int r;
	Circle(){
		this(new Point(0,0),100);
		// this는 한 클래스의 다른 생성자를
		// 호출할 때
	}
	Circle(Point center, int r){
		this.center=center;
		this.r=r;
	}
	void draw() {
		System.out.printf("[center=(%d. %d), r=%d, color]",
				center.x, center.y,r,color);
	}
}
