package ch07;

public class Point {
	// x��ǥ
	int x;  // �ν��Ͻ� ����
	// y��ǥ
	int y;  // �ν��Ͻ� ����
	Point(int x, int y){// x, y 2���� ������
		this.x=x;
		this.y=y;
	}
//	Point(){            // �Ű������� 0���� ������(�⺻ ������)
//		this(0,0);      // this():�� Ŭ����(Point)���� �ٸ� ������()�� ȣ�� 
//	}
	String getXY() {    // x�� y ������ ����Ǿ� �ִ� ���� ����ϱ� ���� �޼ҵ�
		return "(" +x+","+y+")";
	}
}
