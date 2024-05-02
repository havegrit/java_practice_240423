package sec05_superkeywordsupermethod.EX02_SuperKeyword_2;

class A {
	void abc() {
		System.out.println("A class의 abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B class의 abc()");
	}
	
	void bcd() {
		super.abc();
	}
}

public class SuperKeyword_2 {
	public static void main(String[] args) {
		B bb = new B();
		
		bb.bcd();
	}
}
