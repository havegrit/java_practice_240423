package oop9;

public class Rectangle extends Shape {
	int w = 10;
	int h = 5;
	
	@Override
	public void area() {
		this.res = w * h;
	}
}
