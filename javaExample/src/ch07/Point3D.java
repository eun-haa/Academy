package ch07;

public class Point3D extends Point{	
	int z;
	
	Point3D(int x, int y, int z){//super()가 있어야 빨간 밑줄이 안그임
		super(x,y);
//		this.x=x;
//		this.y=y;
		this.z=z;
	}
	String getXY() {
		return "(" + x + "," + y + "," + z + ")";
	}
	
	
}
