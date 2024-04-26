package control.exam;

public class LoopTest3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				if(i <= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}	// end of j
			System.out.println();
		}	// end of i
		System.out.println("종료");
	}
}
