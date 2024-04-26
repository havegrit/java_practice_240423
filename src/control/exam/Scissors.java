package control.exam;

import java.util.Scanner;

public class Scissors {
	public static void main(String[] args) {
		// 가위는 1, 바위는 2, 보는 3 이라고 가정
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력: ");
		int you = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		
		System.out.println("You -> %s".formatted(
				switch(you) {
				case 1 -> "가위";
				case 2 -> "바위";
				default -> "보";
				}));
		System.out.println("Com -> %s".formatted(
				switch(com) {
				case 1 -> "가위";
				case 2 -> "바위";
				default -> "보";
				}));
		
		System.out.println(
				switch(you - com) {
				/*
				 *	you와 com 값이 같으면 무승부 
				 */
				case 0 -> "무승부 입니다.";
				/*
				 *	you - com 값이 -1, -2, 1일 경우 승리 
				 */
				case -1, -2, 1 -> "당신의 승리입니다.";
				default -> "컴퓨터의 승리입니다.";
				});

		System.out.println("종료");
	}
}
