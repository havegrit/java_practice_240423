package oop1;

import java.util.Scanner;

public class MethodTest9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("넓이를 계산할 도형은? (1. 원 2. 사각형 3. 삼각형) > ");
		int n = sc.nextInt();
		
		System.out.println(
				switch(n) {
				case 1 -> circleArea(sc);
				case 2 -> rectangleArea(sc);
				case 3 -> triangleArea(sc);
				default -> "잘못된 입력입니다. 프로그램을 종료합니다.";
				});
	}
	
	private static String circleArea(Scanner sc) {
		System.out.println("원의 넓이를 계산합니다.");
		System.out.print("반지름을 입력하세요 > ");
		int r = sc.nextInt();
		return "반지름이 %d인 원의 넓이는 %.2f입니다.".formatted(r, r * r * 3.14);
	}
	
	private static String triangleArea(Scanner sc) {		
		System.out.println("삼각형의 넓이를 계산합니다.");
		System.out.print("가로 길이를 입력하세요 > ");
		int width = sc.nextInt();
		System.out.print("세로 길이를 입력하세요 > ");
		int height = sc.nextInt();
		return "가로 %d, 세로 %d인 삼각형의 넓이는 %.2f입니다.".formatted(width, height, (double)(width * height) / 2);
	}
	
	private static String rectangleArea(Scanner sc) {
		System.out.println("사각형의 넓이를 계산합니다.");
		System.out.print("밑변 길이을 입력하세요 > ");
		int width = sc.nextInt();
		System.out.print("높이를 입력하세요 > ");
		int height = sc.nextInt();
		return "밑변 %d, 높이 %d인 사각형의 넓이는 %d입니다.".formatted(width, height, width * height);
	}
}
