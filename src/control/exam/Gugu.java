package control.exam;

public class Gugu {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i+=4) {
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k < i+4; k++) {
					System.out.print(k + " X " + j + " = " + k*j + "\t");
				}	// end of k
				System.out.println();
			}	// end of j
			System.out.println();
		}	//end of i
	}
}
