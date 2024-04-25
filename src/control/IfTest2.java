package control;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력: ");
		int score = sc.nextInt();
		char grade;
		
		sc.close();
		
		if (score < 60) {
			grade = 'F';
		} else if (score < 70) {
			grade = 'D';
		} else if (score < 80) {
			grade = 'C';
		} else if (score < 90) {
			grade = 'B';
		} else {
			grade = 'A';
		}
		
		System.out.println("%d점은 %c입니다.".formatted(score, grade));
	}
}
