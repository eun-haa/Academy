package ch07;

public class Point3D extends Point{	
	int z;
	
	Point3D(int x, int y, int z){//super()�� �־�� ���� ������ �ȱ���
		super(x,y);
//		this.x=x;
//		this.y=y;
		this.z=z;
	}
	String getXY() {
		return "(" + x + "," + y + "," + z + ")";
	}
	
	
}
