package sec05_superkeywordsupermethod.EX01_SuperKeyword_1;

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
		abc();
	}
}

public class SuperKeyword_1 {
	public static void main(String[] args) {
		B bb = new B();
		
		bb.bcd();
	}
}
