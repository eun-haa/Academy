package ch07;

public class Triangle extends Shape{// shape를 Triangle에 포함
	// 삼각형을 그리기 위한 점
	Point[] p = new Point[3];
	Triangle(Point[] p) {
		this.p=p;
	}
	void draw() {
		System.out.printf("[p1=%s,p2=%s,p3=%s,color=%s]%n",
				p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}
