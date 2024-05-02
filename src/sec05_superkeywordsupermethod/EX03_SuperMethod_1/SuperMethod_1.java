package sec05_superkeywordsupermethod.EX03_SuperMethod_1;

class A {
	A() {
		System.out.println("A constructor");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B constructor");
	}
}

class C {
	C(int a) {
		System.out.println("C constructor");
	}
}

class D extends C {
	/* 컴파일러가 자동으로 추가하는 생성자
	D() {
		super();
	}
	 */
	
	D() {
		super(3);
	}
}



public class SuperMethod_1 {
	public static void main(String[] args) {
		A aa = new A();
		System.out.println();
		
		B bb = new B();
	}
}
