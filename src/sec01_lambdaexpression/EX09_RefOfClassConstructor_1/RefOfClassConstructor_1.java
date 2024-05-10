package sec01_lambdaexpression.EX09_RefOfClassConstructor_1;

interface A {
	B acb();
}

class B {
	B() {
		System.out.println("첫 번째 생성자");
	}
	B(int k) {
		System.out.println("두 번째 생성자");
	}
}

public class RefOfClassConstructor_1 {
	public static void main(String[] args) {
		A a1 = new A() {
			@Override
			public B acb() {
				return new B();
			}
		};
		
		A a2 = () -> new B();
		
		A a3 = B::new;
		
		a1.acb();
		a2.acb();
		a3.acb();
	}
}
