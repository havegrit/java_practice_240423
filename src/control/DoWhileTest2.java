package control;

public class DoWhileTest2 {
	public static void main(String[] args) {
		int d1, d2;
		
		d1 = (int) (Math.random() * 6);
		do {
			d2 = (int) (Math.random() * 6);
		} while (d1 == d2);
		
		System.out.println(d1 + "," + d2);
		System.out.println("종료");
	}
}
