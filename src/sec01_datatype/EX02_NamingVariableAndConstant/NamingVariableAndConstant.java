package sec01_datatype.EX02_NamingVariableAndConstant;

public class NamingVariableAndConstant {
	public static void main(String[] args) {
		// 변수
		boolean aBcD;		// 대문자는 새로운 단어의 앞 글자에 사용하도록 권장
		byte 가나다;		// 기본적으로 변수명을 한글로 작성할 수 있지만 권장하지 않음
		short _abcd;
		char $ab_cd;
//		int 3abcd;	// 숫자는 이름 맨 앞에 올 수 없음
		long abcd3;
//		float int;		// 예약어는 사용할 수 없음
		double main;
//		int my Work; 	// 스페이스, 특수 키는 사용할 수 없음
		String myClassName;
		int ABC;			// 일반 변수명에 전부 대문자를 사용하는 것은 권장하지 않음
		
		// 상수
		final double PI;
		final int MY_DATA;
		final float myData;	// 소문자를 사용할 수는 있으나 권장하지 않음
	}
}
