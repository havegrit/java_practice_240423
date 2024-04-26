package control.exam;

public class LoopTest4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i + j >= 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}	// end of j
			System.out.println();
		}	// end of i
		System.out.println("종료");
	}
}
