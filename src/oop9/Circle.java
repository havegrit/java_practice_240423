package oop9;

public class Circle extends Shape {
	int r = 10;
	
	@Override
	public void area() {
		this.res = r * r * 3.14;
	}
}
