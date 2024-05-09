package sec01_theneedforgeneric.EX02_Solution1_UsingObject;

class Apple {}
class Pencil {}
class Goods {
	private Object object;
	public Object getObject() {
		return this.object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
}

public class Solution1_UsingObject {
	public static void main(String[] args) {
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		Apple apple = (Apple) goods1.getObject();

		Goods goods2 = new Goods();
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil) goods2.getObject();

		// 잘못된 캐스팅(약한 타입 체크)
//		Goods goods3 = new Goods();
//		goods3.setObject(new Apple());
//		Pencil pencil2 = (Pencil) goods3.getObject();		// 예외가 발생
	}
}
