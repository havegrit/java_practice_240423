package oop1;

public class MethodTest7 {
	public static void main(String[] args) {
		print(1);
		print(2, 3);
		print(4, 5, 6);		
	}

	private static void print(int... i) {		// one or more parameters 
//		for (int j = 0; j < i.length; j++) {
//			System.out.print(i[j] + "\t");
//		}
//		System.out.println();
		for (int n : i) {
			System.out.print(n + "\t");
		}
		System.out.println();
	}
}
