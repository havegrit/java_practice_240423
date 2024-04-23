package basic;

public class DataType {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println("b = " + b);
		
		byte b2 = 10;
		System.out.println("b2 = " + b2);
		
		char c = '가';
		System.out.println("c = " + c);
		
		short sh = 32767;
		System.out.println("sh = " + sh);
		
		int i = 2147483647;
		System.out.println("i = " + i);
		
		long lo = 2147483648L;
		System.out.println("lo = " + lo);
		
		double d = 3.1415926535;
		System.out.println("d = " + d);
		
		float f = 3.1415926535f;
		System.out.println("f = " + f);
		
		String greeting = "안녕하세요\n";
		greeting = greeting + "반갑습니다.";
		System.out.println(greeting);
		
		String greeting2 =
				"""
				만나서 반갑습니다.
				좋은 하루되세요.
				""";
		System.out.println(greeting2);
		
		System.out.println("안녕하세요.\t자바");
		System.out.println("안녕하세요.	자바");
	}
}
