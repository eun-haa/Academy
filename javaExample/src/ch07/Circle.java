package ch07;

public class Circle extends Shape {// shape�� Circle�� ����
	// ���� ���� ��ǥ
	Point center;
	// ������
	int r;
	Circle(){
		this(new Point(0,0),100);
		// this�� �� Ŭ������ �ٸ� �����ڸ�
		// ȣ���� ��
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
