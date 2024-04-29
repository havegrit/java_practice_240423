package oop2;

public class PointTest {
	public static void main(String[] args) {
		Point2D pt = new Point2D();
		pt.x = 100;
		pt.y = 200;
		
		System.out.println("x = %d".formatted(pt.x));
		System.out.println("y = %d".formatted(pt.y));
	}
}
