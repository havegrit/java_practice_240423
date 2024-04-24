package basic;

public class OpTest14 {
	public static void main(String[] args) {
		// 정수 -> 실수 의 경우 자동(묵시적) 형변환
		double d = 10;			System.out.println(d);
		float f = 2147483648L;	System.out.println(f);
		
		// 강제(명시적) 형변화. 실수 -> 정수 로의 변환의 경우 소수점 이하 값 버림
		int p = (int)3.14;		System.out.println(p);
	}
}