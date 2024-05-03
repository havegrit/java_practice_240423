package exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = "ㅎㅇ";
		try {
			System.out.println(str.toString());		// new NullPointerException();
			System.out.println("try 종료. 예외 발생하지 않음");
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("NullPointerException 처리...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally 블럭");
		}
		System.out.println("종료");
	}
}
