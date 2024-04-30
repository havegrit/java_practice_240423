package sec02_method.EX06_MethodOverloading;

public class MethodOverloading {
	public static void main(String[] args) {
		print();
		print(3);
		print(5.8);
		print(2, 5);
	}

	private static void print() {
		System.out.println("데이터가 없습니다.");
	}

	private static void print(int a) {
		System.out.println(a);
	}

	private static void print(double a) {
		System.out.println(a);
	}

	private static void print(int a, int b) {
		System.out.println("a: %d b: %d".formatted(a, b));
	}
}
