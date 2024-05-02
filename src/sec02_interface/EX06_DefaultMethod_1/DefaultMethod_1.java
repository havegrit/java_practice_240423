package sec02_interface.EX06_DefaultMethod_1;

interface A {
	void abc();
	default void bcd() {
		System.out.println("A interface's bcd()");
	}
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("B class's abc()");
	}
}

class C implements A {
	@Override
	public void abc() {
		System.out.println("C class's abc()");
	}
	public void bcd() {
		System.out.println("C class's bcd()");
	}
}

public class DefaultMethod_1 {
	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new C();
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
	}
}
