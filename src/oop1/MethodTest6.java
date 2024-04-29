package oop1;

public class MethodTest6 {
	public static void main(String[] args) {
		int[] n = {1};
		System.out.println("main: %d".formatted(n[0]));
		callByRef(n);
		System.out.println("main: %d".formatted(n[0]));
	}

	private static void callByRef(int[] n) {
		System.out.println("callByRef: %d".formatted(n[0]));
		n[0]++;
		System.out.println("callByRef: %d".formatted(n[0]));
	}
}
