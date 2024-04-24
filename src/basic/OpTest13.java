package basic;

import java.util.Scanner;

public class OpTest13 {
	public static void main(String[] args) {
		// 실습 문제 - 정수를 입력받아서 조건연산을 이용해 짝수 홀수를 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수, 홀수 판별");
		System.out.print("숫자: ");
		int n = sc.nextInt();
		sc.close();
		
		String result = n % 2 == 0 ? "짝수" : "홀수";
		System.out.println("입력하신 숫자는 " + result + "입니다.");
		System.out.println(n % 2);
	}
}