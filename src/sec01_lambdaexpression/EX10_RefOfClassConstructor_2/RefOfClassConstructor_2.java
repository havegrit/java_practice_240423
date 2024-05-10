package sec01_lambdaexpression.EX10_RefOfClassConstructor_2;

interface A {
	B acb(int k);
}

class B {
	B() {
		System.out.println("첫 번째 생성자");
	}
	B(int k) {
		System.out.println("두 번째 생성자");
	}
}

public class RefOfClassConstructor_2 {
	public static void main(String[] args) {
		A a1 = new A() {
			@Override
			public B acb(int k) {
				return new B(k);
			}
		};
		
		A a2 = (int k) -> new B(k);
		
		A a3 = B::new;
		
		a1.acb(3);
		a2.acb(3);
		a3.acb(3);
	}
}
