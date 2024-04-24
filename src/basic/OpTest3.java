package basic;

public class OpTest3 {
	public static void main(String[] args) {
		boolean a, b;
		a = true;
		b = false;

		System.out.println(a && b); // logical AND
		System.out.println(a || b); // logical OR
		System.out.println(!a); // NOT
		System.out.println(!b); // NOT
		System.out.println(a ^ b); // XOR
		System.out.println(true ^ true);
		System.out.println(false ^ false);
	}
}
