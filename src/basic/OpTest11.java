package basic;

public class OpTest11 {
	public static void main(String[] args) {
		int a = 10; // 1010(2)

		System.out.println(a << 2); // 101000(2)
		System.out.println(a);
		System.out.println(a >> 2); // 0010(2)
		System.out.println(a);
		System.out.println(a <<= 2); // 축약연산자

		a = -10;
		System.out.println(a >> 2);
		System.out.println(a >>> 2);
	}
}