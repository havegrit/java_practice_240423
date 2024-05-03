package exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try (NeMam n = new NeMam()) {
			System.out.println("try 블록 입니다.");
			if (true) throw new RuntimeException("강제 예외 발생");
			System.out.println("try 종료");
		} catch (Exception e) {
			System.out.println("catch 블록 입니다.");
		}
		System.out.println("종료합니다.");
	}
}
