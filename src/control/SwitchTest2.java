package control;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력: ");
		int score = sc.nextInt();
		char grade;
		
		sc.close();
		
		grade = switch (score/10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
		
		System.out.println("%d점은 %c학점 입니다.".formatted(score, grade));
	}
}
