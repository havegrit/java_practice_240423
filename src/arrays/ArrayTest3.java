package arrays;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 90, 80, 70},
				{ 90, 80, 70, 60},
				{ 80, 70, 60, 50}
		};
		int[] total = new int[score.length];
		
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for (int row = 0; row < score.length; row++) {
			for (int col = 0; col < score[row].length; col++) {
				System.out.print("%4d\t".formatted(score[row][col]));
				total[row] += score[row][col];
			}
			System.out.println("%4d\t%4d".formatted(total[row], total[row]/score[row].length));
		}
	}
}
