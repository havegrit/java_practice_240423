package sec05_superkeywordsupermethod.EX04_SuperMethod_2;

class A {
	A() {
		this(3);
		System.out.println("A constructor 1");
	}
	
	A(int a) {
		System.out.println("A constructor 2");
	}
}

class B extends A {
	B() {
		this(3);
		System.out.println("B constructor 1");
	}
	
	B(int a) {
		System.out.println("B constructor 2");
	}
}

public class SuperMethod_2 {
	public static void main(String[] args) {
		A aa1 = new A();
		System.out.println();
		A aa2 = new A(3);
		System.out.println();
		
		B bb1 = new B();
		System.out.println();
		B bb2 = new B(3);
	}
}
