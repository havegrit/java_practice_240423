package sec01_lambdaexpression.EX03_RefOfInstanceMethod_Type1_1;

interface A {
	void abc();
}

class B {
	void bcd() {
		System.out.println("method");
	}
}

public class RefOfInstanceMethod_Type1_1 {
	public static void main(String[] args) {
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		B b = new B();
		A a3 = b::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
