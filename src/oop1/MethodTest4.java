package oop1;

public class MethodTest4 {
	public static void main(String[] args) {
		int a = 7, b = 4;
		int c = add(a, b);
		System.out.println(c);
		System.out.println("main.a: %d".formatted(a));
	}

	private static int add(int a, int b) {
		int c = a + b;
		a++;
		System.out.println("add.a: %d".formatted(a));
		
		return c;
	}
}
