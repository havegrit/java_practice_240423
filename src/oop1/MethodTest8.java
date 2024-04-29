package oop1;

import java.util.Scanner;

public class MethodTest8 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("난 누구냐? 내 이름을 말해봐! > ");
			String name = sc.nextLine();
			System.out.println(say(name));			
		}
	}

	private static String say(String name) {
		return switch(name) {
		case "정대만" -> "그래, 난 정대만. 포기를 모르는 남자지.";
		case "서태웅" -> "내가 북산을 최고의 팀으로 만든다.";
		case "채치수" -> "전국재패~!!";
		case "강백호" -> "난 천재니까!";
		case "송태섭" -> "넘버1 가드";
		default -> "우리들은 강하다~!!";
		};
	}
}
