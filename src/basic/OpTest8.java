package basic;

public class OpTest8 {
	public static void main(String[] args) {
		int a = 10;
		int b = a++; // b = a
						// a = a + 1
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}
