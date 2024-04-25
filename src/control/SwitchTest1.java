package control;

public class SwitchTest1 {
	public static void main(String[] args) {
		int n = 2;

		switch (n) {
		case 1:
		case 3:
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
			break;
		default:
			System.out.println("에러");
		}
		System.out.println("종료");
	}
}
