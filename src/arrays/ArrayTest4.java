package arrays;

public class ArrayTest4 {
	public static void main(String[] args) {
		int[][][] score = {
			{
				{100, 90, 80, 70},
				{ 90, 80, 70, 60},
				{ 80, 70, 60, 50}
			},
			{
				{100, 100, 90, 80},
				{100, 90, 80, 70},
				{90, 80, 70, 60}
			}
		};
		
		for (int tab = 0; tab < score.length; tab++) {
			System.out.println("* %d학기 *".formatted(tab + 1));
			System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
			for (int row = 0; row < score[tab].length; row++) {
				int sum = 0;
				for (int col = 0; col < score[tab][row].length; col++) {
					System.out.print("%4d\t".formatted(score[tab][row][col]));
					sum += score[tab][row][col];
				}
				System.out.println("%4d\t%4.1f\t".formatted(sum, (double)(sum/score[tab][row].length)));
			}
			System.out.println();
		}
	}
}
