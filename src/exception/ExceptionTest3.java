package exception;

import java.io.IOException;

public class ExceptionTest3 {
	public static void main(String[] args) {
		try {
			runMethod();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}

	private static void runMethod() throws IOException {
		throw new IOException("파일처리 예외상황 발생");
	}
}
