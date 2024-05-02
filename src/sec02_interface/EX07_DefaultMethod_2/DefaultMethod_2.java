package sec02_interface.EX07_DefaultMethod_2;

interface A {
	default void abc() {
		System.out.println("A interface's bcd()");
	}
}

class B implements A {
	@Override
	public void abc() {
		A.super.abc();
		System.out.println("B class's abc()");
	}
}

public class DefaultMethod_2 {
	public static void main(String[] args) {
		B b = new B();
		
		b.abc();
	}
}
