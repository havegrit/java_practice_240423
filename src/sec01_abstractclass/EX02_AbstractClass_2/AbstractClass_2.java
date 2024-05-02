package sec01_abstractclass.EX02_AbstractClass_2;

abstract class A {
	abstract void abc();
}

public class AbstractClass_2 {
	public static void main(String[] args) {
		A a1 = new A() {
			void abc() {
				System.out.println("방법 2. anonymous inner class 방법으로 객체 생성");
			}
		};
		A a2 = new A() {
			void abc() {
				System.out.println("방법 2. anonymous inner class 방법으로 객체 생성");
			}
		};

		a1.abc();
		a2.abc();
	}
}
