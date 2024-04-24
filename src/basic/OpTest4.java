package basic;

public class OpTest4 {
	public static void main(String[] args) {
		int a = 10, b = 5;
//		int temp;

		// 가독성이 더 좋아 많이 사용
//		temp = a;
//		a = b;
//		b = temp;

		// 메모리 절약, 레지스터 이용하기에 속도 좀 더 빠름
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}
}
