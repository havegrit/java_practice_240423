package oop1;

public class MethodTest3 {
	public static void main(String[] args) {
		int dice = getDice();
		System.out.println("주사위는 %d".formatted(dice));
	}

	private static int getDice() {
		return (int )(Math.random() * 6) + 1;
	}
}
