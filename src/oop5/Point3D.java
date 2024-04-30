package oop5;

public class Point3D extends Point2D {
	int z;
	public Point3D() {}
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Poinr3D(x, y, z) Constructor 수행");
	}

	@Override
	public String toString() {
		return super.toString() + ", Point3D [z = %d]".formatted(this.z);
	}
}
