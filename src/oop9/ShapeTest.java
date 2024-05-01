package oop9;

public class ShapeTest {
	public static void main(String[] args) {
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());
	}
	
	public static void printArea(Shape s) {
		s.area();
		if (s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("반지름이 %d인 원의 넓이는 %.1f 입니다.".formatted(c.r, c.res));
		} else if (s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("가로 %d, 세로 %d인 사각형의 넓이는 %.1f 입니다.".formatted(r.w, r.h, r.res));
		} else if (s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.println("밑변 %d, 높이 %d인 사각형의 넓이는 %.1f 입니다.".formatted(t.w, t.h, t.res));
		}
	}
}
