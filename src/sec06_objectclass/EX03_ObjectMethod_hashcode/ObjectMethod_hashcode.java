package sec06_objectclass.EX03_ObjectMethod_hashcode;

import java.util.HashMap;

class A {
	String name;
	A(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A)obj).name) {
			return true;
		} else 
			return false;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

class B {
	String name;
	B(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B)obj).name) {
			return true;
		} else 
			return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

public class ObjectMethod_hashcode {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "data1");
		hm1.put(2, "data2");
		hm1.put(3, "data3");
		System.out.println(hm1);

		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("first"), "data1");
		hm2.put(new A("first"), "data2");
		hm2.put(new A("second"), "data3");
		System.out.println(hm2);

		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("first"), "data1");
		hm3.put(new B("first"), "data2");
		hm3.put(new B("second"), "data3");
		System.out.println(hm3);
		
	}
}
