package basic;

public class OpTest12 {
	public static void main(String[] args) {
		int n = 4; // n은 주민등록번호 7번째 자리 수
		System.out.println(
				n == 1 || n == 3 ? "남자" :
				n == 2 || n == 4 ? "여자" :
									"error");
	}
}