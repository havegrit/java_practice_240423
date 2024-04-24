package sec01_operator_1.EX04_RelationOperator;

public class RelationOperator {
	public static void main(String[] args) {
		System.out.println(5 < 2);
		System.out.println(5 > 2);
		System.out.println(5 < 5);
		System.out.println(5 <= 2);
		System.out.println(5 >= 2);
		System.out.println();
		
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println();
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2);
	}
}
