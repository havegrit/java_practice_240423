package oop1;

public class MethodTest1 {
	public static void main(String[] args) {
		// Method Overloading
		print();
		print("혁진");		// parameter, 실매개변수
		print("혜령");
	}

	// arg X, return X
	private static void print() {		// behavior 
		System.out.println("안녕하세요~");
	}

	// arg O, return X
	private static void print(String name) {		// argument, (형식)매개변수
		System.out.println("안녕하세요~ %s님".formatted(name));
	}
}
