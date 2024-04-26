package control.exam;

public class LoopTest1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}	// end of j
			System.out.println();
		}	// end of i
		System.out.println("종료");
	}
}
