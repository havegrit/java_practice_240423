package oop1;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("a > ");
			int a = sc.nextInt();
			System.out.print("b > ");
			int b = sc.nextInt();

			System.out.println("%d + %d = %d".formatted(a, b, add(a, b)));
			System.out.println("%d - %d = %d".formatted(a, b, sub(a, b)));
			System.out.println("%d * %d = %d".formatted(a, b, mul(a, b)));
			System.out.println("%d / %d = %.2f".formatted(a, b, div(a, b)));
		}
	}

	// arg O, return O
	private static double div(int a, int b) {
		return (double) a / (double) b;
	}

	private static int mul(int a, int b) {
		return a * b;
	}

	private static int sub(int a, int b) {
		return a - b;
	}

	private static int add(int a, int b) {
		return a + b;
	}
}
