package oop3;

public class Point2D {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void print() {
		System.out.println("x = %d".formatted(this.getX()));
		System.out.println("y = %d".formatted(this.getY()));
	}
}
