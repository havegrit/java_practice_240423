package sec03_methodoverriding.EX04_MethodOverriding_4;

class A {
	protected void abd() {}
}

class B1 extends A {
	public void abd() {}
}

class B2 extends A {
	protected void abd() {}
}

class B3 extends A {
	// void abd() {}
}

class B4 extends A {
	// private void abd() {}
}

public class MethodOverriding_4 {
	public static void main(String[] args) {
		
	}
}
