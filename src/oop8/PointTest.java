package oop8;

public class PointTest {
	public static void main(String[] args) {
		Point2D up = new Point3D();		// upcasting, 자동형변환
		up.x = 100;
		up.y = 200;
//		up.z = 300;
		
		Point3D dn = (Point3D) up;
		dn.x = 100;
		dn.y = 200;
		dn.z = 300;
	}
}
