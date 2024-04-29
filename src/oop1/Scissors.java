package oop1;

import java.util.Scanner;

public class Scissors {
	public static void main(String[] args) {
		// 가위는 1, 바위는 2, 보는 3 이라고 가정
		String[] caption = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력: ");
		int you = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("You -> %s".formatted(caption[you - 1]));
		System.out.println("Com -> %s".formatted(caption[com - 1]));

		System.out.println(getMessage(you, com));

		System.out.println("종료");
	}

	private static String getMessage(int you, int com) {
		return switch ((you - com + 3) % 3) {
		/*
		 * you와 com 값이 같으면 무승부
		 */
		case 0 -> "무승부 입니다.";
		/*
		 * you - com 값이 -1, -2, 1일 경우 승리
		 */
		case 1 -> "당신의 승리입니다.";
		default -> "컴퓨터의 승리입니다.";
		};
	}

//	private static String caption(int val) {
//		String rsp = switch (val) {
//		case 1 -> "가위";
//		case 2 -> "바위";
//		default -> "보";
//		};
//
//		return rsp;
//	}
}
