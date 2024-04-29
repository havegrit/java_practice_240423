package oop1;

public class MethodTest5 {
	public static void main(String[] args) {
		int[] n = {1};
		
		System.out.println("main: %d".formatted(n[0]));
//		callByRef(Arrays.copyOf(n, n.length));
		int[] copy = new int[n.length];
		/*
		 * n -> copy 배열이 복사됨
		 * System.arraycopy(src, scrPos, copy, copyPos, length)
		 */
		System.arraycopy(n, 0, copy, 0, n.length);
		callByRef(copy);
		System.out.println("main: %d".formatted(n[0]));
	}

	private static void callByRef(int[] n) {
		System.out.println("callByRef: %d".formatted(n[0]));
		n[0]++;
		System.out.println("callByRef: %d".formatted(n[0]));
	}
}
