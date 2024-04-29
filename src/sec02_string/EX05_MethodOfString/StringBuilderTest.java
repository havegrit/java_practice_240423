package sec02_string.EX05_MethodOfString;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("실수란 "); printString(sb);
		sb.append("신을 "); printString(sb);
		sb.append("용서하는 "); printString(sb);
		sb.append("인간의 "); printString(sb);
		sb.append("행위이다"); printString(sb);
//		System.out.println(sb);
	}

	private static void printString(StringBuilder sb) {
		System.out.printf("%s:%s:%s\n", sb.length(), sb.capacity(), sb);
	}
}
